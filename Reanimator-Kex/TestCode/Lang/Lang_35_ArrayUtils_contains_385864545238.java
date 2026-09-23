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
import java.lang.Short;

public class ArrayUtils_contains_385864545238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;
     Object term725;
     Object term13062;

    public ArrayUtils_contains_385864545238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717 = (short[]) newShortArray(7);
        setShortElement(term717, 0, (short) 17129);
        setShortElement(term717, 1, (short) -14492);
        setShortElement(term717, 2, (short) -19350);
        setShortElement(term717, 3, (short) 3527);
        setShortElement(term717, 4, (short) 15769);
        setShortElement(term717, 5, (short) -1950);
        setShortElement(term717, 6, (short) -14769);
        term725 = new Short((short) 2621);
        term13062 = (short[]) newShortArray(7);
        setShortElement(term13062, 0, (short) 17129);
        setShortElement(term13062, 1, (short) -14492);
        setShortElement(term13062, 2, (short) -19350);
        setShortElement(term13062, 3, (short) 3527);
        setShortElement(term13062, 4, (short) 15769);
        setShortElement(term13062, 5, (short) -1950);
        setShortElement(term13062, 6, (short) -14769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term717;
        args[1] = term725;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term717, term13062));
        assertTrue(recursiveEquals(term725, (short) 2621));
        assertTrue(recursiveEquals(retValue, false));
    }

};


