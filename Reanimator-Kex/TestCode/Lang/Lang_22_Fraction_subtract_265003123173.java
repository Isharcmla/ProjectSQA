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

public class Fraction_subtract_265003123173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40815;
     Object term40897;

    public Fraction_subtract_265003123173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40815 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term40815, term40815.getClass(), "numerator", 524288);
        setIntField(term40815, term40815.getClass(), "denominator", -2101465832);
        term40897 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term40897, term40897.getClass(), "numerator", 16384);
        setIntField(term40897, term40897.getClass(), "denominator", 1386127340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term40897;
        try {
            callMethod(klass, "subtract", argTypes, term40815, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


