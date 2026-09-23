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

public class BigFraction_multiply_569068198124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13554;
     Object term13694;

    public BigFraction_multiply_569068198124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13554 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term13600 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term13554, term13554.getClass(), "numerator", term13600);
        setField(term13554, term13554.getClass(), "denominator", null);
        term13694 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term13740 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term13694, term13694.getClass(), "numerator", term13740);
        setField(term13694, term13694.getClass(), "denominator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term13694;
        callMethod(klass, "multiply", argTypes, term13554, args);
    }

};


