package src.main.java.com.exception;

public class MoodAnalyser {
	 private String message;

	    public MoodAnalyser(String message) {
	        this.message = message;
	    }

	    public String analyseMood(String message) throws MoodAnalysisException {
	        this.message = message;
	        return analyseMood();
	    }

	    public String analyseMood() throws MoodAnalysisException {

	        try {

	            if (message.contains("Sad")) {
	                return "SAD";
	            } else {
	                return "HAPPY";
	            }
	        }catch(NullPointerException e){
	           throw new MoodAnalysisException("PLease enter proper message");
	        }
	    }
}
