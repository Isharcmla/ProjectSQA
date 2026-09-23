package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MultidimensionalCounter_getCounts_142166671466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33570;
     Object term43582;
     Object term33575;

    public MultidimensionalCounter_getCounts_142166671466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33570 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term33570, term33570.getClass(), "totalSize", 1);
        setIntField(term33570, term33570.getClass(), "dimension", 10112);
        term43582 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term43582, term43582.getClass(), "dimension", 10112);
        setField(term43582, term43582.getClass(), "uniCounterOffset", null);
        setField(term43582, term43582.getClass(), "size", null);
        setIntField(term43582, term43582.getClass(), "totalSize", 1);
        setIntField(term43582, term43582.getClass(), "last", 0);
        term33575 = (int[]) newIntArray(10112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getCounts", argTypes, term33570, args);
        assertTrue(recursiveEquals(term33570, term43582));
        assertTrue(recursiveEquals(retValue, term33575));
    }

};


