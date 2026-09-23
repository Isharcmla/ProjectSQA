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

public class Fraction_reduce_3355035251988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584250;
     Object term585136;
     Object term585133;

    public Fraction_reduce_3355035251988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584250 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term584250, term584250.getClass(), "numerator", -73210962);
        setIntField(term584250, term584250.getClass(), "denominator", 865117105);
        term585136 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term585136, term585136.getClass(), "numerator", -73210962);
        setIntField(term585136, term585136.getClass(), "denominator", 865117105);
        setField(term585136, term585136.getClass(), "toString", null);
        setField(term585136, term585136.getClass(), "toProperString", null);
        term585133 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term585133, term585133.getClass(), "numerator", -73210962);
        setIntField(term585133, term585133.getClass(), "denominator", 865117105);
        setField(term585133, term585133.getClass(), "toString", null);
        setField(term585133, term585133.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term584250, args);
        assertTrue(recursiveEquals(term584250, term585136));
        assertTrue(recursiveEquals(retValue, term585133));
    }

};


