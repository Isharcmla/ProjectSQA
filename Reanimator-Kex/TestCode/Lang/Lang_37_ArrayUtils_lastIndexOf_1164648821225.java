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
import java.lang.Long;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1164648821225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term554;
     Object term556;
     Object term12621;

    public ArrayUtils_lastIndexOf_1164648821225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = (long[]) newLongArray(2);
        setLongElement(term551, 0, 1233889271256172047L);
        setLongElement(term551, 1, 6617340557564669657L);
        term554 = new Long(1439298019805881866L);
        term556 = new Integer(767834723);
        term12621 = (long[]) newLongArray(2);
        setLongElement(term12621, 0, 1233889271256172047L);
        setLongElement(term12621, 1, 6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term551;
        args[1] = term554;
        args[2] = term556;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term551, term12621));
        assertTrue(recursiveEquals(term554, 1439298019805881866L));
        assertTrue(recursiveEquals(term556, 767834723));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


