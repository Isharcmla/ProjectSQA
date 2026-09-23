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

public class Fraction_reduce_3355035252106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620030;
     Object term620619;
     Object term620616;

    public Fraction_reduce_3355035252106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620030 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620030, term620030.getClass(), "numerator", 621863042);
        setIntField(term620030, term620030.getClass(), "denominator", 1786669497);
        term620619 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620619, term620619.getClass(), "numerator", 621863042);
        setIntField(term620619, term620619.getClass(), "denominator", 1786669497);
        setField(term620619, term620619.getClass(), "toString", null);
        setField(term620619, term620619.getClass(), "toProperString", null);
        term620616 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620616, term620616.getClass(), "numerator", 621863042);
        setIntField(term620616, term620616.getClass(), "denominator", 1786669497);
        setField(term620616, term620616.getClass(), "toString", null);
        setField(term620616, term620616.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term620030, args);
        assertTrue(recursiveEquals(term620030, term620619));
        assertTrue(recursiveEquals(retValue, term620616));
    }

};


