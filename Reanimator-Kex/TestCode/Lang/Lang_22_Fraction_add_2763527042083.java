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

public class Fraction_add_2763527042083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678294;
     Object term678376;

    public Fraction_add_2763527042083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term678294 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term678294, term678294.getClass(), "numerator", 1073741824);
        setIntField(term678294, term678294.getClass(), "denominator", 1683492892);
        term678376 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term678376, term678376.getClass(), "numerator", 1073741824);
        setIntField(term678376, term678376.getClass(), "denominator", -1979429890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term678376;
        try {
            callMethod(klass, "add", argTypes, term678294, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


