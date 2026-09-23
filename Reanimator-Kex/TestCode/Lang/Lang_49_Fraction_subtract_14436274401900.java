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

public class Fraction_subtract_14436274401900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557984;
     Object term558064;

    public Fraction_subtract_14436274401900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557984 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term557984, term557984.getClass(), "numerator", 4096);
        setIntField(term557984, term557984.getClass(), "denominator", -1176510504);
        term558064 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term558064, term558064.getClass(), "numerator", 536870912);
        setIntField(term558064, term558064.getClass(), "denominator", 1203008076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term558064;
        try {
            callMethod(klass, "subtract", argTypes, term557984, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


