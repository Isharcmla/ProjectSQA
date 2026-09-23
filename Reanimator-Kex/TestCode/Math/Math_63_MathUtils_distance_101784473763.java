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

public class MathUtils_distance_101784473763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;
     Object term373;

    public MathUtils_distance_101784473763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = (int[]) newIntArray(5);
        setIntElement(term367, 0, -1016503459);
        setIntElement(term367, 1, -1968847291);
        setIntElement(term367, 2, 579005622);
        setIntElement(term367, 3, -14890619);
        setIntElement(term367, 4, 1632125673);
        term373 = (int[]) newIntArray(2);
        setIntElement(term373, 0, 454281060);
        setIntElement(term373, 1, -1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term367;
        args[1] = term373;
        callMethod(klass, "distance", argTypes, null, args);
    }

};


