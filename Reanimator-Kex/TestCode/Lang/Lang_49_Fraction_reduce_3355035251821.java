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

public class Fraction_reduce_3355035251821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533429;
     Object term533628;
     Object term533625;

    public Fraction_reduce_3355035251821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533429 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533429, term533429.getClass(), "numerator", 626011562);
        setIntField(term533429, term533429.getClass(), "denominator", 245879433);
        term533628 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533628, term533628.getClass(), "numerator", 626011562);
        setIntField(term533628, term533628.getClass(), "denominator", 245879433);
        setField(term533628, term533628.getClass(), "toString", null);
        setField(term533628, term533628.getClass(), "toProperString", null);
        term533625 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533625, term533625.getClass(), "numerator", 626011562);
        setIntField(term533625, term533625.getClass(), "denominator", 245879433);
        setField(term533625, term533625.getClass(), "toString", null);
        setField(term533625, term533625.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term533429, args);
        assertTrue(recursiveEquals(term533429, term533628));
        assertTrue(recursiveEquals(retValue, term533625));
    }

};


