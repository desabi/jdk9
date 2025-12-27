package com.desabisc.interfaceseg.privateeg;

public class DataProcessorMain {
    public static void main(String[] args) {
        DataProcessorImpl dataProcessor = new DataProcessorImpl();
        dataProcessor.processJson("{\"key\": \"value\"}");
        dataProcessor.processXml("<key>value</key>");
    }
}
