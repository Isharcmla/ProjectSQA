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

public class ReflectiveTypeAdapterFactory_excludeField_98487045786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56968;
     Object term57092;

    public ReflectiveTypeAdapterFactory_excludeField_98487045786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56968 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term57040 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term57040, term57040.getClass(), "version", -4.6161896180547584E18);
        setBooleanField(term57040, term57040.getClass(), "serializeInnerClasses", true);
        setField(term56968, term56968.getClass(), "excluder", term57040);
        Class<? extends Object> term58998 = Class.forName((String) "java.nio.file.CopyMoveHelper$CopyOptions");
        term57092 = ((Class) term58998).getDeclaredField((String) "followLinks");
        ((Field) term57092).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57092;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term56968, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


