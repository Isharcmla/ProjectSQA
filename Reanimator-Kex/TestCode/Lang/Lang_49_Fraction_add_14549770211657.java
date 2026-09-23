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

public class Fraction_add_14549770211657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487836;
     Object term487916;

    public Fraction_add_14549770211657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487836 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term487836, term487836.getClass(), "numerator", -2147483648);
        setIntField(term487836, term487836.getClass(), "denominator", 1346371584);
        term487916 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term487916, term487916.getClass(), "numerator", -2147483648);
        setIntField(term487916, term487916.getClass(), "denominator", 1024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term487916;
        try {
            callMethod(klass, "add", argTypes, term487836, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


