package com.mahmoudadnan.pokemontaskapp.data.models;

public class Type {
    private long slot;
    private Species type;

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }

    public Species getType() { return type; }
    public void setType(Species value) { this.type = value; }
}
