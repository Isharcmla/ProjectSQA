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

public class Fraction_multiply_1924204567887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367676;
     Object term367766;

    public Fraction_multiply_1924204567887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367676 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term367676, term367676.getClass(), "numerator", -1199042406);
        term367766 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term367766, term367766.getClass(), "numerator", -2004877158);
        setIntField(term367766, term367766.getClass(), "denominator", 1627529231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term367766;
        try {
            callMethod(klass, "multiply", argTypes, term367676, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


