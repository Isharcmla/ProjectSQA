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

public class ArrayUtils_addAll_1794904704303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426;
     Object term1433;
     Object term15001;
     Object term15002;
     Object term14980;

    public ArrayUtils_addAll_1794904704303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1426 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term1426, 1, true);
        setBooleanElement(term1426, 3, true);
        term1433 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term1433, 0, true);
        term15001 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term15001, 1, true);
        setBooleanElement(term15001, 3, true);
        term15002 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term15002, 0, true);
        term14980 = (boolean[]) newBooleanArray(9);
        setBooleanElement(term14980, 1, true);
        setBooleanElement(term14980, 3, true);
        setBooleanElement(term14980, 6, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1426;
        args[1] = term1433;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1426, term15001));
        assertTrue(recursiveEquals(term1433, term15002));
        assertTrue(recursiveEquals(retValue, term14980));
    }

};


