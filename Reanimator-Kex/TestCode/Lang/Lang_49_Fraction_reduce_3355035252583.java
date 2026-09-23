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

public class Fraction_reduce_3355035252583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770120;
     Object term771016;
     Object term771013;

    public Fraction_reduce_3355035252583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770120 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term770120, term770120.getClass(), "numerator", -1065198702);
        setIntField(term770120, term770120.getClass(), "denominator", 1610640559);
        term771016 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term771016, term771016.getClass(), "numerator", -1065198702);
        setIntField(term771016, term771016.getClass(), "denominator", 1610640559);
        setField(term771016, term771016.getClass(), "toString", null);
        setField(term771016, term771016.getClass(), "toProperString", null);
        term771013 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term771013, term771013.getClass(), "numerator", -1065198702);
        setIntField(term771013, term771013.getClass(), "denominator", 1610640559);
        setField(term771013, term771013.getClass(), "toString", null);
        setField(term771013, term771013.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term770120, args);
        assertTrue(recursiveEquals(term770120, term771016));
        assertTrue(recursiveEquals(retValue, term771013));
    }

};


