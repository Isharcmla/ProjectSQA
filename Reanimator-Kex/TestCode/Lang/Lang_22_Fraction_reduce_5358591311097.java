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

public class Fraction_reduce_5358591311097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352265;
     Object term352377;
     Object term352371;

    public Fraction_reduce_5358591311097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352265 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352265, term352265.getClass(), "numerator", -1176828918);
        setIntField(term352265, term352265.getClass(), "denominator", 2069065395);
        term352377 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352377, term352377.getClass(), "numerator", -1176828918);
        setIntField(term352377, term352377.getClass(), "denominator", 2069065395);
        setField(term352377, term352377.getClass(), "toString", null);
        setField(term352377, term352377.getClass(), "toProperString", null);
        term352371 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352371, term352371.getClass(), "numerator", -392276306);
        setIntField(term352371, term352371.getClass(), "denominator", 689688465);
        setField(term352371, term352371.getClass(), "toString", null);
        setField(term352371, term352371.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term352265, args);
        assertTrue(recursiveEquals(term352265, term352377));
        assertTrue(recursiveEquals(retValue, term352371));
    }

};


