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

public class ChiSquareTestImpl_isPositive_27167295365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28518;
     Object term28360;

    public ChiSquareTestImpl_isPositive_27167295365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28518 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        term28360 = (double[]) newDoubleArray(3);
        setDoubleElement(term28360, 0, 9.007199254740992E15);
        setDoubleElement(term28360, 1, 4.503599627370497E15);
        setDoubleElement(term28360, 2, 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28360;
        callMethod(klass, "isPositive", argTypes, term28518, args);
    }

};


