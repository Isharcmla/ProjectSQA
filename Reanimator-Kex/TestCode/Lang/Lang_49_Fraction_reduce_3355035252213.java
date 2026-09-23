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

public class Fraction_reduce_3355035252213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653209;
     Object term654412;
     Object term654409;

    public Fraction_reduce_3355035252213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653209 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term653209, term653209.getClass(), "numerator", 99792198);
        setIntField(term653209, term653209.getClass(), "denominator", 1278977869);
        term654412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term654412, term654412.getClass(), "numerator", 99792198);
        setIntField(term654412, term654412.getClass(), "denominator", 1278977869);
        setField(term654412, term654412.getClass(), "toString", null);
        setField(term654412, term654412.getClass(), "toProperString", null);
        term654409 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term654409, term654409.getClass(), "numerator", 99792198);
        setIntField(term654409, term654409.getClass(), "denominator", 1278977869);
        setField(term654409, term654409.getClass(), "toString", null);
        setField(term654409, term654409.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term653209, args);
        assertTrue(recursiveEquals(term653209, term654412));
        assertTrue(recursiveEquals(retValue, term654409));
    }

};


