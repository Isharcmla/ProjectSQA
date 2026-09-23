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

public class Fraction_addSub_1853047840302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84167;
     Object term84249;

    public Fraction_addSub_1853047840302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84167 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term84167, term84167.getClass(), "numerator", 134217728);
        setIntField(term84167, term84167.getClass(), "denominator", 1073741825);
        term84249 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term84249, term84249.getClass(), "numerator", -2147483648);
        setIntField(term84249, term84249.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term84249;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term84167, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


