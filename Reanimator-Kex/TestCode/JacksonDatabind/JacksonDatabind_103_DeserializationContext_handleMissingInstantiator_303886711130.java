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

public class DeserializationContext_handleMissingInstantiator_303886711130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2514;

    public DeserializationContext_handleMissingInstantiator_303886711130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2514 = (Object[]) newArray("java.lang.Object", 7);
        Object term2515 = newInstance(Class.forName("java.lang.Object"));
        Object term2516 = newInstance(Class.forName("java.lang.Object"));
        Object term2517 = newInstance(Class.forName("java.lang.Object"));
        Object term2518 = newInstance(Class.forName("java.lang.Object"));
        Object term2519 = newInstance(Class.forName("java.lang.Object"));
        Object term2520 = newInstance(Class.forName("java.lang.Object"));
        Object term2521 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2514, 0, term2515);
        setElement(term2514, 1, term2516);
        setElement(term2514, 2, term2517);
        setElement(term2514, 3, term2518);
        setElement(term2514, 4, term2519);
        setElement(term2514, 5, term2520);
        setElement(term2514, 6, term2521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = "RMFIsYGgne";
        args[4] = term2514;
        try {
            callMethod(klass, "handleMissingInstantiator", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


