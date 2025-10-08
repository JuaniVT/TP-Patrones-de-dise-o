package Flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory

class LetraFactory {

    private final Map<Character, Letra> letras = new HashMap<>();

    public Letra getLetra(char c) {
        if (!letras.containsKey(c)) {
            letras.put(c, new LetraConcreta(c));
        }
        return letras.get(c);

    }

}