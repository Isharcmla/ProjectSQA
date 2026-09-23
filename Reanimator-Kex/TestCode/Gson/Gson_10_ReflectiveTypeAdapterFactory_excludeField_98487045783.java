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

public class ReflectiveTypeAdapterFactory_excludeField_98487045783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54443;
     Object term54567;

    public ReflectiveTypeAdapterFactory_excludeField_98487045783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54443 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term54515 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term54515, term54515.getClass(), "version", 0.0);
        setBooleanField(term54515, term54515.getClass(), "serializeInnerClasses", false);
        setField(term54443, term54443.getClass(), "excluder", term54515);
        Class<? extends Object> term56302 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsChars$ByteBufferHandle");
        term54567 = ((Class) term56302).getDeclaredField((String) "FORM");
        ((Field) term54567).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term54567;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term54443, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


