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

public class Fraction_reduce_3355035252407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714303;
     Object term715622;
     Object term715619;

    public Fraction_reduce_3355035252407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714303 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term714303, term714303.getClass(), "numerator", 125934066);
        setIntField(term714303, term714303.getClass(), "denominator", 1430168593);
        term715622 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term715622, term715622.getClass(), "numerator", 125934066);
        setIntField(term715622, term715622.getClass(), "denominator", 1430168593);
        setField(term715622, term715622.getClass(), "toString", null);
        setField(term715622, term715622.getClass(), "toProperString", null);
        term715619 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term715619, term715619.getClass(), "numerator", 125934066);
        setIntField(term715619, term715619.getClass(), "denominator", 1430168593);
        setField(term715619, term715619.getClass(), "toString", null);
        setField(term715619, term715619.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term714303, args);
        assertTrue(recursiveEquals(term714303, term715622));
        assertTrue(recursiveEquals(retValue, term715619));
    }

};


