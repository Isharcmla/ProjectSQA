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

public class Fraction_reduce_335503525826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232617;
     Object term233579;
     Object term233576;

    public Fraction_reduce_335503525826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232617 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term232617, term232617.getClass(), "numerator", -1735013606);
        setIntField(term232617, term232617.getClass(), "denominator", 1182827163);
        term233579 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term233579, term233579.getClass(), "numerator", -1735013606);
        setIntField(term233579, term233579.getClass(), "denominator", 1182827163);
        setField(term233579, term233579.getClass(), "toString", null);
        setField(term233579, term233579.getClass(), "toProperString", null);
        term233576 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term233576, term233576.getClass(), "numerator", -1735013606);
        setIntField(term233576, term233576.getClass(), "denominator", 1182827163);
        setField(term233576, term233576.getClass(), "toString", null);
        setField(term233576, term233576.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term232617, args);
        assertTrue(recursiveEquals(term232617, term233579));
        assertTrue(recursiveEquals(retValue, term233576));
    }

};


