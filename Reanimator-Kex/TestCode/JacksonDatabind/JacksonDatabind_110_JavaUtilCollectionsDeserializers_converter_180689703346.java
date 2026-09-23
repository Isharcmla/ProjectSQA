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

public class JavaUtilCollectionsDeserializers_converter_180689703346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318625;
     Object term319299;

    public JavaUtilCollectionsDeserializers_converter_180689703346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318661 = Class.forName((String) "java.util.Collections$SynchronizedSortedSet");
        Class<? extends Object> term318801 = Class.forName((String) "java.nio.HeapByteBufferR");
        Class<? extends Object> term319049 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfRef");
        term319299 = Class.forName((String) "java.util.Collections$SingletonSet");
        term318625 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term318765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term318907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term319013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term319153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term319245 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term318625, term318625.getClass(), "_class", term318661);
        setField(term318765, term318765.getClass(), "_class", term318801);
        setField(term318907, term318907.getClass(), "_class", term318801);
        setField(term319013, term319013.getClass(), "_class", term319049);
        setField(term319153, term319153.getClass(), "_class", null);
        setField(term319245, term319245.getClass(), "_class", term319299);
        setField(term319153, term319153.getClass(), "_superClass", term319245);
        setField(term319013, term319013.getClass(), "_superClass", term319153);
        setField(term318907, term318907.getClass(), "_superClass", term319013);
        setField(term318765, term318765.getClass(), "_superClass", term318907);
        setField(term318625, term318625.getClass(), "_superClass", term318765);
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
        args[1] = term318625;
        args[2] = term319299;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


