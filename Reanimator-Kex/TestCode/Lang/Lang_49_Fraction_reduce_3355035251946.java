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

public class Fraction_reduce_3355035251946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571127;
     Object term571617;
     Object term571614;

    public Fraction_reduce_3355035251946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571127 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term571127, term571127.getClass(), "numerator", 1077941126);
        setIntField(term571127, term571127.getClass(), "denominator", 438044931);
        term571617 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term571617, term571617.getClass(), "numerator", 1077941126);
        setIntField(term571617, term571617.getClass(), "denominator", 438044931);
        setField(term571617, term571617.getClass(), "toString", null);
        setField(term571617, term571617.getClass(), "toProperString", null);
        term571614 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term571614, term571614.getClass(), "numerator", 1077941126);
        setIntField(term571614, term571614.getClass(), "denominator", 438044931);
        setField(term571614, term571614.getClass(), "toString", null);
        setField(term571614, term571614.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term571127, args);
        assertTrue(recursiveEquals(term571127, term571617));
        assertTrue(recursiveEquals(retValue, term571614));
    }

};


