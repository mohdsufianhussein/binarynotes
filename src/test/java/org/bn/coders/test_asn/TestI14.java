
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1Integer;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.constraints.ASN1ValueRangeConstraint;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "TestI14" )
    public class TestI14 implements IASN1PreparedElement {
    
            @ASN1Integer( name = "TestI14" )
            @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 16384L 
		
	   )
	   
            private Integer value;
            
            public TestI14() {
            }

            public TestI14(Integer value) {
                this.value = value;
            }
            
            public void setValue(Integer value) {
                this.value = value;
            }
            
            public Integer getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestI14.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            