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

public class Fraction_add_2763527041253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405821;
     Object term405903;

    public Fraction_add_2763527041253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405821 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term405821, term405821.getClass(), "numerator", 536870912);
        setIntField(term405821, term405821.getClass(), "denominator", 77053404);
        term405903 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term405903, term405903.getClass(), "numerator", 1073741824);
        setIntField(term405903, term405903.getClass(), "denominator", -109078050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term405903;
        try {
            callMethod(klass, "add", argTypes, term405821, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


