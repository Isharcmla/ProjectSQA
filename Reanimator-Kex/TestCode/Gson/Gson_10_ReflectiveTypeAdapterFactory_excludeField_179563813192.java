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
import java.util.ArrayList;

public class ReflectiveTypeAdapterFactory_excludeField_179563813192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61718;
     Object term61790;

    public ReflectiveTypeAdapterFactory_excludeField_179563813192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62565 = Class.forName((String) "java.util.Collections$2");
        term61718 = ((Class) term62565).getDeclaredField((String) "est");
        ((Field) term61718).setAccessible(false);
        ArrayList term61842 = new ArrayList();
        term61790 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term61790, term61790.getClass(), "version", 65536.0);
        setBooleanField(term61790, term61790.getClass(), "serializeInnerClasses", true);
        setField(term61790, term61790.getClass(), "deserializationStrategies", term61842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term61718;
        args[1] = false;
        args[2] = term61790;
        try {
            callMethod(klass, "excludeField", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


