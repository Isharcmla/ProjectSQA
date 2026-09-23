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

public class Fraction_reduce_335503525130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26212;
     Object term26767;
     Object term26764;

    public Fraction_reduce_335503525130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26212 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term26212, term26212.getClass(), "numerator", -251151246);
        setIntField(term26212, term26212.getClass(), "denominator", 1034686847);
        term26767 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term26767, term26767.getClass(), "numerator", -251151246);
        setIntField(term26767, term26767.getClass(), "denominator", 1034686847);
        setField(term26767, term26767.getClass(), "toString", null);
        setField(term26767, term26767.getClass(), "toProperString", null);
        term26764 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term26764, term26764.getClass(), "numerator", -251151246);
        setIntField(term26764, term26764.getClass(), "denominator", 1034686847);
        setField(term26764, term26764.getClass(), "toString", null);
        setField(term26764, term26764.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term26212, args);
        assertTrue(recursiveEquals(term26212, term26767));
        assertTrue(recursiveEquals(retValue, term26764));
    }

};


