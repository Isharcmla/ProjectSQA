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

public class Fraction_reduce_5358591312162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704283;
     Object term705321;
     Object term705318;

    public Fraction_reduce_5358591312162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704283 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term704283, term704283.getClass(), "numerator", 605063410);
        setIntField(term704283, term704283.getClass(), "denominator", 1393047553);
        term705321 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term705321, term705321.getClass(), "numerator", 605063410);
        setIntField(term705321, term705321.getClass(), "denominator", 1393047553);
        setField(term705321, term705321.getClass(), "toString", null);
        setField(term705321, term705321.getClass(), "toProperString", null);
        term705318 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term705318, term705318.getClass(), "numerator", 605063410);
        setIntField(term705318, term705318.getClass(), "denominator", 1393047553);
        setField(term705318, term705318.getClass(), "toString", null);
        setField(term705318, term705318.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term704283, args);
        assertTrue(recursiveEquals(term704283, term705321));
        assertTrue(recursiveEquals(retValue, term705318));
    }

};


