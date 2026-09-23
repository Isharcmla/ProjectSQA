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

public class Fraction_reduce_535859131891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283660;
     Object term284162;
     Object term284159;

    public Fraction_reduce_535859131891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283660 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term283660, term283660.getClass(), "numerator", 132746674);
        setIntField(term283660, term283660.getClass(), "denominator", 1850308465);
        term284162 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term284162, term284162.getClass(), "numerator", 132746674);
        setIntField(term284162, term284162.getClass(), "denominator", 1850308465);
        setField(term284162, term284162.getClass(), "toString", null);
        setField(term284162, term284162.getClass(), "toProperString", null);
        term284159 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term284159, term284159.getClass(), "numerator", 132746674);
        setIntField(term284159, term284159.getClass(), "denominator", 1850308465);
        setField(term284159, term284159.getClass(), "toString", null);
        setField(term284159, term284159.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term283660, args);
        assertTrue(recursiveEquals(term283660, term284162));
        assertTrue(recursiveEquals(retValue, term284159));
    }

};


