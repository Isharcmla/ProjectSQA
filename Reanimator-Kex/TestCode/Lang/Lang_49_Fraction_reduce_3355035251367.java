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

public class Fraction_reduce_3355035251367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399170;
     Object term400355;
     Object term400352;

    public Fraction_reduce_3355035251367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399170 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term399170, term399170.getClass(), "numerator", -1573355446);
        setIntField(term399170, term399170.getClass(), "denominator", 1763601475);
        term400355 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term400355, term400355.getClass(), "numerator", -1573355446);
        setIntField(term400355, term400355.getClass(), "denominator", 1763601475);
        setField(term400355, term400355.getClass(), "toString", null);
        setField(term400355, term400355.getClass(), "toProperString", null);
        term400352 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term400352, term400352.getClass(), "numerator", -1573355446);
        setIntField(term400352, term400352.getClass(), "denominator", 1763601475);
        setField(term400352, term400352.getClass(), "toString", null);
        setField(term400352, term400352.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term399170, args);
        assertTrue(recursiveEquals(term399170, term400355));
        assertTrue(recursiveEquals(retValue, term400352));
    }

};


