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

public class Fraction_reduce_5358591312298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751272;
     Object term751781;
     Object term751778;

    public Fraction_reduce_5358591312298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751272 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751272, term751272.getClass(), "numerator", -1061775902);
        setIntField(term751272, term751272.getClass(), "denominator", 562575015);
        term751781 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751781, term751781.getClass(), "numerator", -1061775902);
        setIntField(term751781, term751781.getClass(), "denominator", 562575015);
        setField(term751781, term751781.getClass(), "toString", null);
        setField(term751781, term751781.getClass(), "toProperString", null);
        term751778 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751778, term751778.getClass(), "numerator", -1061775902);
        setIntField(term751778, term751778.getClass(), "denominator", 562575015);
        setField(term751778, term751778.getClass(), "toString", null);
        setField(term751778, term751778.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term751272, args);
        assertTrue(recursiveEquals(term751272, term751781));
        assertTrue(recursiveEquals(retValue, term751778));
    }

};


