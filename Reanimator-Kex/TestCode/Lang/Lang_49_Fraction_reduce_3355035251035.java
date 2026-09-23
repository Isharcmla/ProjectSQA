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

public class Fraction_reduce_3355035251035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297522;
     Object term297730;
     Object term297727;

    public Fraction_reduce_3355035251035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297522 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297522, term297522.getClass(), "numerator", 1229514546);
        setIntField(term297522, term297522.getClass(), "denominator", 1611699521);
        term297730 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297730, term297730.getClass(), "numerator", 1229514546);
        setIntField(term297730, term297730.getClass(), "denominator", 1611699521);
        setField(term297730, term297730.getClass(), "toString", null);
        setField(term297730, term297730.getClass(), "toProperString", null);
        term297727 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297727, term297727.getClass(), "numerator", 1229514546);
        setIntField(term297727, term297727.getClass(), "denominator", 1611699521);
        setField(term297727, term297727.getClass(), "toString", null);
        setField(term297727, term297727.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term297522, args);
        assertTrue(recursiveEquals(term297522, term297730));
        assertTrue(recursiveEquals(retValue, term297727));
    }

};


