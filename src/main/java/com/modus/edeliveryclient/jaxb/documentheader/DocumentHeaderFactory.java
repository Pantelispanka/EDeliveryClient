//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.28 at 03:40:13 PM EEST 
//


package com.modus.edeliveryclient.jaxb.documentheader;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.modus.edeliveryclient.jaxbclasses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class DocumentHeaderFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.modus.edeliveryclient.jaxbclasses
     * 
     */
    public DocumentHeaderFactory() {
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader }
     * 
     */
    public StandardBusinessDocumentHeader createStandardBusinessDocumentHeader() {
        return new StandardBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.BusinessScope }
     * 
     */
    public StandardBusinessDocumentHeader.BusinessScope createStandardBusinessDocumentHeaderBusinessScope() {
        return new StandardBusinessDocumentHeader.BusinessScope();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.Receiver }
     * 
     */
    public StandardBusinessDocumentHeader.Receiver createStandardBusinessDocumentHeaderReceiver() {
        return new StandardBusinessDocumentHeader.Receiver();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.Sender }
     * 
     */
    public StandardBusinessDocumentHeader.Sender createStandardBusinessDocumentHeaderSender() {
        return new StandardBusinessDocumentHeader.Sender();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.DocumentIdentification }
     * 
     */
    public StandardBusinessDocumentHeader.DocumentIdentification createStandardBusinessDocumentHeaderDocumentIdentification() {
        return new StandardBusinessDocumentHeader.DocumentIdentification();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.BusinessScope.Scope }
     * 
     */
    public StandardBusinessDocumentHeader.BusinessScope.Scope createStandardBusinessDocumentHeaderBusinessScopeScope() {
        return new StandardBusinessDocumentHeader.BusinessScope.Scope();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.Receiver.Identifier }
     * 
     */
    public StandardBusinessDocumentHeader.Receiver.Identifier createStandardBusinessDocumentHeaderReceiverIdentifier() {
        return new StandardBusinessDocumentHeader.Receiver.Identifier();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader.Sender.Identifier }
     * 
     */
    public StandardBusinessDocumentHeader.Sender.Identifier createStandardBusinessDocumentHeaderSenderIdentifier() {
        return new StandardBusinessDocumentHeader.Sender.Identifier();
    }

}