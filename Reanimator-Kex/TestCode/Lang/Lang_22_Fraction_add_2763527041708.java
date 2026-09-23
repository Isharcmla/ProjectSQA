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

public class Fraction_add_2763527041708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553848;
     Object term553930;

    public Fraction_add_2763527041708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553848 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term553848, term553848.getClass(), "numerator", 4096);
        setIntField(term553848, term553848.getClass(), "denominator", 1183965404);
        term553930 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term553930, term553930.getClass(), "numerator", 2048);
        setIntField(term553930, term553930.getClass(), "denominator", -1368051874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term553930;
        try {
            callMethod(klass, "add", argTypes, term553848, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


