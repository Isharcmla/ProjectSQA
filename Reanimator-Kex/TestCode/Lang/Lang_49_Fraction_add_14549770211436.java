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

public class Fraction_add_14549770211436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419701;
     Object term419781;

    public Fraction_add_14549770211436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419701 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term419701, term419701.getClass(), "numerator", 131072);
        setIntField(term419701, term419701.getClass(), "denominator", 319742236);
        term419781 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term419781, term419781.getClass(), "numerator", 8192);
        setIntField(term419781, term419781.getClass(), "denominator", -432668674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term419781;
        try {
            callMethod(klass, "add", argTypes, term419701, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


