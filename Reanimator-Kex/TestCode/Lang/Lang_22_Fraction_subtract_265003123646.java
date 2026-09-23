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

public class Fraction_subtract_265003123646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202382;
     Object term202464;

    public Fraction_subtract_265003123646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202382 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term202382, term202382.getClass(), "numerator", 268435456);
        setIntField(term202382, term202382.getClass(), "denominator", -1278869752);
        term202464 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term202464, term202464.getClass(), "numerator", 268435456);
        setIntField(term202464, term202464.getClass(), "denominator", 871172260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term202464;
        try {
            callMethod(klass, "subtract", argTypes, term202382, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


