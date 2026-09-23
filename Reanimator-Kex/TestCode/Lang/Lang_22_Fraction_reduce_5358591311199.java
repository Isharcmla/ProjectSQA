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

public class Fraction_reduce_5358591311199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388473;
     Object term389355;
     Object term389352;

    public Fraction_reduce_5358591311199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388473 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term388473, term388473.getClass(), "numerator", 830626306);
        setIntField(term388473, term388473.getClass(), "denominator", 1879321689);
        term389355 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term389355, term389355.getClass(), "numerator", 830626306);
        setIntField(term389355, term389355.getClass(), "denominator", 1879321689);
        setField(term389355, term389355.getClass(), "toString", null);
        setField(term389355, term389355.getClass(), "toProperString", null);
        term389352 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term389352, term389352.getClass(), "numerator", 830626306);
        setIntField(term389352, term389352.getClass(), "denominator", 1879321689);
        setField(term389352, term389352.getClass(), "toString", null);
        setField(term389352, term389352.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term388473, args);
        assertTrue(recursiveEquals(term388473, term389355));
        assertTrue(recursiveEquals(retValue, term389352));
    }

};


