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

public class Fraction_subtract_1936718128854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321091;
     Object term321179;

    public Fraction_subtract_1936718128854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321091 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term321091, term321091.getClass(), "numerator", 536870912);
        setIntField(term321091, term321091.getClass(), "denominator", -2147483647);
        term321179 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term321179, term321179.getClass(), "numerator", 2048);
        setIntField(term321179, term321179.getClass(), "denominator", -942653098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term321179;
        callMethod(klass, "subtract", argTypes, term321091, args);
    }

};


