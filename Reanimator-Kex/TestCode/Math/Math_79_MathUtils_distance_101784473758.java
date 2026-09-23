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

public class MathUtils_distance_101784473758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term352;

    public MathUtils_distance_101784473758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = (int[]) newIntArray(6);
        setIntElement(term345, 0, -817164822);
        setIntElement(term345, 1, -1016503459);
        setIntElement(term345, 2, -1968847291);
        setIntElement(term345, 3, 579005622);
        setIntElement(term345, 4, -14890619);
        setIntElement(term345, 5, 1632125673);
        term352 = (int[]) newIntArray(5);
        setIntElement(term352, 0, 454281060);
        setIntElement(term352, 1, -1786399638);
        setIntElement(term352, 2, 2055867847);
        setIntElement(term352, 3, -1048298087);
        setIntElement(term352, 4, 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term345;
        args[1] = term352;
        callMethod(klass, "distance", argTypes, null, args);
    }

};


