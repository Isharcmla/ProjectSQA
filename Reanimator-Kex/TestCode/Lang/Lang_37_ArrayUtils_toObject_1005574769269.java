package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;

public class ArrayUtils_toObject_1005574769269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;
     Object term14124;
     Object term14101;

    public ArrayUtils_toObject_1005574769269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1121 = (char[]) newCharArray(7);
        setCharElement(term1121, 0, 'T');
        setCharElement(term1121, 1, 'y');
        setCharElement(term1121, 2, 'S');
        setCharElement(term1121, 3, 'M');
        setCharElement(term1121, 4, 'j');
        setCharElement(term1121, 5, 'G');
        setCharElement(term1121, 6, 'Y');
        term14124 = (char[]) newCharArray(7);
        setCharElement(term14124, 0, 'T');
        setCharElement(term14124, 1, 'y');
        setCharElement(term14124, 2, 'S');
        setCharElement(term14124, 3, 'M');
        setCharElement(term14124, 4, 'j');
        setCharElement(term14124, 5, 'G');
        setCharElement(term14124, 6, 'Y');
        Character term14102 = new Character('T');
        Character term14104 = new Character('y');
        Character term14106 = new Character('S');
        Character term14108 = new Character('M');
        Character term14110 = new Character('j');
        Character term14112 = new Character('G');
        Character term14114 = new Character('Y');
        term14101 = (Object[]) newArray("java.lang.Character", 7);
        setElement(term14101, 0, term14102);
        setElement(term14101, 1, term14104);
        setElement(term14101, 2, term14106);
        setElement(term14101, 3, term14108);
        setElement(term14101, 4, term14110);
        setElement(term14101, 5, term14112);
        setElement(term14101, 6, term14114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1121;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1121, term14124));
        assertTrue(recursiveEquals(retValue, term14101));
    }

};


