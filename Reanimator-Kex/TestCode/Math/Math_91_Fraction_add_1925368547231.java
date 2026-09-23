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

public class Fraction_add_1925368547231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73341;
     Object term73429;

    public Fraction_add_1925368547231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73341 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term73341, term73341.getClass(), "numerator", 262144);
        setIntField(term73341, term73341.getClass(), "denominator", -767995);
        term73429 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term73429, term73429.getClass(), "numerator", 1073741824);
        setIntField(term73429, term73429.getClass(), "denominator", 549752897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term73429;
        try {
            callMethod(klass, "add", argTypes, term73341, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


