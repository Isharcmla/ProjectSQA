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

public class Fraction_add_2763527041752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568887;
     Object term568969;

    public Fraction_add_2763527041752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568887 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term568887, term568887.getClass(), "numerator", 67108864);
        setIntField(term568887, term568887.getClass(), "denominator", 51063804);
        term568969 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term568969, term568969.getClass(), "numerator", 128);
        setIntField(term568969, term568969.getClass(), "denominator", -51189778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term568969;
        try {
            callMethod(klass, "add", argTypes, term568887, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


