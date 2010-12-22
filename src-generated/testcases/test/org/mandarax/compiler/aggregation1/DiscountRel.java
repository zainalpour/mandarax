package test.org.mandarax.compiler.aggregation1;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Discount</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version 22/12/2010 4:07:54 PM 
 */
public class DiscountRel {

	// fields created for slots 
	public String customer = null; 
	public int discount = 0;
	
	// constructors
	public DiscountRel () {
		super();
	}
	
	public DiscountRel ( String customer , int discount ) {
		super();
		this.customer=customer; 
		this.discount=discount; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		DiscountRel _tmp = (DiscountRel) obj;
   		return new EqualsBuilder()
            .append(customer, _tmp.customer)
            .append(discount, _tmp.discount)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(customer)
            .append(discount)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("customer",customer)
    		.append("discount",discount)
    		.toString();
   }
   

}

