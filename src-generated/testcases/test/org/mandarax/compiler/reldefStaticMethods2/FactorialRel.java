package test.org.mandarax.compiler.reldefStaticMethods2;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Class representing the relationship <strong>Factorial</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version 22/12/2010 4:07:54 PM 
 */
public class FactorialRel {

	// fields created for slots 
	public int n = 0; 
	public int fact = 0;
	
	// constructors
	public FactorialRel () {
		super();
	}
	
	public FactorialRel ( int n , int fact ) {
		super();
		this.n=n; 
		this.fact=fact; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		FactorialRel _tmp = (FactorialRel) obj;
   		return new EqualsBuilder()
            .append(n, _tmp.n)
            .append(fact, _tmp.fact)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(n)
            .append(fact)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("n",n)
    		.append("fact",fact)
    		.toString();
   }
   

}

