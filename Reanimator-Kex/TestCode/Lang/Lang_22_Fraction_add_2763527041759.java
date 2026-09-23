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

public class Fraction_add_2763527041759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571862;
     Object term571944;

    public Fraction_add_2763527041759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571862 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term571862, term571862.getClass(), "numerator", 1073741824);
        setIntField(term571862, term571862.getClass(), "denominator", 147246164);
        term571944 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term571944, term571944.getClass(), "numerator", 1073741824);
        setIntField(term571944, term571944.getClass(), "denominator", -153750022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term571944;
        try {
            callMethod(klass, "add", argTypes, term571862, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


