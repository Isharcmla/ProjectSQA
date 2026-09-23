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

public class Fraction_add_1454977021327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85998;
     Object term86078;

    public Fraction_add_1454977021327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85998 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term85998, term85998.getClass(), "numerator", 1073741824);
        setIntField(term85998, term85998.getClass(), "denominator", 1225527716);
        term86078 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term86078, term86078.getClass(), "numerator", 4096);
        setIntField(term86078, term86078.getClass(), "denominator", -1719995934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term86078;
        try {
            callMethod(klass, "add", argTypes, term85998, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


