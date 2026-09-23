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

public class Fraction_reduce_3355035251969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577828;
     Object term578728;
     Object term578722;

    public Fraction_reduce_3355035251969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577828 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term577828, term577828.getClass(), "numerator", 200802);
        setIntField(term577828, term577828.getClass(), "denominator", 2147018793);
        term578728 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term578728, term578728.getClass(), "numerator", 200802);
        setIntField(term578728, term578728.getClass(), "denominator", 2147018793);
        setField(term578728, term578728.getClass(), "toString", null);
        setField(term578728, term578728.getClass(), "toProperString", null);
        term578722 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term578722, term578722.getClass(), "numerator", 66934);
        setIntField(term578722, term578722.getClass(), "denominator", 715672931);
        setField(term578722, term578722.getClass(), "toString", null);
        setField(term578722, term578722.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term577828, args);
        assertTrue(recursiveEquals(term577828, term578728));
        assertTrue(recursiveEquals(retValue, term578722));
    }

};


