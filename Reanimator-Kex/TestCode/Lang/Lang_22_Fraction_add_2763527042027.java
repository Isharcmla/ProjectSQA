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

public class Fraction_add_2763527042027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659416;
     Object term659498;

    public Fraction_add_2763527042027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659416 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term659416, term659416.getClass(), "numerator", 67108864);
        setIntField(term659416, term659416.getClass(), "denominator", 195050012);
        term659498 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term659498, term659498.getClass(), "numerator", 1073741824);
        setIntField(term659498, term659498.getClass(), "denominator", -287323906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term659498;
        try {
            callMethod(klass, "add", argTypes, term659416, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


