package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChiSquareTestImpl_isPositive_27167295372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29539;
     Object term29362;

    public ChiSquareTestImpl_isPositive_27167295372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29539 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        term29362 = (double[]) newDoubleArray(5);
        setDoubleElement(term29362, 0, 9.007199254740992E15);
        setDoubleElement(term29362, 1, 4.503599627370497E15);
        setDoubleElement(term29362, 2, 4.503599627370497E15);
        setDoubleElement(term29362, 3, 4.503599627370497E15);
        setDoubleElement(term29362, 4, 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29362;
        callMethod(klass, "isPositive", argTypes, term29539, args);
    }

};


