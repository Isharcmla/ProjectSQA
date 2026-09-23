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

public class Fraction_add_2763527042340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764307;
     Object term764389;

    public Fraction_add_2763527042340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764307 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term764307, term764307.getClass(), "numerator", 2097152);
        setIntField(term764307, term764307.getClass(), "denominator", 1442977788);
        term764389 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term764389, term764389.getClass(), "numerator", 536870912);
        setIntField(term764389, term764389.getClass(), "denominator", -1826214930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term764389;
        try {
            callMethod(klass, "add", argTypes, term764307, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


