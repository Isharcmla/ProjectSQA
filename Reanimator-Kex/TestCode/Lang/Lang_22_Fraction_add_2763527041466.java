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

public class Fraction_add_2763527041466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476704;
     Object term476786;

    public Fraction_add_2763527041466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476704 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term476704, term476704.getClass(), "numerator", 2097152);
        setIntField(term476704, term476704.getClass(), "denominator", 1507716004);
        term476786 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term476786, term476786.getClass(), "numerator", 1);
        setIntField(term476786, term476786.getClass(), "denominator", -1700469278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term476786;
        try {
            callMethod(klass, "add", argTypes, term476704, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


