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

public class Fraction_add_7517755721198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595600;
     Object term595690;

    public Fraction_add_7517755721198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595600 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term595600, term595600.getClass(), "numerator", 128);
        setIntField(term595600, term595600.getClass(), "denominator", -1071434558);
        term595690 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term595690, term595690.getClass(), "numerator", 1073741824);
        setIntField(term595690, term595690.getClass(), "denominator", -615516743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term595690;
        try {
            callMethod(klass, "add", argTypes, term595600, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


