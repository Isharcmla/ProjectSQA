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

public class Fraction_reduce_5358591311327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432037;
     Object term432478;
     Object term432475;

    public Fraction_reduce_5358591311327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432037 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term432037, term432037.getClass(), "numerator", -1611795326);
        setIntField(term432037, term432037.getClass(), "denominator", 1862714887);
        term432478 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term432478, term432478.getClass(), "numerator", -1611795326);
        setIntField(term432478, term432478.getClass(), "denominator", 1862714887);
        setField(term432478, term432478.getClass(), "toString", null);
        setField(term432478, term432478.getClass(), "toProperString", null);
        term432475 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term432475, term432475.getClass(), "numerator", -1611795326);
        setIntField(term432475, term432475.getClass(), "denominator", 1862714887);
        setField(term432475, term432475.getClass(), "toString", null);
        setField(term432475, term432475.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term432037, args);
        assertTrue(recursiveEquals(term432037, term432478));
        assertTrue(recursiveEquals(retValue, term432475));
    }

};


