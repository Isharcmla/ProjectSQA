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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524442;
     Object term524754;
     Object term525208;
     Object term525253;
     Object term525205;

    public JavaUtilCollectionsDeserializers_converter_180689703504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term524534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term524626 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term524718 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term524442, term524442.getClass(), "_class", null);
        setField(term524534, term524534.getClass(), "_class", null);
        setField(term524626, term524626.getClass(), "_class", null);
        setField(term524626, term524626.getClass(), "_superClass", term524718);
        setField(term524534, term524534.getClass(), "_superClass", term524626);
        setField(term524442, term524442.getClass(), "_superClass", term524534);
        term524754 = Class.forName((String) "java.util.stream.SortedOps$DoubleSortingSink");
        term525208 = Class.forName((String) "com.fasterxml.jackson.databind.JsonDeserializer$None");
        term525253 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term525254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term525255 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term525256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term525253, term525253.getClass(), "_elementType", null);
        setField(term525254, term525254.getClass(), "_keyType", null);
        setField(term525254, term525254.getClass(), "_valueType", null);
        setField(term525255, term525255.getClass(), "_keyType", null);
        setField(term525255, term525255.getClass(), "_valueType", null);
        setField(term525256, term525256.getClass(), "_keyType", null);
        setField(term525256, term525256.getClass(), "_valueType", null);
        setField(term525256, term525256.getClass(), "_superClass", null);
        setField(term525256, term525256.getClass(), "_superInterfaces", null);
        setField(term525256, term525256.getClass(), "_bindings", null);
        setField(term525256, term525256.getClass(), "_canonicalName", null);
        setField(term525256, term525256.getClass(), "_class", null);
        setIntField(term525256, term525256.getClass(), "_hash", 0);
        setField(term525256, term525256.getClass(), "_valueHandler", null);
        setField(term525256, term525256.getClass(), "_typeHandler", null);
        setBooleanField(term525256, term525256.getClass(), "_asStatic", false);
        setField(term525255, term525255.getClass(), "_superClass", term525256);
        setField(term525255, term525255.getClass(), "_superInterfaces", null);
        setField(term525255, term525255.getClass(), "_bindings", null);
        setField(term525255, term525255.getClass(), "_canonicalName", null);
        setField(term525255, term525255.getClass(), "_class", null);
        setIntField(term525255, term525255.getClass(), "_hash", 0);
        setField(term525255, term525255.getClass(), "_valueHandler", null);
        setField(term525255, term525255.getClass(), "_typeHandler", null);
        setBooleanField(term525255, term525255.getClass(), "_asStatic", false);
        setField(term525254, term525254.getClass(), "_superClass", term525255);
        setField(term525254, term525254.getClass(), "_superInterfaces", null);
        setField(term525254, term525254.getClass(), "_bindings", null);
        setField(term525254, term525254.getClass(), "_canonicalName", null);
        setField(term525254, term525254.getClass(), "_class", null);
        setIntField(term525254, term525254.getClass(), "_hash", 0);
        setField(term525254, term525254.getClass(), "_valueHandler", null);
        setField(term525254, term525254.getClass(), "_typeHandler", null);
        setBooleanField(term525254, term525254.getClass(), "_asStatic", false);
        setField(term525253, term525253.getClass(), "_superClass", term525254);
        setField(term525253, term525253.getClass(), "_superInterfaces", null);
        setField(term525253, term525253.getClass(), "_bindings", null);
        setField(term525253, term525253.getClass(), "_canonicalName", null);
        setField(term525253, term525253.getClass(), "_class", null);
        setIntField(term525253, term525253.getClass(), "_hash", 0);
        setField(term525253, term525253.getClass(), "_valueHandler", null);
        setField(term525253, term525253.getClass(), "_typeHandler", null);
        setBooleanField(term525253, term525253.getClass(), "_asStatic", false);
        term525205 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term525205, term525205.getClass(), "_inputType", null);
        setIntField(term525205, term525205.getClass(), "_kind", 0);
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
        args[1] = term524442;
        args[2] = term524754;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term524442, term525253));
        assertTrue(recursiveEquals(term524754, 0));
        assertTrue(recursiveEquals(retValue, term525205));
    }

};


