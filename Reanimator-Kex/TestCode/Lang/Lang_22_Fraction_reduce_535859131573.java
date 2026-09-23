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

public class Fraction_reduce_535859131573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177119;
     Object term177628;
     Object term177625;

    public Fraction_reduce_535859131573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177119 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term177119, term177119.getClass(), "numerator", -1853714478);
        setIntField(term177119, term177119.getClass(), "denominator", 1640314799);
        term177628 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term177628, term177628.getClass(), "numerator", -1853714478);
        setIntField(term177628, term177628.getClass(), "denominator", 1640314799);
        setField(term177628, term177628.getClass(), "toString", null);
        setField(term177628, term177628.getClass(), "toProperString", null);
        term177625 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term177625, term177625.getClass(), "numerator", -1853714478);
        setIntField(term177625, term177625.getClass(), "denominator", 1640314799);
        setField(term177625, term177625.getClass(), "toString", null);
        setField(term177625, term177625.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term177119, args);
        assertTrue(recursiveEquals(term177119, term177628));
        assertTrue(recursiveEquals(retValue, term177625));
    }

};


