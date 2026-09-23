package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_indexOfAny_561533082190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;
     Object term10049;

    public StringUtils_indexOfAny_561533082190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1392 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1392, 0, "dEnhdmILtU");
        setElement(term1392, 1, "hoicvmsovO");
        setElement(term1392, 2, "eqJfYWRaEL");
        setElement(term1392, 3, "fhkbdRViHi");
        setElement(term1392, 4, "uWHnvSvaPl");
        setElement(term1392, 5, "kBdSllIBVz");
        term10049 = (Object[]) newArray("java.lang.String", 6);
        setElement(term10049, 0, "dEnhdmILtU");
        setElement(term10049, 1, "hoicvmsovO");
        setElement(term10049, 2, "eqJfYWRaEL");
        setElement(term10049, 3, "fhkbdRViHi");
        setElement(term10049, 4, "uWHnvSvaPl");
        setElement(term10049, 5, "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "ieCtQFdkii";
        args[1] = term1392;
        Object retValue = callMethod(klass, "indexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1392, term10049));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


