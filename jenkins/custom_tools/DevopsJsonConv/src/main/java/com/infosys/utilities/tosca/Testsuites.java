//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 06:13:21 PM IST 
//


package com.infosys.utilities.tosca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testsuite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="testcase" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="failure" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testsuite"
})
@XmlRootElement(name = "testsuites")
public class Testsuites {

    @XmlElement(required = true)
    protected Testsuites.Testsuite testsuite;

    /**
     * Gets the value of the testsuite property.
     * 
     * @return
     *     possible object is
     *     {@link Testsuites.Testsuite }
     *     
     */
    public Testsuites.Testsuite getTestsuite() {
        return testsuite;
    }

    /**
     * Sets the value of the testsuite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Testsuites.Testsuite }
     *     
     */
    public void setTestsuite(Testsuites.Testsuite value) {
        this.testsuite = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="testcase" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="failure" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "testcase"
    })
    public static class Testsuite {

        protected List<Testsuites.Testsuite.Testcase> testcase;
        @XmlAttribute(name = "failures")
        protected Byte failures;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "log")
        protected String log;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "tests")
        protected Byte tests;
        @XmlAttribute(name = "time")
        protected String time;
        @XmlAttribute(name = "timestamp")
        @XmlSchemaType(name = "dateTime")
        protected String timestamp;

        /**
         * Gets the value of the testcase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testcase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestcase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Testsuites.Testsuite.Testcase }
         * 
         * 
         */
        public List<Testsuites.Testsuite.Testcase> getTestcase() {
            if (testcase == null) {
                testcase = new ArrayList<Testsuites.Testsuite.Testcase>();
            }
            return this.testcase;
        }

        /**
         * Gets the value of the failures property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getFailures() {
            return failures;
        }

        /**
         * Sets the value of the failures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setFailures(Byte value) {
            this.failures = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the log property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLog() {
            return log;
        }

        /**
         * Sets the value of the log property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLog(String value) {
            this.log = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the tests property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getTests() {
            return tests;
        }

        /**
         * Sets the value of the tests property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setTests(Byte value) {
            this.tests = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(String value) {
            this.timestamp = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="failure" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Testcase {

            @XmlElementRef(name = "failure", type = JAXBElement.class, required = false)
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "log")
            protected String log;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "time")
            protected String time;
            @XmlAttribute(name = "timestamp")
            @XmlSchemaType(name = "dateTime")
            protected String timestamp;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link Testsuites.Testsuite.Testcase.Failure }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Gets the value of the log property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLog() {
                return log;
            }

            /**
             * Sets the value of the log property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLog(String value) {
                this.log = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setTime(String value) {
                this.time = value;
            }

            /**
             * Gets the value of the timestamp property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public String getTimestamp() {
                return timestamp;
            }

            /**
             * Sets the value of the timestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTimestamp(String value) {
                this.timestamp = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Failure {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "message")
                protected String message;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }

        }

    }

}
