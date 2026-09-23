package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41952;
     Object term42042;

    public Fraction_add_751775572145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41952 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41952, term41952.getClass(), "numerator", 8192);
        setIntField(term41952, term41952.getClass(), "denominator", -1063387022);
        term42042 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term42042, term42042.getClass(), "numerator", 2);
        setIntField(term42042, term42042.getClass(), "denominator", -951820383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term42042;
        try {
            callMethod(klass, "add", argTypes, term41952, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


