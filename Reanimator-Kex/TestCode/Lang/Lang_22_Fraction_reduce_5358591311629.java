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

public class Fraction_reduce_5358591311629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530731;
     Object term530833;
     Object term530830;

    public Fraction_reduce_5358591311629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530731 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530731, term530731.getClass(), "numerator", -410377206);
        setIntField(term530731, term530731.getClass(), "denominator", 2057835587);
        term530833 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530833, term530833.getClass(), "numerator", -410377206);
        setIntField(term530833, term530833.getClass(), "denominator", 2057835587);
        setField(term530833, term530833.getClass(), "toString", null);
        setField(term530833, term530833.getClass(), "toProperString", null);
        term530830 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530830, term530830.getClass(), "numerator", -410377206);
        setIntField(term530830, term530830.getClass(), "denominator", 2057835587);
        setField(term530830, term530830.getClass(), "toString", null);
        setField(term530830, term530830.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term530731, args);
        assertTrue(recursiveEquals(term530731, term530833));
        assertTrue(recursiveEquals(retValue, term530830));
    }

};


