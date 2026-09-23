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

public class Fraction_add_1454977021337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88947;
     Object term89027;

    public Fraction_add_1454977021337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88947 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term88947, term88947.getClass(), "numerator", 1048576);
        setIntField(term88947, term88947.getClass(), "denominator", 989312508);
        term89027 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term89027, term89027.getClass(), "numerator", -2147483648);
        setIntField(term89027, term89027.getClass(), "denominator", -947786002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term89027;
        try {
            callMethod(klass, "add", argTypes, term88947, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


