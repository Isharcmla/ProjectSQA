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

public class Fraction_add_751775572958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400389;
     Object term400479;

    public Fraction_add_751775572958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400389 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term400389, term400389.getClass(), "numerator", 1024);
        setIntField(term400389, term400389.getClass(), "denominator", -1067351550);
        term400479 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term400479, term400479.getClass(), "numerator", 2);
        setIntField(term400479, term400479.getClass(), "denominator", -1630719367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term400479;
        try {
            callMethod(klass, "add", argTypes, term400389, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


