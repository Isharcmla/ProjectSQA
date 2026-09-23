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

public class Fraction_reduce_3355035251729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506498;
     Object term506968;
     Object term506965;

    public Fraction_reduce_3355035251729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506498 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term506498, term506498.getClass(), "numerator", -1609601066);
        setIntField(term506498, term506498.getClass(), "denominator", 526333);
        term506968 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term506968, term506968.getClass(), "numerator", -1609601066);
        setIntField(term506968, term506968.getClass(), "denominator", 526333);
        setField(term506968, term506968.getClass(), "toString", null);
        setField(term506968, term506968.getClass(), "toProperString", null);
        term506965 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term506965, term506965.getClass(), "numerator", -1609601066);
        setIntField(term506965, term506965.getClass(), "denominator", 526333);
        setField(term506965, term506965.getClass(), "toString", null);
        setField(term506965, term506965.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term506498, args);
        assertTrue(recursiveEquals(term506498, term506968));
        assertTrue(recursiveEquals(retValue, term506965));
    }

};


