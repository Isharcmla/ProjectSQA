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

public class Fraction_reduce_335503525347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91995;
     Object term92089;
     Object term92086;

    public Fraction_reduce_335503525347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91995 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term91995, term91995.getClass(), "numerator", 537941906);
        setIntField(term91995, term91995.getClass(), "denominator", 275399393);
        term92089 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term92089, term92089.getClass(), "numerator", 537941906);
        setIntField(term92089, term92089.getClass(), "denominator", 275399393);
        setField(term92089, term92089.getClass(), "toString", null);
        setField(term92089, term92089.getClass(), "toProperString", null);
        term92086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term92086, term92086.getClass(), "numerator", 537941906);
        setIntField(term92086, term92086.getClass(), "denominator", 275399393);
        setField(term92086, term92086.getClass(), "toString", null);
        setField(term92086, term92086.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term91995, args);
        assertTrue(recursiveEquals(term91995, term92089));
        assertTrue(recursiveEquals(retValue, term92086));
    }

};


