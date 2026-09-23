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

public class Fraction_subtract_265003123816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258248;
     Object term258330;

    public Fraction_subtract_265003123816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258248 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term258248, term258248.getClass(), "numerator", 1048576);
        setIntField(term258248, term258248.getClass(), "denominator", -1977612024);
        term258330 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term258330, term258330.getClass(), "numerator", 536870912);
        setIntField(term258330, term258330.getClass(), "denominator", 1634734244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term258330;
        try {
            callMethod(klass, "subtract", argTypes, term258248, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


