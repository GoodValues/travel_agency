package com.travel_agency.model.trip;

public enum AlimentationEnum {
    AI("All inclusive"),
    BB("Bed and Breakfast"),
    HB("Half Board"),
    FB("Full Board"),
    SC("Full Board");


    String description;

    AlimentationEnum() {
    }

    AlimentationEnum(String description) {
        this.description = description;
    }
}
