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

public class Fraction_reduce_3355035252341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693444;
     Object term694041;
     Object term694038;

    public Fraction_reduce_3355035252341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693444 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term693444, term693444.getClass(), "numerator", -419758138);
        setIntField(term693444, term693444.getClass(), "denominator", 209879005);
        term694041 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694041, term694041.getClass(), "numerator", -419758138);
        setIntField(term694041, term694041.getClass(), "denominator", 209879005);
        setField(term694041, term694041.getClass(), "toString", null);
        setField(term694041, term694041.getClass(), "toProperString", null);
        term694038 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694038, term694038.getClass(), "numerator", -419758138);
        setIntField(term694038, term694038.getClass(), "denominator", 209879005);
        setField(term694038, term694038.getClass(), "toString", null);
        setField(term694038, term694038.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term693444, args);
        assertTrue(recursiveEquals(term693444, term694041));
        assertTrue(recursiveEquals(retValue, term694038));
    }

};


