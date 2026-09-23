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

public class Fraction_subtract_2650031232065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673112;
     Object term673194;

    public Fraction_subtract_2650031232065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673112 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term673112, term673112.getClass(), "numerator", 2);
        setIntField(term673112, term673112.getClass(), "denominator", -1798189384);
        term673194 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term673194, term673194.getClass(), "numerator", 8388608);
        setIntField(term673194, term673194.getClass(), "denominator", 968492604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term673194;
        try {
            callMethod(klass, "subtract", argTypes, term673112, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


