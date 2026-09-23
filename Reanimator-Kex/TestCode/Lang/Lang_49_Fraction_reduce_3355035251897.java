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

public class Fraction_reduce_3355035251897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557476;
     Object term557581;
     Object term557578;

    public Fraction_reduce_3355035251897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557476 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term557476, term557476.getClass(), "numerator", -1072037894);
        setIntField(term557476, term557476.getClass(), "denominator", 554631163);
        term557581 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term557581, term557581.getClass(), "numerator", -1072037894);
        setIntField(term557581, term557581.getClass(), "denominator", 554631163);
        setField(term557581, term557581.getClass(), "toString", null);
        setField(term557581, term557581.getClass(), "toProperString", null);
        term557578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term557578, term557578.getClass(), "numerator", -1072037894);
        setIntField(term557578, term557578.getClass(), "denominator", 554631163);
        setField(term557578, term557578.getClass(), "toString", null);
        setField(term557578, term557578.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term557476, args);
        assertTrue(recursiveEquals(term557476, term557581));
        assertTrue(recursiveEquals(retValue, term557578));
    }

};


