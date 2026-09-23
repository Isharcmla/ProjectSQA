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

public class Fraction_multiplyBy_16360464552513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748037;
     Object term748117;

    public Fraction_multiplyBy_16360464552513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748037 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term748037, term748037.getClass(), "numerator", 666461874);
        term748117 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term748117, term748117.getClass(), "numerator", 664340098);
        setIntField(term748117, term748117.getClass(), "denominator", 1688212485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term748117;
        try {
            callMethod(klass, "multiplyBy", argTypes, term748037, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


