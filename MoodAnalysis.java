package moodAnalyserPrograms;

public class MoodAnalysis {
	 private String message;

	    public MoodAnalysis(String message) {
	        this.message = message;
	    }

	    public String analyseMood(String message) {
	        this.message = message;
	        return analyseMood();
	    }

	    public String analyseMood() {

	        try {

	            if (message.contains("Sad")) {
	                return "SAD";
	            } else {
	                return "HAPPY";
	            }
	        }catch(NullPointerException e){
	            return "HAPPY";}
	    }
}
