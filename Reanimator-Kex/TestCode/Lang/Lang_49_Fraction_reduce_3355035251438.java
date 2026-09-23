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

public class Fraction_reduce_3355035251438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420483;
     Object term421363;
     Object term421360;

    public Fraction_reduce_3355035251438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420483 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term420483, term420483.getClass(), "numerator", -1599888290);
        setIntField(term420483, term420483.getClass(), "denominator", 1082559193);
        term421363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term421363, term421363.getClass(), "numerator", -1599888290);
        setIntField(term421363, term421363.getClass(), "denominator", 1082559193);
        setField(term421363, term421363.getClass(), "toString", null);
        setField(term421363, term421363.getClass(), "toProperString", null);
        term421360 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term421360, term421360.getClass(), "numerator", -1599888290);
        setIntField(term421360, term421360.getClass(), "denominator", 1082559193);
        setField(term421360, term421360.getClass(), "toString", null);
        setField(term421360, term421360.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term420483, args);
        assertTrue(recursiveEquals(term420483, term421363));
        assertTrue(recursiveEquals(retValue, term421360));
    }

};


