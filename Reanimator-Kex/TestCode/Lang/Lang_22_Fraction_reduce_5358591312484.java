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

public class Fraction_reduce_5358591312484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813280;
     Object term813825;
     Object term813819;

    public Fraction_reduce_5358591312484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813280 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term813280, term813280.getClass(), "numerator", -885884470);
        setIntField(term813280, term813280.getClass(), "denominator", 1862602755);
        term813825 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term813825, term813825.getClass(), "numerator", -885884470);
        setIntField(term813825, term813825.getClass(), "denominator", 1862602755);
        setField(term813825, term813825.getClass(), "toString", null);
        setField(term813825, term813825.getClass(), "toProperString", null);
        term813819 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term813819, term813819.getClass(), "numerator", -177176894);
        setIntField(term813819, term813819.getClass(), "denominator", 372520551);
        setField(term813819, term813819.getClass(), "toString", null);
        setField(term813819, term813819.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term813280, args);
        assertTrue(recursiveEquals(term813280, term813825));
        assertTrue(recursiveEquals(retValue, term813819));
    }

};


