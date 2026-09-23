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

public class Fraction_reduce_535859131764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240363;
     Object term241101;
     Object term241098;

    public Fraction_reduce_535859131764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240363 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term240363, term240363.getClass(), "numerator", -608182802);
        setIntField(term240363, term240363.getClass(), "denominator", 1003201185);
        term241101 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term241101, term241101.getClass(), "numerator", -608182802);
        setIntField(term241101, term241101.getClass(), "denominator", 1003201185);
        setField(term241101, term241101.getClass(), "toString", null);
        setField(term241101, term241101.getClass(), "toProperString", null);
        term241098 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term241098, term241098.getClass(), "numerator", -608182802);
        setIntField(term241098, term241098.getClass(), "denominator", 1003201185);
        setField(term241098, term241098.getClass(), "toString", null);
        setField(term241098, term241098.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term240363, args);
        assertTrue(recursiveEquals(term240363, term241101));
        assertTrue(recursiveEquals(retValue, term241098));
    }

};


