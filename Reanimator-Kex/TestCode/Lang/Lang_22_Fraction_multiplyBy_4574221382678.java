package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221382678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878079;
     Object term878161;

    public Fraction_multiplyBy_4574221382678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term878079 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term878079, term878079.getClass(), "numerator", 360118162);
        term878161 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term878161, term878161.getClass(), "numerator", 67536786);
        setIntField(term878161, term878161.getClass(), "denominator", 2015071797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term878161;
        try {
            callMethod(klass, "multiplyBy", argTypes, term878079, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


