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

public class Fraction_reduce_3355035251837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538301;
     Object term538489;
     Object term538483;

    public Fraction_reduce_3355035251837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538301 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term538301, term538301.getClass(), "numerator", 176801646);
        setIntField(term538301, term538301.getClass(), "denominator", 436867151);
        term538489 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term538489, term538489.getClass(), "numerator", 176801646);
        setIntField(term538489, term538489.getClass(), "denominator", 436867151);
        setField(term538489, term538489.getClass(), "toString", null);
        setField(term538489, term538489.getClass(), "toProperString", null);
        term538483 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term538483, term538483.getClass(), "numerator", 25257378);
        setIntField(term538483, term538483.getClass(), "denominator", 62409593);
        setField(term538483, term538483.getClass(), "toString", null);
        setField(term538483, term538483.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term538301, args);
        assertTrue(recursiveEquals(term538301, term538489));
        assertTrue(recursiveEquals(retValue, term538483));
    }

};


