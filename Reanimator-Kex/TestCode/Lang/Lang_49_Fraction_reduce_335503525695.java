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

public class Fraction_reduce_335503525695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192501;
     Object term192702;
     Object term192699;

    public Fraction_reduce_335503525695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192501 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192501, term192501.getClass(), "numerator", -1389244570);
        setIntField(term192501, term192501.getClass(), "denominator", 1524075829);
        term192702 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192702, term192702.getClass(), "numerator", -1389244570);
        setIntField(term192702, term192702.getClass(), "denominator", 1524075829);
        setField(term192702, term192702.getClass(), "toString", null);
        setField(term192702, term192702.getClass(), "toProperString", null);
        term192699 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192699, term192699.getClass(), "numerator", -1389244570);
        setIntField(term192699, term192699.getClass(), "denominator", 1524075829);
        setField(term192699, term192699.getClass(), "toString", null);
        setField(term192699, term192699.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term192501, args);
        assertTrue(recursiveEquals(term192501, term192702));
        assertTrue(recursiveEquals(retValue, term192699));
    }

};


