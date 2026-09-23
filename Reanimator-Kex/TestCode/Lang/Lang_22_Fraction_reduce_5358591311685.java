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

public class Fraction_reduce_5358591311685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547082;
     Object term547183;
     Object term547180;

    public Fraction_reduce_5358591311685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547082 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term547082, term547082.getClass(), "numerator", 536870866);
        setIntField(term547082, term547082.getClass(), "denominator", 1610612737);
        term547183 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term547183, term547183.getClass(), "numerator", 536870866);
        setIntField(term547183, term547183.getClass(), "denominator", 1610612737);
        setField(term547183, term547183.getClass(), "toString", null);
        setField(term547183, term547183.getClass(), "toProperString", null);
        term547180 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term547180, term547180.getClass(), "numerator", 536870866);
        setIntField(term547180, term547180.getClass(), "denominator", 1610612737);
        setField(term547180, term547180.getClass(), "toString", null);
        setField(term547180, term547180.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term547082, args);
        assertTrue(recursiveEquals(term547082, term547183));
        assertTrue(recursiveEquals(retValue, term547180));
    }

};


