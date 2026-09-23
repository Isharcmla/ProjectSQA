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

public class Fraction_reduce_5358591312129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693341;
     Object term693544;
     Object term693541;

    public Fraction_reduce_5358591312129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693341 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693341, term693341.getClass(), "numerator", -1542683134);
        setIntField(term693341, term693341.getClass(), "denominator", 1552375383);
        term693544 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693544, term693544.getClass(), "numerator", -1542683134);
        setIntField(term693544, term693544.getClass(), "denominator", 1552375383);
        setField(term693544, term693544.getClass(), "toString", null);
        setField(term693544, term693544.getClass(), "toProperString", null);
        term693541 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term693541, term693541.getClass(), "numerator", -1542683134);
        setIntField(term693541, term693541.getClass(), "denominator", 1552375383);
        setField(term693541, term693541.getClass(), "toString", null);
        setField(term693541, term693541.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term693341, args);
        assertTrue(recursiveEquals(term693341, term693544));
        assertTrue(recursiveEquals(retValue, term693541));
    }

};


