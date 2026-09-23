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
import java.lang.Double;

public class ArrayUtils_indexOf_1060270074248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;
     Object term846;
     Object term848;
     Object term13359;

    public ArrayUtils_indexOf_1060270074248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = (double[]) newDoubleArray(1);
        setDoubleElement(term844, 0, 0.5840714198152577);
        term846 = new Double(0.7559240768573477);
        term848 = new Double(0.10667076642995188);
        term13359 = (double[]) newDoubleArray(1);
        setDoubleElement(term13359, 0, 0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term844;
        args[1] = term846;
        args[2] = term848;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term844, term13359));
        assertTrue(recursiveEquals(term846, 0.7559240768573477));
        assertTrue(recursiveEquals(term848, 0.10667076642995188));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


