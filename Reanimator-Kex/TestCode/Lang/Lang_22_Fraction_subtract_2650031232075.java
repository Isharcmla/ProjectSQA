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

public class Fraction_subtract_2650031232075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675763;
     Object term675845;

    public Fraction_subtract_2650031232075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675763 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675763, term675763.getClass(), "numerator", 512);
        setIntField(term675763, term675763.getClass(), "denominator", -2132119576);
        term675845 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675845, term675845.getClass(), "numerator", 131072);
        setIntField(term675845, term675845.getClass(), "denominator", 1090351764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term675845;
        try {
            callMethod(klass, "subtract", argTypes, term675763, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


