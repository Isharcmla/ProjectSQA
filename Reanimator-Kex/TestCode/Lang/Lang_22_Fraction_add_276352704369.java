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

public class Fraction_add_276352704369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106181;
     Object term106263;

    public Fraction_add_276352704369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106181 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term106181, term106181.getClass(), "numerator", 524288);
        setIntField(term106181, term106181.getClass(), "denominator", 573384332);
        term106263 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term106263, term106263.getClass(), "numerator", 32768);
        setIntField(term106263, term106263.getClass(), "denominator", -790654474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term106263;
        try {
            callMethod(klass, "add", argTypes, term106181, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


