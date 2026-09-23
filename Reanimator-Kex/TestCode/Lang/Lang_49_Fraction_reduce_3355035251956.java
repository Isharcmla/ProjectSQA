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

public class Fraction_reduce_3355035251956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574240;
     Object term574514;
     Object term574508;

    public Fraction_reduce_3355035251956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574240 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574240, term574240.getClass(), "numerator", 1112035346);
        setIntField(term574240, term574240.getClass(), "denominator", 512);
        term574514 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574514, term574514.getClass(), "numerator", 1112035346);
        setIntField(term574514, term574514.getClass(), "denominator", 512);
        setField(term574514, term574514.getClass(), "toString", null);
        setField(term574514, term574514.getClass(), "toProperString", null);
        term574508 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574508, term574508.getClass(), "numerator", 556017673);
        setIntField(term574508, term574508.getClass(), "denominator", 256);
        setField(term574508, term574508.getClass(), "toString", null);
        setField(term574508, term574508.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term574240, args);
        assertTrue(recursiveEquals(term574240, term574514));
        assertTrue(recursiveEquals(retValue, term574508));
    }

};


