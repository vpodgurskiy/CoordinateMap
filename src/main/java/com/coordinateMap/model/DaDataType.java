package com.coordinateMap;

public enum DaDataType {
    ADDRESS("address information");

    public String getDescribe() {
        return describe;
    }

    private final String describe;

    DaDataType(String s) {
        this.describe = s;
    }


}
