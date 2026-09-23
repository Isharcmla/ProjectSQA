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

public class Fraction_reduce_535859131616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192077;
     Object term192924;
     Object term192921;

    public Fraction_reduce_535859131616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192077 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term192077, term192077.getClass(), "numerator", -803979242);
        setIntField(term192077, term192077.getClass(), "denominator", 424404237);
        term192924 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term192924, term192924.getClass(), "numerator", -803979242);
        setIntField(term192924, term192924.getClass(), "denominator", 424404237);
        setField(term192924, term192924.getClass(), "toString", null);
        setField(term192924, term192924.getClass(), "toProperString", null);
        term192921 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term192921, term192921.getClass(), "numerator", -803979242);
        setIntField(term192921, term192921.getClass(), "denominator", 424404237);
        setField(term192921, term192921.getClass(), "toString", null);
        setField(term192921, term192921.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term192077, args);
        assertTrue(recursiveEquals(term192077, term192924));
        assertTrue(recursiveEquals(retValue, term192921));
    }

};


