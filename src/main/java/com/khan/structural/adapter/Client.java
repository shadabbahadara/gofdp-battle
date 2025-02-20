package com.khan.structural.adapter;

public class Client {
    public static void main(String[] args) {
        XmlOutput xmlOutput = new XmlOutput();
        JsonClient jsonClient = new JsonClient();

        JsonAdapter adapter = new JsonAdapter(xmlOutput);
        jsonClient.processJsonData(adapter.getJsonData());
    }
}
