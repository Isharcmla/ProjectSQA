package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MathUtils_equals_176199458485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term75;
     Object term4187;
     Object term4188;

    public MathUtils_equals_176199458485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = (double[]) newDoubleArray(5);
        setDoubleElement(term69, 0, 0.6436713023569729);
        setDoubleElement(term69, 1, 0.7332741045694002);
        setDoubleElement(term69, 2, 0.4569171842750229);
        setDoubleElement(term69, 3, 0.8598297828918529);
        setDoubleElement(term69, 4, 0.43692187681405226);
        term75 = (double[]) newDoubleArray(4);
        setDoubleElement(term75, 0, 0.7633268466829064);
        setDoubleElement(term75, 1, 0.13481025392611334);
        setDoubleElement(term75, 2, 0.3800088629986428);
        setDoubleElement(term75, 3, 0.5840714198152577);
        term4187 = (double[]) newDoubleArray(5);
        setDoubleElement(term4187, 0, 0.6436713023569729);
        setDoubleElement(term4187, 1, 0.7332741045694002);
        setDoubleElement(term4187, 2, 0.4569171842750229);
        setDoubleElement(term4187, 3, 0.8598297828918529);
        setDoubleElement(term4187, 4, 0.43692187681405226);
        term4188 = (double[]) newDoubleArray(4);
        setDoubleElement(term4188, 0, 0.7633268466829064);
        setDoubleElement(term4188, 1, 0.13481025392611334);
        setDoubleElement(term4188, 2, 0.3800088629986428);
        setDoubleElement(term4188, 3, 0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term69;
        args[1] = term75;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term69, term4187));
        assertTrue(recursiveEquals(term75, term4188));
        assertTrue(recursiveEquals(retValue, false));
    }

};


