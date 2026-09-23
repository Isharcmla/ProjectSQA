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

public class Fraction_reduce_3355035251669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491315;
     Object term491415;
     Object term491412;

    public Fraction_reduce_3355035251669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491315 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term491315, term491315.getClass(), "numerator", -1349683190);
        setIntField(term491315, term491315.getClass(), "denominator", 121650883);
        term491415 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term491415, term491415.getClass(), "numerator", -1349683190);
        setIntField(term491415, term491415.getClass(), "denominator", 121650883);
        setField(term491415, term491415.getClass(), "toString", null);
        setField(term491415, term491415.getClass(), "toProperString", null);
        term491412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term491412, term491412.getClass(), "numerator", -1349683190);
        setIntField(term491412, term491412.getClass(), "denominator", 121650883);
        setField(term491412, term491412.getClass(), "toString", null);
        setField(term491412, term491412.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term491315, args);
        assertTrue(recursiveEquals(term491315, term491415));
        assertTrue(recursiveEquals(retValue, term491412));
    }

};


