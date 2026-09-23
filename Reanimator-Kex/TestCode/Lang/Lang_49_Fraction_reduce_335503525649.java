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

public class Fraction_reduce_335503525649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180813;
     Object term181026;
     Object term181023;

    public Fraction_reduce_335503525649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180813 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term180813, term180813.getClass(), "numerator", 1243985686);
        setIntField(term180813, term180813.getClass(), "denominator", 1809022915);
        term181026 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term181026, term181026.getClass(), "numerator", 1243985686);
        setIntField(term181026, term181026.getClass(), "denominator", 1809022915);
        setField(term181026, term181026.getClass(), "toString", null);
        setField(term181026, term181026.getClass(), "toProperString", null);
        term181023 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term181023, term181023.getClass(), "numerator", 1243985686);
        setIntField(term181023, term181023.getClass(), "denominator", 1809022915);
        setField(term181023, term181023.getClass(), "toString", null);
        setField(term181023, term181023.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term180813, args);
        assertTrue(recursiveEquals(term180813, term181026));
        assertTrue(recursiveEquals(retValue, term181023));
    }

};


