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

public class Fraction_reduce_3355035252339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692738;
     Object term693545;
     Object term693542;

    public Fraction_reduce_3355035252339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692738 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term692738, term692738.getClass(), "numerator", 469810578);
        setIntField(term692738, term692738.getClass(), "denominator", 1367371681);
        term693545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term693545, term693545.getClass(), "numerator", 469810578);
        setIntField(term693545, term693545.getClass(), "denominator", 1367371681);
        setField(term693545, term693545.getClass(), "toString", null);
        setField(term693545, term693545.getClass(), "toProperString", null);
        term693542 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term693542, term693542.getClass(), "numerator", 469810578);
        setIntField(term693542, term693542.getClass(), "denominator", 1367371681);
        setField(term693542, term693542.getClass(), "toString", null);
        setField(term693542, term693542.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term692738, args);
        assertTrue(recursiveEquals(term692738, term693545));
        assertTrue(recursiveEquals(retValue, term693542));
    }

};


