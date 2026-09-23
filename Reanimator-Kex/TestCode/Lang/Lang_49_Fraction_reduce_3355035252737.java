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

public class Fraction_reduce_3355035252737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815726;
     Object term816545;
     Object term816542;

    public Fraction_reduce_3355035252737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815726 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term815726, term815726.getClass(), "numerator", -1082046062);
        setIntField(term815726, term815726.getClass(), "denominator", 1912652079);
        term816545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term816545, term816545.getClass(), "numerator", -1082046062);
        setIntField(term816545, term816545.getClass(), "denominator", 1912652079);
        setField(term816545, term816545.getClass(), "toString", null);
        setField(term816545, term816545.getClass(), "toProperString", null);
        term816542 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term816542, term816542.getClass(), "numerator", -1082046062);
        setIntField(term816542, term816542.getClass(), "denominator", 1912652079);
        setField(term816542, term816542.getClass(), "toString", null);
        setField(term816542, term816542.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term815726, args);
        assertTrue(recursiveEquals(term815726, term816545));
        assertTrue(recursiveEquals(retValue, term816542));
    }

};


