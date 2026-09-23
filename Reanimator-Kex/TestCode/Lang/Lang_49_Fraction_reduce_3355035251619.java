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

public class Fraction_reduce_3355035251619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475750;
     Object term475956;
     Object term475950;

    public Fraction_reduce_3355035251619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475750 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475750, term475750.getClass(), "numerator", -1484385414);
        setIntField(term475750, term475750.getClass(), "denominator", 270562623);
        term475956 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475956, term475956.getClass(), "numerator", -1484385414);
        setIntField(term475956, term475956.getClass(), "denominator", 270562623);
        setField(term475956, term475956.getClass(), "toString", null);
        setField(term475956, term475956.getClass(), "toProperString", null);
        term475950 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475950, term475950.getClass(), "numerator", -494795138);
        setIntField(term475950, term475950.getClass(), "denominator", 90187541);
        setField(term475950, term475950.getClass(), "toString", null);
        setField(term475950, term475950.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term475750, args);
        assertTrue(recursiveEquals(term475750, term475956));
        assertTrue(recursiveEquals(retValue, term475950));
    }

};


