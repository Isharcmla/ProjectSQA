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

public class Fraction_add_1454977021396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107544;
     Object term107624;

    public Fraction_add_1454977021396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107544 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term107544, term107544.getClass(), "numerator", -2147483648);
        setIntField(term107544, term107544.getClass(), "denominator", 1223926556);
        term107624 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term107624, term107624.getClass(), "numerator", -2147483648);
        setIntField(term107624, term107624.getClass(), "denominator", -1352525314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term107624;
        try {
            callMethod(klass, "add", argTypes, term107544, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


