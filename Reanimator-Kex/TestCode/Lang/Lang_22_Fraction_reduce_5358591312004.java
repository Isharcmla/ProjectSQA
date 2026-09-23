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

public class Fraction_reduce_5358591312004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653129;
     Object term653638;
     Object term653635;

    public Fraction_reduce_5358591312004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653129 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653129, term653129.getClass(), "numerator", -919870846);
        setIntField(term653129, term653129.getClass(), "denominator", 1880354567);
        term653638 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653638, term653638.getClass(), "numerator", -919870846);
        setIntField(term653638, term653638.getClass(), "denominator", 1880354567);
        setField(term653638, term653638.getClass(), "toString", null);
        setField(term653638, term653638.getClass(), "toProperString", null);
        term653635 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653635, term653635.getClass(), "numerator", -919870846);
        setIntField(term653635, term653635.getClass(), "denominator", 1880354567);
        setField(term653635, term653635.getClass(), "toString", null);
        setField(term653635, term653635.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term653129, args);
        assertTrue(recursiveEquals(term653129, term653638));
        assertTrue(recursiveEquals(retValue, term653635));
    }

};


