package edu.harvard.seas.synthesis;

public class Example {
	public String input;
	public String[] exact;
	public String[] unmatch;
	public String[] generalize;
	public Boolean output;
	
	// Temporal ordering constraints
	// Each element specifies that "before" text must appear before "after" text
	public TemporalOrdering[] ordering;
	
	@Override
	public String toString() {
		return input;
	}
	
	// Inner class to represent temporal ordering constraints
	public static class TemporalOrdering {
		public String before;
		public String after;
		
		public TemporalOrdering() {
		}
		
		public TemporalOrdering(String before, String after) {
			this.before = before;
			this.after = after;
		}
		
		@Override
		public String toString() {
			return "\"" + before + "\" before \"" + after + "\"";
		}
	}
}