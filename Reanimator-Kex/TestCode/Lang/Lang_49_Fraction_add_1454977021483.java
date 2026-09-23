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

public class Fraction_add_1454977021483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133832;
     Object term133912;

    public Fraction_add_1454977021483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133832 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term133832, term133832.getClass(), "numerator", 2);
        setIntField(term133832, term133832.getClass(), "denominator", 1142468924);
        term133912 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term133912, term133912.getClass(), "numerator", 16);
        setIntField(term133912, term133912.getClass(), "denominator", -1669486322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term133912;
        try {
            callMethod(klass, "add", argTypes, term133832, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


