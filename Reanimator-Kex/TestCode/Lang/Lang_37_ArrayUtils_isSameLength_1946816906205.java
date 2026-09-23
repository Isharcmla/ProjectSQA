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

public class ArrayUtils_isSameLength_1946816906205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;
     Object term365;
     Object term11832;
     Object term11833;

    public ArrayUtils_isSameLength_1946816906205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term359, 0, true);
        setBooleanElement(term359, 2, true);
        setBooleanElement(term359, 4, true);
        term365 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term365, 1, true);
        term11832 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term11832, 0, true);
        setBooleanElement(term11832, 2, true);
        setBooleanElement(term11832, 4, true);
        term11833 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term11833, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term359;
        args[1] = term365;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term359, term11832));
        assertTrue(recursiveEquals(term365, term11833));
        assertTrue(recursiveEquals(retValue, false));
    }

};


