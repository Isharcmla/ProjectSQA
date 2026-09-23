package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809295;
     Object term809921;
     Object term809918;

    public Fraction_reduce_5358591312472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809295 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809295, term809295.getClass(), "numerator", -1631576490);
        setIntField(term809295, term809295.getClass(), "denominator", 1816445869);
        term809921 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809921, term809921.getClass(), "numerator", -1631576490);
        setIntField(term809921, term809921.getClass(), "denominator", 1816445869);
        setField(term809921, term809921.getClass(), "toString", null);
        setField(term809921, term809921.getClass(), "toProperString", null);
        term809918 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809918, term809918.getClass(), "numerator", -1631576490);
        setIntField(term809918, term809918.getClass(), "denominator", 1816445869);
        setField(term809918, term809918.getClass(), "toString", null);
        setField(term809918, term809918.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term809295, args);
        assertTrue(recursiveEquals(term809295, term809921));
        assertTrue(recursiveEquals(retValue, term809918));
    }

};


