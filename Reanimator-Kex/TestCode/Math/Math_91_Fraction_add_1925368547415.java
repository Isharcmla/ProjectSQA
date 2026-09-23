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

public class Fraction_add_1925368547415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146896;
     Object term146984;

    public Fraction_add_1925368547415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146896 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term146896, term146896.getClass(), "numerator", 131072);
        setIntField(term146896, term146896.getClass(), "denominator", -261619707);
        term146984 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term146984, term146984.getClass(), "numerator", 32768);
        setIntField(term146984, term146984.getClass(), "denominator", 823661793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term146984;
        callMethod(klass, "add", argTypes, term146896, args);
    }

};


