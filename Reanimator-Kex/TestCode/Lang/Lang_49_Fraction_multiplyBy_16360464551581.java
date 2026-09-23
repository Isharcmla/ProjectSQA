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

public class Fraction_multiplyBy_16360464551581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464143;
     Object term464223;

    public Fraction_multiplyBy_16360464551581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464143 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term464143, term464143.getClass(), "numerator", 1441659882);
        term464223 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term464223, term464223.getClass(), "numerator", 3);
        setIntField(term464223, term464223.getClass(), "denominator", 1978530745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term464223;
        try {
            callMethod(klass, "multiplyBy", argTypes, term464143, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


