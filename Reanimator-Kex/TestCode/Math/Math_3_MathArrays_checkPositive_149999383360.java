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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_checkPositive_149999383360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;
     Object term12822;

    public MathArrays_checkPositive_149999383360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1634 = (double[]) newDoubleArray(2);
        setDoubleElement(term1634, 0, 0.5412182593116958);
        setDoubleElement(term1634, 1, 0.16988691727397487);
        term12822 = (double[]) newDoubleArray(2);
        setDoubleElement(term12822, 0, 0.5412182593116958);
        setDoubleElement(term12822, 1, 0.16988691727397487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1634;
        callMethod(klass, "checkPositive", argTypes, null, args);
        assertTrue(recursiveEquals(term1634, term12822));
    }

};


