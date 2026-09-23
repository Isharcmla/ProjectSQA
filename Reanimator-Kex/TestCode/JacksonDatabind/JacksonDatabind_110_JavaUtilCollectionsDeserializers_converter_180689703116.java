package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62323;
     Object term62579;

    public JavaUtilCollectionsDeserializers_converter_180689703116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62451 = Class.forName((String) "java.io.FilePermission");
        term62323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term62415 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term62543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term62323, term62323.getClass(), "_class", null);
        setField(term62415, term62415.getClass(), "_class", term62451);
        setField(term62415, term62415.getClass(), "_superClass", term62543);
        setField(term62323, term62323.getClass(), "_superClass", term62415);
        term62579 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term62323;
        args[2] = term62579;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


