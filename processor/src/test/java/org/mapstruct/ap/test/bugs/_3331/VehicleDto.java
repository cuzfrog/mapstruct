/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._3331;

/**
 * @author Filip Hrisafov
 */
public abstract class VehicleDto {

    private final String name;

    protected VehicleDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Car extends VehicleDto {

        private final int numOfDoors;

        public Car(String name, int numOfDoors) {
            super( name );
            this.numOfDoors = numOfDoors;
        }

        public int getNumOfDoors() {
            return numOfDoors;
        }
    }

    public static class Motorbike extends VehicleDto {

        private final boolean allowedForMinor;

        public Motorbike(String name, boolean allowedForMinor) {
            super( name );
            this.allowedForMinor = allowedForMinor;
        }

        public boolean isAllowedForMinor() {
            return allowedForMinor;
        }
    }

}
