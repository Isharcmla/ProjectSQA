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

public class Fraction_add_14549770211155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335069;
     Object term335149;

    public Fraction_add_14549770211155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term335069, term335069.getClass(), "numerator", 4194304);
        setIntField(term335069, term335069.getClass(), "denominator", 1493538036);
        term335149 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term335149, term335149.getClass(), "numerator", 1073741824);
        setIntField(term335149, term335149.getClass(), "denominator", -1990596790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term335149;
        try {
            callMethod(klass, "add", argTypes, term335069, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


