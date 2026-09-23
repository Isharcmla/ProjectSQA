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

public class Fraction_reduce_335503525959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275619;
     Object term276271;
     Object term276268;

    public Fraction_reduce_335503525959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275619 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term275619, term275619.getClass(), "numerator", 536870926);
        setIntField(term275619, term275619.getClass(), "denominator", 1877999583);
        term276271 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276271, term276271.getClass(), "numerator", 536870926);
        setIntField(term276271, term276271.getClass(), "denominator", 1877999583);
        setField(term276271, term276271.getClass(), "toString", null);
        setField(term276271, term276271.getClass(), "toProperString", null);
        term276268 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276268, term276268.getClass(), "numerator", 536870926);
        setIntField(term276268, term276268.getClass(), "denominator", 1877999583);
        setField(term276268, term276268.getClass(), "toString", null);
        setField(term276268, term276268.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term275619, args);
        assertTrue(recursiveEquals(term275619, term276271));
        assertTrue(recursiveEquals(retValue, term276268));
    }

};


