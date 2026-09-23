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

public class Fraction_reduce_3355035252228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657199;
     Object term658613;
     Object term658610;

    public Fraction_reduce_3355035252228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657199 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term657199, term657199.getClass(), "numerator", -887067682);
        setIntField(term657199, term657199.getClass(), "denominator", 1360732681);
        term658613 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term658613, term658613.getClass(), "numerator", -887067682);
        setIntField(term658613, term658613.getClass(), "denominator", 1360732681);
        setField(term658613, term658613.getClass(), "toString", null);
        setField(term658613, term658613.getClass(), "toProperString", null);
        term658610 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term658610, term658610.getClass(), "numerator", -887067682);
        setIntField(term658610, term658610.getClass(), "denominator", 1360732681);
        setField(term658610, term658610.getClass(), "toString", null);
        setField(term658610, term658610.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term657199, args);
        assertTrue(recursiveEquals(term657199, term658613));
        assertTrue(recursiveEquals(retValue, term658610));
    }

};


