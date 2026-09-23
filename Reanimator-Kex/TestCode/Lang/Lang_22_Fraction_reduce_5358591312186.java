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

public class Fraction_reduce_5358591312186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711202;
     Object term712036;
     Object term712033;

    public Fraction_reduce_5358591312186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711202 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term711202, term711202.getClass(), "numerator", -270510322);
        setIntField(term711202, term711202.getClass(), "denominator", 1457530897);
        term712036 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term712036, term712036.getClass(), "numerator", -270510322);
        setIntField(term712036, term712036.getClass(), "denominator", 1457530897);
        setField(term712036, term712036.getClass(), "toString", null);
        setField(term712036, term712036.getClass(), "toProperString", null);
        term712033 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term712033, term712033.getClass(), "numerator", -270510322);
        setIntField(term712033, term712033.getClass(), "denominator", 1457530897);
        setField(term712033, term712033.getClass(), "toString", null);
        setField(term712033, term712033.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term711202, args);
        assertTrue(recursiveEquals(term711202, term712036));
        assertTrue(recursiveEquals(retValue, term712033));
    }

};


