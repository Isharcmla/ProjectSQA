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

public class ReflectiveTypeAdapterFactory_getFieldNames_66604790185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55198;
     Object term55326;

    public ReflectiveTypeAdapterFactory_getFieldNames_66604790185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57850 = Class.forName((String) "com.google.gson.FieldNamingPolicy");
        Field term57849 = ((Class) term57850).getDeclaredField((String) "IDENTITY");
        ((Field) term57849).setAccessible(true);
        Object enum12 = ((Field) term57849).get((Object) null);
        term55198 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        setField(term55198, term55198.getClass(), "fieldNamingPolicy", enum12);
        Class<? extends Object> term58045 = Class.forName((String) "java.util.concurrent.atomic.AtomicReferenceFieldUpdater$AtomicReferenceFieldUpdaterImpl$1");
        term55326 = ((Class) term58045).getDeclaredField((String) "this$0");
        ((Field) term55326).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term55326;
        try {
            callMethod(klass, "getFieldNames", argTypes, term55198, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


