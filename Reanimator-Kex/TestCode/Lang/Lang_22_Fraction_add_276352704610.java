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

public class Fraction_add_276352704610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189969;
     Object term190051;

    public Fraction_add_276352704610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189969 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term189969, term189969.getClass(), "numerator", 1073741824);
        setIntField(term189969, term189969.getClass(), "denominator", 1213266884);
        term190051 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term190051, term190051.getClass(), "numerator", 1073741824);
        setIntField(term190051, term190051.getClass(), "denominator", -1748000526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term190051;
        try {
            callMethod(klass, "add", argTypes, term189969, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


