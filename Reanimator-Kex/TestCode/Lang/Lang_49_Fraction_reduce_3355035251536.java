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

public class Fraction_reduce_3355035251536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451957;
     Object term452652;
     Object term452646;

    public Fraction_reduce_3355035251536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term451957, term451957.getClass(), "numerator", 1102908030);
        setIntField(term451957, term451957.getClass(), "denominator", 2145027207);
        term452652 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452652, term452652.getClass(), "numerator", 1102908030);
        setIntField(term452652, term452652.getClass(), "denominator", 2145027207);
        setField(term452652, term452652.getClass(), "toString", null);
        setField(term452652, term452652.getClass(), "toProperString", null);
        term452646 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452646, term452646.getClass(), "numerator", 367636010);
        setIntField(term452646, term452646.getClass(), "denominator", 715009069);
        setField(term452646, term452646.getClass(), "toString", null);
        setField(term452646, term452646.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term451957, args);
        assertTrue(recursiveEquals(term451957, term452652));
        assertTrue(recursiveEquals(retValue, term452646));
    }

};


