package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class CharacterReader_consumeTo_154260165648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;
     Object term1062;

    public CharacterReader_consumeTo_154260165648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1011 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1012 = (char[]) newCharArray(9);
        Object[] term1025 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term1012, 0, 'Z');
        setCharElement(term1012, 1, 'p');
        setCharElement(term1012, 2, 'V');
        setCharElement(term1012, 3, 'm');
        setCharElement(term1012, 4, 'a');
        setCharElement(term1012, 5, 'n');
        setCharElement(term1012, 6, 'W');
        setCharElement(term1012, 7, 'E');
        setCharElement(term1012, 8, 'G');
        setField(term1011, term1011.getClass(), "input", term1012);
        setIntField(term1011, term1011.getClass(), "length", -226514366);
        setIntField(term1011, term1011.getClass(), "pos", 1193880199);
        setIntField(term1011, term1011.getClass(), "mark", -1087774327);
        setElement(term1025, 0, "aKnKipADSo");
        setElement(term1025, 1, "wSQxaModmm");
        setElement(term1025, 2, "UlajhuVLaP");
        setField(term1011, term1011.getClass(), "stringCache", term1025);
        term1062 = new Character('t');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1062;
        try {
            callMethod(klass, "consumeTo", argTypes, term1011, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


