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
import java.lang.Character;

public class ArrayUtils_removeElement_1321947160336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;
     Object term1859;
     Object term24913;
     Object term24908;

    public ArrayUtils_removeElement_1321947160336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1854 = (char[]) newCharArray(4);
        setCharElement(term1854, 0, 'd');
        setCharElement(term1854, 1, 'v');
        setCharElement(term1854, 2, 'g');
        setCharElement(term1854, 3, 'J');
        term1859 = new Character('l');
        term24913 = (char[]) newCharArray(4);
        setCharElement(term24913, 0, 'd');
        setCharElement(term24913, 1, 'v');
        setCharElement(term24913, 2, 'g');
        setCharElement(term24913, 3, 'J');
        term24908 = (char[]) newCharArray(4);
        setCharElement(term24908, 0, 'd');
        setCharElement(term24908, 1, 'v');
        setCharElement(term24908, 2, 'g');
        setCharElement(term24908, 3, 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1854;
        args[1] = term1859;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1854, term24913));
        assertTrue(recursiveEquals(term1859, 'l'));
        assertTrue(recursiveEquals(retValue, term24908));
    }

};


