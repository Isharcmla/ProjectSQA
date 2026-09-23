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

public class DeserializationContext_reportInputMismatch_2116767273143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5948;

    public DeserializationContext_reportInputMismatch_2116767273143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5948 = (Object[]) newArray("java.lang.Object", 4);
        Object term5949 = newInstance(Class.forName("java.lang.Object"));
        Object term5950 = newInstance(Class.forName("java.lang.Object"));
        Object term5951 = newInstance(Class.forName("java.lang.Object"));
        Object term5952 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5948, 0, term5949);
        setElement(term5948, 1, term5950);
        setElement(term5948, 2, term5951);
        setElement(term5948, 3, term5952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term5948;
        try {
            callMethod(klass, "reportInputMismatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


