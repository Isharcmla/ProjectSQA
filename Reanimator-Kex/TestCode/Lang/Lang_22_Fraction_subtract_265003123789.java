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

public class Fraction_subtract_265003123789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249673;
     Object term249755;

    public Fraction_subtract_265003123789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249673 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249673, term249673.getClass(), "numerator", 2097152);
        setIntField(term249673, term249673.getClass(), "denominator", -84415544);
        term249755 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249755, term249755.getClass(), "numerator", -2147483648);
        setIntField(term249755, term249755.getClass(), "denominator", 59147268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term249755;
        try {
            callMethod(klass, "subtract", argTypes, term249673, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


