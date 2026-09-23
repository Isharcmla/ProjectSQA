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

public class Fraction_reduce_335503525255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63804;
     Object term63900;
     Object term63897;

    public Fraction_reduce_335503525255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63804 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term63804, term63804.getClass(), "numerator", 1474);
        setIntField(term63804, term63804.getClass(), "denominator", 2147483119);
        term63900 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term63900, term63900.getClass(), "numerator", 1474);
        setIntField(term63900, term63900.getClass(), "denominator", 2147483119);
        setField(term63900, term63900.getClass(), "toString", null);
        setField(term63900, term63900.getClass(), "toProperString", null);
        term63897 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term63897, term63897.getClass(), "numerator", 1474);
        setIntField(term63897, term63897.getClass(), "denominator", 2147483119);
        setField(term63897, term63897.getClass(), "toString", null);
        setField(term63897, term63897.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term63804, args);
        assertTrue(recursiveEquals(term63804, term63900));
        assertTrue(recursiveEquals(retValue, term63897));
    }

};


