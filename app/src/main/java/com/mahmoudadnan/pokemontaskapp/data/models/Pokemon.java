package com.mahmoudadnan.pokemontaskapp.data.models;

public class Pokemon {
    private Ability[] abilities;
    private long baseExperience;
    private Species[] forms;
    private Object[] gameIndices;
    private long height;
    private Object[] heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private Object[] moves;
    private String name;
    private long order;
    private Object[] pastTypes;
    private Species species;
    private Sprites sprites;
    private Stat[] stats;
    private Type[] types;
    private long weight;

    public Ability[] getAbilities() { return abilities; }
    public void setAbilities(Ability[] value) { this.abilities = value; }

    public long getBaseExperience() { return baseExperience; }
    public void setBaseExperience(long value) { this.baseExperience = value; }

    public Species[] getForms() { return forms; }
    public void setForms(Species[] value) { this.forms = value; }

    public Object[] getGameIndices() { return gameIndices; }
    public void setGameIndices(Object[] value) { this.gameIndices = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public Object[] getHeldItems() { return heldItems; }
    public void setHeldItems(Object[] value) { this.heldItems = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getIsDefault() { return isDefault; }
    public void setIsDefault(boolean value) { this.isDefault = value; }

    public String getLocationAreaEncounters() { return locationAreaEncounters; }
    public void setLocationAreaEncounters(String value) { this.locationAreaEncounters = value; }

    public Object[] getMoves() { return moves; }
    public void setMoves(Object[] value) { this.moves = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public Object[] getPastTypes() { return pastTypes; }
    public void setPastTypes(Object[] value) { this.pastTypes = value; }

    public Species getSpecies() { return species; }
    public void setSpecies(Species value) { this.species = value; }

    public Sprites getSprites() { return sprites; }
    public void setSprites(Sprites value) { this.sprites = value; }

    public Stat[] getStats() { return stats; }
    public void setStats(Stat[] value) { this.stats = value; }

    public Type[] getTypes() { return types; }
    public void setTypes(Type[] value) { this.types = value; }

    public long getWeight() { return weight; }
    public void setWeight(long value) { this.weight = value; }
}
