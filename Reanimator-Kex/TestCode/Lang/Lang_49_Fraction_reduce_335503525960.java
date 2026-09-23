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

public class Fraction_reduce_335503525960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275869;
     Object term276377;
     Object term276374;

    public Fraction_reduce_335503525960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275869 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term275869, term275869.getClass(), "numerator", -485494778);
        setIntField(term275869, term275869.getClass(), "denominator", 1939334917);
        term276377 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276377, term276377.getClass(), "numerator", -485494778);
        setIntField(term276377, term276377.getClass(), "denominator", 1939334917);
        setField(term276377, term276377.getClass(), "toString", null);
        setField(term276377, term276377.getClass(), "toProperString", null);
        term276374 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276374, term276374.getClass(), "numerator", -485494778);
        setIntField(term276374, term276374.getClass(), "denominator", 1939334917);
        setField(term276374, term276374.getClass(), "toString", null);
        setField(term276374, term276374.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term275869, args);
        assertTrue(recursiveEquals(term275869, term276377));
        assertTrue(recursiveEquals(retValue, term276374));
    }

};


