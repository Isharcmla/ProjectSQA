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

public class Fraction_subtract_193671812876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15057;
     Object term15145;

    public Fraction_subtract_193671812876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15057 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term15057, term15057.getClass(), "numerator", 134217728);
        setIntField(term15057, term15057.getClass(), "denominator", -2147483647);
        term15145 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term15145, term15145.getClass(), "numerator", -2147483648);
        setIntField(term15145, term15145.getClass(), "denominator", -1070596610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term15145;
        try {
            callMethod(klass, "subtract", argTypes, term15057, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


