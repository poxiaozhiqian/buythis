package cn.software_source.buythis.buythis.util;

public class AjaxResult {

    private boolean success;
    private String message;
    private Object result;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public AjaxResult setResult(Object result) {
        this.result = result;
        return this;
    }

    public static AjaxResult getAjax(){
        return new AjaxResult();
    }
}
