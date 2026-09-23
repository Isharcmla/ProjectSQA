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

public class Fraction_reduce_5358591311774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576899;
     Object term577414;
     Object term577411;

    public Fraction_reduce_5358591311774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576899 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term576899, term576899.getClass(), "numerator", -707452450);
        setIntField(term576899, term576899.getClass(), "denominator", 2016315657);
        term577414 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term577414, term577414.getClass(), "numerator", -707452450);
        setIntField(term577414, term577414.getClass(), "denominator", 2016315657);
        setField(term577414, term577414.getClass(), "toString", null);
        setField(term577414, term577414.getClass(), "toProperString", null);
        term577411 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term577411, term577411.getClass(), "numerator", -707452450);
        setIntField(term577411, term577411.getClass(), "denominator", 2016315657);
        setField(term577411, term577411.getClass(), "toString", null);
        setField(term577411, term577411.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term576899, args);
        assertTrue(recursiveEquals(term576899, term577414));
        assertTrue(recursiveEquals(retValue, term577411));
    }

};


