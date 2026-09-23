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

public class Fraction_reduce_3355035252104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619663;
     Object term620138;
     Object term620135;

    public Fraction_reduce_3355035252104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619663 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term619663, term619663.getClass(), "numerator", 1476395058);
        setIntField(term619663, term619663.getClass(), "denominator", 1073741857);
        term620138 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620138, term620138.getClass(), "numerator", 1476395058);
        setIntField(term620138, term620138.getClass(), "denominator", 1073741857);
        setField(term620138, term620138.getClass(), "toString", null);
        setField(term620138, term620138.getClass(), "toProperString", null);
        term620135 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620135, term620135.getClass(), "numerator", 1476395058);
        setIntField(term620135, term620135.getClass(), "denominator", 1073741857);
        setField(term620135, term620135.getClass(), "toString", null);
        setField(term620135, term620135.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term619663, args);
        assertTrue(recursiveEquals(term619663, term620138));
        assertTrue(recursiveEquals(retValue, term620135));
    }

};


