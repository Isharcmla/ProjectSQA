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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550600;
     Object term551372;

    public JavaUtilCollectionsDeserializers_converter_180689703526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term550636 = Class.forName((String) "java.nio.channels.AsynchronousChannel");
        Class<? extends Object> term550786 = Class.forName((String) "java.lang.StackStreamFactory$StackFrameTraverser");
        Class<? extends Object> term550928 = Class.forName((String) "java.util.stream.DoublePipeline$4");
        Class<? extends Object> term551084 = Class.forName((String) "java.util.zip.Checksum$1");
        term551372 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor");
        term550600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term550750 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term550892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term551048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term551204 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term551318 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term550600, term550600.getClass(), "_class", term550636);
        setField(term550750, term550750.getClass(), "_class", term550786);
        setField(term550892, term550892.getClass(), "_class", term550928);
        setField(term551048, term551048.getClass(), "_class", term551084);
        setField(term551204, term551204.getClass(), "_class", null);
        setField(term551318, term551318.getClass(), "_class", term551372);
        setField(term551204, term551204.getClass(), "_superClass", term551318);
        setField(term551048, term551048.getClass(), "_superClass", term551204);
        setField(term550892, term550892.getClass(), "_superClass", term551048);
        setField(term550750, term550750.getClass(), "_superClass", term550892);
        setField(term550600, term550600.getClass(), "_superClass", term550750);
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
        args[1] = term550600;
        args[2] = term551372;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


