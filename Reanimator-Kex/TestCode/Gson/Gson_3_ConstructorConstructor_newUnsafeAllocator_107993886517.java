package com.google.gson.internal;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;

public class ConstructorConstructor_newUnsafeAllocator_107993886517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5552;
     Object term5588;
     Object term5624;

    public ConstructorConstructor_newUnsafeAllocator_107993886517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5552 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        term5588 = Class.forName((String) "java.util.zip.CheckedInputStream");
        term5624 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask$OfDouble");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term5588;
        args[1] = term5624;
        try {
            callMethod(klass, "newUnsafeAllocator", argTypes, term5552, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


