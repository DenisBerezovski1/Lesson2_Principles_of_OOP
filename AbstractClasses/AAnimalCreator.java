package lesson2.AbstractClasses;

import lesson2.Interfaces.Animals.*;

public abstract class AAnimalCreator implements GetCat,
        GetDog,
        GetHen,
        GetStork,
        GetTiger,
        GetWolf{
    protected AAnimalParamCreator paramCreator;
}
