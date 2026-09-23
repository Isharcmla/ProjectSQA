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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_consumeToAny_142270361050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1273;
     Object term1320;
     Object term7680;
     Object term7689;

    public CharacterReader_consumeToAny_142270361050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1273 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1274 = (char[]) newCharArray(5);
        Object[] term1283 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term1274, 0, 'S');
        setCharElement(term1274, 1, 'b');
        setCharElement(term1274, 2, 'S');
        setCharElement(term1274, 3, 'z');
        setCharElement(term1274, 4, 'j');
        setField(term1273, term1273.getClass(), "input", term1274);
        setIntField(term1273, term1273.getClass(), "length", 679763016);
        setIntField(term1273, term1273.getClass(), "pos", 1962444399);
        setIntField(term1273, term1273.getClass(), "mark", 767834723);
        setElement(term1283, 0, "jDtqGUpnZN");
        setElement(term1283, 1, "nGKItKLYNC");
        setElement(term1283, 2, "UiUYnPrcCi");
        setField(term1273, term1273.getClass(), "stringCache", term1283);
        term1320 = (char[]) newCharArray(7);
        setCharElement(term1320, 0, 'V');
        setCharElement(term1320, 1, 'p');
        setCharElement(term1320, 2, 'O');
        setCharElement(term1320, 3, 'Q');
        setCharElement(term1320, 4, 'T');
        setCharElement(term1320, 5, 'y');
        setCharElement(term1320, 6, 'S');
        term7680 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term7681 = (char[]) newCharArray(5);
        Object[] term7682 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term7681, 0, 'S');
        setCharElement(term7681, 1, 'b');
        setCharElement(term7681, 2, 'S');
        setCharElement(term7681, 3, 'z');
        setCharElement(term7681, 4, 'j');
        setField(term7680, term7680.getClass(), "input", term7681);
        setIntField(term7680, term7680.getClass(), "length", 679763016);
        setIntField(term7680, term7680.getClass(), "pos", 1962444399);
        setIntField(term7680, term7680.getClass(), "mark", 767834723);
        setElement(term7682, 0, "jDtqGUpnZN");
        setElement(term7682, 1, "nGKItKLYNC");
        setElement(term7682, 2, "UiUYnPrcCi");
        setField(term7680, term7680.getClass(), "stringCache", term7682);
        term7689 = (char[]) newCharArray(7);
        setCharElement(term7689, 0, 'V');
        setCharElement(term7689, 1, 'p');
        setCharElement(term7689, 2, 'O');
        setCharElement(term7689, 3, 'Q');
        setCharElement(term7689, 4, 'T');
        setCharElement(term7689, 5, 'y');
        setCharElement(term7689, 6, 'S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1320;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term1273, args);
        assertTrue(recursiveEquals(term1273, term7680));
        assertTrue(recursiveEquals(term1320, term7689));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


