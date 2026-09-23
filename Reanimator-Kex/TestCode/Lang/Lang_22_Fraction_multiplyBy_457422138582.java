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

public class Fraction_multiplyBy_457422138582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180223;
     Object term180305;

    public Fraction_multiplyBy_457422138582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180223 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term180223, term180223.getClass(), "numerator", 263838698);
        setIntField(term180223, term180223.getClass(), "denominator", 1610612731);
        term180305 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term180305, term180305.getClass(), "numerator", 1073741826);
        setIntField(term180305, term180305.getClass(), "denominator", 180503073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term180305;
        try {
            callMethod(klass, "multiplyBy", argTypes, term180223, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


