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

public class Fraction_reduce_3355035252448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728528;
     Object term729256;
     Object term729250;

    public Fraction_reduce_3355035252448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728528 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term728528, term728528.getClass(), "numerator", -1785596110);
        setIntField(term728528, term728528.getClass(), "denominator", 60065855);
        term729256 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term729256, term729256.getClass(), "numerator", -1785596110);
        setIntField(term729256, term729256.getClass(), "denominator", 60065855);
        setField(term729256, term729256.getClass(), "toString", null);
        setField(term729256, term729256.getClass(), "toProperString", null);
        term729250 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term729250, term729250.getClass(), "numerator", -357119222);
        setIntField(term729250, term729250.getClass(), "denominator", 12013171);
        setField(term729250, term729250.getClass(), "toString", null);
        setField(term729250, term729250.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term728528, args);
        assertTrue(recursiveEquals(term728528, term729256));
        assertTrue(recursiveEquals(retValue, term729250));
    }

};


