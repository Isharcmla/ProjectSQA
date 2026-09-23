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

public class Fraction_reduce_5358591312324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759946;
     Object term760464;
     Object term760461;

    public Fraction_reduce_5358591312324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759946 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term759946, term759946.getClass(), "numerator", 282747026);
        setIntField(term759946, term759946.getClass(), "denominator", 868672385);
        term760464 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term760464, term760464.getClass(), "numerator", 282747026);
        setIntField(term760464, term760464.getClass(), "denominator", 868672385);
        setField(term760464, term760464.getClass(), "toString", null);
        setField(term760464, term760464.getClass(), "toProperString", null);
        term760461 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term760461, term760461.getClass(), "numerator", 282747026);
        setIntField(term760461, term760461.getClass(), "denominator", 868672385);
        setField(term760461, term760461.getClass(), "toString", null);
        setField(term760461, term760461.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term759946, args);
        assertTrue(recursiveEquals(term759946, term760464));
        assertTrue(recursiveEquals(retValue, term760461));
    }

};


