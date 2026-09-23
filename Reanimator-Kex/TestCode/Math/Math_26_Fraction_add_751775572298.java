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

public class Fraction_add_751775572298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123420;
     Object term123510;

    public Fraction_add_751775572298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123420 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term123420, term123420.getClass(), "numerator", 524288);
        setIntField(term123420, term123420.getClass(), "denominator", -1068984030);
        term123510 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term123510, term123510.getClass(), "numerator", 65536);
        setIntField(term123510, term123510.getClass(), "denominator", -1712081779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term123510;
        try {
            callMethod(klass, "add", argTypes, term123420, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


