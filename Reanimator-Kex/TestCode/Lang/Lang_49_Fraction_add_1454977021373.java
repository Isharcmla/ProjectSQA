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

public class Fraction_add_1454977021373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99663;
     Object term99743;

    public Fraction_add_1454977021373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99663 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99663, term99663.getClass(), "numerator", -2147483648);
        setIntField(term99663, term99663.getClass(), "denominator", 1071987700);
        term99743 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99743, term99743.getClass(), "numerator", 67108864);
        setIntField(term99743, term99743.getClass(), "denominator", -1059849910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term99743;
        try {
            callMethod(klass, "add", argTypes, term99663, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


