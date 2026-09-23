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

public class Fraction_add_1454977021252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62418;
     Object term62498;

    public Fraction_add_1454977021252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62418 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term62418, term62418.getClass(), "numerator", 524288);
        setIntField(term62418, term62418.getClass(), "denominator", 80742492);
        term62498 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term62498, term62498.getClass(), "numerator", 16384);
        setIntField(term62498, term62498.getClass(), "denominator", -104335970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term62498;
        try {
            callMethod(klass, "add", argTypes, term62418, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


