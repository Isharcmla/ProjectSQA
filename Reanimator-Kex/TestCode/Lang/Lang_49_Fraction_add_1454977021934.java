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

public class Fraction_add_1454977021934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266649;
     Object term266729;

    public Fraction_add_1454977021934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266649 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term266649, term266649.getClass(), "numerator", -2147483648);
        setIntField(term266649, term266649.getClass(), "denominator", 1091591804);
        term266729 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term266729, term266729.getClass(), "numerator", -2147483648);
        setIntField(term266729, term266729.getClass(), "denominator", -1569260114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term266729;
        try {
            callMethod(klass, "add", argTypes, term266649, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


