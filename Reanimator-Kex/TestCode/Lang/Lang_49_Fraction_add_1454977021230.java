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

public class Fraction_add_1454977021230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56520;
     Object term56600;

    public Fraction_add_1454977021230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56520 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term56520, term56520.getClass(), "numerator", 1073741824);
        setIntField(term56520, term56520.getClass(), "denominator", 360985948);
        term56600 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term56600, term56600.getClass(), "numerator", 1073741824);
        setIntField(term56600, term56600.getClass(), "denominator", -405807458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term56600;
        try {
            callMethod(klass, "add", argTypes, term56520, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


