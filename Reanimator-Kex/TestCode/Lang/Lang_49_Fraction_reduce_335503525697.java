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

public class Fraction_reduce_335503525697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192992;
     Object term193089;
     Object term193086;

    public Fraction_reduce_335503525697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192992 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192992, term192992.getClass(), "numerator", 1227963598);
        setIntField(term192992, term192992.getClass(), "denominator", 310530095);
        term193089 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term193089, term193089.getClass(), "numerator", 1227963598);
        setIntField(term193089, term193089.getClass(), "denominator", 310530095);
        setField(term193089, term193089.getClass(), "toString", null);
        setField(term193089, term193089.getClass(), "toProperString", null);
        term193086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term193086, term193086.getClass(), "numerator", 1227963598);
        setIntField(term193086, term193086.getClass(), "denominator", 310530095);
        setField(term193086, term193086.getClass(), "toString", null);
        setField(term193086, term193086.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term192992, args);
        assertTrue(recursiveEquals(term192992, term193089));
        assertTrue(recursiveEquals(retValue, term193086));
    }

};


