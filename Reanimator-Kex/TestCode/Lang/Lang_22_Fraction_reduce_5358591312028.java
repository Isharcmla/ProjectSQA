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

public class Fraction_reduce_5358591312028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659865;
     Object term660863;
     Object term660860;

    public Fraction_reduce_5358591312028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659865 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term659865, term659865.getClass(), "numerator", -2147221038);
        setIntField(term659865, term659865.getClass(), "denominator", 1971323119);
        term660863 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term660863, term660863.getClass(), "numerator", -2147221038);
        setIntField(term660863, term660863.getClass(), "denominator", 1971323119);
        setField(term660863, term660863.getClass(), "toString", null);
        setField(term660863, term660863.getClass(), "toProperString", null);
        term660860 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term660860, term660860.getClass(), "numerator", -2147221038);
        setIntField(term660860, term660860.getClass(), "denominator", 1971323119);
        setField(term660860, term660860.getClass(), "toString", null);
        setField(term660860, term660860.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term659865, args);
        assertTrue(recursiveEquals(term659865, term660863));
        assertTrue(recursiveEquals(retValue, term660860));
    }

};


