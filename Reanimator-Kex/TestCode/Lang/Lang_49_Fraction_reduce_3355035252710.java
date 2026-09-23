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

public class Fraction_reduce_3355035252710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808222;
     Object term808736;
     Object term808733;

    public Fraction_reduce_3355035252710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term808222 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808222, term808222.getClass(), "numerator", -28665086);
        setIntField(term808222, term808222.getClass(), "denominator", 2127049831);
        term808736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808736, term808736.getClass(), "numerator", -28665086);
        setIntField(term808736, term808736.getClass(), "denominator", 2127049831);
        setField(term808736, term808736.getClass(), "toString", null);
        setField(term808736, term808736.getClass(), "toProperString", null);
        term808733 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808733, term808733.getClass(), "numerator", -28665086);
        setIntField(term808733, term808733.getClass(), "denominator", 2127049831);
        setField(term808733, term808733.getClass(), "toString", null);
        setField(term808733, term808733.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term808222, args);
        assertTrue(recursiveEquals(term808222, term808736));
        assertTrue(recursiveEquals(retValue, term808733));
    }

};


