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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221382699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885081;
     Object term885163;

    public Fraction_multiplyBy_4574221382699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term885081 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term885081, term885081.getClass(), "numerator", 493029738);
        term885163 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term885163, term885163.getClass(), "numerator", 493029738);
        setIntField(term885163, term885163.getClass(), "denominator", 808790817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term885163;
        callMethod(klass, "multiplyBy", argTypes, term885081, args);
    }

};


