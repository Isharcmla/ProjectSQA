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

public class Fraction_reduce_3355035252676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798564;
     Object term799468;
     Object term799465;

    public Fraction_reduce_3355035252676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term798564, term798564.getClass(), "numerator", -2145918806);
        setIntField(term798564, term798564.getClass(), "denominator", 1075573347);
        term799468 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term799468, term799468.getClass(), "numerator", -2145918806);
        setIntField(term799468, term799468.getClass(), "denominator", 1075573347);
        setField(term799468, term799468.getClass(), "toString", null);
        setField(term799468, term799468.getClass(), "toProperString", null);
        term799465 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term799465, term799465.getClass(), "numerator", -2145918806);
        setIntField(term799465, term799465.getClass(), "denominator", 1075573347);
        setField(term799465, term799465.getClass(), "toString", null);
        setField(term799465, term799465.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term798564, args);
        assertTrue(recursiveEquals(term798564, term799468));
        assertTrue(recursiveEquals(retValue, term799465));
    }

};


