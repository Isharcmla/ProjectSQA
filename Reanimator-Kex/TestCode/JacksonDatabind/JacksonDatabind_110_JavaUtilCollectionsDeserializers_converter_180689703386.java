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

public class JavaUtilCollectionsDeserializers_converter_180689703386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366996;
     Object term367728;

    public JavaUtilCollectionsDeserializers_converter_180689703386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term367136 = Class.forName((String) "java.lang.StackStreamFactory$AbstractStackWalker");
        Class<? extends Object> term367278 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator");
        Class<? extends Object> term367420 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfRef");
        Class<? extends Object> term367560 = Class.forName((String) "java.util.Collections$SingletonList");
        term367728 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapProperty");
        term366996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term367100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term367242 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term367384 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term367524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term367674 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term366996, term366996.getClass(), "_class", null);
        setField(term367100, term367100.getClass(), "_class", term367136);
        setField(term367242, term367242.getClass(), "_class", term367278);
        setField(term367384, term367384.getClass(), "_class", term367420);
        setField(term367524, term367524.getClass(), "_class", term367560);
        setField(term367674, term367674.getClass(), "_class", term367728);
        setField(term367524, term367524.getClass(), "_superClass", term367674);
        setField(term367384, term367384.getClass(), "_superClass", term367524);
        setField(term367242, term367242.getClass(), "_superClass", term367384);
        setField(term367100, term367100.getClass(), "_superClass", term367242);
        setField(term366996, term366996.getClass(), "_superClass", term367100);
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
        args[1] = term366996;
        args[2] = term367728;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


