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

public class Fraction_reduce_3355035251912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561403;
     Object term561908;
     Object term561905;

    public Fraction_reduce_3355035251912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561403 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561403, term561403.getClass(), "numerator", 86653442);
        setIntField(term561403, term561403.getClass(), "denominator", 1951209625);
        term561908 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561908, term561908.getClass(), "numerator", 86653442);
        setIntField(term561908, term561908.getClass(), "denominator", 1951209625);
        setField(term561908, term561908.getClass(), "toString", null);
        setField(term561908, term561908.getClass(), "toProperString", null);
        term561905 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561905, term561905.getClass(), "numerator", 86653442);
        setIntField(term561905, term561905.getClass(), "denominator", 1951209625);
        setField(term561905, term561905.getClass(), "toString", null);
        setField(term561905, term561905.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term561403, args);
        assertTrue(recursiveEquals(term561403, term561908));
        assertTrue(recursiveEquals(retValue, term561905));
    }

};


