package com.kodlama.io.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean success) {
		super(data, false);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDataResult(T data) {
		super(data,false);
	}
	
	public ErrorDataResult(String message) {
		super(null,false,message);
	}
	
	public ErrorDataResult() {
		super(null,false);
	}
	
}
