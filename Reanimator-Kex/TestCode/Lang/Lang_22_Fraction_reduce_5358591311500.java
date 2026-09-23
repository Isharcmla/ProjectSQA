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

public class Fraction_reduce_5358591311500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488138;
     Object term488675;
     Object term488672;

    public Fraction_reduce_5358591311500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488138 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term488138, term488138.getClass(), "numerator", -769624478);
        setIntField(term488138, term488138.getClass(), "denominator", 1634463847);
        term488675 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term488675, term488675.getClass(), "numerator", -769624478);
        setIntField(term488675, term488675.getClass(), "denominator", 1634463847);
        setField(term488675, term488675.getClass(), "toString", null);
        setField(term488675, term488675.getClass(), "toProperString", null);
        term488672 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term488672, term488672.getClass(), "numerator", -769624478);
        setIntField(term488672, term488672.getClass(), "denominator", 1634463847);
        setField(term488672, term488672.getClass(), "toString", null);
        setField(term488672, term488672.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term488138, args);
        assertTrue(recursiveEquals(term488138, term488675));
        assertTrue(recursiveEquals(retValue, term488672));
    }

};


