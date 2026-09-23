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

public class JavaUtilCollectionsDeserializers_converter_180689703464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471077;
     Object term472075;

    public JavaUtilCollectionsDeserializers_converter_180689703464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471113 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleDeserializers");
        Class<? extends Object> term471253 = Class.forName((String) "java.lang.CharacterDataUndefined");
        Class<? extends Object> term471395 = Class.forName((String) "com.fasterxml.jackson.core.JsonProcessingException");
        Class<? extends Object> term471537 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat");
        Class<? extends Object> term471769 = Class.forName((String) "java.util.concurrent.locks.StampedLock$ReadLockView");
        Class<? extends Object> term471919 = Class.forName((String) "java.util.stream.Nodes$ConcNode");
        term471077 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term471217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term471359 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term471501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term471641 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term471733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term471883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term472039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term471077, term471077.getClass(), "_class", term471113);
        setField(term471217, term471217.getClass(), "_class", term471253);
        setField(term471359, term471359.getClass(), "_class", term471395);
        setField(term471501, term471501.getClass(), "_class", term471537);
        setField(term471641, term471641.getClass(), "_class", null);
        setField(term471733, term471733.getClass(), "_class", term471769);
        setField(term471883, term471883.getClass(), "_class", term471919);
        setField(term471883, term471883.getClass(), "_superClass", term472039);
        setField(term471733, term471733.getClass(), "_superClass", term471883);
        setField(term471641, term471641.getClass(), "_superClass", term471733);
        setField(term471501, term471501.getClass(), "_superClass", term471641);
        setField(term471359, term471359.getClass(), "_superClass", term471501);
        setField(term471217, term471217.getClass(), "_superClass", term471359);
        setField(term471077, term471077.getClass(), "_superClass", term471217);
        term472075 = Class.forName((String) "java.lang.LiveStackFrame$PrimitiveSlot");
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
        args[1] = term471077;
        args[2] = term472075;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


