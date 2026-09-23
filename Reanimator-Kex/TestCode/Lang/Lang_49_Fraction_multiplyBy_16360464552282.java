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

public class Fraction_multiplyBy_16360464552282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675116;
     Object term675196;

    public Fraction_multiplyBy_16360464552282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675116 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term675116, term675116.getClass(), "numerator", 872661686);
        setIntField(term675116, term675116.getClass(), "denominator", 609984523);
        term675196 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term675196, term675196.getClass(), "numerator", 1073741826);
        setIntField(term675196, term675196.getClass(), "denominator", 2074500903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term675196;
        try {
            callMethod(klass, "multiplyBy", argTypes, term675116, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


