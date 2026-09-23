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

public class Fraction_add_14549770212276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673355;
     Object term673435;

    public Fraction_add_14549770212276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673355 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term673355, term673355.getClass(), "numerator", 8192);
        setIntField(term673355, term673355.getClass(), "denominator", 572188);
        term673435 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term673435, term673435.getClass(), "numerator", 67108864);
        setIntField(term673435, term673435.getClass(), "denominator", -811010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term673435;
        try {
            callMethod(klass, "add", argTypes, term673355, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


