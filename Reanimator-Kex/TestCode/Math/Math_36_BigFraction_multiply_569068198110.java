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
import java.lang.Object;

public class BigFraction_multiply_569068198110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11065;
     Object term11205;

    public BigFraction_multiply_569068198110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11065 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term11111 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term11065, term11065.getClass(), "numerator", term11111);
        term11205 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term11251 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term11205, term11205.getClass(), "numerator", term11251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term11205;
        callMethod(klass, "multiply", argTypes, term11065, args);
    }

};


