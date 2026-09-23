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

public class Fraction_add_1454977021943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270255;
     Object term270335;

    public Fraction_add_1454977021943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270255 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term270255, term270255.getClass(), "numerator", 1073741824);
        setIntField(term270255, term270255.getClass(), "denominator", 297536244);
        term270335 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term270335, term270335.getClass(), "numerator", 1073741824);
        setIntField(term270335, term270335.getClass(), "denominator", -324625590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term270335;
        try {
            callMethod(klass, "add", argTypes, term270255, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


