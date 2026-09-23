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

public class Fraction_add_1925368547487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177527;
     Object term177615;

    public Fraction_add_1925368547487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177527 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term177527, term177527.getClass(), "numerator", 8388608);
        setIntField(term177527, term177527.getClass(), "denominator", -519871487);
        term177615 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term177615, term177615.getClass(), "numerator", 4096);
        setIntField(term177615, term177615.getClass(), "denominator", 1912743437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term177615;
        try {
            callMethod(klass, "add", argTypes, term177527, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


