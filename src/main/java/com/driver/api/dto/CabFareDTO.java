package com.driver.api.dto;

import lombok.Data;

@Data
public class CabFareDTO {
    private int fare;

    public int getFare() {
        return fare;
    }
}
