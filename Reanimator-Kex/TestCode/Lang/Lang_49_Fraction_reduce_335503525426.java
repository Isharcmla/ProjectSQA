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

public class Fraction_reduce_335503525426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116241;
     Object term116567;
     Object term116564;

    public Fraction_reduce_335503525426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116241 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116241, term116241.getClass(), "numerator", 136325138);
        setIntField(term116241, term116241.getClass(), "denominator", 2047837265);
        term116567 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116567, term116567.getClass(), "numerator", 136325138);
        setIntField(term116567, term116567.getClass(), "denominator", 2047837265);
        setField(term116567, term116567.getClass(), "toString", null);
        setField(term116567, term116567.getClass(), "toProperString", null);
        term116564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116564, term116564.getClass(), "numerator", 136325138);
        setIntField(term116564, term116564.getClass(), "denominator", 2047837265);
        setField(term116564, term116564.getClass(), "toString", null);
        setField(term116564, term116564.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term116241, args);
        assertTrue(recursiveEquals(term116241, term116567));
        assertTrue(recursiveEquals(retValue, term116564));
    }

};


