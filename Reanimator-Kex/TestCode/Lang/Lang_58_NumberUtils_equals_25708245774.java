package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_equals_25708245774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;
     Object term445;
     Object term5648;
     Object term5649;

    public NumberUtils_equals_25708245774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443 = (int[]) newIntArray(1);
        setIntElement(term443, 0, 1484323161);
        term445 = (int[]) newIntArray(6);
        setIntElement(term445, 0, 391863371);
        setIntElement(term445, 1, -1922583790);
        setIntElement(term445, 2, -616727354);
        setIntElement(term445, 3, -1955890973);
        setIntElement(term445, 4, -2038273078);
        setIntElement(term445, 5, 1227103734);
        term5648 = (int[]) newIntArray(1);
        setIntElement(term5648, 0, 1484323161);
        term5649 = (int[]) newIntArray(6);
        setIntElement(term5649, 0, 391863371);
        setIntElement(term5649, 1, -1922583790);
        setIntElement(term5649, 2, -616727354);
        setIntElement(term5649, 3, -1955890973);
        setIntElement(term5649, 4, -2038273078);
        setIntElement(term5649, 5, 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term443;
        args[1] = term445;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term443, term5648));
        assertTrue(recursiveEquals(term445, term5649));
        assertTrue(recursiveEquals(retValue, false));
    }

};


