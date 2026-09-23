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

public class Fraction_reduce_3355035252288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676930;
     Object term677431;
     Object term677425;

    public Fraction_reduce_3355035252288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676930 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676930, term676930.getClass(), "numerator", -1680210438);
        setIntField(term676930, term676930.getClass(), "denominator", 1874921115);
        term677431 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term677431, term677431.getClass(), "numerator", -1680210438);
        setIntField(term677431, term677431.getClass(), "denominator", 1874921115);
        setField(term677431, term677431.getClass(), "toString", null);
        setField(term677431, term677431.getClass(), "toProperString", null);
        term677425 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term677425, term677425.getClass(), "numerator", -560070146);
        setIntField(term677425, term677425.getClass(), "denominator", 624973705);
        setField(term677425, term677425.getClass(), "toString", null);
        setField(term677425, term677425.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term676930, args);
        assertTrue(recursiveEquals(term676930, term677431));
        assertTrue(recursiveEquals(retValue, term677425));
    }

};


