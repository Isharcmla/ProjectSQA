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

public class Fraction_reduce_5358591311392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454422;
     Object term454795;
     Object term454792;

    public Fraction_reduce_5358591311392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454422 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term454422, term454422.getClass(), "numerator", -1505492822);
        setIntField(term454422, term454422.getClass(), "denominator", 1388593283);
        term454795 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term454795, term454795.getClass(), "numerator", -1505492822);
        setIntField(term454795, term454795.getClass(), "denominator", 1388593283);
        setField(term454795, term454795.getClass(), "toString", null);
        setField(term454795, term454795.getClass(), "toProperString", null);
        term454792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term454792, term454792.getClass(), "numerator", -1505492822);
        setIntField(term454792, term454792.getClass(), "denominator", 1388593283);
        setField(term454792, term454792.getClass(), "toString", null);
        setField(term454792, term454792.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term454422, args);
        assertTrue(recursiveEquals(term454422, term454795));
        assertTrue(recursiveEquals(retValue, term454792));
    }

};


