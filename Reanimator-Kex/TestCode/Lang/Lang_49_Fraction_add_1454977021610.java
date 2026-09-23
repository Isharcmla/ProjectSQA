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

public class Fraction_add_1454977021610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168967;
     Object term169047;

    public Fraction_add_1454977021610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168967 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term168967, term168967.getClass(), "numerator", 1073741824);
        setIntField(term168967, term168967.getClass(), "denominator", 1615856788);
        term169047 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term169047, term169047.getClass(), "numerator", 1073741824);
        setIntField(term169047, term169047.getClass(), "denominator", -1348535398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term169047;
        try {
            callMethod(klass, "add", argTypes, term168967, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


