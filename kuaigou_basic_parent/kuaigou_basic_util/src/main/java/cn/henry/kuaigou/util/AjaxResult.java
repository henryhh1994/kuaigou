package cn.henry.kuaigou.util;

public class AjaxResult {
//    默认操作成功
    private boolean success=true;
    private String msg="操作成功";
    private Object object;
//提供一个获取AjaxResult实例的方法
    public static AjaxResult getAjax(){
        return new AjaxResult();
    }
    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
