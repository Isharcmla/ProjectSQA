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

public class Fraction_reduce_335503525241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60701;
     Object term61178;
     Object term61175;

    public Fraction_reduce_335503525241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60701 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term60701, term60701.getClass(), "numerator", -375723546);
        setIntField(term60701, term60701.getClass(), "denominator", 2106737141);
        term61178 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term61178, term61178.getClass(), "numerator", -375723546);
        setIntField(term61178, term61178.getClass(), "denominator", 2106737141);
        setField(term61178, term61178.getClass(), "toString", null);
        setField(term61178, term61178.getClass(), "toProperString", null);
        term61175 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term61175, term61175.getClass(), "numerator", -375723546);
        setIntField(term61175, term61175.getClass(), "denominator", 2106737141);
        setField(term61175, term61175.getClass(), "toString", null);
        setField(term61175, term61175.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term60701, args);
        assertTrue(recursiveEquals(term60701, term61178));
        assertTrue(recursiveEquals(retValue, term61175));
    }

};


