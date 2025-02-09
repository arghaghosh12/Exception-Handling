package day5;

class InvalidMarksException  extends Exception{
	private String message;
	public InvalidMarksException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}
 