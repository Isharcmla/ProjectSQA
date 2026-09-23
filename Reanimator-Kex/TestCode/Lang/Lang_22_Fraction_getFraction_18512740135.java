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
import static org.apache.commons.lang3.math.EqualityUtils.*;
import java.lang.Integer;

public class Fraction_getFraction_18512740135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;
     Object term1439;

    public Fraction_getFraction_18512740135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Integer(1484323161);
        term7 = new Integer(391863371);
        term1439 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1439, term1439.getClass(), "numerator", 1484323161);
        setIntField(term1439, term1439.getClass(), "denominator", 391863371);
        setField(term1439, term1439.getClass(), "toString", null);
        setField(term1439, term1439.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        Object retValue = callMethod(klass, "getFraction", argTypes, null, args);
        assertTrue(recursiveEquals(term5, 1484323161));
        assertTrue(recursiveEquals(term7, 391863371));
        assertTrue(recursiveEquals(retValue, term1439));
    }

};


