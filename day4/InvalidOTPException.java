package day5;

class InvalidOTPException extends Exception {
	private String message;
	public InvalidOTPException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
	

}
