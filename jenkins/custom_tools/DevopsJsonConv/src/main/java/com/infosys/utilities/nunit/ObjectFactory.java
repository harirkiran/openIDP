//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.02 at 08:54:42 PM IST 
//
package com.infosys.utilities.nunit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	private final static QName _Message_QNAME = new QName("", "message");
	private final static QName _Output_QNAME = new QName("", "output");
	private final static QName _StackTrace_QNAME = new QName("", "stack-trace");
	private final static QName _CommandLine_QNAME = new QName("", "command-line");

	public Setting createSetting() {
		return new Setting();
	}

	public Property createProperty() {
		return new Property();
	}

	public Failure createFailure() {
		return new Failure();
	}

	public TestCase createTestCase() {
		return new TestCase();
	}

	public Properties createProperties() {
		return new Properties();
	}

	public Reason createReason() {
		return new Reason();
	}

	public TestSuite createTestSuite() {
		return new TestSuite();
	}

	public Environment createEnvironment() {
		return new Environment();
	}

	public Settings createSettings() {
		return new Settings();
	}

	public TestRun createTestRun() {
		return new TestRun();
	}

	@XmlElementDecl(namespace = "", name = "message")
	public JAXBElement<String> createMessage(String value) {
		return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
	}

	@XmlElementDecl(namespace = "", name = "output")
	public JAXBElement<String> createOutput(String value) {
		return new JAXBElement<String>(_Output_QNAME, String.class, null, value);
	}

	@XmlElementDecl(namespace = "", name = "stack-trace")
	public JAXBElement<String> createStackTrace(String value) {
		return new JAXBElement<String>(_StackTrace_QNAME, String.class, null, value);
	}

	@XmlElementDecl(namespace = "", name = "command-line")
	public JAXBElement<String> createCommandLine(String value) {
		return new JAXBElement<String>(_CommandLine_QNAME, String.class, null, value);
	}
}