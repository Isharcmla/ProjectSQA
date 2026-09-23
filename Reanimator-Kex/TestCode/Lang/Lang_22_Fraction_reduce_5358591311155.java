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

public class Fraction_reduce_5358591311155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373434;
     Object term373627;
     Object term373624;

    public Fraction_reduce_5358591311155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373434 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term373434, term373434.getClass(), "numerator", -37222002);
        setIntField(term373434, term373434.getClass(), "denominator", 1803582673);
        term373627 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term373627, term373627.getClass(), "numerator", -37222002);
        setIntField(term373627, term373627.getClass(), "denominator", 1803582673);
        setField(term373627, term373627.getClass(), "toString", null);
        setField(term373627, term373627.getClass(), "toProperString", null);
        term373624 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term373624, term373624.getClass(), "numerator", -37222002);
        setIntField(term373624, term373624.getClass(), "denominator", 1803582673);
        setField(term373624, term373624.getClass(), "toString", null);
        setField(term373624, term373624.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term373434, args);
        assertTrue(recursiveEquals(term373434, term373627));
        assertTrue(recursiveEquals(retValue, term373624));
    }

};


