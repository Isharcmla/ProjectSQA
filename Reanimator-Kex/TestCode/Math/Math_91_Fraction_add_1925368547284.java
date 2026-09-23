package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93199;
     Object term93287;

    public Fraction_add_1925368547284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93199 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term93199, term93199.getClass(), "numerator", 1073741824);
        setIntField(term93199, term93199.getClass(), "denominator", -1073741829);
        term93287 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term93287, term93287.getClass(), "numerator", 1073741824);
        setIntField(term93287, term93287.getClass(), "denominator", 1073741797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term93287;
        try {
            callMethod(klass, "add", argTypes, term93199, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


