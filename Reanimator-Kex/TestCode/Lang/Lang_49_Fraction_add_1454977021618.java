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

public class Fraction_add_1454977021618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172219;
     Object term172299;

    public Fraction_add_1454977021618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172219 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term172219, term172219.getClass(), "numerator", 1073741824);
        setIntField(term172219, term172219.getClass(), "denominator", 1576409052);
        term172299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term172299, term172299.getClass(), "numerator", 1073741824);
        setIntField(term172299, term172299.getClass(), "denominator", -1760494498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term172299;
        try {
            callMethod(klass, "add", argTypes, term172219, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


