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

public class Fraction_reduce_3355035252045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600428;
     Object term600630;
     Object term600627;

    public Fraction_reduce_3355035252045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600428 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600428, term600428.getClass(), "numerator", -651663694);
        setIntField(term600428, term600428.getClass(), "denominator", 1837914063);
        term600630 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600630, term600630.getClass(), "numerator", -651663694);
        setIntField(term600630, term600630.getClass(), "denominator", 1837914063);
        setField(term600630, term600630.getClass(), "toString", null);
        setField(term600630, term600630.getClass(), "toProperString", null);
        term600627 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600627, term600627.getClass(), "numerator", -651663694);
        setIntField(term600627, term600627.getClass(), "denominator", 1837914063);
        setField(term600627, term600627.getClass(), "toString", null);
        setField(term600627, term600627.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term600428, args);
        assertTrue(recursiveEquals(term600428, term600630));
        assertTrue(recursiveEquals(retValue, term600627));
    }

};


