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

public class Fraction_reduce_3355035251099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318006;
     Object term318665;
     Object term318662;

    public Fraction_reduce_3355035251099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318006 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term318006, term318006.getClass(), "numerator", -1420849886);
        setIntField(term318006, term318006.getClass(), "denominator", 709982571);
        term318665 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term318665, term318665.getClass(), "numerator", -1420849886);
        setIntField(term318665, term318665.getClass(), "denominator", 709982571);
        setField(term318665, term318665.getClass(), "toString", null);
        setField(term318665, term318665.getClass(), "toProperString", null);
        term318662 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term318662, term318662.getClass(), "numerator", -1420849886);
        setIntField(term318662, term318662.getClass(), "denominator", 709982571);
        setField(term318662, term318662.getClass(), "toString", null);
        setField(term318662, term318662.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term318006, args);
        assertTrue(recursiveEquals(term318006, term318665));
        assertTrue(recursiveEquals(retValue, term318662));
    }

};


