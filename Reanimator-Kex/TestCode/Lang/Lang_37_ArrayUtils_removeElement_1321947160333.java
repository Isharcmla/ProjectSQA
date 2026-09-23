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

public class ArrayUtils_removeElement_1321947160333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1812;
     Object term1815;
     Object term24544;
     Object term24541;

    public ArrayUtils_removeElement_1321947160333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1812 = (boolean[]) newBooleanArray(2);
        setBooleanElement(term1812, 0, true);
        setBooleanElement(term1812, 1, true);
        term1815 = new Boolean(false);
        term24544 = (boolean[]) newBooleanArray(2);
        setBooleanElement(term24544, 0, true);
        setBooleanElement(term24544, 1, true);
        term24541 = (boolean[]) newBooleanArray(2);
        setBooleanElement(term24541, 0, true);
        setBooleanElement(term24541, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1812;
        args[1] = term1815;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1812, term24544));
        assertTrue(recursiveEquals(term1815, false));
        assertTrue(recursiveEquals(retValue, term24541));
    }

};


