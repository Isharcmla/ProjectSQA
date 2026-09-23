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

public class Fraction_reduce_335503525837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237101;
     Object term237198;
     Object term237195;

    public Fraction_reduce_335503525837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237101 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term237101, term237101.getClass(), "numerator", 135722434);
        setIntField(term237101, term237101.getClass(), "denominator", 457619785);
        term237198 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term237198, term237198.getClass(), "numerator", 135722434);
        setIntField(term237198, term237198.getClass(), "denominator", 457619785);
        setField(term237198, term237198.getClass(), "toString", null);
        setField(term237198, term237198.getClass(), "toProperString", null);
        term237195 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term237195, term237195.getClass(), "numerator", 135722434);
        setIntField(term237195, term237195.getClass(), "denominator", 457619785);
        setField(term237195, term237195.getClass(), "toString", null);
        setField(term237195, term237195.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term237101, args);
        assertTrue(recursiveEquals(term237101, term237198));
        assertTrue(recursiveEquals(retValue, term237195));
    }

};


