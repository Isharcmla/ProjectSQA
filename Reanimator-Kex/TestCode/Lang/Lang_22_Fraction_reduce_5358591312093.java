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

public class Fraction_reduce_5358591312093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682080;
     Object term682301;
     Object term682298;

    public Fraction_reduce_5358591312093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682080 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682080, term682080.getClass(), "numerator", -987233786);
        setIntField(term682080, term682080.getClass(), "denominator", 1318358901);
        term682301 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682301, term682301.getClass(), "numerator", -987233786);
        setIntField(term682301, term682301.getClass(), "denominator", 1318358901);
        setField(term682301, term682301.getClass(), "toString", null);
        setField(term682301, term682301.getClass(), "toProperString", null);
        term682298 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682298, term682298.getClass(), "numerator", -987233786);
        setIntField(term682298, term682298.getClass(), "denominator", 1318358901);
        setField(term682298, term682298.getClass(), "toString", null);
        setField(term682298, term682298.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term682080, args);
        assertTrue(recursiveEquals(term682080, term682301));
        assertTrue(recursiveEquals(retValue, term682298));
    }

};


