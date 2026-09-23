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
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1162680693267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1084;
     Object term1086;
     Object term1088;
     Object term14009;

    public ArrayUtils_lastIndexOf_1162680693267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1084 = (boolean[]) newBooleanArray(1);
        setBooleanElement(term1084, 0, true);
        term1086 = new Boolean(true);
        term1088 = new Integer(-481533957);
        term14009 = (boolean[]) newBooleanArray(1);
        setBooleanElement(term14009, 0, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1084;
        args[1] = term1086;
        args[2] = term1088;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1084, term14009));
        assertTrue(recursiveEquals(term1086, true));
        assertTrue(recursiveEquals(term1088, -481533957));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


