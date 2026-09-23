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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ReflectiveTypeAdapterFactory_excludeField_1795638131104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67605;
     Object term67677;

    public ReflectiveTypeAdapterFactory_excludeField_1795638131104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67678 = Class.forName((String) "java.nio.ByteBufferAsDoubleBufferRB");
        term67605 = ((Class) term67678).getDeclaredField((String) "$assertionsDisabled");
        ((Field) term67605).setAccessible(false);
        term67677 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term67677, term67677.getClass(), "version", 1.0);
        setBooleanField(term67677, term67677.getClass(), "serializeInnerClasses", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term67605;
        args[1] = true;
        args[2] = term67677;
        callMethod(klass, "excludeField", argTypes, null, args);
    }

};


