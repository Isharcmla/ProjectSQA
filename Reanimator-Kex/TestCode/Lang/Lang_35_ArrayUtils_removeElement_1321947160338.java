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

public class ArrayUtils_removeElement_1321947160338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;
     Object term1875;
     Object term24970;
     Object term24965;

    public ArrayUtils_removeElement_1321947160338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1870 = (char[]) newCharArray(4);
        setCharElement(term1870, 0, 'd');
        setCharElement(term1870, 1, 'v');
        setCharElement(term1870, 2, 'g');
        setCharElement(term1870, 3, 'J');
        term1875 = new Character('l');
        term24970 = (char[]) newCharArray(4);
        setCharElement(term24970, 0, 'd');
        setCharElement(term24970, 1, 'v');
        setCharElement(term24970, 2, 'g');
        setCharElement(term24970, 3, 'J');
        term24965 = (char[]) newCharArray(4);
        setCharElement(term24965, 0, 'd');
        setCharElement(term24965, 1, 'v');
        setCharElement(term24965, 2, 'g');
        setCharElement(term24965, 3, 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1870;
        args[1] = term1875;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1870, term24970));
        assertTrue(recursiveEquals(term1875, 'l'));
        assertTrue(recursiveEquals(retValue, term24965));
    }

};


