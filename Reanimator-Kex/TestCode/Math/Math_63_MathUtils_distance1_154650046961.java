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

public class MathUtils_distance1_154650046961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;
     Object term333;

    public MathUtils_distance1_154650046961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325 = (int[]) newIntArray(7);
        setIntElement(term325, 0, -1145578966);
        setIntElement(term325, 1, 679763016);
        setIntElement(term325, 2, 1962444399);
        setIntElement(term325, 3, 767834723);
        setIntElement(term325, 4, -602026508);
        setIntElement(term325, 5, -157887805);
        setIntElement(term325, 6, 1876565163);
        term333 = (int[]) newIntArray(1);
        setIntElement(term333, 0, -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term325;
        args[1] = term333;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


