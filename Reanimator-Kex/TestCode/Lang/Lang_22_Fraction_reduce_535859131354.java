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

public class Fraction_reduce_535859131354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101570;
     Object term102034;
     Object term102028;

    public Fraction_reduce_535859131354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101570 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term101570, term101570.getClass(), "numerator", -232320498);
        setIntField(term101570, term101570.getClass(), "denominator", 968297361);
        term102034 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term102034, term102034.getClass(), "numerator", -232320498);
        setIntField(term102034, term102034.getClass(), "denominator", 968297361);
        setField(term102034, term102034.getClass(), "toString", null);
        setField(term102034, term102034.getClass(), "toProperString", null);
        term102028 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term102028, term102028.getClass(), "numerator", -77440166);
        setIntField(term102028, term102028.getClass(), "denominator", 322765787);
        setField(term102028, term102028.getClass(), "toString", null);
        setField(term102028, term102028.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term101570, args);
        assertTrue(recursiveEquals(term101570, term102034));
        assertTrue(recursiveEquals(retValue, term102028));
    }

};


