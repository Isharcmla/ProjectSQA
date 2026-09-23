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

public class ArrayUtils_lastIndexOf_1162680693265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073;
     Object term1075;
     Object term1077;
     Object term13963;

    public ArrayUtils_lastIndexOf_1162680693265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1073 = (boolean[]) newBooleanArray(1);
        setBooleanElement(term1073, 0, true);
        term1075 = new Boolean(true);
        term1077 = new Integer(-481533957);
        term13963 = (boolean[]) newBooleanArray(1);
        setBooleanElement(term13963, 0, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1073;
        args[1] = term1075;
        args[2] = term1077;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1073, term13963));
        assertTrue(recursiveEquals(term1075, true));
        assertTrue(recursiveEquals(term1077, -481533957));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


