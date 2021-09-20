package com.example.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        switch (this){
            case HOUSEKEEPING:
                return "Housekeeping";
            case CONCIERGE:
                return "Concierge";
            case FRONT_DESK:
                return "front Desk";
            case SECURITY:
                return "Security";
        }
        return "";
    }
}
