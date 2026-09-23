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

public class Fraction_reduce_5358591312304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752718;
     Object term753708;
     Object term753705;

    public Fraction_reduce_5358591312304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752718 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term752718, term752718.getClass(), "numerator", -529199886);
        setIntField(term752718, term752718.getClass(), "denominator", 403352575);
        term753708 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term753708, term753708.getClass(), "numerator", -529199886);
        setIntField(term753708, term753708.getClass(), "denominator", 403352575);
        setField(term753708, term753708.getClass(), "toString", null);
        setField(term753708, term753708.getClass(), "toProperString", null);
        term753705 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term753705, term753705.getClass(), "numerator", -529199886);
        setIntField(term753705, term753705.getClass(), "denominator", 403352575);
        setField(term753705, term753705.getClass(), "toString", null);
        setField(term753705, term753705.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term752718, args);
        assertTrue(recursiveEquals(term752718, term753708));
        assertTrue(recursiveEquals(retValue, term753705));
    }

};


