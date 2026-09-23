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

public class Fraction_subtract_2650031231832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597556;
     Object term597638;

    public Fraction_subtract_2650031231832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597556 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term597556, term597556.getClass(), "numerator", 134217728);
        setIntField(term597556, term597556.getClass(), "denominator", -1429289032);
        term597638 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term597638, term597638.getClass(), "numerator", 524288);
        setIntField(term597638, term597638.getClass(), "denominator", 1184633532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term597638;
        try {
            callMethod(klass, "subtract", argTypes, term597556, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


