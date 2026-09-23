package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_14436274401952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572789;
     Object term572869;

    public Fraction_subtract_14436274401952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572789 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term572789, term572789.getClass(), "numerator", 67108864);
        setIntField(term572789, term572789.getClass(), "denominator", -1997885784);
        term572869 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term572869, term572869.getClass(), "numerator", 4096);
        setIntField(term572869, term572869.getClass(), "denominator", 2087848948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term572869;
        try {
            callMethod(klass, "subtract", argTypes, term572789, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


