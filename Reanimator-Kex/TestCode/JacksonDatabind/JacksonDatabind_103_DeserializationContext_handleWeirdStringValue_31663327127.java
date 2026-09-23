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

public class DeserializationContext_handleWeirdStringValue_31663327127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2445;

    public DeserializationContext_handleWeirdStringValue_31663327127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2445 = (Object[]) newArray("java.lang.Object", 9);
        Object term2446 = newInstance(Class.forName("java.lang.Object"));
        Object term2447 = newInstance(Class.forName("java.lang.Object"));
        Object term2448 = newInstance(Class.forName("java.lang.Object"));
        Object term2449 = newInstance(Class.forName("java.lang.Object"));
        Object term2450 = newInstance(Class.forName("java.lang.Object"));
        Object term2451 = newInstance(Class.forName("java.lang.Object"));
        Object term2452 = newInstance(Class.forName("java.lang.Object"));
        Object term2453 = newInstance(Class.forName("java.lang.Object"));
        Object term2454 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2445, 0, term2446);
        setElement(term2445, 1, term2447);
        setElement(term2445, 2, term2448);
        setElement(term2445, 3, term2449);
        setElement(term2445, 4, term2450);
        setElement(term2445, 5, term2451);
        setElement(term2445, 6, term2452);
        setElement(term2445, 7, term2453);
        setElement(term2445, 8, term2454);
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
        args[1] = "SzjVpOQTyS";
        args[2] = "MjGYSRKTNF";
        args[3] = term2445;
        try {
            callMethod(klass, "handleWeirdStringValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


