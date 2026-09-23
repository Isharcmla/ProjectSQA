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

public class Fraction_reduce_3355035251775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519860;
     Object term520064;
     Object term520061;

    public Fraction_reduce_3355035251775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519860 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519860, term519860.getClass(), "numerator", 30);
        setIntField(term519860, term519860.getClass(), "denominator", 1073741831);
        term520064 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520064, term520064.getClass(), "numerator", 30);
        setIntField(term520064, term520064.getClass(), "denominator", 1073741831);
        setField(term520064, term520064.getClass(), "toString", null);
        setField(term520064, term520064.getClass(), "toProperString", null);
        term520061 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520061, term520061.getClass(), "numerator", 30);
        setIntField(term520061, term520061.getClass(), "denominator", 1073741831);
        setField(term520061, term520061.getClass(), "toString", null);
        setField(term520061, term520061.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term519860, args);
        assertTrue(recursiveEquals(term519860, term520064));
        assertTrue(recursiveEquals(retValue, term520061));
    }

};


