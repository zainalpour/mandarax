package test.org.mandarax.compiler.reldef8;

/**
 * Class representing the relationship <strong>GrandFather</strong>.
 * @version Nov 8, 2010 10:35:33 AM 
 */
public class GrandFatherRel {

	// constructors
	public GrandFatherRel () {
		super();
	}
	
	public GrandFatherRel ( String grandFather , String grandChild ) {
		super();
		this.grandFather=grandFather; 
		this.grandChild=grandChild; 
		
	}

	// instance variables created for slots
	 
	public String grandFather = null; 
	 
	public String grandChild = null; 
	

}

