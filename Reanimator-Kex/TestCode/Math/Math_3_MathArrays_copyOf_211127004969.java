package org.apache.commons.math3.util;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MathArrays_copyOf_211127004969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2174;
     Object term2182;

    public MathArrays_copyOf_211127004969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2174 = (double[]) newDoubleArray(7);
        setDoubleElement(term2174, 0, 0.5597136413549945);
        setDoubleElement(term2174, 1, 0.28292420012823627);
        setDoubleElement(term2174, 2, 0.5407563152320285);
        setDoubleElement(term2174, 3, 0.9485929668765458);
        setDoubleElement(term2174, 4, 0.5179319342588155);
        setDoubleElement(term2174, 5, 0.25025774487844066);
        setDoubleElement(term2174, 6, 0.1858089882752998);
        term2182 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2174;
        args[1] = term2182;
        try {
            callMethod(klass, "copyOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


