package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_98487045739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19694;
     Object term19818;

    public ReflectiveTypeAdapterFactory_excludeField_98487045739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19694 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term19766 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term19766, term19766.getClass(), "version", 1.0);
        setBooleanField(term19766, term19766.getClass(), "serializeInnerClasses", false);
        setField(term19694, term19694.getClass(), "excluder", term19766);
        Class<? extends Object> term21296 = Class.forName((String) "java.nio.file.FileTreeWalker$DirectoryNode");
        term19818 = ((Class) term21296).getDeclaredField((String) "iterator");
        ((Field) term19818).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term19818;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term19694, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


