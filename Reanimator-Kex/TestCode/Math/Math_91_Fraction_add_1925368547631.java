package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239838;
     Object term239926;

    public Fraction_add_1925368547631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239838 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term239838, term239838.getClass(), "numerator", 2);
        setIntField(term239838, term239838.getClass(), "denominator", -27262685);
        term239926 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term239926, term239926.getClass(), "numerator", 16384);
        setIntField(term239926, term239926.getClass(), "denominator", 90183751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term239926;
        try {
            callMethod(klass, "add", argTypes, term239838, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


