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

public class Fraction_reduce_3355035251928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566427;
     Object term567155;
     Object term567152;

    public Fraction_reduce_3355035251928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566427 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term566427, term566427.getClass(), "numerator", -362397922);
        setIntField(term566427, term566427.getClass(), "denominator", 267473673);
        term567155 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567155, term567155.getClass(), "numerator", -362397922);
        setIntField(term567155, term567155.getClass(), "denominator", 267473673);
        setField(term567155, term567155.getClass(), "toString", null);
        setField(term567155, term567155.getClass(), "toProperString", null);
        term567152 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567152, term567152.getClass(), "numerator", -362397922);
        setIntField(term567152, term567152.getClass(), "denominator", 267473673);
        setField(term567152, term567152.getClass(), "toString", null);
        setField(term567152, term567152.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term566427, args);
        assertTrue(recursiveEquals(term566427, term567155));
        assertTrue(recursiveEquals(retValue, term567152));
    }

};


