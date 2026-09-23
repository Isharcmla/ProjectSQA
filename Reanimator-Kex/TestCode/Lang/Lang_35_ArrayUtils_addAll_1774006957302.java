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

public class ArrayUtils_addAll_1774006957302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1411;
     Object term1417;
     Object term14953;
     Object term14959;
     Object term14936;

    public ArrayUtils_addAll_1774006957302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1411 = (Object[]) newArray("java.lang.Object", 5);
        Object term1412 = newInstance(Class.forName("java.lang.Object"));
        Object term1413 = newInstance(Class.forName("java.lang.Object"));
        Object term1414 = newInstance(Class.forName("java.lang.Object"));
        Object term1415 = newInstance(Class.forName("java.lang.Object"));
        Object term1416 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1411, 0, term1412);
        setElement(term1411, 1, term1413);
        setElement(term1411, 2, term1414);
        setElement(term1411, 3, term1415);
        setElement(term1411, 4, term1416);
        term1417 = (Object[]) newArray("java.lang.Object", 8);
        Object term1418 = newInstance(Class.forName("java.lang.Object"));
        Object term1419 = newInstance(Class.forName("java.lang.Object"));
        Object term1420 = newInstance(Class.forName("java.lang.Object"));
        Object term1421 = newInstance(Class.forName("java.lang.Object"));
        Object term1422 = newInstance(Class.forName("java.lang.Object"));
        Object term1423 = newInstance(Class.forName("java.lang.Object"));
        Object term1424 = newInstance(Class.forName("java.lang.Object"));
        Object term1425 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1417, 0, term1418);
        setElement(term1417, 1, term1419);
        setElement(term1417, 2, term1420);
        setElement(term1417, 3, term1421);
        setElement(term1417, 4, term1422);
        setElement(term1417, 5, term1423);
        setElement(term1417, 6, term1424);
        setElement(term1417, 7, term1425);
        term14953 = (Object[]) newArray("java.lang.Object", 5);
        Object term14954 = newInstance(Class.forName("java.lang.Object"));
        Object term14955 = newInstance(Class.forName("java.lang.Object"));
        Object term14956 = newInstance(Class.forName("java.lang.Object"));
        Object term14957 = newInstance(Class.forName("java.lang.Object"));
        Object term14958 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14953, 0, term14954);
        setElement(term14953, 1, term14955);
        setElement(term14953, 2, term14956);
        setElement(term14953, 3, term14957);
        setElement(term14953, 4, term14958);
        term14959 = (Object[]) newArray("java.lang.Object", 8);
        Object term14960 = newInstance(Class.forName("java.lang.Object"));
        Object term14961 = newInstance(Class.forName("java.lang.Object"));
        Object term14962 = newInstance(Class.forName("java.lang.Object"));
        Object term14963 = newInstance(Class.forName("java.lang.Object"));
        Object term14964 = newInstance(Class.forName("java.lang.Object"));
        Object term14965 = newInstance(Class.forName("java.lang.Object"));
        Object term14966 = newInstance(Class.forName("java.lang.Object"));
        Object term14967 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14959, 0, term14960);
        setElement(term14959, 1, term14961);
        setElement(term14959, 2, term14962);
        setElement(term14959, 3, term14963);
        setElement(term14959, 4, term14964);
        setElement(term14959, 5, term14965);
        setElement(term14959, 6, term14966);
        setElement(term14959, 7, term14967);
        term14936 = (Object[]) newArray("java.lang.Object", 13);
        Object term14937 = newInstance(Class.forName("java.lang.Object"));
        Object term14938 = newInstance(Class.forName("java.lang.Object"));
        Object term14939 = newInstance(Class.forName("java.lang.Object"));
        Object term14940 = newInstance(Class.forName("java.lang.Object"));
        Object term14941 = newInstance(Class.forName("java.lang.Object"));
        Object term14942 = newInstance(Class.forName("java.lang.Object"));
        Object term14943 = newInstance(Class.forName("java.lang.Object"));
        Object term14944 = newInstance(Class.forName("java.lang.Object"));
        Object term14945 = newInstance(Class.forName("java.lang.Object"));
        Object term14946 = newInstance(Class.forName("java.lang.Object"));
        Object term14947 = newInstance(Class.forName("java.lang.Object"));
        Object term14948 = newInstance(Class.forName("java.lang.Object"));
        Object term14949 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14936, 0, term14937);
        setElement(term14936, 1, term14938);
        setElement(term14936, 2, term14939);
        setElement(term14936, 3, term14940);
        setElement(term14936, 4, term14941);
        setElement(term14936, 5, term14942);
        setElement(term14936, 6, term14943);
        setElement(term14936, 7, term14944);
        setElement(term14936, 8, term14945);
        setElement(term14936, 9, term14946);
        setElement(term14936, 10, term14947);
        setElement(term14936, 11, term14948);
        setElement(term14936, 12, term14949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1411;
        args[1] = term1417;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1411, term14953));
        assertTrue(recursiveEquals(term1417, term14959));
        assertTrue(recursiveEquals(retValue, term14936));
    }

};


