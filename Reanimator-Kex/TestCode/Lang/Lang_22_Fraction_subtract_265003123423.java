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

public class Fraction_subtract_265003123423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124342;
     Object term124424;

    public Fraction_subtract_265003123423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124342 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term124342, term124342.getClass(), "numerator", -2147483648);
        setIntField(term124342, term124342.getClass(), "denominator", -25168456);
        term124424 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term124424, term124424.getClass(), "numerator", 262144);
        setIntField(term124424, term124424.getClass(), "denominator", 20970940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term124424;
        try {
            callMethod(klass, "subtract", argTypes, term124342, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


