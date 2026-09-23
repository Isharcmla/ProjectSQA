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

public class Fraction_add_14549770211705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500050;
     Object term500130;

    public Fraction_add_14549770211705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500050 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term500050, term500050.getClass(), "numerator", 2);
        setIntField(term500050, term500050.getClass(), "denominator", 1083188);
        term500130 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term500130, term500130.getClass(), "numerator", 1048576);
        setIntField(term500130, term500130.getClass(), "denominator", -1067158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term500130;
        try {
            callMethod(klass, "add", argTypes, term500050, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


