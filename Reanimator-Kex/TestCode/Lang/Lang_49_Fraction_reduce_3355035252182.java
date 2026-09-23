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

public class Fraction_reduce_3355035252182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644769;
     Object term645304;
     Object term645301;

    public Fraction_reduce_3355035252182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644769 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term644769, term644769.getClass(), "numerator", -1458119862);
        setIntField(term644769, term644769.getClass(), "denominator", 1435522691);
        term645304 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645304, term645304.getClass(), "numerator", -1458119862);
        setIntField(term645304, term645304.getClass(), "denominator", 1435522691);
        setField(term645304, term645304.getClass(), "toString", null);
        setField(term645304, term645304.getClass(), "toProperString", null);
        term645301 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645301, term645301.getClass(), "numerator", -1458119862);
        setIntField(term645301, term645301.getClass(), "denominator", 1435522691);
        setField(term645301, term645301.getClass(), "toString", null);
        setField(term645301, term645301.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term644769, args);
        assertTrue(recursiveEquals(term644769, term645304));
        assertTrue(recursiveEquals(retValue, term645301));
    }

};


