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

public class Fraction_add_2763527042146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698615;
     Object term698697;

    public Fraction_add_2763527042146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698615 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term698615, term698615.getClass(), "numerator", 4096);
        setIntField(term698615, term698615.getClass(), "denominator", 1226453764);
        term698697 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term698697, term698697.getClass(), "numerator", 512);
        setIntField(term698697, term698697.getClass(), "denominator", -1704129646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term698697;
        try {
            callMethod(klass, "add", argTypes, term698615, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


