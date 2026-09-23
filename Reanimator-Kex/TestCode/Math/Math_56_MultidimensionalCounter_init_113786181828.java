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
import java.lang.Object;

public class MultidimensionalCounter_init_113786181828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5672;

    public MultidimensionalCounter_init_113786181828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5825 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term5675 = (int[]) newIntArray(0);
        setIntField(term5825, term5825.getClass(), "dimension", 0);
        setField(term5825, term5825.getClass(), "size", term5675);
        setField(term5825, term5825.getClass(), "uniCounterOffset", null);
        setIntField(term5825, term5825.getClass(), "last", 0);
        term5672 = (int[]) newIntArray(0);
        setIntElement(term5672, -1, 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5672;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


