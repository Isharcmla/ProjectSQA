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
import static org.apache.commons.math.fraction.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class Fraction_init_164354601626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term15;
     Object term17;
     Object term19;
     Object term673;

    public Fraction_init_164354601626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Double(0.28570734989730284);
        term15 = new Double(0.40176586625454525);
        term17 = new Integer(1484323161);
        term19 = new Integer(391863371);
        term673 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term673, term673.getClass(), "denominator", 1);
        setIntField(term673, term673.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term13;
        args[1] = term15;
        args[2] = term17;
        args[3] = term19;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term673));
        assertTrue(recursiveEquals(term13, 0.28570734989730284));
        assertTrue(recursiveEquals(term15, 0.40176586625454525));
        assertTrue(recursiveEquals(term17, 1484323161));
        assertTrue(recursiveEquals(term19, 391863371));
    }

};


