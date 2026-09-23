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

public class Fraction_reduce_5358591312513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823574;
     Object term824286;
     Object term824280;

    public Fraction_reduce_5358591312513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823574 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term823574, term823574.getClass(), "numerator", -1576779618);
        setIntField(term823574, term823574.getClass(), "denominator", 811491465);
        term824286 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term824286, term824286.getClass(), "numerator", -1576779618);
        setIntField(term824286, term824286.getClass(), "denominator", 811491465);
        setField(term824286, term824286.getClass(), "toString", null);
        setField(term824286, term824286.getClass(), "toProperString", null);
        term824280 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term824280, term824280.getClass(), "numerator", -525593206);
        setIntField(term824280, term824280.getClass(), "denominator", 270497155);
        setField(term824280, term824280.getClass(), "toString", null);
        setField(term824280, term824280.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term823574, args);
        assertTrue(recursiveEquals(term823574, term824286));
        assertTrue(recursiveEquals(retValue, term824280));
    }

};


