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

public class Fraction_reduce_3355035251698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498559;
     Object term498919;
     Object term498916;

    public Fraction_reduce_3355035251698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498559 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498559, term498559.getClass(), "numerator", 173081282);
        setIntField(term498559, term498559.getClass(), "denominator", 65306401);
        term498919 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498919, term498919.getClass(), "numerator", 173081282);
        setIntField(term498919, term498919.getClass(), "denominator", 65306401);
        setField(term498919, term498919.getClass(), "toString", null);
        setField(term498919, term498919.getClass(), "toProperString", null);
        term498916 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498916, term498916.getClass(), "numerator", 173081282);
        setIntField(term498916, term498916.getClass(), "denominator", 65306401);
        setField(term498916, term498916.getClass(), "toString", null);
        setField(term498916, term498916.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term498559, args);
        assertTrue(recursiveEquals(term498559, term498919));
        assertTrue(recursiveEquals(retValue, term498916));
    }

};


