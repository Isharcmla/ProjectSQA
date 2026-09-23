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

public class Fraction_reduce_5358591312406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786483;
     Object term786965;
     Object term786962;

    public Fraction_reduce_5358591312406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786483 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term786483, term786483.getClass(), "numerator", -1029697402);
        setIntField(term786483, term786483.getClass(), "denominator", 1499199525);
        term786965 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term786965, term786965.getClass(), "numerator", -1029697402);
        setIntField(term786965, term786965.getClass(), "denominator", 1499199525);
        setField(term786965, term786965.getClass(), "toString", null);
        setField(term786965, term786965.getClass(), "toProperString", null);
        term786962 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term786962, term786962.getClass(), "numerator", -1029697402);
        setIntField(term786962, term786962.getClass(), "denominator", 1499199525);
        setField(term786962, term786962.getClass(), "toString", null);
        setField(term786962, term786962.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term786483, args);
        assertTrue(recursiveEquals(term786483, term786965));
        assertTrue(recursiveEquals(retValue, term786962));
    }

};


