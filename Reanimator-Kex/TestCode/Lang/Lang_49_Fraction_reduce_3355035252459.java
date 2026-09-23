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

public class Fraction_reduce_3355035252459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731866;
     Object term732076;
     Object term732073;

    public Fraction_reduce_3355035252459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731866 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731866, term731866.getClass(), "numerator", 78912578);
        setIntField(term731866, term731866.getClass(), "denominator", 2084575593);
        term732076 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term732076, term732076.getClass(), "numerator", 78912578);
        setIntField(term732076, term732076.getClass(), "denominator", 2084575593);
        setField(term732076, term732076.getClass(), "toString", null);
        setField(term732076, term732076.getClass(), "toProperString", null);
        term732073 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term732073, term732073.getClass(), "numerator", 78912578);
        setIntField(term732073, term732073.getClass(), "denominator", 2084575593);
        setField(term732073, term732073.getClass(), "toString", null);
        setField(term732073, term732073.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term731866, args);
        assertTrue(recursiveEquals(term731866, term732076));
        assertTrue(recursiveEquals(retValue, term732073));
    }

};


