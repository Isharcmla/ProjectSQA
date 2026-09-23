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

public class StringUtils_indexOfAny_805743433205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446;
     Object term9754;

    public StringUtils_indexOfAny_805743433205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1446 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1446, 0, "eqJfYWRaEL");
        setElement(term1446, 1, "fhkbdRViHi");
        setElement(term1446, 2, "uWHnvSvaPl");
        setElement(term1446, 3, "kBdSllIBVz");
        setElement(term1446, 4, "TJmVBGfTML");
        setElement(term1446, 5, "tPlsykYBqO");
        term9754 = (Object[]) newArray("java.lang.String", 6);
        setElement(term9754, 0, "eqJfYWRaEL");
        setElement(term9754, 1, "fhkbdRViHi");
        setElement(term9754, 2, "uWHnvSvaPl");
        setElement(term9754, 3, "kBdSllIBVz");
        setElement(term9754, 4, "TJmVBGfTML");
        setElement(term9754, 5, "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "hoicvmsovO";
        args[1] = term1446;
        Object retValue = callMethod(klass, "indexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1446, term9754));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


