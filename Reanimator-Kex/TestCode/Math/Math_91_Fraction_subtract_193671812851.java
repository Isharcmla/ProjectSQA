package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_193671812851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6680;
     Object term6768;

    public Fraction_subtract_193671812851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6680 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term6680, term6680.getClass(), "numerator", 1073741824);
        setIntField(term6680, term6680.getClass(), "denominator", -2147483647);
        term6768 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term6768, term6768.getClass(), "numerator", 1073741824);
        setIntField(term6768, term6768.getClass(), "denominator", -2113937574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term6768;
        try {
            callMethod(klass, "subtract", argTypes, term6680, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


