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

public class Fraction_reduce_3355035252005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588952;
     Object term589530;
     Object term589527;

    public Fraction_reduce_3355035252005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588952 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term588952, term588952.getClass(), "numerator", -1199499162);
        setIntField(term588952, term588952.getClass(), "denominator", 1741718245);
        term589530 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589530, term589530.getClass(), "numerator", -1199499162);
        setIntField(term589530, term589530.getClass(), "denominator", 1741718245);
        setField(term589530, term589530.getClass(), "toString", null);
        setField(term589530, term589530.getClass(), "toProperString", null);
        term589527 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589527, term589527.getClass(), "numerator", -1199499162);
        setIntField(term589527, term589527.getClass(), "denominator", 1741718245);
        setField(term589527, term589527.getClass(), "toString", null);
        setField(term589527, term589527.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term588952, args);
        assertTrue(recursiveEquals(term588952, term589530));
        assertTrue(recursiveEquals(retValue, term589527));
    }

};


