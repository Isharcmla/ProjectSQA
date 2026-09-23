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

public class Fraction_reduce_535859131825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261082;
     Object term261928;
     Object term261925;

    public Fraction_reduce_535859131825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261082 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term261082, term261082.getClass(), "numerator", -194935870);
        setIntField(term261082, term261082.getClass(), "denominator", 2043776519);
        term261928 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term261928, term261928.getClass(), "numerator", -194935870);
        setIntField(term261928, term261928.getClass(), "denominator", 2043776519);
        setField(term261928, term261928.getClass(), "toString", null);
        setField(term261928, term261928.getClass(), "toProperString", null);
        term261925 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term261925, term261925.getClass(), "numerator", -194935870);
        setIntField(term261925, term261925.getClass(), "denominator", 2043776519);
        setField(term261925, term261925.getClass(), "toString", null);
        setField(term261925, term261925.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term261082, args);
        assertTrue(recursiveEquals(term261082, term261928));
        assertTrue(recursiveEquals(retValue, term261925));
    }

};


