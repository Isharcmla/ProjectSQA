package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754384;
     Object term754483;
     Object term754480;

    public Fraction_reduce_5358591312307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754384 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term754384, term754384.getClass(), "numerator", 110660114);
        setIntField(term754384, term754384.getClass(), "denominator", 1612088321);
        term754483 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term754483, term754483.getClass(), "numerator", 110660114);
        setIntField(term754483, term754483.getClass(), "denominator", 1612088321);
        setField(term754483, term754483.getClass(), "toString", null);
        setField(term754483, term754483.getClass(), "toProperString", null);
        term754480 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term754480, term754480.getClass(), "numerator", 110660114);
        setIntField(term754480, term754480.getClass(), "denominator", 1612088321);
        setField(term754480, term754480.getClass(), "toString", null);
        setField(term754480, term754480.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term754384, args);
        assertTrue(recursiveEquals(term754384, term754483));
        assertTrue(recursiveEquals(retValue, term754480));
    }

};


