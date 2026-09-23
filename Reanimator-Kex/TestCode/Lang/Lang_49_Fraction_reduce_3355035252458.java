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

public class Fraction_reduce_3355035252458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731427;
     Object term731972;
     Object term731966;

    public Fraction_reduce_3355035252458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731427 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731427, term731427.getClass(), "numerator", -88690518);
        setIntField(term731427, term731427.getClass(), "denominator", 2146492323);
        term731972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731972, term731972.getClass(), "numerator", -88690518);
        setIntField(term731972, term731972.getClass(), "denominator", 2146492323);
        setField(term731972, term731972.getClass(), "toString", null);
        setField(term731972, term731972.getClass(), "toProperString", null);
        term731966 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731966, term731966.getClass(), "numerator", -9854502);
        setIntField(term731966, term731966.getClass(), "denominator", 238499147);
        setField(term731966, term731966.getClass(), "toString", null);
        setField(term731966, term731966.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term731427, args);
        assertTrue(recursiveEquals(term731427, term731972));
        assertTrue(recursiveEquals(retValue, term731966));
    }

};


