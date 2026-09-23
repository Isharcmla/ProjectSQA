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

public class Fraction_reduce_335503525332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87069;
     Object term87800;
     Object term87794;

    public Fraction_reduce_335503525332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term87069, term87069.getClass(), "numerator", 9194370);
        setIntField(term87069, term87069.getClass(), "denominator", 1948620825);
        term87800 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term87800, term87800.getClass(), "numerator", 9194370);
        setIntField(term87800, term87800.getClass(), "denominator", 1948620825);
        setField(term87800, term87800.getClass(), "toString", null);
        setField(term87800, term87800.getClass(), "toProperString", null);
        term87794 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term87794, term87794.getClass(), "numerator", 612958);
        setIntField(term87794, term87794.getClass(), "denominator", 129908055);
        setField(term87794, term87794.getClass(), "toString", null);
        setField(term87794, term87794.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term87069, args);
        assertTrue(recursiveEquals(term87069, term87800));
        assertTrue(recursiveEquals(retValue, term87794));
    }

};


