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

public class Fraction_reduce_5358591312383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778792;
     Object term779790;
     Object term779787;

    public Fraction_reduce_5358591312383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term778792, term778792.getClass(), "numerator", -936620378);
        setIntField(term778792, term778792.getClass(), "denominator", 1612456373);
        term779790 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term779790, term779790.getClass(), "numerator", -936620378);
        setIntField(term779790, term779790.getClass(), "denominator", 1612456373);
        setField(term779790, term779790.getClass(), "toString", null);
        setField(term779790, term779790.getClass(), "toProperString", null);
        term779787 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term779787, term779787.getClass(), "numerator", -936620378);
        setIntField(term779787, term779787.getClass(), "denominator", 1612456373);
        setField(term779787, term779787.getClass(), "toString", null);
        setField(term779787, term779787.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term778792, args);
        assertTrue(recursiveEquals(term778792, term779790));
        assertTrue(recursiveEquals(retValue, term779787));
    }

};


