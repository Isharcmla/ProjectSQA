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

public class Fraction_add_1925368547580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219590;
     Object term219678;

    public Fraction_add_1925368547580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219590 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term219590, term219590.getClass(), "numerator", 1073741824);
        setIntField(term219590, term219590.getClass(), "denominator", -1073741810);
        term219678 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term219678, term219678.getClass(), "numerator", 1073741824);
        setIntField(term219678, term219678.getClass(), "denominator", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term219678;
        callMethod(klass, "add", argTypes, term219590, args);
    }

};


