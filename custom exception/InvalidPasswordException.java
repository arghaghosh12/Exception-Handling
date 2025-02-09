package customexception;

class InvalidPasswordException extends RuntimeException {
	private String message;

	InvalidPasswordException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
	

}


//Unchacked-->> class InvalidPasswordException extends RuntimeException{..}
//Checked-->> class InvalidPasswordException extends Exception{..}