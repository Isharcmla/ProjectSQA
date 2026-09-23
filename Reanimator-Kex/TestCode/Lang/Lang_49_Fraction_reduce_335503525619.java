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

public class Fraction_reduce_335503525619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172687;
     Object term173181;
     Object term173178;

    public Fraction_reduce_335503525619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172687 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term172687, term172687.getClass(), "numerator", 1210728466);
        setIntField(term172687, term172687.getClass(), "denominator", 605346561);
        term173181 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173181, term173181.getClass(), "numerator", 1210728466);
        setIntField(term173181, term173181.getClass(), "denominator", 605346561);
        setField(term173181, term173181.getClass(), "toString", null);
        setField(term173181, term173181.getClass(), "toProperString", null);
        term173178 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173178, term173178.getClass(), "numerator", 1210728466);
        setIntField(term173178, term173178.getClass(), "denominator", 605346561);
        setField(term173178, term173178.getClass(), "toString", null);
        setField(term173178, term173178.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term172687, args);
        assertTrue(recursiveEquals(term172687, term173181));
        assertTrue(recursiveEquals(retValue, term173178));
    }

};


