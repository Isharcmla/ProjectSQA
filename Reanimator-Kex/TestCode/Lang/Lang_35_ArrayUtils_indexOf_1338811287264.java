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
import java.lang.Boolean;

public class ArrayUtils_indexOf_1338811287264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;
     Object term1050;
     Object term13931;

    public ArrayUtils_indexOf_1338811287264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041 = (boolean[]) newBooleanArray(8);
        setBooleanElement(term1041, 0, true);
        setBooleanElement(term1041, 3, true);
        setBooleanElement(term1041, 4, true);
        setBooleanElement(term1041, 5, true);
        setBooleanElement(term1041, 6, true);
        setBooleanElement(term1041, 7, true);
        term1050 = new Boolean(false);
        term13931 = (boolean[]) newBooleanArray(8);
        setBooleanElement(term13931, 0, true);
        setBooleanElement(term13931, 3, true);
        setBooleanElement(term13931, 4, true);
        setBooleanElement(term13931, 5, true);
        setBooleanElement(term13931, 6, true);
        setBooleanElement(term13931, 7, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1041;
        args[1] = term1050;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1041, term13931));
        assertTrue(recursiveEquals(term1050, false));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


