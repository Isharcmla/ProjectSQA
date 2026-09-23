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

public class Fraction_reduce_535859131452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134662;
     Object term135648;
     Object term135645;

    public Fraction_reduce_535859131452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134662 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term134662, term134662.getClass(), "numerator", 182195362);
        setIntField(term134662, term134662.getClass(), "denominator", 302231849);
        term135648 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term135648, term135648.getClass(), "numerator", 182195362);
        setIntField(term135648, term135648.getClass(), "denominator", 302231849);
        setField(term135648, term135648.getClass(), "toString", null);
        setField(term135648, term135648.getClass(), "toProperString", null);
        term135645 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term135645, term135645.getClass(), "numerator", 182195362);
        setIntField(term135645, term135645.getClass(), "denominator", 302231849);
        setField(term135645, term135645.getClass(), "toString", null);
        setField(term135645, term135645.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term134662, args);
        assertTrue(recursiveEquals(term134662, term135648));
        assertTrue(recursiveEquals(retValue, term135645));
    }

};


