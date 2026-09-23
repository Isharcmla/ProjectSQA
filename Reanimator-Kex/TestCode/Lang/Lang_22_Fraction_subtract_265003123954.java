package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_265003123954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305295;
     Object term305377;

    public Fraction_subtract_265003123954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305295 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term305295, term305295.getClass(), "numerator", 134217728);
        setIntField(term305295, term305295.getClass(), "denominator", -1183449096);
        term305377 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term305377, term305377.getClass(), "numerator", 1073741824);
        setIntField(term305377, term305377.getClass(), "denominator", 938672092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term305377;
        try {
            callMethod(klass, "subtract", argTypes, term305295, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


