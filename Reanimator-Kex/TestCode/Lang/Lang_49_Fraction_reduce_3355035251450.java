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

public class Fraction_reduce_3355035251450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423947;
     Object term424672;
     Object term424666;

    public Fraction_reduce_3355035251450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423947 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term423947, term423947.getClass(), "numerator", 118997718);
        setIntField(term423947, term423947.getClass(), "denominator", 1108043523);
        term424672 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term424672, term424672.getClass(), "numerator", 118997718);
        setIntField(term424672, term424672.getClass(), "denominator", 1108043523);
        setField(term424672, term424672.getClass(), "toString", null);
        setField(term424672, term424672.getClass(), "toProperString", null);
        term424666 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term424666, term424666.getClass(), "numerator", 39665906);
        setIntField(term424666, term424666.getClass(), "denominator", 369347841);
        setField(term424666, term424666.getClass(), "toString", null);
        setField(term424666, term424666.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term423947, args);
        assertTrue(recursiveEquals(term423947, term424672));
        assertTrue(recursiveEquals(retValue, term424666));
    }

};


