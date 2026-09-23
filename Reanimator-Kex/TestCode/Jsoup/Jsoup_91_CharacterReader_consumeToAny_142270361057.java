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

public class CharacterReader_consumeToAny_142270361057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1385;
     Object term1424;
     Object term9167;
     Object term9174;

    public CharacterReader_consumeToAny_142270361057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1385 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1386 = (char[]) newCharArray(7);
        Object[] term1399 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term1386, 0, 'V');
        setCharElement(term1386, 1, 'p');
        setCharElement(term1386, 2, 'O');
        setCharElement(term1386, 3, 'Q');
        setCharElement(term1386, 4, 'T');
        setCharElement(term1386, 5, 'y');
        setCharElement(term1386, 6, 'S');
        setField(term1385, term1385.getClass(), "charBuf", term1386);
        setField(term1385, term1385.getClass(), "reader", null);
        setIntField(term1385, term1385.getClass(), "bufLength", 962840079);
        setIntField(term1385, term1385.getClass(), "bufSplitPoint", 1540719661);
        setIntField(term1385, term1385.getClass(), "bufPos", 1265463001);
        setIntField(term1385, term1385.getClass(), "readerPos", 335112684);
        setIntField(term1385, term1385.getClass(), "bufMark", 1551099402);
        setElement(term1399, 0, "UoYtihxVaS");
        setElement(term1399, 1, "JDswTTCZHV");
        setField(term1385, term1385.getClass(), "stringCache", term1399);
        term1424 = (char[]) newCharArray(6);
        setCharElement(term1424, 0, 'M');
        setCharElement(term1424, 1, 'j');
        setCharElement(term1424, 2, 'G');
        setCharElement(term1424, 3, 'Y');
        setCharElement(term1424, 4, 'S');
        setCharElement(term1424, 5, 'R');
        term9167 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term9168 = (char[]) newCharArray(7);
        Object[] term9169 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term9168, 0, 'V');
        setCharElement(term9168, 1, 'p');
        setCharElement(term9168, 2, 'O');
        setCharElement(term9168, 3, 'Q');
        setCharElement(term9168, 4, 'T');
        setCharElement(term9168, 5, 'y');
        setCharElement(term9168, 6, 'S');
        setField(term9167, term9167.getClass(), "charBuf", term9168);
        setField(term9167, term9167.getClass(), "reader", null);
        setIntField(term9167, term9167.getClass(), "bufLength", 962840079);
        setIntField(term9167, term9167.getClass(), "bufSplitPoint", 1540719661);
        setIntField(term9167, term9167.getClass(), "bufPos", 1265463001);
        setIntField(term9167, term9167.getClass(), "readerPos", 335112684);
        setIntField(term9167, term9167.getClass(), "bufMark", 1551099402);
        setElement(term9169, 0, "UoYtihxVaS");
        setElement(term9169, 1, "JDswTTCZHV");
        setField(term9167, term9167.getClass(), "stringCache", term9169);
        term9174 = (char[]) newCharArray(6);
        setCharElement(term9174, 0, 'M');
        setCharElement(term9174, 1, 'j');
        setCharElement(term9174, 2, 'G');
        setCharElement(term9174, 3, 'Y');
        setCharElement(term9174, 4, 'S');
        setCharElement(term9174, 5, 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1424;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term1385, args);
        assertTrue(recursiveEquals(term1385, term9167));
        assertTrue(recursiveEquals(term1424, term9174));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


