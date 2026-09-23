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

public class Fraction_add_2763527041797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584644;
     Object term584726;

    public Fraction_add_2763527041797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584644 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term584644, term584644.getClass(), "numerator", 16384);
        setIntField(term584644, term584644.getClass(), "denominator", 2139889580);
        term584726 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term584726, term584726.getClass(), "numerator", 262144);
        setIntField(term584726, term584726.getClass(), "denominator", -1798016634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term584726;
        try {
            callMethod(klass, "add", argTypes, term584644, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


