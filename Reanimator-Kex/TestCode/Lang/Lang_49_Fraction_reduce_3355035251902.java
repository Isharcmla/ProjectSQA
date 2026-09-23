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

public class Fraction_reduce_3355035251902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558270;
     Object term559210;
     Object term559207;

    public Fraction_reduce_3355035251902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558270 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term558270, term558270.getClass(), "numerator", 1615073282);
        setIntField(term558270, term558270.getClass(), "denominator", 807522905);
        term559210 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term559210, term559210.getClass(), "numerator", 1615073282);
        setIntField(term559210, term559210.getClass(), "denominator", 807522905);
        setField(term559210, term559210.getClass(), "toString", null);
        setField(term559210, term559210.getClass(), "toProperString", null);
        term559207 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term559207, term559207.getClass(), "numerator", 1615073282);
        setIntField(term559207, term559207.getClass(), "denominator", 807522905);
        setField(term559207, term559207.getClass(), "toString", null);
        setField(term559207, term559207.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term558270, args);
        assertTrue(recursiveEquals(term558270, term559210));
        assertTrue(recursiveEquals(retValue, term559207));
    }

};


