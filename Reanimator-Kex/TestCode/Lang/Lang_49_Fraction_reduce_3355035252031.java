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

public class Fraction_reduce_3355035252031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596605;
     Object term597471;
     Object term597468;

    public Fraction_reduce_3355035252031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term596605 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term596605, term596605.getClass(), "numerator", 605422130);
        setIntField(term596605, term596605.getClass(), "denominator", 287766529);
        term597471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term597471, term597471.getClass(), "numerator", 605422130);
        setIntField(term597471, term597471.getClass(), "denominator", 287766529);
        setField(term597471, term597471.getClass(), "toString", null);
        setField(term597471, term597471.getClass(), "toProperString", null);
        term597468 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term597468, term597468.getClass(), "numerator", 605422130);
        setIntField(term597468, term597468.getClass(), "denominator", 287766529);
        setField(term597468, term597468.getClass(), "toString", null);
        setField(term597468, term597468.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term596605, args);
        assertTrue(recursiveEquals(term596605, term597471));
        assertTrue(recursiveEquals(retValue, term597468));
    }

};


