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

public class Fraction_add_2763527042698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884109;
     Object term884191;

    public Fraction_add_2763527042698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884109 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term884109, term884109.getClass(), "numerator", -2147483648);
        setIntField(term884109, term884109.getClass(), "denominator", 805307548);
        term884191 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term884191, term884191.getClass(), "numerator", -2147483648);
        setIntField(term884191, term884191.getClass(), "denominator", -1207960386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term884191;
        try {
            callMethod(klass, "add", argTypes, term884109, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


