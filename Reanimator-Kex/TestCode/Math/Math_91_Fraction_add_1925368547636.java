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

public class Fraction_add_1925368547636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241092;
     Object term241180;

    public Fraction_add_1925368547636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241092 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term241092, term241092.getClass(), "numerator", 67108864);
        setIntField(term241092, term241092.getClass(), "denominator", -33160125);
        term241180 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term241180, term241180.getClass(), "numerator", -2147483648);
        setIntField(term241180, term241180.getClass(), "denominator", 1895658503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term241180;
        try {
            callMethod(klass, "add", argTypes, term241092, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


