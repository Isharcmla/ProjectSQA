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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class ConstructorConstructor_newUnsafeAllocator_107993886519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8007;
     Object term8043;
     Object term8079;
     Object term9289;
     Object term9290;
     Object term9309;
     Object term9124;

    public ConstructorConstructor_newUnsafeAllocator_107993886519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8007 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        term8043 = Class.forName((String) "java.lang.invoke.VarHandleObjects$FieldInstanceReadWrite");
        term8079 = Class.forName((String) "java.util.zip.ZipFile$ZipFileInflaterInputStream");
        term9289 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term9289, term9289.getClass(), "instanceCreators", null);
        term9290 = Class.forName((String) "com.google.gson.JsonNull");
        term9309 = Class.forName((String) "com.google.gson.internal.bind.TypeAdapters$29");
        Class<? extends Object> term9126 = Class.forName((String) "com.google.gson.JsonNull");
        Class<? extends Object> term9208 = Class.forName((String) "com.google.gson.internal.bind.TypeAdapters$29");
        term9124 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor$12"));
        Object term9125 = newInstance(Class.forName("com.google.gson.internal.UnsafeAllocator$4"));
        Object term9288 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term9124, term9124.getClass(), "unsafeAllocator", term9125);
        setField(term9124, term9124.getClass(), "val$rawType", term9126);
        setField(term9124, term9124.getClass(), "val$type", term9208);
        setField(term9288, term9288.getClass(), "instanceCreators", null);
        setField(term9124, term9124.getClass(), "this$0", term9288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term8043;
        args[1] = term8079;
        Object retValue = callMethod(klass, "newUnsafeAllocator", argTypes, term8007, args);
        assertTrue(recursiveEquals(term8007, term9289));
        assertTrue(recursiveEquals(term8043, term9290));
        assertTrue(recursiveEquals(term8079, term9309));
        assertTrue(recursiveEquals(retValue, term9124));
    }

};


