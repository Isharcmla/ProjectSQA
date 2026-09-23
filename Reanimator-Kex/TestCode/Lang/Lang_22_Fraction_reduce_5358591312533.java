package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830039;
     Object term830575;
     Object term830572;

    public Fraction_reduce_5358591312533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830039 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830039, term830039.getClass(), "numerator", -228258126);
        setIntField(term830039, term830039.getClass(), "denominator", 2130705775);
        term830575 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830575, term830575.getClass(), "numerator", -228258126);
        setIntField(term830575, term830575.getClass(), "denominator", 2130705775);
        setField(term830575, term830575.getClass(), "toString", null);
        setField(term830575, term830575.getClass(), "toProperString", null);
        term830572 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830572, term830572.getClass(), "numerator", -228258126);
        setIntField(term830572, term830572.getClass(), "denominator", 2130705775);
        setField(term830572, term830572.getClass(), "toString", null);
        setField(term830572, term830572.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term830039, args);
        assertTrue(recursiveEquals(term830039, term830575));
        assertTrue(recursiveEquals(retValue, term830572));
    }

};


