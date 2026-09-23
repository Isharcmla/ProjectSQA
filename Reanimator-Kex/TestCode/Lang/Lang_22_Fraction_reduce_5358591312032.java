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

public class Fraction_reduce_5358591312032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661380;
     Object term661815;
     Object term661812;

    public Fraction_reduce_5358591312032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661380 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661380, term661380.getClass(), "numerator", -1830792554);
        setIntField(term661380, term661380.getClass(), "denominator", 2050479853);
        term661815 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661815, term661815.getClass(), "numerator", -1830792554);
        setIntField(term661815, term661815.getClass(), "denominator", 2050479853);
        setField(term661815, term661815.getClass(), "toString", null);
        setField(term661815, term661815.getClass(), "toProperString", null);
        term661812 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661812, term661812.getClass(), "numerator", -1830792554);
        setIntField(term661812, term661812.getClass(), "denominator", 2050479853);
        setField(term661812, term661812.getClass(), "toString", null);
        setField(term661812, term661812.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term661380, args);
        assertTrue(recursiveEquals(term661380, term661815));
        assertTrue(recursiveEquals(retValue, term661812));
    }

};


