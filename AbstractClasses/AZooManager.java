package lesson2.AbstractClasses;

import lesson2.Interfaces.Params.GetIndex;
import lesson2.Interfaces.ZooManager.*;

import java.io.BufferedReader;

public abstract class AZooManager implements PlayAllCry, PlayCry, PrintAllInfo, PrintInfo, AddAnimal, GetIndex, DelAnimal {
    protected AAnimalCreator creator;
    protected AZoo zoo;
    protected BufferedReader reader;
}
