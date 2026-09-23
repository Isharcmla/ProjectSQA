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

public class ArrayUtils_addAll_559494236307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1510;
     Object term1516;
     Object term15198;
     Object term15199;
     Object term15183;

    public ArrayUtils_addAll_559494236307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1510 = (float[]) newFloatArray(5);
        setFloatElement(term1510, 0, 0.51208574F);
        setFloatElement(term1510, 1, 0.28528106F);
        setFloatElement(term1510, 2, 0.30827713F);
        setFloatElement(term1510, 3, 0.63008493F);
        setFloatElement(term1510, 4, 0.97831506F);
        term1516 = (float[]) newFloatArray(1);
        setFloatElement(term1516, 0, 0.9737084F);
        term15198 = (float[]) newFloatArray(5);
        setFloatElement(term15198, 0, 0.51208574F);
        setFloatElement(term15198, 1, 0.28528106F);
        setFloatElement(term15198, 2, 0.30827713F);
        setFloatElement(term15198, 3, 0.63008493F);
        setFloatElement(term15198, 4, 0.97831506F);
        term15199 = (float[]) newFloatArray(1);
        setFloatElement(term15199, 0, 0.9737084F);
        term15183 = (float[]) newFloatArray(6);
        setFloatElement(term15183, 0, 0.51208574F);
        setFloatElement(term15183, 1, 0.28528106F);
        setFloatElement(term15183, 2, 0.30827713F);
        setFloatElement(term15183, 3, 0.63008493F);
        setFloatElement(term15183, 4, 0.97831506F);
        setFloatElement(term15183, 5, 0.9737084F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1510;
        args[1] = term1516;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1510, term15198));
        assertTrue(recursiveEquals(term1516, term15199));
        assertTrue(recursiveEquals(retValue, term15183));
    }

};


