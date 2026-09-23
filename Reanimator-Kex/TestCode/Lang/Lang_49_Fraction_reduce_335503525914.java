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

public class Fraction_reduce_335503525914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260802;
     Object term261197;
     Object term261194;

    public Fraction_reduce_335503525914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260802 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term260802, term260802.getClass(), "numerator", -752362434);
        setIntField(term260802, term260802.getClass(), "denominator", 257687209);
        term261197 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term261197, term261197.getClass(), "numerator", -752362434);
        setIntField(term261197, term261197.getClass(), "denominator", 257687209);
        setField(term261197, term261197.getClass(), "toString", null);
        setField(term261197, term261197.getClass(), "toProperString", null);
        term261194 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term261194, term261194.getClass(), "numerator", -752362434);
        setIntField(term261194, term261194.getClass(), "denominator", 257687209);
        setField(term261194, term261194.getClass(), "toString", null);
        setField(term261194, term261194.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term260802, args);
        assertTrue(recursiveEquals(term260802, term261197));
        assertTrue(recursiveEquals(retValue, term261194));
    }

};


