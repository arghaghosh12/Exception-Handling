package customexception;

class InvalidUserIdException  extends Exception{
	private String message;
	
	public InvalidUserIdException(String message) 
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
