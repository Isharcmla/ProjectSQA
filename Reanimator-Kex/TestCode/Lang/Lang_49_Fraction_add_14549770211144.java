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

public class Fraction_add_14549770211144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331169;
     Object term331249;

    public Fraction_add_14549770211144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term331169, term331169.getClass(), "numerator", 1024);
        setIntField(term331169, term331169.getClass(), "denominator", 1711334916);
        term331249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term331249, term331249.getClass(), "numerator", 4096);
        setIntField(term331249, term331249.getClass(), "denominator", -2013366382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term331249;
        try {
            callMethod(klass, "add", argTypes, term331169, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


