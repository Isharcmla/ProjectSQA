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

public class MultidimensionalCounter_getCounts_142166671442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16088;

    public MultidimensionalCounter_getCounts_142166671442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16088 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term15471 = (int[]) newIntArray(489);
        setIntField(term16088, term16088.getClass(), "totalSize", 1);
        setIntField(term16088, term16088.getClass(), "dimension", 0);
        setIntField(term16088, term16088.getClass(), "last", 1);
        setField(term16088, term16088.getClass(), "uniCounterOffset", term15471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "getCounts", argTypes, term16088, args);
    }

};


