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

public class Fraction_reduce_335503525905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258977;
     Object term259102;
     Object term259096;

    public Fraction_reduce_335503525905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258977 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term258977, term258977.getClass(), "numerator", -1912572046);
        setIntField(term258977, term258977.getClass(), "denominator", 1073741824);
        term259102 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term259102, term259102.getClass(), "numerator", -1912572046);
        setIntField(term259102, term259102.getClass(), "denominator", 1073741824);
        setField(term259102, term259102.getClass(), "toString", null);
        setField(term259102, term259102.getClass(), "toProperString", null);
        term259096 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term259096, term259096.getClass(), "numerator", -956286023);
        setIntField(term259096, term259096.getClass(), "denominator", 536870912);
        setField(term259096, term259096.getClass(), "toString", null);
        setField(term259096, term259096.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term258977, args);
        assertTrue(recursiveEquals(term258977, term259102));
        assertTrue(recursiveEquals(retValue, term259096));
    }

};


