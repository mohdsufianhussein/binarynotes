
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1SequenceOf;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "BugList" )
    public class BugList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "BugList" , isSetOf = false)
	    private java.util.Collection<BugValueType> value = null; 
    
            public BugList () {
            }
        
            public BugList ( java.util.Collection<BugValueType> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<BugValueType> value) {
                this.value = value;
            }
            
            public java.util.Collection<BugValueType> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<BugValueType>()); 
            }
            
            public void add(BugValueType item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(BugList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            