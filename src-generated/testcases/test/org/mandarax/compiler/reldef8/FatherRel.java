package test.org.mandarax.compiler.reldef8;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Class representing the relationship <strong>Father</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Dec 2, 2010 1:56:05 PM 
 */
public class FatherRel {

	// fields created for slots 
	public String father = null; 
	public String child = null;
	
	// constructors
	public FatherRel () {
		super();
	}
	
	public FatherRel ( String father , String child ) {
		super();
		this.father=father; 
		this.child=child; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		FatherRel _tmp = (FatherRel) obj;
   		return new EqualsBuilder()
            .append(father, _tmp.father)
            .append(child, _tmp.child)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(father)
            .append(child)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("father",father)
    		.append("child",child)
    		.toString();
   }
   

}

