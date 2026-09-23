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

public class Fraction_reduce_5358591311461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475410;
     Object term475515;
     Object term475512;

    public Fraction_reduce_5358591311461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475410 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term475410, term475410.getClass(), "numerator", 136080162);
        setIntField(term475410, term475410.getClass(), "denominator", 537662137);
        term475515 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term475515, term475515.getClass(), "numerator", 136080162);
        setIntField(term475515, term475515.getClass(), "denominator", 537662137);
        setField(term475515, term475515.getClass(), "toString", null);
        setField(term475515, term475515.getClass(), "toProperString", null);
        term475512 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term475512, term475512.getClass(), "numerator", 136080162);
        setIntField(term475512, term475512.getClass(), "denominator", 537662137);
        setField(term475512, term475512.getClass(), "toString", null);
        setField(term475512, term475512.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term475410, args);
        assertTrue(recursiveEquals(term475410, term475515));
        assertTrue(recursiveEquals(retValue, term475512));
    }

};


