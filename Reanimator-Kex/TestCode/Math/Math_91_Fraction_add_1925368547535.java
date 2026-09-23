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

public class Fraction_add_1925368547535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199738;
     Object term199826;

    public Fraction_add_1925368547535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199738 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term199738, term199738.getClass(), "numerator", 8388608);
        setIntField(term199738, term199738.getClass(), "denominator", -1056980247);
        term199826 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term199826, term199826.getClass(), "numerator", 268435456);
        setIntField(term199826, term199826.getClass(), "denominator", 886044151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term199826;
        try {
            callMethod(klass, "add", argTypes, term199738, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


