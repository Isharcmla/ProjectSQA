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
import org.mockito.Mockito;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public class _Gson_Types_declaringClassOf_1123100285110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17460;
     Object term17871;

    public _Gson_Types_declaringClassOf_1123100285110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17509 = Class.forName((String) "java.util.stream.ReduceOps$3ReducingSink");
        term17460 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        Mockito.when(((TypeVariable)term17460).getGenericDeclaration()).thenReturn((GenericDeclaration)term17509);
        term17871 = Class.forName((String) "kex.java.lang.Character$Subset");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.TypeVariable");
        Object[] args = new Object[1];
        args[0] = term17460;
        Object retValue = callMethod(klass, "declaringClassOf", argTypes, null, args);
        assertTrue(recursiveEquals(term17460, null));
        assertTrue(recursiveEquals(retValue, term17871));
    }

};


