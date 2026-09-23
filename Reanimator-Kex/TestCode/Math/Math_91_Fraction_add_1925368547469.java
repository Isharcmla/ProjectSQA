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

public class Fraction_add_1925368547469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171721;
     Object term171809;

    public Fraction_add_1925368547469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171721 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term171721, term171721.getClass(), "numerator", 1073741824);
        setIntField(term171721, term171721.getClass(), "denominator", -535225799);
        term171809 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term171809, term171809.getClass(), "numerator", 1073741824);
        setIntField(term171809, term171809.getClass(), "denominator", 1873443301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term171809;
        try {
            callMethod(klass, "add", argTypes, term171721, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


