package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302551;
     Object term302641;

    public Fraction_add_751775572651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302551 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term302551, term302551.getClass(), "numerator", 64);
        setIntField(term302551, term302551.getClass(), "denominator", -2122037134);
        term302641 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term302641, term302641.getClass(), "numerator", 134217728);
        setIntField(term302641, term302641.getClass(), "denominator", -1338127167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term302641;
        try {
            callMethod(klass, "add", argTypes, term302551, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


