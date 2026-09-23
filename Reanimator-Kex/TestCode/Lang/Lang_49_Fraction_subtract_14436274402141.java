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

public class Fraction_subtract_14436274402141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630806;
     Object term630886;

    public Fraction_subtract_14436274402141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630806 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term630806, term630806.getClass(), "numerator", 524288);
        setIntField(term630806, term630806.getClass(), "denominator", -279017528);
        term630886 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term630886, term630886.getClass(), "numerator", 1073741824);
        setIntField(term630886, term630886.getClass(), "denominator", 406978052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term630886;
        try {
            callMethod(klass, "subtract", argTypes, term630806, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


