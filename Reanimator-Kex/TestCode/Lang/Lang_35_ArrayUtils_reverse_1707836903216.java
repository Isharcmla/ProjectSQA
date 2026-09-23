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

public class ArrayUtils_reverse_1707836903216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;
     Object term12297;

    public ArrayUtils_reverse_1707836903216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440 = (double[]) newDoubleArray(8);
        setDoubleElement(term440, 0, 0.1374549299694151);
        setDoubleElement(term440, 1, 0.7031006357544823);
        setDoubleElement(term440, 2, 0.9527281779865117);
        setDoubleElement(term440, 3, 0.9828442029246764);
        setDoubleElement(term440, 4, 0.2779719046761513);
        setDoubleElement(term440, 5, 0.6436713023569729);
        setDoubleElement(term440, 6, 0.7332741045694002);
        setDoubleElement(term440, 7, 0.4569171842750229);
        term12297 = (double[]) newDoubleArray(8);
        setDoubleElement(term12297, 0, 0.4569171842750229);
        setDoubleElement(term12297, 1, 0.7332741045694002);
        setDoubleElement(term12297, 2, 0.6436713023569729);
        setDoubleElement(term12297, 3, 0.2779719046761513);
        setDoubleElement(term12297, 4, 0.9828442029246764);
        setDoubleElement(term12297, 5, 0.9527281779865117);
        setDoubleElement(term12297, 6, 0.7031006357544823);
        setDoubleElement(term12297, 7, 0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term440;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term440, term12297));
    }

};


