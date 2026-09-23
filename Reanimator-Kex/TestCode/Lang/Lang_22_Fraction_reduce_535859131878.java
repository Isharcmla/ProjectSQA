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

public class Fraction_reduce_535859131878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279683;
     Object term280580;
     Object term280577;

    public Fraction_reduce_535859131878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279683 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term279683, term279683.getClass(), "numerator", 1949517194);
        setIntField(term279683, term279683.getClass(), "denominator", 2100831549);
        term280580 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280580, term280580.getClass(), "numerator", 1949517194);
        setIntField(term280580, term280580.getClass(), "denominator", 2100831549);
        setField(term280580, term280580.getClass(), "toString", null);
        setField(term280580, term280580.getClass(), "toProperString", null);
        term280577 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280577, term280577.getClass(), "numerator", 1949517194);
        setIntField(term280577, term280577.getClass(), "denominator", 2100831549);
        setField(term280577, term280577.getClass(), "toString", null);
        setField(term280577, term280577.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term279683, args);
        assertTrue(recursiveEquals(term279683, term280580));
        assertTrue(recursiveEquals(retValue, term280577));
    }

};


