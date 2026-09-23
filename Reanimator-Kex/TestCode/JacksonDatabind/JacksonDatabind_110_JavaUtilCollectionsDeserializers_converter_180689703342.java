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

public class JavaUtilCollectionsDeserializers_converter_180689703342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313562;
     Object term314246;

    public JavaUtilCollectionsDeserializers_converter_180689703342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term313598 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl");
        Class<? extends Object> term313950 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfDouble");
        Class<? extends Object> term314090 = Class.forName((String) "java.util.stream.Streams$1");
        term313562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term313702 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term313808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term313914 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term314054 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term314210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term313562, term313562.getClass(), "_class", term313598);
        setField(term313702, term313702.getClass(), "_class", null);
        setField(term313808, term313808.getClass(), "_class", null);
        setField(term313914, term313914.getClass(), "_class", term313950);
        setField(term314054, term314054.getClass(), "_class", term314090);
        setField(term314054, term314054.getClass(), "_superClass", term314210);
        setField(term313914, term313914.getClass(), "_superClass", term314054);
        setField(term313808, term313808.getClass(), "_superClass", term313914);
        setField(term313702, term313702.getClass(), "_superClass", term313808);
        setField(term313562, term313562.getClass(), "_superClass", term313702);
        term314246 = Class.forName((String) "java.util.TimerTask");
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
        args[1] = term313562;
        args[2] = term314246;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


