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

public class ReflectiveTypeAdapterFactory_excludeField_98487045798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64611;
     Object term64735;

    public ReflectiveTypeAdapterFactory_excludeField_98487045798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64611 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term64683 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term64683, term64683.getClass(), "version", 1.0);
        setBooleanField(term64683, term64683.getClass(), "serializeInnerClasses", true);
        setField(term64611, term64611.getClass(), "excluder", term64683);
        Class<? extends Object> term65899 = Class.forName((String) "java.lang.module.ModuleDescriptor$Requires");
        term64735 = ((Class) term65899).getDeclaredField((String) "rawCompiledVersion");
        ((Field) term64735).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term64735;
        args[1] = true;
        try {
            callMethod(klass, "excludeField", argTypes, term64611, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


