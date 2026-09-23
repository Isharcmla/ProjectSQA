package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035251622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476247;
     Object term476663;
     Object term476660;

    public Fraction_reduce_3355035251622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476247 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476247, term476247.getClass(), "numerator", -720944502);
        setIntField(term476247, term476247.getClass(), "denominator", 1556330611);
        term476663 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476663, term476663.getClass(), "numerator", -720944502);
        setIntField(term476663, term476663.getClass(), "denominator", 1556330611);
        setField(term476663, term476663.getClass(), "toString", null);
        setField(term476663, term476663.getClass(), "toProperString", null);
        term476660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476660, term476660.getClass(), "numerator", -720944502);
        setIntField(term476660, term476660.getClass(), "denominator", 1556330611);
        setField(term476660, term476660.getClass(), "toString", null);
        setField(term476660, term476660.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term476247, args);
        assertTrue(recursiveEquals(term476247, term476663));
        assertTrue(recursiveEquals(retValue, term476660));
    }

};


