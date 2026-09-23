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

public class Fraction_reduce_3355035252284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675838;
     Object term676626;
     Object term676623;

    public Fraction_reduce_3355035252284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675838 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term675838, term675838.getClass(), "numerator", -762016638);
        setIntField(term675838, term675838.getClass(), "denominator", 2016281351);
        term676626 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676626, term676626.getClass(), "numerator", -762016638);
        setIntField(term676626, term676626.getClass(), "denominator", 2016281351);
        setField(term676626, term676626.getClass(), "toString", null);
        setField(term676626, term676626.getClass(), "toProperString", null);
        term676623 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676623, term676623.getClass(), "numerator", -762016638);
        setIntField(term676623, term676623.getClass(), "denominator", 2016281351);
        setField(term676623, term676623.getClass(), "toString", null);
        setField(term676623, term676623.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term675838, args);
        assertTrue(recursiveEquals(term675838, term676626));
        assertTrue(recursiveEquals(retValue, term676623));
    }

};


