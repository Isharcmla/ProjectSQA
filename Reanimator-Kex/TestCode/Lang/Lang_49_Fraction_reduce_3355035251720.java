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

public class Fraction_reduce_3355035251720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504107;
     Object term504602;
     Object term504599;

    public Fraction_reduce_3355035251720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504107 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504107, term504107.getClass(), "numerator", -884889434);
        setIntField(term504107, term504107.getClass(), "denominator", 2053403749);
        term504602 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504602, term504602.getClass(), "numerator", -884889434);
        setIntField(term504602, term504602.getClass(), "denominator", 2053403749);
        setField(term504602, term504602.getClass(), "toString", null);
        setField(term504602, term504602.getClass(), "toProperString", null);
        term504599 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504599, term504599.getClass(), "numerator", -884889434);
        setIntField(term504599, term504599.getClass(), "denominator", 2053403749);
        setField(term504599, term504599.getClass(), "toString", null);
        setField(term504599, term504599.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term504107, args);
        assertTrue(recursiveEquals(term504107, term504602));
        assertTrue(recursiveEquals(retValue, term504599));
    }

};


