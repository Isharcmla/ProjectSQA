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

public class ArrayUtils_addAll_1794904704301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418;
     Object term1425;
     Object term14962;
     Object term14963;
     Object term14941;

    public ArrayUtils_addAll_1794904704301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term1418, 1, true);
        setBooleanElement(term1418, 3, true);
        term1425 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term1425, 0, true);
        term14962 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term14962, 1, true);
        setBooleanElement(term14962, 3, true);
        term14963 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term14963, 0, true);
        term14941 = (boolean[]) newBooleanArray(9);
        setBooleanElement(term14941, 1, true);
        setBooleanElement(term14941, 3, true);
        setBooleanElement(term14941, 6, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1418;
        args[1] = term1425;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1418, term14962));
        assertTrue(recursiveEquals(term1425, term14963));
        assertTrue(recursiveEquals(retValue, term14941));
    }

};


