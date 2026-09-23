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
import java.lang.String;
import java.lang.Object;

public class ReflectiveTypeAdapterFactory_getFieldNames_66604790124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8638;
     Object term8766;

    public ReflectiveTypeAdapterFactory_getFieldNames_66604790124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10588 = Class.forName((String) "com.google.gson.FieldNamingPolicy");
        Field term10587 = ((Class) term10588).getDeclaredField((String) "IDENTITY");
        ((Field) term10587).setAccessible(true);
        Object enum4 = ((Field) term10587).get((Object) null);
        term8638 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        setField(term8638, term8638.getClass(), "fieldNamingPolicy", enum4);
        Class<? extends Object> term10783 = Class.forName((String) "java.lang.StackStreamFactory");
        term8766 = ((Class) term10783).getDeclaredField((String) "BATCH_SIZE");
        ((Field) term8766).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term8766;
        try {
            callMethod(klass, "getFieldNames", argTypes, term8638, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


