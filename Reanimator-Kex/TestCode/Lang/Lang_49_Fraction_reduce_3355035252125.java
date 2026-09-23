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

public class Fraction_reduce_3355035252125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625387;
     Object term626255;
     Object term626252;

    public Fraction_reduce_3355035252125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625387 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term625387, term625387.getClass(), "numerator", 775154226);
        setIntField(term625387, term625387.getClass(), "denominator", 1552826881);
        term626255 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term626255, term626255.getClass(), "numerator", 775154226);
        setIntField(term626255, term626255.getClass(), "denominator", 1552826881);
        setField(term626255, term626255.getClass(), "toString", null);
        setField(term626255, term626255.getClass(), "toProperString", null);
        term626252 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term626252, term626252.getClass(), "numerator", 775154226);
        setIntField(term626252, term626252.getClass(), "denominator", 1552826881);
        setField(term626252, term626252.getClass(), "toString", null);
        setField(term626252, term626252.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term625387, args);
        assertTrue(recursiveEquals(term625387, term626255));
        assertTrue(recursiveEquals(retValue, term626252));
    }

};


