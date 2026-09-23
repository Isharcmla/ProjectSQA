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

public class Fraction_reduce_535859131133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29865;
     Object term29970;
     Object term29967;

    public Fraction_reduce_535859131133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29865 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term29865, term29865.getClass(), "numerator", -1811419058);
        setIntField(term29865, term29865.getClass(), "denominator", 1853998977);
        term29970 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term29970, term29970.getClass(), "numerator", -1811419058);
        setIntField(term29970, term29970.getClass(), "denominator", 1853998977);
        setField(term29970, term29970.getClass(), "toString", null);
        setField(term29970, term29970.getClass(), "toProperString", null);
        term29967 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term29967, term29967.getClass(), "numerator", -1811419058);
        setIntField(term29967, term29967.getClass(), "denominator", 1853998977);
        setField(term29967, term29967.getClass(), "toString", null);
        setField(term29967, term29967.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term29865, args);
        assertTrue(recursiveEquals(term29865, term29970));
        assertTrue(recursiveEquals(retValue, term29967));
    }

};


