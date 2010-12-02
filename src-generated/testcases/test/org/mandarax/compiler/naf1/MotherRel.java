package test.org.mandarax.compiler.naf1;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Mother</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Dec 2, 2010 1:56:06 PM 
 */
public class MotherRel {

	// fields created for slots 
	public Person mother = null; 
	public Person child = null;
	
	// constructors
	public MotherRel () {
		super();
	}
	
	public MotherRel ( Person mother , Person child ) {
		super();
		this.mother=mother; 
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
   		MotherRel _tmp = (MotherRel) obj;
   		return new EqualsBuilder()
            .append(mother, _tmp.mother)
            .append(child, _tmp.child)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(mother)
            .append(child)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("mother",mother)
    		.append("child",child)
    		.toString();
   }
   

}

