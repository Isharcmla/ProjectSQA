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

public class Fraction_add_1454977021787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219917;
     Object term219997;

    public Fraction_add_1454977021787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219917 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term219917, term219917.getClass(), "numerator", 262144);
        setIntField(term219917, term219917.getClass(), "denominator", 1555280892);
        term219997 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term219997, term219997.getClass(), "numerator", 8192);
        setIntField(term219997, term219997.getClass(), "denominator", -1524815506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term219997;
        try {
            callMethod(klass, "add", argTypes, term219917, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


