package network.y9.dto;

/**
 * Result
 *
 * @author moryxsw
 * @since 2023/2/21
 */

public class Result<T> {

    /**
     * code
     */
    private int code;

    /**
     * msg
     */
    private String msg;

    /**
     * data
     */
    private T data;


    //==========================================================================================
    public Result() {
    }

    public Result(int code, String msg) {
        this(code, msg, null);
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //===============================================================================

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
