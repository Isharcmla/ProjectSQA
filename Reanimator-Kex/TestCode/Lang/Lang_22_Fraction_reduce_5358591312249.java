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

public class Fraction_reduce_5358591312249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733978;
     Object term734499;
     Object term734493;

    public Fraction_reduce_5358591312249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733978 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term733978, term733978.getClass(), "numerator", -544099722);
        setIntField(term733978, term733978.getClass(), "denominator", 1611375165);
        term734499 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term734499, term734499.getClass(), "numerator", -544099722);
        setIntField(term734499, term734499.getClass(), "denominator", 1611375165);
        setField(term734499, term734499.getClass(), "toString", null);
        setField(term734499, term734499.getClass(), "toProperString", null);
        term734493 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term734493, term734493.getClass(), "numerator", -181366574);
        setIntField(term734493, term734493.getClass(), "denominator", 537125055);
        setField(term734493, term734493.getClass(), "toString", null);
        setField(term734493, term734493.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term733978, args);
        assertTrue(recursiveEquals(term733978, term734499));
        assertTrue(recursiveEquals(retValue, term734493));
    }

};


