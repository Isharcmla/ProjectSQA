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

public class DeserializationContext_mappingException_1472033435168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10250;

    public DeserializationContext_mappingException_1472033435168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10250 = (Object[]) newArray("java.lang.Object", 4);
        Object term10251 = newInstance(Class.forName("java.lang.Object"));
        Object term10252 = newInstance(Class.forName("java.lang.Object"));
        Object term10253 = newInstance(Class.forName("java.lang.Object"));
        Object term10254 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10250, 0, term10251);
        setElement(term10250, 1, term10252);
        setElement(term10250, 2, term10253);
        setElement(term10250, 3, term10254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "GzFkzHGYFt";
        args[1] = term10250;
        try {
            callMethod(klass, "mappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


