package test.org.mandarax.compiler.reldef12;
 
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>GrandFather</strong>.
 * @version Nov 16, 2010 10:05:51 PM 
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

