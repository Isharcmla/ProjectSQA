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

public class Fraction_subtract_14436274402163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638383;
     Object term638463;

    public Fraction_subtract_14436274402163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term638383, term638383.getClass(), "numerator", 65536);
        setIntField(term638383, term638383.getClass(), "denominator", -1142132216);
        term638463 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term638463, term638463.getClass(), "numerator", 8388608);
        setIntField(term638463, term638463.getClass(), "denominator", 1038700324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term638463;
        try {
            callMethod(klass, "subtract", argTypes, term638383, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


