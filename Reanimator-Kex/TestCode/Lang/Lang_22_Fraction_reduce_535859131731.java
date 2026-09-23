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

public class Fraction_reduce_535859131731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231354;
     Object term231912;
     Object term231909;

    public Fraction_reduce_535859131731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231354 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term231354, term231354.getClass(), "numerator", -33038);
        setIntField(term231354, term231354.getClass(), "denominator", 2147352511);
        term231912 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term231912, term231912.getClass(), "numerator", -33038);
        setIntField(term231912, term231912.getClass(), "denominator", 2147352511);
        setField(term231912, term231912.getClass(), "toString", null);
        setField(term231912, term231912.getClass(), "toProperString", null);
        term231909 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term231909, term231909.getClass(), "numerator", -33038);
        setIntField(term231909, term231909.getClass(), "denominator", 2147352511);
        setField(term231909, term231909.getClass(), "toString", null);
        setField(term231909, term231909.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term231354, args);
        assertTrue(recursiveEquals(term231354, term231912));
        assertTrue(recursiveEquals(retValue, term231909));
    }

};


