package test.org.mandarax.compiler.reldef4;

/**
 * Class representing the relationship <strong>Father</strong>.
 * @version Nov 18, 2010 9:53:03 AM 
 */
public class FatherRel {

	// constructors
	public FatherRel () {
		super();
	}
	
	public FatherRel ( String father , String child ) {
		super();
		this.father=father; 
		this.child=child; 
		
	}

	// instance variables created for slots
	 
	public String father = null; 
	 
	public String child = null; 
	

}

