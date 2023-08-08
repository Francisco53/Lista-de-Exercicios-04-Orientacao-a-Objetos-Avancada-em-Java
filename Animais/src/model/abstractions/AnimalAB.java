package model.abstractions;

import model.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    
    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();
    
}
