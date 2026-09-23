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

public class Fraction_reduce_535859131786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248814;
     Object term249332;
     Object term249329;

    public Fraction_reduce_535859131786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248814 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term248814, term248814.getClass(), "numerator", 553648946);
        setIntField(term248814, term248814.getClass(), "denominator", 813694209);
        term249332 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249332, term249332.getClass(), "numerator", 553648946);
        setIntField(term249332, term249332.getClass(), "denominator", 813694209);
        setField(term249332, term249332.getClass(), "toString", null);
        setField(term249332, term249332.getClass(), "toProperString", null);
        term249329 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249329, term249329.getClass(), "numerator", 553648946);
        setIntField(term249329, term249329.getClass(), "denominator", 813694209);
        setField(term249329, term249329.getClass(), "toString", null);
        setField(term249329, term249329.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term248814, args);
        assertTrue(recursiveEquals(term248814, term249332));
        assertTrue(recursiveEquals(retValue, term249329));
    }

};


