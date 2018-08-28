package com.xingyun.sharehomeapp.model;

import java.io.Serializable;

public class AppResponse  implements Serializable {

    private Boolean resultStatus;// true:Request Success false: Request fail
    private Integer resultCode;// response code
    private String resultMessage;// response message
    private Object resultData;// business data
    private Object extendField;// 扩展字段

    public AppResponse(Boolean resultStatus, Integer resultCode, String resultMessage, Object resultData, Object extendField) {
        this.resultStatus = resultStatus;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.resultData = resultData;
        this.extendField = extendField;
    }

    public AppResponse() {
    }

    public Boolean getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Boolean resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public Object getExtendField() {
        return extendField;
    }

    public void setExtendField(Object extendField) {
        this.extendField = extendField;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
