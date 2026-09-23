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

public class Fraction_add_14549770212340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693068;
     Object term693148;

    public Fraction_add_14549770212340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693068 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term693068, term693068.getClass(), "numerator", 1073741824);
        setIntField(term693068, term693068.getClass(), "denominator", 1746845948);
        term693148 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term693148, term693148.getClass(), "numerator", 2);
        setIntField(term693148, term693148.getClass(), "denominator", -2081626514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term693148;
        try {
            callMethod(klass, "add", argTypes, term693068, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


