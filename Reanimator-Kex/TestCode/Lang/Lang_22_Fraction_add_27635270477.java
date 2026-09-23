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

public class Fraction_add_27635270477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8438;
     Object term8520;

    public Fraction_add_27635270477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8438 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term8438, term8438.getClass(), "numerator", 1073741824);
        setIntField(term8438, term8438.getClass(), "denominator", 649245068);
        term8520 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term8520, term8520.getClass(), "numerator", 1073741824);
        setIntField(term8520, term8520.getClass(), "denominator", -552225162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term8520;
        try {
            callMethod(klass, "add", argTypes, term8438, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


