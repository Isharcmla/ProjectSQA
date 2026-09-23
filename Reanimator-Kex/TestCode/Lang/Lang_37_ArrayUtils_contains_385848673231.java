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

public class ArrayUtils_contains_385848673231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;
     Object term621;
     Object term12796;

    public ArrayUtils_contains_385848673231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = (int[]) newIntArray(9);
        setIntElement(term611, 0, 1328271830);
        setIntElement(term611, 1, 1596070772);
        setIntElement(term611, 2, 97029295);
        setIntElement(term611, 3, -1371869594);
        setIntElement(term611, 4, -2095575670);
        setIntElement(term611, 5, 1225272962);
        setIntElement(term611, 6, 1324040357);
        setIntElement(term611, 7, -1588772968);
        setIntElement(term611, 8, -93135961);
        term621 = new Integer(-112921587);
        term12796 = (int[]) newIntArray(9);
        setIntElement(term12796, 0, 1328271830);
        setIntElement(term12796, 1, 1596070772);
        setIntElement(term12796, 2, 97029295);
        setIntElement(term12796, 3, -1371869594);
        setIntElement(term12796, 4, -2095575670);
        setIntElement(term12796, 5, 1225272962);
        setIntElement(term12796, 6, 1324040357);
        setIntElement(term12796, 7, -1588772968);
        setIntElement(term12796, 8, -93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term611;
        args[1] = term621;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term611, term12796));
        assertTrue(recursiveEquals(term621, -112921587));
        assertTrue(recursiveEquals(retValue, false));
    }

};


