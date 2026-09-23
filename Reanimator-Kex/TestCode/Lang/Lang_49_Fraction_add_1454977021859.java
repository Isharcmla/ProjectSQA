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

public class Fraction_add_1454977021859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243418;
     Object term243498;

    public Fraction_add_1454977021859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243418 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term243418, term243418.getClass(), "numerator", -2147483648);
        setIntField(term243418, term243418.getClass(), "denominator", 388764);
        term243498 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term243498, term243498.getClass(), "numerator", -2147483648);
        setIntField(term243498, term243498.getClass(), "denominator", -531010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term243498;
        try {
            callMethod(klass, "add", argTypes, term243418, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


