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

public class ArrayUtils_indexOf_1338811287262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030;
     Object term1039;
     Object term13885;

    public ArrayUtils_indexOf_1338811287262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1030 = (boolean[]) newBooleanArray(8);
        setBooleanElement(term1030, 0, true);
        setBooleanElement(term1030, 3, true);
        setBooleanElement(term1030, 4, true);
        setBooleanElement(term1030, 5, true);
        setBooleanElement(term1030, 6, true);
        setBooleanElement(term1030, 7, true);
        term1039 = new Boolean(false);
        term13885 = (boolean[]) newBooleanArray(8);
        setBooleanElement(term13885, 0, true);
        setBooleanElement(term13885, 3, true);
        setBooleanElement(term13885, 4, true);
        setBooleanElement(term13885, 5, true);
        setBooleanElement(term13885, 6, true);
        setBooleanElement(term13885, 7, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1030;
        args[1] = term1039;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1030, term13885));
        assertTrue(recursiveEquals(term1039, false));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


