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

public class Fraction_reduce_535859131379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108850;
     Object term108948;
     Object term108945;

    public Fraction_reduce_535859131379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108850 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term108850, term108850.getClass(), "numerator", -35519674);
        setIntField(term108850, term108850.getClass(), "denominator", 2117148693);
        term108948 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term108948, term108948.getClass(), "numerator", -35519674);
        setIntField(term108948, term108948.getClass(), "denominator", 2117148693);
        setField(term108948, term108948.getClass(), "toString", null);
        setField(term108948, term108948.getClass(), "toProperString", null);
        term108945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term108945, term108945.getClass(), "numerator", -35519674);
        setIntField(term108945, term108945.getClass(), "denominator", 2117148693);
        setField(term108945, term108945.getClass(), "toString", null);
        setField(term108945, term108945.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term108850, args);
        assertTrue(recursiveEquals(term108850, term108948));
        assertTrue(recursiveEquals(retValue, term108945));
    }

};


