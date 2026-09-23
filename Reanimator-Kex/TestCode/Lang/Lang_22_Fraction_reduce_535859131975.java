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

public class Fraction_reduce_535859131975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312614;
     Object term313226;
     Object term313223;

    public Fraction_reduce_535859131975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312614 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term312614, term312614.getClass(), "numerator", 173179778);
        setIntField(term312614, term312614.getClass(), "denominator", 1630143609);
        term313226 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term313226, term313226.getClass(), "numerator", 173179778);
        setIntField(term313226, term313226.getClass(), "denominator", 1630143609);
        setField(term313226, term313226.getClass(), "toString", null);
        setField(term313226, term313226.getClass(), "toProperString", null);
        term313223 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term313223, term313223.getClass(), "numerator", 173179778);
        setIntField(term313223, term313223.getClass(), "denominator", 1630143609);
        setField(term313223, term313223.getClass(), "toString", null);
        setField(term313223, term313223.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term312614, args);
        assertTrue(recursiveEquals(term312614, term313226));
        assertTrue(recursiveEquals(retValue, term313223));
    }

};


