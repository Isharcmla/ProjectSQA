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

public class MathUtils_distance1_154650046956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term312;

    public MathUtils_distance1_154650046956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309 = (int[]) newIntArray(2);
        setIntElement(term309, 0, -469968304);
        setIntElement(term309, 1, -1145578966);
        term312 = (int[]) newIntArray(6);
        setIntElement(term312, 0, 679763016);
        setIntElement(term312, 1, 1962444399);
        setIntElement(term312, 2, 767834723);
        setIntElement(term312, 3, -602026508);
        setIntElement(term312, 4, -157887805);
        setIntElement(term312, 5, 1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term309;
        args[1] = term312;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


