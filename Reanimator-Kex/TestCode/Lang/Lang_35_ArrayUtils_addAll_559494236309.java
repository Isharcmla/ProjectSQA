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

public class ArrayUtils_addAll_559494236309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518;
     Object term1524;
     Object term15237;
     Object term15238;
     Object term15222;

    public ArrayUtils_addAll_559494236309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1518 = (float[]) newFloatArray(5);
        setFloatElement(term1518, 0, 0.51208574F);
        setFloatElement(term1518, 1, 0.28528106F);
        setFloatElement(term1518, 2, 0.30827713F);
        setFloatElement(term1518, 3, 0.63008493F);
        setFloatElement(term1518, 4, 0.97831506F);
        term1524 = (float[]) newFloatArray(1);
        setFloatElement(term1524, 0, 0.9737084F);
        term15237 = (float[]) newFloatArray(5);
        setFloatElement(term15237, 0, 0.51208574F);
        setFloatElement(term15237, 1, 0.28528106F);
        setFloatElement(term15237, 2, 0.30827713F);
        setFloatElement(term15237, 3, 0.63008493F);
        setFloatElement(term15237, 4, 0.97831506F);
        term15238 = (float[]) newFloatArray(1);
        setFloatElement(term15238, 0, 0.9737084F);
        term15222 = (float[]) newFloatArray(6);
        setFloatElement(term15222, 0, 0.51208574F);
        setFloatElement(term15222, 1, 0.28528106F);
        setFloatElement(term15222, 2, 0.30827713F);
        setFloatElement(term15222, 3, 0.63008493F);
        setFloatElement(term15222, 4, 0.97831506F);
        setFloatElement(term15222, 5, 0.9737084F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1518;
        args[1] = term1524;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1518, term15237));
        assertTrue(recursiveEquals(term1524, term15238));
        assertTrue(recursiveEquals(retValue, term15222));
    }

};


