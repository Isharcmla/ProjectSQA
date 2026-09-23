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

public class Fraction_add_14549770212176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643048;
     Object term643128;

    public Fraction_add_14549770212176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term643048 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term643048, term643048.getClass(), "numerator", 536870912);
        setIntField(term643048, term643048.getClass(), "denominator", 1345485268);
        term643128 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term643128, term643128.getClass(), "numerator", 524288);
        setIntField(term643128, term643128.getClass(), "denominator", -1873284166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term643128;
        try {
            callMethod(klass, "add", argTypes, term643048, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


