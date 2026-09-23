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

public class NumberUtils_max_29829587288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589;
     Object term6286;

    public NumberUtils_max_29829587288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589 = (double[]) newDoubleArray(9);
        setDoubleElement(term589, 0, 0.7655020693602768);
        setDoubleElement(term589, 1, 0.1374549299694151);
        setDoubleElement(term589, 2, 0.7031006357544823);
        setDoubleElement(term589, 3, 0.9527281779865117);
        setDoubleElement(term589, 4, 0.9828442029246764);
        setDoubleElement(term589, 5, 0.2779719046761513);
        setDoubleElement(term589, 6, 0.6436713023569729);
        setDoubleElement(term589, 7, 0.7332741045694002);
        setDoubleElement(term589, 8, 0.4569171842750229);
        term6286 = (double[]) newDoubleArray(9);
        setDoubleElement(term6286, 0, 0.7655020693602768);
        setDoubleElement(term6286, 1, 0.1374549299694151);
        setDoubleElement(term6286, 2, 0.7031006357544823);
        setDoubleElement(term6286, 3, 0.9527281779865117);
        setDoubleElement(term6286, 4, 0.9828442029246764);
        setDoubleElement(term6286, 5, 0.2779719046761513);
        setDoubleElement(term6286, 6, 0.6436713023569729);
        setDoubleElement(term6286, 7, 0.7332741045694002);
        setDoubleElement(term6286, 8, 0.4569171842750229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term589;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term589, term6286));
    }

};


