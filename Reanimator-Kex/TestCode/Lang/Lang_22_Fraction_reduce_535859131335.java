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

public class Fraction_reduce_535859131335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94266;
     Object term94777;
     Object term94774;

    public Fraction_reduce_535859131335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94266 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term94266, term94266.getClass(), "numerator", 352460878);
        setIntField(term94266, term94266.getClass(), "denominator", 2145343215);
        term94777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term94777, term94777.getClass(), "numerator", 352460878);
        setIntField(term94777, term94777.getClass(), "denominator", 2145343215);
        setField(term94777, term94777.getClass(), "toString", null);
        setField(term94777, term94777.getClass(), "toProperString", null);
        term94774 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term94774, term94774.getClass(), "numerator", 352460878);
        setIntField(term94774, term94774.getClass(), "denominator", 2145343215);
        setField(term94774, term94774.getClass(), "toString", null);
        setField(term94774, term94774.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term94266, args);
        assertTrue(recursiveEquals(term94266, term94777));
        assertTrue(recursiveEquals(retValue, term94774));
    }

};


