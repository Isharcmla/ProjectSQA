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

public class Fraction_reduce_335503525353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93368;
     Object term93978;
     Object term93975;

    public Fraction_reduce_335503525353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93368 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term93368, term93368.getClass(), "numerator", 1886996638);
        setIntField(term93368, term93368.getClass(), "denominator", 435259);
        term93978 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term93978, term93978.getClass(), "numerator", 1886996638);
        setIntField(term93978, term93978.getClass(), "denominator", 435259);
        setField(term93978, term93978.getClass(), "toString", null);
        setField(term93978, term93978.getClass(), "toProperString", null);
        term93975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term93975, term93975.getClass(), "numerator", 1886996638);
        setIntField(term93975, term93975.getClass(), "denominator", 435259);
        setField(term93975, term93975.getClass(), "toString", null);
        setField(term93975, term93975.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term93368, args);
        assertTrue(recursiveEquals(term93368, term93978));
        assertTrue(recursiveEquals(retValue, term93975));
    }

};


