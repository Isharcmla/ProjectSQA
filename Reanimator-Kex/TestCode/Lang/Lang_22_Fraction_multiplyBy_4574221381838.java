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

public class Fraction_multiplyBy_4574221381838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599673;
     Object term599755;

    public Fraction_multiplyBy_4574221381838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599673 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term599673, term599673.getClass(), "numerator", 1672478986);
        term599755 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term599755, term599755.getClass(), "numerator", 1636827146);
        setIntField(term599755, term599755.getClass(), "denominator", 1314171649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term599755;
        try {
            callMethod(klass, "multiplyBy", argTypes, term599673, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


