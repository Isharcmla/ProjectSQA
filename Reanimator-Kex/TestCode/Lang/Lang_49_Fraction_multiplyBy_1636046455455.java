package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_1636046455455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124361;
     Object term124441;

    public Fraction_multiplyBy_1636046455455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124361 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term124361, term124361.getClass(), "numerator", 402005874);
        setIntField(term124361, term124361.getClass(), "denominator", 1073741824);
        term124441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term124441, term124441.getClass(), "numerator", 1073741825);
        setIntField(term124441, term124441.getClass(), "denominator", 1679638661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term124441;
        try {
            callMethod(klass, "multiplyBy", argTypes, term124361, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


