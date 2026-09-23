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

public class Fraction_add_2763527042185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710858;
     Object term710940;

    public Fraction_add_2763527042185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710858 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710858, term710858.getClass(), "numerator", -2147483648);
        setIntField(term710858, term710858.getClass(), "denominator", 908884700);
        term710940 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710940, term710940.getClass(), "numerator", -2147483648);
        setIntField(term710940, term710940.getClass(), "denominator", -797345442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term710940;
        try {
            callMethod(klass, "add", argTypes, term710858, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


