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

public class Fraction_subtract_265003123238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61533;
     Object term61615;

    public Fraction_subtract_265003123238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61533 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term61533, term61533.getClass(), "numerator", 1073741824);
        setIntField(term61533, term61533.getClass(), "denominator", -1080491528);
        term61615 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term61615, term61615.getClass(), "numerator", 1073741824);
        setIntField(term61615, term61615.getClass(), "denominator", 900398556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term61615;
        try {
            callMethod(klass, "subtract", argTypes, term61533, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


