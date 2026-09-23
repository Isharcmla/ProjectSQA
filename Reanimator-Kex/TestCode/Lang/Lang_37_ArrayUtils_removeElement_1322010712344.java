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

public class ArrayUtils_removeElement_1322010712344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922;
     Object term1927;
     Object term26239;
     Object term26234;

    public ArrayUtils_removeElement_1322010712344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922 = (long[]) newLongArray(4);
        setLongElement(term1922, 0, -8654565919063661957L);
        setLongElement(term1922, 1, -5248475803419977214L);
        setLongElement(term1922, 2, -6723783499250797216L);
        setLongElement(term1922, 3, 41775768178052008L);
        term1927 = new Long(6682528376118987775L);
        term26239 = (long[]) newLongArray(4);
        setLongElement(term26239, 0, -8654565919063661957L);
        setLongElement(term26239, 1, -5248475803419977214L);
        setLongElement(term26239, 2, -6723783499250797216L);
        setLongElement(term26239, 3, 41775768178052008L);
        term26234 = (long[]) newLongArray(4);
        setLongElement(term26234, 0, -8654565919063661957L);
        setLongElement(term26234, 1, -5248475803419977214L);
        setLongElement(term26234, 2, -6723783499250797216L);
        setLongElement(term26234, 3, 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1922;
        args[1] = term1927;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1922, term26239));
        assertTrue(recursiveEquals(term1927, 6682528376118987775L));
        assertTrue(recursiveEquals(retValue, term26234));
    }

};


