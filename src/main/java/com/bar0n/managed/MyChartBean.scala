package com.bar0n.managed

import java.time.format.DateTimeFormatter
import java.time.{LocalDateTime, ZoneOffset}
import javax.faces.bean.{RequestScoped, ManagedBean, ManagedProperty, ViewScoped}

import model.SECTIONRECORDSType

import scala.beans.BeanProperty
import scala.collection.mutable

/**
  * Created by dbaron
  */
@ManagedBean
@RequestScoped
class MyChartBean extends Serializable {
  @ManagedProperty(value = "#{fileUploadBean}")
  @BeanProperty var fileUploadBean: FileUploadBean = null

  private var sk1: SK = _

  def getData = {

    /*if (sk1 != null) sk1
    else {*/
    val datas: mutable.Buffer[CarbonData] = if (fileUploadBean.getDataType != null) {
      val s: SECTIONRECORDSType = fileUploadBean.getDataType.getSECTIONRECORDS
      import scala.collection.JavaConversions._
      val pattern: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")

      val rec = s.getRECORD.head
      val init = LocalDateTime.parse(rec.getDate + " " + rec.getTime, pattern).toEpochSecond(ZoneOffset.ofTotalSeconds(0))
      val map: mutable.Buffer[CarbonData] = s.getRECORD.map(record => {

        val time: LocalDateTime = LocalDateTime.parse(record.getDate + " " + record.getTime, pattern)
        val decimal = new java.lang.Double(record.getSk1)
        val ki = new java.lang.Double(record.getKi)
        CarbonData(time, decimal, init, ki)
      })
      map
    }
    else {
      val datas1: mutable.Buffer[CarbonData] = mutable.Buffer[CarbonData](CarbonData(LocalDateTime.now(), 1, 1, 1))
      datas1
    }
    val sk: SK = SK("Accu Check", datas.filter(x => x.getVal != 0).sortBy(x => x.getX), datas.filter(x => x.ki != 0).sortBy(x => x.getX))
    sk1 = sk
    sk1
    //  }
  }
  def getData1:String={
    import scala.collection.JavaConversions._
    getData.getMy.map(x=>x.getLabel+","+x.value).mkString(";")
  }

  def getData2:String={
    import scala.collection.JavaConversions._
    getData.getkiData.map(x=>x.getLabel+","+x.ki+"]").mkString(";")
  }
  def setData1(s:String)={}
  def setData2(s:String)={}
}

case class SK(@BeanProperty name: String, @BeanProperty data: mutable.Buffer[CarbonData],kiData: mutable.Buffer[CarbonData]) {

  import scala.collection.JavaConverters._

  def getMy = new java.util.ArrayList(data.asJavaCollection)
  def getkiData = new java.util.ArrayList(kiData.asJavaCollection)
}

case class CarbonData(@BeanProperty time: LocalDateTime, @BeanProperty value: Double, init: Long,@BeanProperty ki: Double) {
  def getVal = value

  def getX: Int = {
    (time.toEpochSecond(ZoneOffset.ofTotalSeconds(0)) - init).toInt
  }


  def getLabel = {
    time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
  }

}
