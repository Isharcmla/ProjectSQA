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

public class Fraction_add_14549770211854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543177;
     Object term543257;

    public Fraction_add_14549770211854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543177 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term543177, term543177.getClass(), "numerator", 1073741824);
        setIntField(term543177, term543177.getClass(), "denominator", 1278273836);
        term543257 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term543257, term543257.getClass(), "numerator", 1073741824);
        setIntField(term543257, term543257.getClass(), "denominator", -1346972986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term543257;
        try {
            callMethod(klass, "add", argTypes, term543177, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


