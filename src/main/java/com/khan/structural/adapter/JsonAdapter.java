package com.khan.structural.adapter;

import org.json.XML;

public class JsonAdapter {
    private XmlOutput xmlOutput;
    public JsonAdapter(XmlOutput xmlOutput) {
        this.xmlOutput = xmlOutput;
    }

    public String getJsonData() {
        return XML.toJSONObject(xmlOutput.getXmlData()).toString();
    }
}
