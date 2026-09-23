package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_74042599183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15839;
     Object term15929;

    public Fraction_subtract_74042599183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15839 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15839, term15839.getClass(), "numerator", 4096);
        setIntField(term15839, term15839.getClass(), "denominator", 1);
        term15929 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15929, term15929.getClass(), "numerator", 16384);
        setIntField(term15929, term15929.getClass(), "denominator", -279592252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term15929;
        try {
            callMethod(klass, "subtract", argTypes, term15839, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


