//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for And-query.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="And-query.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}And.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}And-query.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "And-query.type", propOrder = {
    "oid",
    "formulaOrAtomOrAnd"
})
public class AndQueryType {

    protected OidType oid;
    @XmlElements({
        @XmlElement(name = "Neg", type = NegType.class),
        @XmlElement(name = "Naf", type = NafType.class),
        @XmlElement(name = "Update", type = UpdateType.class),
        @XmlElement(name = "Retract", type = RetractType.class),
        @XmlElement(name = "Equal", type = EqualType.class),
        @XmlElement(name = "Rule", type = RuleType.class),
        @XmlElement(name = "Atom", type = AtomType.class),
        @XmlElement(name = "Assert", type = AssertType.class),
        @XmlElement(name = "And", type = AndInnerType.class),
        @XmlElement(name = "Or", type = OrInnerType.class),
        @XmlElement(name = "formula", type = FormulaAndOrType.class)
    })
    protected List<Object> formulaOrAtomOrAnd;
    @XmlAttribute(name = "closure")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String closure;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link OidType }
     *     
     */
    public OidType getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OidType }
     *     
     */
    public void setOid(OidType value) {
        this.oid = value;
    }

    /**
     * Gets the value of the formulaOrAtomOrAnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulaOrAtomOrAnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulaOrAtomOrAnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegType }
     * {@link NafType }
     * {@link UpdateType }
     * {@link RetractType }
     * {@link EqualType }
     * {@link RuleType }
     * {@link AtomType }
     * {@link AssertType }
     * {@link AndInnerType }
     * {@link OrInnerType }
     * {@link FormulaAndOrType }
     * 
     * 
     */
    public List<Object> getFormulaOrAtomOrAnd() {
        if (formulaOrAtomOrAnd == null) {
            formulaOrAtomOrAnd = new ArrayList<Object>();
        }
        return this.formulaOrAtomOrAnd;
    }

    /**
     * Gets the value of the closure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosure() {
        return closure;
    }

    /**
     * Sets the value of the closure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosure(String value) {
        this.closure = value;
    }

}
