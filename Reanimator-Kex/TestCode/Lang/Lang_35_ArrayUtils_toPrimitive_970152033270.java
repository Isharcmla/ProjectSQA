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

public class ArrayUtils_toPrimitive_970152033270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;
     Object term1130;
     Object term14118;
     Object term14088;

    public ArrayUtils_toPrimitive_970152033270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1112 = new Character('S');
        Character term1114 = new Character('S');
        Character term1116 = new Character('b');
        Character term1118 = new Character('S');
        Character term1120 = new Character('z');
        Character term1122 = new Character('j');
        Character term1124 = new Character('V');
        Character term1126 = new Character('p');
        Character term1128 = new Character('O');
        term1111 = (Object[]) newArray("java.lang.Character", 9);
        setElement(term1111, 0, term1112);
        setElement(term1111, 1, term1114);
        setElement(term1111, 2, term1116);
        setElement(term1111, 3, term1118);
        setElement(term1111, 4, term1120);
        setElement(term1111, 5, term1122);
        setElement(term1111, 6, term1124);
        setElement(term1111, 7, term1126);
        setElement(term1111, 8, term1128);
        term1130 = new Character('Q');
        Character term14119 = new Character('S');
        Character term14120 = new Character('S');
        Character term14121 = new Character('b');
        Character term14122 = new Character('S');
        Character term14123 = new Character('z');
        Character term14124 = new Character('j');
        Character term14125 = new Character('V');
        Character term14126 = new Character('p');
        Character term14127 = new Character('O');
        term14118 = (Object[]) newArray("java.lang.Character", 9);
        setElement(term14118, 0, term14119);
        setElement(term14118, 1, term14120);
        setElement(term14118, 2, term14121);
        setElement(term14118, 3, term14122);
        setElement(term14118, 4, term14123);
        setElement(term14118, 5, term14124);
        setElement(term14118, 6, term14125);
        setElement(term14118, 7, term14126);
        setElement(term14118, 8, term14127);
        term14088 = (char[]) newCharArray(9);
        setCharElement(term14088, 0, 'S');
        setCharElement(term14088, 1, 'S');
        setCharElement(term14088, 2, 'b');
        setCharElement(term14088, 3, 'S');
        setCharElement(term14088, 4, 'z');
        setCharElement(term14088, 5, 'j');
        setCharElement(term14088, 6, 'V');
        setCharElement(term14088, 7, 'p');
        setCharElement(term14088, 8, 'O');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Character"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1111;
        args[1] = term1130;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1111, term14118));
        assertTrue(recursiveEquals(term1130, 'Q'));
        assertTrue(recursiveEquals(retValue, term14088));
    }

};


