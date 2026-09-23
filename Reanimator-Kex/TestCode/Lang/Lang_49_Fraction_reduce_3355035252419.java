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

public class Fraction_reduce_3355035252419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718618;
     Object term719398;
     Object term719395;

    public Fraction_reduce_3355035252419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718618 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term718618, term718618.getClass(), "numerator", -831312914);
        setIntField(term718618, term718618.getClass(), "denominator", 1488799665);
        term719398 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term719398, term719398.getClass(), "numerator", -831312914);
        setIntField(term719398, term719398.getClass(), "denominator", 1488799665);
        setField(term719398, term719398.getClass(), "toString", null);
        setField(term719398, term719398.getClass(), "toProperString", null);
        term719395 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term719395, term719395.getClass(), "numerator", -831312914);
        setIntField(term719395, term719395.getClass(), "denominator", 1488799665);
        setField(term719395, term719395.getClass(), "toString", null);
        setField(term719395, term719395.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term718618, args);
        assertTrue(recursiveEquals(term718618, term719398));
        assertTrue(recursiveEquals(retValue, term719395));
    }

};


