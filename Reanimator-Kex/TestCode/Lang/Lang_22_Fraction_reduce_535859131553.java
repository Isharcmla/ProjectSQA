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

public class Fraction_reduce_535859131553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170402;
     Object term170911;
     Object term170908;

    public Fraction_reduce_535859131553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170402 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term170402, term170402.getClass(), "numerator", 336536962);
        setIntField(term170402, term170402.getClass(), "denominator", 875598649);
        term170911 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term170911, term170911.getClass(), "numerator", 336536962);
        setIntField(term170911, term170911.getClass(), "denominator", 875598649);
        setField(term170911, term170911.getClass(), "toString", null);
        setField(term170911, term170911.getClass(), "toProperString", null);
        term170908 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term170908, term170908.getClass(), "numerator", 336536962);
        setIntField(term170908, term170908.getClass(), "denominator", 875598649);
        setField(term170908, term170908.getClass(), "toString", null);
        setField(term170908, term170908.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term170402, args);
        assertTrue(recursiveEquals(term170402, term170911));
        assertTrue(recursiveEquals(retValue, term170908));
    }

};


