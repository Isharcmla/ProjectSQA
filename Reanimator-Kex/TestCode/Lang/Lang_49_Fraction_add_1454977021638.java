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

public class Fraction_add_1454977021638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177489;
     Object term177569;

    public Fraction_add_1454977021638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177489 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177489, term177489.getClass(), "numerator", 1073741824);
        setIntField(term177489, term177489.getClass(), "denominator", 1517711340);
        term177569 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177569, term177569.getClass(), "numerator", 1073741824);
        setIntField(term177569, term177569.getClass(), "denominator", -1865418714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term177569;
        try {
            callMethod(klass, "add", argTypes, term177489, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


