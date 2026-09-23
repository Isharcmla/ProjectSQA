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

public class Fraction_reduce_3355035252612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779508;
     Object term780364;
     Object term780361;

    public Fraction_reduce_3355035252612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779508 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term779508, term779508.getClass(), "numerator", -1004836846);
        setIntField(term779508, term779508.getClass(), "denominator", 543171615);
        term780364 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term780364, term780364.getClass(), "numerator", -1004836846);
        setIntField(term780364, term780364.getClass(), "denominator", 543171615);
        setField(term780364, term780364.getClass(), "toString", null);
        setField(term780364, term780364.getClass(), "toProperString", null);
        term780361 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term780361, term780361.getClass(), "numerator", -1004836846);
        setIntField(term780361, term780361.getClass(), "denominator", 543171615);
        setField(term780361, term780361.getClass(), "toString", null);
        setField(term780361, term780361.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term779508, args);
        assertTrue(recursiveEquals(term779508, term780364));
        assertTrue(recursiveEquals(retValue, term780361));
    }

};


