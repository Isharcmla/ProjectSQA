package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_isSameLength_1946816906207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term376;
     Object term11878;
     Object term11879;

    public ArrayUtils_isSameLength_1946816906207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term370, 0, true);
        setBooleanElement(term370, 2, true);
        setBooleanElement(term370, 4, true);
        term376 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term376, 1, true);
        term11878 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term11878, 0, true);
        setBooleanElement(term11878, 2, true);
        setBooleanElement(term11878, 4, true);
        term11879 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term11879, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term370;
        args[1] = term376;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term370, term11878));
        assertTrue(recursiveEquals(term376, term11879));
        assertTrue(recursiveEquals(retValue, false));
    }

};


