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

public class ArrayUtils_removeElement_1322010712346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;
     Object term1943;
     Object term26260;
     Object term26255;

    public ArrayUtils_removeElement_1322010712346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1938 = (long[]) newLongArray(4);
        setLongElement(term1938, 0, -8654565919063661957L);
        setLongElement(term1938, 1, -5248475803419977214L);
        setLongElement(term1938, 2, -6723783499250797216L);
        setLongElement(term1938, 3, 41775768178052008L);
        term1943 = new Long(6682528376118987775L);
        term26260 = (long[]) newLongArray(4);
        setLongElement(term26260, 0, -8654565919063661957L);
        setLongElement(term26260, 1, -5248475803419977214L);
        setLongElement(term26260, 2, -6723783499250797216L);
        setLongElement(term26260, 3, 41775768178052008L);
        term26255 = (long[]) newLongArray(4);
        setLongElement(term26255, 0, -8654565919063661957L);
        setLongElement(term26255, 1, -5248475803419977214L);
        setLongElement(term26255, 2, -6723783499250797216L);
        setLongElement(term26255, 3, 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1938;
        args[1] = term1943;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1938, term26260));
        assertTrue(recursiveEquals(term1943, 6682528376118987775L));
        assertTrue(recursiveEquals(retValue, term26255));
    }

};


