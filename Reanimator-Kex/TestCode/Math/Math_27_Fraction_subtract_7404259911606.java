package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_7404259911606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671968;
     Object term672058;

    public Fraction_subtract_7404259911606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671968 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term671968, term671968.getClass(), "numerator", 1073741824);
        setIntField(term671968, term671968.getClass(), "denominator", 1);
        term672058 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term672058, term672058.getClass(), "numerator", 1073741824);
        setIntField(term672058, term672058.getClass(), "denominator", -1441554476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term672058;
        callMethod(klass, "subtract", argTypes, term671968, args);
    }

};


