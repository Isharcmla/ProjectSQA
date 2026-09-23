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

public class Fraction_reduce_3355035252509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746963;
     Object term747665;
     Object term747662;

    public Fraction_reduce_3355035252509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term746963, term746963.getClass(), "numerator", 453529426);
        setIntField(term746963, term746963.getClass(), "denominator", 1979727905);
        term747665 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term747665, term747665.getClass(), "numerator", 453529426);
        setIntField(term747665, term747665.getClass(), "denominator", 1979727905);
        setField(term747665, term747665.getClass(), "toString", null);
        setField(term747665, term747665.getClass(), "toProperString", null);
        term747662 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term747662, term747662.getClass(), "numerator", 453529426);
        setIntField(term747662, term747662.getClass(), "denominator", 1979727905);
        setField(term747662, term747662.getClass(), "toString", null);
        setField(term747662, term747662.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term746963, args);
        assertTrue(recursiveEquals(term746963, term747665));
        assertTrue(recursiveEquals(retValue, term747662));
    }

};


