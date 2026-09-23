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

public class ReflectiveTypeAdapterFactory_excludeField_179563813164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39677;
     Object term39749;

    public ReflectiveTypeAdapterFactory_excludeField_179563813164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41516 = Class.forName((String) "java.lang.StringBuffer");
        term39677 = ((Class) term41516).getDeclaredField((String) "toStringCache");
        ((Field) term39677).setAccessible(false);
        term39749 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term39749, term39749.getClass(), "version", 4.6116860184273879E18);
        setBooleanField(term39749, term39749.getClass(), "serializeInnerClasses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term39677;
        args[1] = false;
        args[2] = term39749;
        try {
            callMethod(klass, "excludeField", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


