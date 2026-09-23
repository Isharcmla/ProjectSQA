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

public class Fraction_add_14549770212602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775767;
     Object term775847;

    public Fraction_add_14549770212602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775767 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term775767, term775767.getClass(), "numerator", 256);
        setIntField(term775767, term775767.getClass(), "denominator", 1614504492);
        term775847 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term775847, term775847.getClass(), "numerator", 262144);
        setIntField(term775847, term775847.getClass(), "denominator", -1412174266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term775847;
        try {
            callMethod(klass, "add", argTypes, term775767, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


