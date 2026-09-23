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

public class Fraction_reduce_3355035251176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342584;
     Object term343185;
     Object term343182;

    public Fraction_reduce_3355035251176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342584 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term342584, term342584.getClass(), "numerator", -1516839014);
        setIntField(term342584, term342584.getClass(), "denominator", 1493821771);
        term343185 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term343185, term343185.getClass(), "numerator", -1516839014);
        setIntField(term343185, term343185.getClass(), "denominator", 1493821771);
        setField(term343185, term343185.getClass(), "toString", null);
        setField(term343185, term343185.getClass(), "toProperString", null);
        term343182 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term343182, term343182.getClass(), "numerator", -1516839014);
        setIntField(term343182, term343182.getClass(), "denominator", 1493821771);
        setField(term343182, term343182.getClass(), "toString", null);
        setField(term343182, term343182.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term342584, args);
        assertTrue(recursiveEquals(term342584, term343185));
        assertTrue(recursiveEquals(retValue, term343182));
    }

};


