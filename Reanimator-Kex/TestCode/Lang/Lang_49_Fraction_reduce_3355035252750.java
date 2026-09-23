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

public class Fraction_reduce_3355035252750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820123;
     Object term821329;
     Object term821326;

    public Fraction_reduce_3355035252750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term820123 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term820123, term820123.getClass(), "numerator", 1657380962);
        setIntField(term820123, term820123.getClass(), "denominator", 2036649785);
        term821329 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term821329, term821329.getClass(), "numerator", 1657380962);
        setIntField(term821329, term821329.getClass(), "denominator", 2036649785);
        setField(term821329, term821329.getClass(), "toString", null);
        setField(term821329, term821329.getClass(), "toProperString", null);
        term821326 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term821326, term821326.getClass(), "numerator", 1657380962);
        setIntField(term821326, term821326.getClass(), "denominator", 2036649785);
        setField(term821326, term821326.getClass(), "toString", null);
        setField(term821326, term821326.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term820123, args);
        assertTrue(recursiveEquals(term820123, term821329));
        assertTrue(recursiveEquals(retValue, term821326));
    }

};


