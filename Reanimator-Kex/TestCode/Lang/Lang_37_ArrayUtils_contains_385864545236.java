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

public class ArrayUtils_contains_385864545236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term714;
     Object term13016;

    public ArrayUtils_contains_385864545236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706 = (short[]) newShortArray(7);
        setShortElement(term706, 0, (short) 17129);
        setShortElement(term706, 1, (short) -14492);
        setShortElement(term706, 2, (short) -19350);
        setShortElement(term706, 3, (short) 3527);
        setShortElement(term706, 4, (short) 15769);
        setShortElement(term706, 5, (short) -1950);
        setShortElement(term706, 6, (short) -14769);
        term714 = new Short((short) 2621);
        term13016 = (short[]) newShortArray(7);
        setShortElement(term13016, 0, (short) 17129);
        setShortElement(term13016, 1, (short) -14492);
        setShortElement(term13016, 2, (short) -19350);
        setShortElement(term13016, 3, (short) 3527);
        setShortElement(term13016, 4, (short) 15769);
        setShortElement(term13016, 5, (short) -1950);
        setShortElement(term13016, 6, (short) -14769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term706;
        args[1] = term714;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term706, term13016));
        assertTrue(recursiveEquals(term714, (short) 2621));
        assertTrue(recursiveEquals(retValue, false));
    }

};


