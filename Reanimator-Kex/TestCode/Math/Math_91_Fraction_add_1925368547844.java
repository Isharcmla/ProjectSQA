package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317810;
     Object term317898;

    public Fraction_add_1925368547844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317810 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317810, term317810.getClass(), "numerator", 16);
        setIntField(term317810, term317810.getClass(), "denominator", -4190587);
        term317898 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317898, term317898.getClass(), "numerator", -2147483648);
        setIntField(term317898, term317898.getClass(), "denominator", 528481409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term317898;
        callMethod(klass, "add", argTypes, term317810, args);
    }

};


