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

public class Fraction_reduce_335503525462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126398;
     Object term127386;
     Object term127383;

    public Fraction_reduce_335503525462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126398 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term126398, term126398.getClass(), "numerator", 67178146);
        setIntField(term126398, term126398.getClass(), "denominator", 1493005881);
        term127386 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term127386, term127386.getClass(), "numerator", 67178146);
        setIntField(term127386, term127386.getClass(), "denominator", 1493005881);
        setField(term127386, term127386.getClass(), "toString", null);
        setField(term127386, term127386.getClass(), "toProperString", null);
        term127383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term127383, term127383.getClass(), "numerator", 67178146);
        setIntField(term127383, term127383.getClass(), "denominator", 1493005881);
        setField(term127383, term127383.getClass(), "toString", null);
        setField(term127383, term127383.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term126398, args);
        assertTrue(recursiveEquals(term126398, term127386));
        assertTrue(recursiveEquals(retValue, term127383));
    }

};


