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

public class Fraction_add_751775572520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237763;
     Object term237853;

    public Fraction_add_751775572520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237763 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term237763, term237763.getClass(), "numerator", -2147483648);
        setIntField(term237763, term237763.getClass(), "denominator", -270532606);
        term237853 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term237853, term237853.getClass(), "numerator", 1073741824);
        setIntField(term237853, term237853.getClass(), "denominator", -135331927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term237853;
        try {
            callMethod(klass, "add", argTypes, term237763, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


