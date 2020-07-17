public class DNA {
  /*This program determines whether there is a protein in a strand of DNA
  */
	  public static void main(String[] args){
	    // -.  .-.   .-. .-.  .
	    //   \    \ /   \   \ /
	    //  / \    \    / \   \
	    //  ~  `-~  `-`    `-~ `-
	    String dna1 =  "ATGCGATACGCTTGA";
	    String dna2 =  "ATGCGATACGTGA";
	    String dna3 = "ATTAATATGTACTGA";
	    String[] dna = {dna1,dna2,dna3};
	    System.out.println("The length of the dna is " + dna.length);

	    //Finds the index where ATG begins
	    System.out.println("dna1 ATG begins at " + dna1.indexOf("ATG"));
	    System.out.println("dna2 ATG begins at " + dna2.indexOf("ATG"));
	    System.out.println("dna3 ATG begins at " + dna3.indexOf("ATG"));

	    //Finds the index where TGA begins
	    System.out.println("dna1 TGA begins at " + dna1.indexOf("TGA"));
	    System.out.println("dna2 TGA begins at " + dna2.indexOf("TGA"));
	    System.out.println("dna3 TGA begins at " + dna3.indexOf("TGA"));
	    System.out.println("dna1 has length " + dna1.length());

	  //Determine whether or not there is a protein
	    //Checks for a start condon and a stop codon using the && operator
	    int startCodon1 = dna1.indexOf("ATG");
	    int startCodon2 = dna2.indexOf("ATG");
	    int startCodon3 = dna3.indexOf("ATG");

	    int stopCodon1 = dna1.indexOf("TGA");
	    int stopCodon2 = dna2.indexOf("TGA");
	    int stopCodon3 = dna3.indexOf("TGA");



	    if (startCodon1==0 && stopCodon1 !=-1)		    	
	    {

	    	String protein = dna1;
		      int len = protein.length();
		      if (len%3==0) {

	   System.out.println("protein");

	}


	  else {
	    System.out.println("No protein");
	  }
	    }    
	   if (startCodon2==0 && stopCodon2 !=-1 ){

		   String protein = dna2;
		      int len = protein.length();
		      if (len%3==0) {

	     System.out.println("protein");

	}


	  else {
	    System.out.println("No protein");
	  }

	  }   

	   if (startCodon3==0 && stopCodon3 !=-1 ){

	    	 String protein = dna3;
		      int len = protein.length();
		      if (len%3==0) {


	   System.out.println("protein");

	}
	   }

	  else {
	    System.out.println("No protein");

	  } 

	  }
}


  
