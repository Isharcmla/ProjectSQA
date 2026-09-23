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

public class ArrayUtils_toObject_1005574769271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1132;
     Object term14170;
     Object term14147;

    public ArrayUtils_toObject_1005574769271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1132 = (char[]) newCharArray(7);
        setCharElement(term1132, 0, 'T');
        setCharElement(term1132, 1, 'y');
        setCharElement(term1132, 2, 'S');
        setCharElement(term1132, 3, 'M');
        setCharElement(term1132, 4, 'j');
        setCharElement(term1132, 5, 'G');
        setCharElement(term1132, 6, 'Y');
        term14170 = (char[]) newCharArray(7);
        setCharElement(term14170, 0, 'T');
        setCharElement(term14170, 1, 'y');
        setCharElement(term14170, 2, 'S');
        setCharElement(term14170, 3, 'M');
        setCharElement(term14170, 4, 'j');
        setCharElement(term14170, 5, 'G');
        setCharElement(term14170, 6, 'Y');
        Character term14148 = new Character('T');
        Character term14150 = new Character('y');
        Character term14152 = new Character('S');
        Character term14154 = new Character('M');
        Character term14156 = new Character('j');
        Character term14158 = new Character('G');
        Character term14160 = new Character('Y');
        term14147 = (Object[]) newArray("java.lang.Character", 7);
        setElement(term14147, 0, term14148);
        setElement(term14147, 1, term14150);
        setElement(term14147, 2, term14152);
        setElement(term14147, 3, term14154);
        setElement(term14147, 4, term14156);
        setElement(term14147, 5, term14158);
        setElement(term14147, 6, term14160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1132;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1132, term14170));
        assertTrue(recursiveEquals(retValue, term14147));
    }

};


