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

public class Fraction_add_14549770211183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345062;
     Object term345142;

    public Fraction_add_14549770211183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345062 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term345062, term345062.getClass(), "numerator", 67108864);
        setIntField(term345062, term345062.getClass(), "denominator", 1720060900);
        term345142 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term345142, term345142.getClass(), "numerator", 524288);
        setIntField(term345142, term345142.getClass(), "denominator", -2092591102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term345142;
        try {
            callMethod(klass, "add", argTypes, term345062, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


