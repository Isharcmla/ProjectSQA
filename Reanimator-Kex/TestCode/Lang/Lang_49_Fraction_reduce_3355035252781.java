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

public class Fraction_reduce_3355035252781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830785;
     Object term830975;
     Object term830972;

    public Fraction_reduce_3355035252781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830785 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830785, term830785.getClass(), "numerator", 14);
        setIntField(term830785, term830785.getClass(), "denominator", 2087141615);
        term830975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830975, term830975.getClass(), "numerator", 14);
        setIntField(term830975, term830975.getClass(), "denominator", 2087141615);
        setField(term830975, term830975.getClass(), "toString", null);
        setField(term830975, term830975.getClass(), "toProperString", null);
        term830972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830972, term830972.getClass(), "numerator", 14);
        setIntField(term830972, term830972.getClass(), "denominator", 2087141615);
        setField(term830972, term830972.getClass(), "toString", null);
        setField(term830972, term830972.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term830785, args);
        assertTrue(recursiveEquals(term830785, term830975));
        assertTrue(recursiveEquals(retValue, term830972));
    }

};


