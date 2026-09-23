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

public class Fraction_reduce_3355035251588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466681;
     Object term467238;
     Object term467235;

    public Fraction_reduce_3355035251588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466681 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term466681, term466681.getClass(), "numerator", 529042);
        setIntField(term466681, term466681.getClass(), "denominator", 2147223745);
        term467238 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term467238, term467238.getClass(), "numerator", 529042);
        setIntField(term467238, term467238.getClass(), "denominator", 2147223745);
        setField(term467238, term467238.getClass(), "toString", null);
        setField(term467238, term467238.getClass(), "toProperString", null);
        term467235 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term467235, term467235.getClass(), "numerator", 529042);
        setIntField(term467235, term467235.getClass(), "denominator", 2147223745);
        setField(term467235, term467235.getClass(), "toString", null);
        setField(term467235, term467235.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term466681, args);
        assertTrue(recursiveEquals(term466681, term467238));
        assertTrue(recursiveEquals(retValue, term467235));
    }

};


