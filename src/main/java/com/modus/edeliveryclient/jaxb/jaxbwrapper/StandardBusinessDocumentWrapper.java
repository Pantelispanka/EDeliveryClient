/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.jaxbwrapper;


import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader;
import com.modus.edeliveryclient.jaxb.egif_core_component.DocumentType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pantelispanka
 */

@XmlRootElement
public class StandardBusinessDocumentWrapper {
    
    
    private StandardBusinessDocumentHeader header;
    private DocumentType documentType;
    
    
    public StandardBusinessDocumentWrapper(){}
    
    
    @XmlElementWrapper
    @XmlElement(name = "StandardBusinessDocumentHeader")
    public StandardBusinessDocumentHeader getStandardBusinessDocumentHeader() {
        return header;
    }

    public void setStandardBusinessDocumentHeader(StandardBusinessDocumentHeader header) {
        this.header = header;
    }
    
    @XmlElementWrapper
    @XmlElement(name = "DocumentType")
    public DocumentType getDocumentType() {
        return documentType;
    }
    
    public void setStandardBusinessDocumentHeader(DocumentType documentType) {
        this.documentType = documentType;
    }
    
    
}
