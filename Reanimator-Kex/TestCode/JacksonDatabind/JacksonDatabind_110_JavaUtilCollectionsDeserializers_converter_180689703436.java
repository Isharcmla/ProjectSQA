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

public class JavaUtilCollectionsDeserializers_converter_180689703436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427531;
     Object term428365;

    public JavaUtilCollectionsDeserializers_converter_180689703436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term427567 = Class.forName((String) "java.util.WeakHashMap$EntrySpliterator");
        Class<? extends Object> term427707 = Class.forName((String) "com.fasterxml.jackson.databind.deser.package-info");
        Class<? extends Object> term427849 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term427991 = Class.forName((String) "java.util.stream.SortedOps$LongSortingSink");
        Class<? extends Object> term428131 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer");
        term427531 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term427671 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term427813 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term427955 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term428095 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term428223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term428329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term427531, term427531.getClass(), "_class", term427567);
        setField(term427671, term427671.getClass(), "_class", term427707);
        setField(term427813, term427813.getClass(), "_class", term427849);
        setField(term427955, term427955.getClass(), "_class", term427991);
        setField(term428095, term428095.getClass(), "_class", term428131);
        setField(term428223, term428223.getClass(), "_class", null);
        setField(term428223, term428223.getClass(), "_superClass", term428329);
        setField(term428095, term428095.getClass(), "_superClass", term428223);
        setField(term427955, term427955.getClass(), "_superClass", term428095);
        setField(term427813, term427813.getClass(), "_superClass", term427955);
        setField(term427671, term427671.getClass(), "_superClass", term427813);
        setField(term427531, term427531.getClass(), "_superClass", term427671);
        term428365 = Class.forName((String) "java.lang.module.ModuleDescriptor$Requires$Modifier");
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
        args[1] = term427531;
        args[2] = term428365;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


