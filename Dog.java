
public class Dog {
	
	
	// Instance Fields
		private int dogSpaceNumber;
		private double dogWeight;
		private boolean grooming;
		
		// Constructor to initialize dog information
		public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
			this.dogSpaceNumber = dogSpaceNumber;
			this.dogWeight = dogWeight;
			this.grooming = grooming;

		}

		
		// Get dogSpaceNumber
		public int getDogSpaceNumber() {
			return dogSpaceNumber;
		}
		// Set dogSpaceNumber
		public void setDogSpaceNumber(int dogSpaceNumber) {
			this.dogSpaceNumber = dogSpaceNumber;
		}
		
		// Get dogWeight
		public double getDogWeight() {
			return dogWeight;
		}
		// Set dogWeight
		public void setDogWeight(double dogWeight) {
			this.dogWeight = dogWeight;
		}
		
		// Get grooming
		public boolean getGrooming() {
			return grooming;
		}
		// Set grooming
		public void setGrooming(boolean grooming) {
			this.grooming = grooming;
		}
	}



