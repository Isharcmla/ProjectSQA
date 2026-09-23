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

public class BigFraction_multiply_569068198118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12519;
     Object term12659;

    public BigFraction_multiply_569068198118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12519 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term12565 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term12519, term12519.getClass(), "numerator", term12565);
        term12659 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        setField(term12659, term12659.getClass(), "numerator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term12659;
        callMethod(klass, "multiply", argTypes, term12519, args);
    }

};


