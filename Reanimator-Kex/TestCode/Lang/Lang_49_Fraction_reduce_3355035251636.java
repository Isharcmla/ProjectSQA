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

public class Fraction_reduce_3355035251636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479704;
     Object term480457;
     Object term480454;

    public Fraction_reduce_3355035251636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479704 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term479704, term479704.getClass(), "numerator", 121800242);
        setIntField(term479704, term479704.getClass(), "denominator", 69288721);
        term480457 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480457, term480457.getClass(), "numerator", 121800242);
        setIntField(term480457, term480457.getClass(), "denominator", 69288721);
        setField(term480457, term480457.getClass(), "toString", null);
        setField(term480457, term480457.getClass(), "toProperString", null);
        term480454 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480454, term480454.getClass(), "numerator", 121800242);
        setIntField(term480454, term480454.getClass(), "denominator", 69288721);
        setField(term480454, term480454.getClass(), "toString", null);
        setField(term480454, term480454.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term479704, args);
        assertTrue(recursiveEquals(term479704, term480457));
        assertTrue(recursiveEquals(retValue, term480454));
    }

};


