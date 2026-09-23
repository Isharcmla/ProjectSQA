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

public class Fraction_add_2763527042408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786776;
     Object term786858;

    public Fraction_add_2763527042408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786776 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term786776, term786776.getClass(), "numerator", 1048576);
        setIntField(term786776, term786776.getClass(), "denominator", 553686876);
        term786858 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term786858, term786858.getClass(), "numerator", 134217728);
        setIntField(term786858, term786858.getClass(), "denominator", -813717218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term786858;
        try {
            callMethod(klass, "add", argTypes, term786776, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


