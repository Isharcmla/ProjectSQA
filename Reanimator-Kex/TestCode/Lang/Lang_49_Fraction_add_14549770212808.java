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

public class Fraction_add_14549770212808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839285;
     Object term839365;

    public Fraction_add_14549770212808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839285 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term839285, term839285.getClass(), "numerator", -2147483648);
        setIntField(term839285, term839285.getClass(), "denominator", 1283305756);
        term839365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term839365, term839365.getClass(), "numerator", -2147483648);
        setIntField(term839365, term839365.getClass(), "denominator", -1252008066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term839365;
        try {
            callMethod(klass, "add", argTypes, term839285, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


