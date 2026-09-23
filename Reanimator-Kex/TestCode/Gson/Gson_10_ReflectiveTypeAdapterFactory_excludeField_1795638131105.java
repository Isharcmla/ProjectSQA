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

public class ReflectiveTypeAdapterFactory_excludeField_1795638131105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66992;
     Object term67064;

    public ReflectiveTypeAdapterFactory_excludeField_1795638131105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68438 = Class.forName((String) "java.lang.invoke.VarHandleChars$FieldStaticReadOnly");
        term66992 = ((Class) term68438).getDeclaredField((String) "FORM");
        ((Field) term66992).setAccessible(false);
        term67064 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term67064, term67064.getClass(), "version", 4.398046511104E12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term66992;
        args[1] = false;
        args[2] = term67064;
        try {
            callMethod(klass, "excludeField", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


