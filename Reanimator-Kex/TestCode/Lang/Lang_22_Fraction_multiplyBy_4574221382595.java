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

public class Fraction_multiplyBy_4574221382595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850785;
     Object term850867;

    public Fraction_multiplyBy_4574221382595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850785 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term850785, term850785.getClass(), "numerator", 721423362);
        setIntField(term850785, term850785.getClass(), "denominator", -1879048192);
        term850867 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term850867, term850867.getClass(), "numerator", 524289);
        setIntField(term850867, term850867.getClass(), "denominator", 1702888965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term850867;
        try {
            callMethod(klass, "multiplyBy", argTypes, term850785, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


