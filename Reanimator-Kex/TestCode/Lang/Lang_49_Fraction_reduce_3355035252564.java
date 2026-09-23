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

public class Fraction_reduce_3355035252564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764899;
     Object term765269;
     Object term765266;

    public Fraction_reduce_3355035252564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764899 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term764899, term764899.getClass(), "numerator", 1485625286);
        setIntField(term764899, term764899.getClass(), "denominator", 380458015);
        term765269 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765269, term765269.getClass(), "numerator", 1485625286);
        setIntField(term765269, term765269.getClass(), "denominator", 380458015);
        setField(term765269, term765269.getClass(), "toString", null);
        setField(term765269, term765269.getClass(), "toProperString", null);
        term765266 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765266, term765266.getClass(), "numerator", 1485625286);
        setIntField(term765266, term765266.getClass(), "denominator", 380458015);
        setField(term765266, term765266.getClass(), "toString", null);
        setField(term765266, term765266.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term764899, args);
        assertTrue(recursiveEquals(term764899, term765269));
        assertTrue(recursiveEquals(retValue, term765266));
    }

};


