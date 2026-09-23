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

public class Fraction_reduce_3355035252034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597660;
     Object term598064;
     Object term598061;

    public Fraction_reduce_3355035252034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term597660, term597660.getClass(), "numerator", 590098682);
        setIntField(term597660, term597660.getClass(), "denominator", 988449109);
        term598064 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598064, term598064.getClass(), "numerator", 590098682);
        setIntField(term598064, term598064.getClass(), "denominator", 988449109);
        setField(term598064, term598064.getClass(), "toString", null);
        setField(term598064, term598064.getClass(), "toProperString", null);
        term598061 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598061, term598061.getClass(), "numerator", 590098682);
        setIntField(term598061, term598061.getClass(), "denominator", 988449109);
        setField(term598061, term598061.getClass(), "toString", null);
        setField(term598061, term598061.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term597660, args);
        assertTrue(recursiveEquals(term597660, term598064));
        assertTrue(recursiveEquals(retValue, term598061));
    }

};


