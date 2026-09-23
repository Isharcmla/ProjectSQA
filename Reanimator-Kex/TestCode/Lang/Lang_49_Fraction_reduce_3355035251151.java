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

public class Fraction_reduce_3355035251151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333963;
     Object term334174;
     Object term334171;

    public Fraction_reduce_3355035251151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term333963, term333963.getClass(), "numerator", -2014966830);
        setIntField(term333963, term333963.getClass(), "denominator", 553388447);
        term334174 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term334174, term334174.getClass(), "numerator", -2014966830);
        setIntField(term334174, term334174.getClass(), "denominator", 553388447);
        setField(term334174, term334174.getClass(), "toString", null);
        setField(term334174, term334174.getClass(), "toProperString", null);
        term334171 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term334171, term334171.getClass(), "numerator", -2014966830);
        setIntField(term334171, term334171.getClass(), "denominator", 553388447);
        setField(term334171, term334171.getClass(), "toString", null);
        setField(term334171, term334171.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term333963, args);
        assertTrue(recursiveEquals(term333963, term334174));
        assertTrue(recursiveEquals(retValue, term334171));
    }

};


