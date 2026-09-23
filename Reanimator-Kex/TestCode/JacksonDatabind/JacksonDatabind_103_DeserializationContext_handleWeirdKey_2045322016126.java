package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DeserializationContext_handleWeirdKey_2045322016126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;

    public DeserializationContext_handleWeirdKey_2045322016126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2391 = (Object[]) newArray("java.lang.Object", 9);
        Object term2392 = newInstance(Class.forName("java.lang.Object"));
        Object term2393 = newInstance(Class.forName("java.lang.Object"));
        Object term2394 = newInstance(Class.forName("java.lang.Object"));
        Object term2395 = newInstance(Class.forName("java.lang.Object"));
        Object term2396 = newInstance(Class.forName("java.lang.Object"));
        Object term2397 = newInstance(Class.forName("java.lang.Object"));
        Object term2398 = newInstance(Class.forName("java.lang.Object"));
        Object term2399 = newInstance(Class.forName("java.lang.Object"));
        Object term2400 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2391, 0, term2392);
        setElement(term2391, 1, term2393);
        setElement(term2391, 2, term2394);
        setElement(term2391, 3, term2395);
        setElement(term2391, 4, term2396);
        setElement(term2391, 5, term2397);
        setElement(term2391, 6, term2398);
        setElement(term2391, 7, term2399);
        setElement(term2391, 8, term2400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "jJCZpVmanW";
        args[2] = "EGtDIRbSSb";
        args[3] = term2391;
        try {
            callMethod(klass, "handleWeirdKey", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


