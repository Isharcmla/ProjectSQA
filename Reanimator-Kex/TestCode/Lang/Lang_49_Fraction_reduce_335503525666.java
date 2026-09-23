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

public class Fraction_reduce_335503525666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184869;
     Object term185425;
     Object term185419;

    public Fraction_reduce_335503525666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184869 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184869, term184869.getClass(), "numerator", 1337972398);
        setIntField(term184869, term184869.getClass(), "denominator", 805306383);
        term185425 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term185425, term185425.getClass(), "numerator", 1337972398);
        setIntField(term185425, term185425.getClass(), "denominator", 805306383);
        setField(term185425, term185425.getClass(), "toString", null);
        setField(term185425, term185425.getClass(), "toProperString", null);
        term185419 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term185419, term185419.getClass(), "numerator", 191138914);
        setIntField(term185419, term185419.getClass(), "denominator", 115043769);
        setField(term185419, term185419.getClass(), "toString", null);
        setField(term185419, term185419.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term184869, args);
        assertTrue(recursiveEquals(term184869, term185425));
        assertTrue(recursiveEquals(retValue, term185419));
    }

};


