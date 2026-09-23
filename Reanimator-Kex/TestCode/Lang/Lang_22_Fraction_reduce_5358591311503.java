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

public class Fraction_reduce_5358591311503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488916;
     Object term489414;
     Object term489411;

    public Fraction_reduce_5358591311503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488916 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term488916, term488916.getClass(), "numerator", -417886178);
        setIntField(term488916, term488916.getClass(), "denominator", 876015657);
        term489414 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term489414, term489414.getClass(), "numerator", -417886178);
        setIntField(term489414, term489414.getClass(), "denominator", 876015657);
        setField(term489414, term489414.getClass(), "toString", null);
        setField(term489414, term489414.getClass(), "toProperString", null);
        term489411 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term489411, term489411.getClass(), "numerator", -417886178);
        setIntField(term489411, term489411.getClass(), "denominator", 876015657);
        setField(term489411, term489411.getClass(), "toString", null);
        setField(term489411, term489411.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term488916, args);
        assertTrue(recursiveEquals(term488916, term489414));
        assertTrue(recursiveEquals(retValue, term489411));
    }

};


