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

public class Fraction_add_192536854740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term68;

    public Fraction_add_192536854740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term65, term65.getClass(), "denominator", -73683645);
        setIntField(term65, term65.getClass(), "numerator", -226514366);
        term68 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term68, term68.getClass(), "denominator", 1193880199);
        setIntField(term68, term68.getClass(), "numerator", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term68;
        try {
            callMethod(klass, "add", argTypes, term65, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


