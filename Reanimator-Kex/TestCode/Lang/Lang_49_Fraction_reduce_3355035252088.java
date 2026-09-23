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

public class Fraction_reduce_3355035252088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615478;
     Object term615859;
     Object term615853;

    public Fraction_reduce_3355035252088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615478 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615478, term615478.getClass(), "numerator", -1894419330);
        setIntField(term615478, term615478.getClass(), "denominator", 1682881593);
        term615859 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615859, term615859.getClass(), "numerator", -1894419330);
        setIntField(term615859, term615859.getClass(), "denominator", 1682881593);
        setField(term615859, term615859.getClass(), "toString", null);
        setField(term615859, term615859.getClass(), "toProperString", null);
        term615853 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615853, term615853.getClass(), "numerator", -631473110);
        setIntField(term615853, term615853.getClass(), "denominator", 560960531);
        setField(term615853, term615853.getClass(), "toString", null);
        setField(term615853, term615853.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term615478, args);
        assertTrue(recursiveEquals(term615478, term615859));
        assertTrue(recursiveEquals(retValue, term615853));
    }

};


