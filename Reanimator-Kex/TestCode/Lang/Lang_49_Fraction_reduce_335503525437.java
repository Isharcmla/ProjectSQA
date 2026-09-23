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

public class Fraction_reduce_335503525437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119112;
     Object term119564;
     Object term119561;

    public Fraction_reduce_335503525437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119112 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term119112, term119112.getClass(), "numerator", 505020738);
        setIntField(term119112, term119112.getClass(), "denominator", 1344012425);
        term119564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term119564, term119564.getClass(), "numerator", 505020738);
        setIntField(term119564, term119564.getClass(), "denominator", 1344012425);
        setField(term119564, term119564.getClass(), "toString", null);
        setField(term119564, term119564.getClass(), "toProperString", null);
        term119561 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term119561, term119561.getClass(), "numerator", 505020738);
        setIntField(term119561, term119561.getClass(), "denominator", 1344012425);
        setField(term119561, term119561.getClass(), "toString", null);
        setField(term119561, term119561.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term119112, args);
        assertTrue(recursiveEquals(term119112, term119564));
        assertTrue(recursiveEquals(retValue, term119561));
    }

};


