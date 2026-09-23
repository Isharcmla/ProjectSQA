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

public class ArrayUtils_reverse_1707836903214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;
     Object term12251;

    public ArrayUtils_reverse_1707836903214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429 = (double[]) newDoubleArray(8);
        setDoubleElement(term429, 0, 0.1374549299694151);
        setDoubleElement(term429, 1, 0.7031006357544823);
        setDoubleElement(term429, 2, 0.9527281779865117);
        setDoubleElement(term429, 3, 0.9828442029246764);
        setDoubleElement(term429, 4, 0.2779719046761513);
        setDoubleElement(term429, 5, 0.6436713023569729);
        setDoubleElement(term429, 6, 0.7332741045694002);
        setDoubleElement(term429, 7, 0.4569171842750229);
        term12251 = (double[]) newDoubleArray(8);
        setDoubleElement(term12251, 0, 0.4569171842750229);
        setDoubleElement(term12251, 1, 0.7332741045694002);
        setDoubleElement(term12251, 2, 0.6436713023569729);
        setDoubleElement(term12251, 3, 0.2779719046761513);
        setDoubleElement(term12251, 4, 0.9828442029246764);
        setDoubleElement(term12251, 5, 0.9527281779865117);
        setDoubleElement(term12251, 6, 0.7031006357544823);
        setDoubleElement(term12251, 7, 0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term429;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term429, term12251));
    }

};


