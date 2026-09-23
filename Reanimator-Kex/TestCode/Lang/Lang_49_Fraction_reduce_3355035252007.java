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

public class Fraction_reduce_3355035252007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589426;
     Object term589735;
     Object term589732;

    public Fraction_reduce_3355035252007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589426 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589426, term589426.getClass(), "numerator", -55463634);
        setIntField(term589426, term589426.getClass(), "denominator", 1074271985);
        term589735 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589735, term589735.getClass(), "numerator", -55463634);
        setIntField(term589735, term589735.getClass(), "denominator", 1074271985);
        setField(term589735, term589735.getClass(), "toString", null);
        setField(term589735, term589735.getClass(), "toProperString", null);
        term589732 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589732, term589732.getClass(), "numerator", -55463634);
        setIntField(term589732, term589732.getClass(), "denominator", 1074271985);
        setField(term589732, term589732.getClass(), "toString", null);
        setField(term589732, term589732.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term589426, args);
        assertTrue(recursiveEquals(term589426, term589735));
        assertTrue(recursiveEquals(retValue, term589732));
    }

};


