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

public class Fraction_reduce_535859131359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102946;
     Object term103382;
     Object term103379;

    public Fraction_reduce_535859131359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102946 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term102946, term102946.getClass(), "numerator", -1538920274);
        setIntField(term102946, term102946.getClass(), "denominator", 1311199265);
        term103382 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term103382, term103382.getClass(), "numerator", -1538920274);
        setIntField(term103382, term103382.getClass(), "denominator", 1311199265);
        setField(term103382, term103382.getClass(), "toString", null);
        setField(term103382, term103382.getClass(), "toProperString", null);
        term103379 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term103379, term103379.getClass(), "numerator", -1538920274);
        setIntField(term103379, term103379.getClass(), "denominator", 1311199265);
        setField(term103379, term103379.getClass(), "toString", null);
        setField(term103379, term103379.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term102946, args);
        assertTrue(recursiveEquals(term102946, term103382));
        assertTrue(recursiveEquals(retValue, term103379));
    }

};


