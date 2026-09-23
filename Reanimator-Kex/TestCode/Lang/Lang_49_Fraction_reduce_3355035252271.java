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

public class Fraction_reduce_3355035252271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671467;
     Object term672386;
     Object term672383;

    public Fraction_reduce_3355035252271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671467 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term671467, term671467.getClass(), "numerator", -1302038894);
        setIntField(term671467, term671467.getClass(), "denominator", 623753903);
        term672386 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term672386, term672386.getClass(), "numerator", -1302038894);
        setIntField(term672386, term672386.getClass(), "denominator", 623753903);
        setField(term672386, term672386.getClass(), "toString", null);
        setField(term672386, term672386.getClass(), "toProperString", null);
        term672383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term672383, term672383.getClass(), "numerator", -1302038894);
        setIntField(term672383, term672383.getClass(), "denominator", 623753903);
        setField(term672383, term672383.getClass(), "toString", null);
        setField(term672383, term672383.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term671467, args);
        assertTrue(recursiveEquals(term671467, term672386));
        assertTrue(recursiveEquals(retValue, term672383));
    }

};


