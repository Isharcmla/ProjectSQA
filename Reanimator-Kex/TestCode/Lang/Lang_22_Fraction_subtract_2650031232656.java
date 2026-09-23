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

public class Fraction_subtract_2650031232656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869630;
     Object term869712;

    public Fraction_subtract_2650031232656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term869630 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term869630, term869630.getClass(), "numerator", 67108864);
        setIntField(term869630, term869630.getClass(), "denominator", -541610504);
        term869712 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term869712, term869712.getClass(), "numerator", 1048576);
        setIntField(term869712, term869712.getClass(), "denominator", 377241308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term869712;
        try {
            callMethod(klass, "subtract", argTypes, term869630, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


