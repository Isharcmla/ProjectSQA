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

public class Fraction_add_14549770212329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689876;
     Object term689956;

    public Fraction_add_14549770212329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689876 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term689876, term689876.getClass(), "numerator", 134217728);
        setIntField(term689876, term689876.getClass(), "denominator", 318926380);
        term689956 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term689956, term689956.getClass(), "numerator", 67108864);
        setIntField(term689956, term689956.getClass(), "denominator", -310616634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term689956;
        try {
            callMethod(klass, "add", argTypes, term689876, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


