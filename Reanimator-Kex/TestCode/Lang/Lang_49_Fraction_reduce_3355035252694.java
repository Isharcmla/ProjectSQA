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

public class Fraction_reduce_3355035252694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803392;
     Object term804396;
     Object term804390;

    public Fraction_reduce_3355035252694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803392 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term803392, term803392.getClass(), "numerator", -1775392854);
        setIntField(term803392, term803392.getClass(), "denominator", 1942409619);
        term804396 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804396, term804396.getClass(), "numerator", -1775392854);
        setIntField(term804396, term804396.getClass(), "denominator", 1942409619);
        setField(term804396, term804396.getClass(), "toString", null);
        setField(term804396, term804396.getClass(), "toProperString", null);
        term804390 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804390, term804390.getClass(), "numerator", -591797618);
        setIntField(term804390, term804390.getClass(), "denominator", 647469873);
        setField(term804390, term804390.getClass(), "toString", null);
        setField(term804390, term804390.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term803392, args);
        assertTrue(recursiveEquals(term803392, term804396));
        assertTrue(recursiveEquals(retValue, term804390));
    }

};


