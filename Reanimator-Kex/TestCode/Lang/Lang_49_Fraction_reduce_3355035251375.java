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

public class Fraction_reduce_3355035251375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402115;
     Object term402325;
     Object term402322;

    public Fraction_reduce_3355035251375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402115 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402115, term402115.getClass(), "numerator", -1054998858);
        setIntField(term402115, term402115.getClass(), "denominator", 1081143277);
        term402325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402325, term402325.getClass(), "numerator", -1054998858);
        setIntField(term402325, term402325.getClass(), "denominator", 1081143277);
        setField(term402325, term402325.getClass(), "toString", null);
        setField(term402325, term402325.getClass(), "toProperString", null);
        term402322 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402322, term402322.getClass(), "numerator", -1054998858);
        setIntField(term402322, term402322.getClass(), "denominator", 1081143277);
        setField(term402322, term402322.getClass(), "toString", null);
        setField(term402322, term402322.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term402115, args);
        assertTrue(recursiveEquals(term402115, term402325));
        assertTrue(recursiveEquals(retValue, term402322));
    }

};


