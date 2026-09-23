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
import java.lang.Double;

public class MathArrays_scaleInPlace_155432207743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term16;
     Object term2438;

    public MathArrays_scaleInPlace_155432207743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = new Double(0.2641345529914265);
        term16 = (double[]) newDoubleArray(4);
        setDoubleElement(term16, 0, 0.36923381893433327);
        setDoubleElement(term16, 1, 0.6076495596892013);
        setDoubleElement(term16, 2, 0.37773193782763337);
        setDoubleElement(term16, 3, 0.8474802076607362);
        term2438 = (double[]) newDoubleArray(4);
        setDoubleElement(term2438, 0, 0.09752740971353743);
        setDoubleElement(term2438, 1, 0.16050124482394434);
        setDoubleElement(term2438, 2, 0.09977205654868725);
        setDoubleElement(term2438, 3, 0.22384880581954986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term14;
        args[1] = term16;
        callMethod(klass, "scaleInPlace", argTypes, null, args);
        assertTrue(recursiveEquals(term14, 0.2641345529914265));
        assertTrue(recursiveEquals(term16, term2438));
    }

};


