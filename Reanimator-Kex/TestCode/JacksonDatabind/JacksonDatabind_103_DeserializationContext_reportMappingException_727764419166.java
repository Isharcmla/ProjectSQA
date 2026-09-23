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

public class DeserializationContext_reportMappingException_727764419166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10201;

    public DeserializationContext_reportMappingException_727764419166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10201 = (Object[]) newArray("java.lang.Object", 4);
        Object term10202 = newInstance(Class.forName("java.lang.Object"));
        Object term10203 = newInstance(Class.forName("java.lang.Object"));
        Object term10204 = newInstance(Class.forName("java.lang.Object"));
        Object term10205 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10201, 0, term10202);
        setElement(term10201, 1, term10203);
        setElement(term10201, 2, term10204);
        setElement(term10201, 3, term10205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = term10201;
        try {
            callMethod(klass, "reportMappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


