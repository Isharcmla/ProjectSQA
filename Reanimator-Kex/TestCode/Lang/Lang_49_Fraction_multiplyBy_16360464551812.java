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

public class Fraction_multiplyBy_16360464551812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530571;
     Object term530651;

    public Fraction_multiplyBy_16360464551812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530571 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530571, term530571.getClass(), "numerator", 102009954);
        setIntField(term530571, term530571.getClass(), "denominator", 149725971);
        term530651 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530651, term530651.getClass(), "numerator", 139161362);
        setIntField(term530651, term530651.getClass(), "denominator", 907625709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term530651;
        try {
            callMethod(klass, "multiplyBy", argTypes, term530571, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


