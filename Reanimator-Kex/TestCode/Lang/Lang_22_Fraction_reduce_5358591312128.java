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

public class Fraction_reduce_5358591312128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693108;
     Object term693447;
     Object term693444;

    public Fraction_reduce_5358591312128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693108 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693108, term693108.getClass(), "numerator", 1711655522);
        setIntField(term693108, term693108.getClass(), "denominator", 1432358025);
        term693447 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693447, term693447.getClass(), "numerator", 1711655522);
        setIntField(term693447, term693447.getClass(), "denominator", 1432358025);
        setField(term693447, term693447.getClass(), "toString", null);
        setField(term693447, term693447.getClass(), "toProperString", null);
        term693444 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693444, term693444.getClass(), "numerator", 1711655522);
        setIntField(term693444, term693444.getClass(), "denominator", 1432358025);
        setField(term693444, term693444.getClass(), "toString", null);
        setField(term693444, term693444.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term693108, args);
        assertTrue(recursiveEquals(term693108, term693447));
        assertTrue(recursiveEquals(retValue, term693444));
    }

};


