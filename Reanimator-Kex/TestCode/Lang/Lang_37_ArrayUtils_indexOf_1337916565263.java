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

public class ArrayUtils_indexOf_1337916565263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;
     Object term1056;
     Object term1058;
     Object term13918;

    public ArrayUtils_indexOf_1337916565263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term1049, 2, true);
        setBooleanElement(term1049, 3, true);
        setBooleanElement(term1049, 4, true);
        setBooleanElement(term1049, 5, true);
        term1056 = new Boolean(true);
        term1058 = new Integer(1655935355);
        term13918 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term13918, 2, true);
        setBooleanElement(term13918, 3, true);
        setBooleanElement(term13918, 4, true);
        setBooleanElement(term13918, 5, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1049;
        args[1] = term1056;
        args[2] = term1058;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1049, term13918));
        assertTrue(recursiveEquals(term1056, true));
        assertTrue(recursiveEquals(term1058, 1655935355));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


