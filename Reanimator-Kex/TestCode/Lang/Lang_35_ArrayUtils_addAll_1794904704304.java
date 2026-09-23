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

public class ArrayUtils_addAll_1794904704304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446;
     Object term1447;
     Object term15045;
     Object term15046;
     Object term15032;

    public ArrayUtils_addAll_1794904704304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1446 = (char[]) newCharArray(0);
        term1447 = (char[]) newCharArray(5);
        setCharElement(term1447, 0, 'N');
        setCharElement(term1447, 1, 'F');
        setCharElement(term1447, 2, 'h');
        setCharElement(term1447, 3, 'R');
        setCharElement(term1447, 4, 'N');
        term15045 = (char[]) newCharArray(0);
        term15046 = (char[]) newCharArray(5);
        setCharElement(term15046, 0, 'N');
        setCharElement(term15046, 1, 'F');
        setCharElement(term15046, 2, 'h');
        setCharElement(term15046, 3, 'R');
        setCharElement(term15046, 4, 'N');
        term15032 = (char[]) newCharArray(5);
        setCharElement(term15032, 0, 'N');
        setCharElement(term15032, 1, 'F');
        setCharElement(term15032, 2, 'h');
        setCharElement(term15032, 3, 'R');
        setCharElement(term15032, 4, 'N');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1446;
        args[1] = term1447;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1446, term15045));
        assertTrue(recursiveEquals(term1447, term15046));
        assertTrue(recursiveEquals(retValue, term15032));
    }

};


