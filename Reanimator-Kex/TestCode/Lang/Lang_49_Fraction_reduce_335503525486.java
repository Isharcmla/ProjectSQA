package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134506;
     Object term134956;
     Object term134953;

    public Fraction_reduce_335503525486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134506 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term134506, term134506.getClass(), "numerator", -439586338);
        setIntField(term134506, term134506.getClass(), "denominator", 1653282553);
        term134956 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term134956, term134956.getClass(), "numerator", -439586338);
        setIntField(term134956, term134956.getClass(), "denominator", 1653282553);
        setField(term134956, term134956.getClass(), "toString", null);
        setField(term134956, term134956.getClass(), "toProperString", null);
        term134953 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term134953, term134953.getClass(), "numerator", -439586338);
        setIntField(term134953, term134953.getClass(), "denominator", 1653282553);
        setField(term134953, term134953.getClass(), "toString", null);
        setField(term134953, term134953.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term134506, args);
        assertTrue(recursiveEquals(term134506, term134956));
        assertTrue(recursiveEquals(retValue, term134953));
    }

};


