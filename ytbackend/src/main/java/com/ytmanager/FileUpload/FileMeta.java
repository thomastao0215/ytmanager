package com.ytmanager.FileUpload;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by jiachen215 on 2017/5/27.
 */
@JsonIgnoreProperties({"bytes"})
public class FileMeta {
    private String fileName;
    private String fileSize;
    private String fileType;

    private byte[] bytes;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
