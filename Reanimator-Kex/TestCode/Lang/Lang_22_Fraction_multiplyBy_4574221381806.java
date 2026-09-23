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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221381806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588339;
     Object term588421;

    public Fraction_multiplyBy_4574221381806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588339 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term588339, term588339.getClass(), "numerator", 38358530);
        setIntField(term588339, term588339.getClass(), "denominator", 1187055883);
        term588421 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term588421, term588421.getClass(), "numerator", 1544028194);
        setIntField(term588421, term588421.getClass(), "denominator", 2083615701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term588421;
        try {
            callMethod(klass, "multiplyBy", argTypes, term588339, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


