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

public class Fraction_addSub_1779294476681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320371;
     Object term320461;

    public Fraction_addSub_1779294476681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320371 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term320371, term320371.getClass(), "numerator", 1073741824);
        setIntField(term320371, term320371.getClass(), "denominator", -1967110975);
        term320461 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term320461, term320461.getClass(), "numerator", 1073741824);
        setIntField(term320461, term320461.getClass(), "denominator", -1106340607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term320461;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term320371, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


