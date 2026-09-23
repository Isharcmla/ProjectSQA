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

public class Fraction_reduce_3355035252533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755420;
     Object term755527;
     Object term755524;

    public Fraction_reduce_3355035252533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term755420 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755420, term755420.getClass(), "numerator", -2134194694);
        setIntField(term755420, term755420.getClass(), "denominator", 1795204347);
        term755527 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755527, term755527.getClass(), "numerator", -2134194694);
        setIntField(term755527, term755527.getClass(), "denominator", 1795204347);
        setField(term755527, term755527.getClass(), "toString", null);
        setField(term755527, term755527.getClass(), "toProperString", null);
        term755524 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755524, term755524.getClass(), "numerator", -2134194694);
        setIntField(term755524, term755524.getClass(), "denominator", 1795204347);
        setField(term755524, term755524.getClass(), "toString", null);
        setField(term755524, term755524.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term755420, args);
        assertTrue(recursiveEquals(term755420, term755527));
        assertTrue(recursiveEquals(retValue, term755524));
    }

};


