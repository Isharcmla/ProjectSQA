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

public class Fraction_reduce_335503525329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86777;
     Object term86876;
     Object term86873;

    public Fraction_reduce_335503525329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86777 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term86777, term86777.getClass(), "numerator", -445897402);
        setIntField(term86777, term86777.getClass(), "denominator", 1799204933);
        term86876 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term86876, term86876.getClass(), "numerator", -445897402);
        setIntField(term86876, term86876.getClass(), "denominator", 1799204933);
        setField(term86876, term86876.getClass(), "toString", null);
        setField(term86876, term86876.getClass(), "toProperString", null);
        term86873 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term86873, term86873.getClass(), "numerator", -445897402);
        setIntField(term86873, term86873.getClass(), "denominator", 1799204933);
        setField(term86873, term86873.getClass(), "toString", null);
        setField(term86873, term86873.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term86777, args);
        assertTrue(recursiveEquals(term86777, term86876));
        assertTrue(recursiveEquals(retValue, term86873));
    }

};


