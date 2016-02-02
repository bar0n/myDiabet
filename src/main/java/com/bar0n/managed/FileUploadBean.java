package com.bar0n.managed;

/**
 * Created by dbaron
 */

import model.DATAType;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.Serializable;


@ManagedBean(name = "fileUploadBean")
@ViewScoped
public class FileUploadBean implements Serializable {

    private DATAType dataType = null;

    public void listener(FileUploadEvent event) throws Exception {
        UploadedFile item = event.getUploadedFile();
        String name = item.getName();
        byte[] data = item.getData();
        ByteArrayInputStream input = new ByteArrayInputStream(data);

        JAXBContext jaxbContext = JAXBContext.newInstance(DATAType.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        Object diarry = jaxbUnmarshaller.unmarshal(input);

        dataType = (DATAType) ((JAXBElement) diarry).getValue();

    }

    public String clearUploadData() {
        dataType = null;
        return null;
    }


    public long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public DATAType getDataType() {
        return dataType;
    }

    public void setDataType(DATAType dataType) {
        this.dataType = dataType;
    }

}