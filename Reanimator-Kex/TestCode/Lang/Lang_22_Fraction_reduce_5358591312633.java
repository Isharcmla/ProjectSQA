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

public class Fraction_reduce_5358591312633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861426;
     Object term861630;
     Object term861627;

    public Fraction_reduce_5358591312633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861426 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861426, term861426.getClass(), "numerator", -2011461182);
        setIntField(term861426, term861426.getClass(), "denominator", 2034245751);
        term861630 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861630, term861630.getClass(), "numerator", -2011461182);
        setIntField(term861630, term861630.getClass(), "denominator", 2034245751);
        setField(term861630, term861630.getClass(), "toString", null);
        setField(term861630, term861630.getClass(), "toProperString", null);
        term861627 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861627, term861627.getClass(), "numerator", -2011461182);
        setIntField(term861627, term861627.getClass(), "denominator", 2034245751);
        setField(term861627, term861627.getClass(), "toString", null);
        setField(term861627, term861627.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term861426, args);
        assertTrue(recursiveEquals(term861426, term861630));
        assertTrue(recursiveEquals(retValue, term861627));
    }

};


