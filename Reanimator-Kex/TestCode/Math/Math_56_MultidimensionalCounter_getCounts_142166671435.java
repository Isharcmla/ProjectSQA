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

public class MultidimensionalCounter_getCounts_142166671435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9106;

    public MultidimensionalCounter_getCounts_142166671435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9106 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term9106, term9106.getClass(), "totalSize", 1073741825);
        setIntField(term9106, term9106.getClass(), "dimension", 0);
        setIntField(term9106, term9106.getClass(), "last", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1073741824;
        callMethod(klass, "getCounts", argTypes, term9106, args);
    }

};


