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

public class Fraction_reduce_535859131765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240673;
     Object term241204;
     Object term241201;

    public Fraction_reduce_535859131765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240673 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term240673, term240673.getClass(), "numerator", 1633347970);
        setIntField(term240673, term240673.getClass(), "denominator", 1644218169);
        term241204 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term241204, term241204.getClass(), "numerator", 1633347970);
        setIntField(term241204, term241204.getClass(), "denominator", 1644218169);
        setField(term241204, term241204.getClass(), "toString", null);
        setField(term241204, term241204.getClass(), "toProperString", null);
        term241201 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term241201, term241201.getClass(), "numerator", 1633347970);
        setIntField(term241201, term241201.getClass(), "denominator", 1644218169);
        setField(term241201, term241201.getClass(), "toString", null);
        setField(term241201, term241201.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term240673, args);
        assertTrue(recursiveEquals(term240673, term241204));
        assertTrue(recursiveEquals(retValue, term241201));
    }

};


