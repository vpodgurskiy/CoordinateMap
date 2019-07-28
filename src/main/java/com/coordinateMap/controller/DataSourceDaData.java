package com.coordinateMap;

import ru.dadata.api.DaData;
import ru.dadata.api.entity.Address;

public class DataSourceDaData {
    private DaData daData;
    private Address address;

    public DataSourceDaData() {
        this.daData = new DaData("267a735dd35306f2864bd9f0cae62267bc63f3f4",
                "f146ace67f5b121522ea8f5967cc4ead2c941a57");
    }

    public void fillDaDataInformation(final DaDataType daDataType, final String inputData) {
        switch (daDataType) {
            case ADDRESS:
                address = daData.cleanAddress(inputData);
                break;
            default:
                break;
        }
    }

    public Address getAddress() {
        return address;
    }
}
