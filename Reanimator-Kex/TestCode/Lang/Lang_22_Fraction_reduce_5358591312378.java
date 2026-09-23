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

public class Fraction_reduce_5358591312378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777478;
     Object term778205;
     Object term778202;

    public Fraction_reduce_5358591312378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777478 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term777478, term777478.getClass(), "numerator", 294120450);
        setIntField(term777478, term777478.getClass(), "denominator", 1907426681);
        term778205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term778205, term778205.getClass(), "numerator", 294120450);
        setIntField(term778205, term778205.getClass(), "denominator", 1907426681);
        setField(term778205, term778205.getClass(), "toString", null);
        setField(term778205, term778205.getClass(), "toProperString", null);
        term778202 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term778202, term778202.getClass(), "numerator", 294120450);
        setIntField(term778202, term778202.getClass(), "denominator", 1907426681);
        setField(term778202, term778202.getClass(), "toString", null);
        setField(term778202, term778202.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term777478, args);
        assertTrue(recursiveEquals(term777478, term778205));
        assertTrue(recursiveEquals(retValue, term778202));
    }

};


