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

public class Fraction_reduce_3355035252237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661442;
     Object term661945;
     Object term661939;

    public Fraction_reduce_3355035252237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661442 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term661442, term661442.getClass(), "numerator", 1503593650);
        setIntField(term661442, term661442.getClass(), "denominator", 485515545);
        term661945 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term661945, term661945.getClass(), "numerator", 1503593650);
        setIntField(term661945, term661945.getClass(), "denominator", 485515545);
        setField(term661945, term661945.getClass(), "toString", null);
        setField(term661945, term661945.getClass(), "toProperString", null);
        term661939 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term661939, term661939.getClass(), "numerator", 300718730);
        setIntField(term661939, term661939.getClass(), "denominator", 97103109);
        setField(term661939, term661939.getClass(), "toString", null);
        setField(term661939, term661939.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term661442, args);
        assertTrue(recursiveEquals(term661442, term661945));
        assertTrue(recursiveEquals(retValue, term661939));
    }

};


