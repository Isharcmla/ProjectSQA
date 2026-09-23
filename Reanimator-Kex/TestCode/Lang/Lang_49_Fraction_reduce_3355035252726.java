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

public class Fraction_reduce_3355035252726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812320;
     Object term812772;
     Object term812766;

    public Fraction_reduce_3355035252726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812320 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812320, term812320.getClass(), "numerator", -1211924334);
        setIntField(term812320, term812320.getClass(), "denominator", 984629775);
        term812772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812772, term812772.getClass(), "numerator", -1211924334);
        setIntField(term812772, term812772.getClass(), "denominator", 984629775);
        setField(term812772, term812772.getClass(), "toString", null);
        setField(term812772, term812772.getClass(), "toProperString", null);
        term812766 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812766, term812766.getClass(), "numerator", -403974778);
        setIntField(term812766, term812766.getClass(), "denominator", 328209925);
        setField(term812766, term812766.getClass(), "toString", null);
        setField(term812766, term812766.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term812320, args);
        assertTrue(recursiveEquals(term812320, term812772));
        assertTrue(recursiveEquals(retValue, term812766));
    }

};


