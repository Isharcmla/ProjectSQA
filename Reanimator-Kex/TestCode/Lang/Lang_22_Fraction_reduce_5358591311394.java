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

public class Fraction_reduce_5358591311394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454689;
     Object term455236;
     Object term455233;

    public Fraction_reduce_5358591311394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454689 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term454689, term454689.getClass(), "numerator", 675611378);
        setIntField(term454689, term454689.getClass(), "denominator", 676331969);
        term455236 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term455236, term455236.getClass(), "numerator", 675611378);
        setIntField(term455236, term455236.getClass(), "denominator", 676331969);
        setField(term455236, term455236.getClass(), "toString", null);
        setField(term455236, term455236.getClass(), "toProperString", null);
        term455233 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term455233, term455233.getClass(), "numerator", 675611378);
        setIntField(term455233, term455233.getClass(), "denominator", 676331969);
        setField(term455233, term455233.getClass(), "toString", null);
        setField(term455233, term455233.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term454689, args);
        assertTrue(recursiveEquals(term454689, term455236));
        assertTrue(recursiveEquals(retValue, term455233));
    }

};


