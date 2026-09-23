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

public class ArrayUtils_subarray_115958469194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;
     Object term177;
     Object term179;
     Object term11495;
     Object term11481;

    public ArrayUtils_subarray_115958469194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171 = (char[]) newCharArray(5);
        setCharElement(term171, 0, 'A');
        setCharElement(term171, 1, 'E');
        setCharElement(term171, 2, 'B');
        setCharElement(term171, 3, 't');
        setCharElement(term171, 4, 'n');
        term177 = new Integer(-1456670397);
        term179 = new Integer(1622346318);
        term11495 = (char[]) newCharArray(5);
        setCharElement(term11495, 0, 'A');
        setCharElement(term11495, 1, 'E');
        setCharElement(term11495, 2, 'B');
        setCharElement(term11495, 3, 't');
        setCharElement(term11495, 4, 'n');
        term11481 = (char[]) newCharArray(5);
        setCharElement(term11481, 0, 'A');
        setCharElement(term11481, 1, 'E');
        setCharElement(term11481, 2, 'B');
        setCharElement(term11481, 3, 't');
        setCharElement(term11481, 4, 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term171;
        args[1] = term177;
        args[2] = term179;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term171, term11495));
        assertTrue(recursiveEquals(term177, -1456670397));
        assertTrue(recursiveEquals(term179, 1622346318));
        assertTrue(recursiveEquals(retValue, term11481));
    }

};


