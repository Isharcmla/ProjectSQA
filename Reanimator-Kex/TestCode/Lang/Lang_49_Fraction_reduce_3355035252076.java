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

public class Fraction_reduce_3355035252076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611623;
     Object term612290;
     Object term612287;

    public Fraction_reduce_3355035252076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611623 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term611623, term611623.getClass(), "numerator", -502936582);
        setIntField(term611623, term611623.getClass(), "denominator", 1535824747);
        term612290 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612290, term612290.getClass(), "numerator", -502936582);
        setIntField(term612290, term612290.getClass(), "denominator", 1535824747);
        setField(term612290, term612290.getClass(), "toString", null);
        setField(term612290, term612290.getClass(), "toProperString", null);
        term612287 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612287, term612287.getClass(), "numerator", -502936582);
        setIntField(term612287, term612287.getClass(), "denominator", 1535824747);
        setField(term612287, term612287.getClass(), "toString", null);
        setField(term612287, term612287.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term611623, args);
        assertTrue(recursiveEquals(term611623, term612290));
        assertTrue(recursiveEquals(retValue, term612287));
    }

};


