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

public class Fraction_reduce_3355035251369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400245;
     Object term400830;
     Object term400827;

    public Fraction_reduce_3355035251369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term400245, term400245.getClass(), "numerator", 1619476850);
        setIntField(term400245, term400245.getClass(), "denominator", 1062224049);
        term400830 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term400830, term400830.getClass(), "numerator", 1619476850);
        setIntField(term400830, term400830.getClass(), "denominator", 1062224049);
        setField(term400830, term400830.getClass(), "toString", null);
        setField(term400830, term400830.getClass(), "toProperString", null);
        term400827 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term400827, term400827.getClass(), "numerator", 1619476850);
        setIntField(term400827, term400827.getClass(), "denominator", 1062224049);
        setField(term400827, term400827.getClass(), "toString", null);
        setField(term400827, term400827.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term400245, args);
        assertTrue(recursiveEquals(term400245, term400830));
        assertTrue(recursiveEquals(retValue, term400827));
    }

};


