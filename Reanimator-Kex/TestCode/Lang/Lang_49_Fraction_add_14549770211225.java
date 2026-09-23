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

public class Fraction_add_14549770211225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357357;
     Object term357437;

    public Fraction_add_14549770211225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357357 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term357357, term357357.getClass(), "numerator", 134217728);
        setIntField(term357357, term357357.getClass(), "denominator", 1618881636);
        term357437 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term357437, term357437.getClass(), "numerator", 1073741824);
        setIntField(term357437, term357437.getClass(), "denominator", -1547718462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term357437;
        try {
            callMethod(klass, "add", argTypes, term357357, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


