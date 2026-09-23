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
import org.mockito.Mockito;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public class _Gson_Types_declaringClassOf_1123100285115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17530;

    public _Gson_Types_declaringClassOf_1123100285115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17579 = Class.forName((String) "java.io.DeleteOnExitHook");
        term17530 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        Mockito.when(((TypeVariable)term17530).getGenericDeclaration()).thenReturn((GenericDeclaration)term17579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.TypeVariable");
        Object[] args = new Object[1];
        args[0] = term17530;
        try {
            callMethod(klass, "declaringClassOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


