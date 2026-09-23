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

public class Fraction_reduce_5358591311421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463625;
     Object term463732;
     Object term463729;

    public Fraction_reduce_5358591311421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463625 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term463625, term463625.getClass(), "numerator", -326023826);
        setIntField(term463625, term463625.getClass(), "denominator", 2012747329);
        term463732 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term463732, term463732.getClass(), "numerator", -326023826);
        setIntField(term463732, term463732.getClass(), "denominator", 2012747329);
        setField(term463732, term463732.getClass(), "toString", null);
        setField(term463732, term463732.getClass(), "toProperString", null);
        term463729 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term463729, term463729.getClass(), "numerator", -326023826);
        setIntField(term463729, term463729.getClass(), "denominator", 2012747329);
        setField(term463729, term463729.getClass(), "toString", null);
        setField(term463729, term463729.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term463625, args);
        assertTrue(recursiveEquals(term463625, term463732));
        assertTrue(recursiveEquals(retValue, term463729));
    }

};


