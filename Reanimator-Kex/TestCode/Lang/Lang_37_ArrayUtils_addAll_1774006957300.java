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
import java.lang.Object;

public class ArrayUtils_addAll_1774006957300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term1410;
     Object term14930;
     Object term14931;
     Object term14920;

    public ArrayUtils_addAll_1774006957300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1409 = (Object[]) newArray("java.lang.Object", 0);
        term1410 = (Object[]) newArray("java.lang.Object", 7);
        Object term1411 = newInstance(Class.forName("java.lang.Object"));
        Object term1412 = newInstance(Class.forName("java.lang.Object"));
        Object term1413 = newInstance(Class.forName("java.lang.Object"));
        Object term1414 = newInstance(Class.forName("java.lang.Object"));
        Object term1415 = newInstance(Class.forName("java.lang.Object"));
        Object term1416 = newInstance(Class.forName("java.lang.Object"));
        Object term1417 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1410, 0, term1411);
        setElement(term1410, 1, term1412);
        setElement(term1410, 2, term1413);
        setElement(term1410, 3, term1414);
        setElement(term1410, 4, term1415);
        setElement(term1410, 5, term1416);
        setElement(term1410, 6, term1417);
        term14930 = (Object[]) newArray("java.lang.Object", 0);
        term14931 = (Object[]) newArray("java.lang.Object", 7);
        Object term14932 = newInstance(Class.forName("java.lang.Object"));
        Object term14933 = newInstance(Class.forName("java.lang.Object"));
        Object term14934 = newInstance(Class.forName("java.lang.Object"));
        Object term14935 = newInstance(Class.forName("java.lang.Object"));
        Object term14936 = newInstance(Class.forName("java.lang.Object"));
        Object term14937 = newInstance(Class.forName("java.lang.Object"));
        Object term14938 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14931, 0, term14932);
        setElement(term14931, 1, term14933);
        setElement(term14931, 2, term14934);
        setElement(term14931, 3, term14935);
        setElement(term14931, 4, term14936);
        setElement(term14931, 5, term14937);
        setElement(term14931, 6, term14938);
        term14920 = (Object[]) newArray("java.lang.Object", 7);
        Object term14921 = newInstance(Class.forName("java.lang.Object"));
        Object term14922 = newInstance(Class.forName("java.lang.Object"));
        Object term14923 = newInstance(Class.forName("java.lang.Object"));
        Object term14924 = newInstance(Class.forName("java.lang.Object"));
        Object term14925 = newInstance(Class.forName("java.lang.Object"));
        Object term14926 = newInstance(Class.forName("java.lang.Object"));
        Object term14927 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14920, 0, term14921);
        setElement(term14920, 1, term14922);
        setElement(term14920, 2, term14923);
        setElement(term14920, 3, term14924);
        setElement(term14920, 4, term14925);
        setElement(term14920, 5, term14926);
        setElement(term14920, 6, term14927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1409;
        args[1] = term1410;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1409, term14930));
        assertTrue(recursiveEquals(term1410, term14931));
        assertTrue(recursiveEquals(retValue, term14920));
    }

};


