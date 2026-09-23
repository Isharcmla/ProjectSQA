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

public class MathArrays_equalsIncludingNaN_107266757877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2341;
     Object term2348;
     Object term19650;
     Object term19651;

    public MathArrays_equalsIncludingNaN_107266757877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2341 = (double[]) newDoubleArray(6);
        setDoubleElement(term2341, 0, 0.1163034938203874);
        setDoubleElement(term2341, 1, 0.1187814206908886);
        setDoubleElement(term2341, 2, 0.04662501176438627);
        setDoubleElement(term2341, 3, 0.17512426723256447);
        setDoubleElement(term2341, 4, 0.9379214810416256);
        setDoubleElement(term2341, 5, 0.10807577760679721);
        term2348 = (double[]) newDoubleArray(0);
        term19650 = (double[]) newDoubleArray(6);
        setDoubleElement(term19650, 0, 0.1163034938203874);
        setDoubleElement(term19650, 1, 0.1187814206908886);
        setDoubleElement(term19650, 2, 0.04662501176438627);
        setDoubleElement(term19650, 3, 0.17512426723256447);
        setDoubleElement(term19650, 4, 0.9379214810416256);
        setDoubleElement(term19650, 5, 0.10807577760679721);
        term19651 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2341;
        args[1] = term2348;
        Object retValue = callMethod(klass, "equalsIncludingNaN", argTypes, null, args);
        assertTrue(recursiveEquals(term2341, term19650));
        assertTrue(recursiveEquals(term2348, term19651));
        assertTrue(recursiveEquals(retValue, false));
    }

};


