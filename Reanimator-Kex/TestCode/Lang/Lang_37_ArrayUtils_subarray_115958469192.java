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
import java.lang.Integer;

public class ArrayUtils_subarray_115958469192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;
     Object term166;
     Object term168;
     Object term11449;
     Object term11435;

    public ArrayUtils_subarray_115958469192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = (char[]) newCharArray(5);
        setCharElement(term160, 0, 'A');
        setCharElement(term160, 1, 'E');
        setCharElement(term160, 2, 'B');
        setCharElement(term160, 3, 't');
        setCharElement(term160, 4, 'n');
        term166 = new Integer(-1456670397);
        term168 = new Integer(1622346318);
        term11449 = (char[]) newCharArray(5);
        setCharElement(term11449, 0, 'A');
        setCharElement(term11449, 1, 'E');
        setCharElement(term11449, 2, 'B');
        setCharElement(term11449, 3, 't');
        setCharElement(term11449, 4, 'n');
        term11435 = (char[]) newCharArray(5);
        setCharElement(term11435, 0, 'A');
        setCharElement(term11435, 1, 'E');
        setCharElement(term11435, 2, 'B');
        setCharElement(term11435, 3, 't');
        setCharElement(term11435, 4, 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term160;
        args[1] = term166;
        args[2] = term168;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term160, term11449));
        assertTrue(recursiveEquals(term166, -1456670397));
        assertTrue(recursiveEquals(term168, 1622346318));
        assertTrue(recursiveEquals(retValue, term11435));
    }

};


