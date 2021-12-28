package ibmtal.com.facebook.core.result;

import java.util.ArrayList;

public class Result<T> {
	private boolean success;
	private T data;
	private ArrayList<T> datas;
	private ArrayList<Message> errors;
	public Result() {
		super();
	}
	public Result(boolean success, T data, ArrayList<T> datas, ArrayList<Message> errors) {
		super();
		this.success = success;
		this.data = data;
		this.datas = datas;
		this.errors = errors;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ArrayList<T> getDatas() {
		return datas;
	}
	public void setDatas(ArrayList<T> datas) {
		this.datas = datas;
	}
	public ArrayList<Message> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<Message> errors) {
		this.errors = errors;
	}

}
