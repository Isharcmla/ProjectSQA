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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173740;
     Object term174128;
     Object term174806;
     Object term174825;
     Object term174803;

    public JavaUtilCollectionsDeserializers_converter_180689703229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term173776 = Class.forName((String) "java.util.stream.DoubleStream$1");
        term173740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term173880 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term173986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term174092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term173740, term173740.getClass(), "_class", term173776);
        setField(term173880, term173880.getClass(), "_class", null);
        setField(term173986, term173986.getClass(), "_class", null);
        setField(term173986, term173986.getClass(), "_superClass", term174092);
        setField(term173880, term173880.getClass(), "_superClass", term173986);
        setField(term173740, term173740.getClass(), "_superClass", term173880);
        term174128 = Class.forName((String) "java.util.HashMap$KeySet");
        term174806 = Class.forName((String) "com.fasterxml.jackson.annotation.PropertyAccessor");
        Class<? extends Object> term174829 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer");
        term174825 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term174826 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term174827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term174828 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term174825, term174825.getClass(), "_elementType", null);
        setField(term174826, term174826.getClass(), "_referencedType", null);
        setField(term174826, term174826.getClass(), "_anchorType", null);
        setField(term174827, term174827.getClass(), "_elementType", null);
        setField(term174828, term174828.getClass(), "_elementType", null);
        setField(term174828, term174828.getClass(), "_superClass", null);
        setField(term174828, term174828.getClass(), "_superInterfaces", null);
        setField(term174828, term174828.getClass(), "_bindings", null);
        setField(term174828, term174828.getClass(), "_canonicalName", null);
        setField(term174828, term174828.getClass(), "_class", null);
        setIntField(term174828, term174828.getClass(), "_hash", 0);
        setField(term174828, term174828.getClass(), "_valueHandler", null);
        setField(term174828, term174828.getClass(), "_typeHandler", null);
        setBooleanField(term174828, term174828.getClass(), "_asStatic", false);
        setField(term174827, term174827.getClass(), "_superClass", term174828);
        setField(term174827, term174827.getClass(), "_superInterfaces", null);
        setField(term174827, term174827.getClass(), "_bindings", null);
        setField(term174827, term174827.getClass(), "_canonicalName", null);
        setField(term174827, term174827.getClass(), "_class", null);
        setIntField(term174827, term174827.getClass(), "_hash", 0);
        setField(term174827, term174827.getClass(), "_valueHandler", null);
        setField(term174827, term174827.getClass(), "_typeHandler", null);
        setBooleanField(term174827, term174827.getClass(), "_asStatic", false);
        setField(term174826, term174826.getClass(), "_superClass", term174827);
        setField(term174826, term174826.getClass(), "_superInterfaces", null);
        setField(term174826, term174826.getClass(), "_bindings", null);
        setField(term174826, term174826.getClass(), "_canonicalName", null);
        setField(term174826, term174826.getClass(), "_class", null);
        setIntField(term174826, term174826.getClass(), "_hash", 0);
        setField(term174826, term174826.getClass(), "_valueHandler", null);
        setField(term174826, term174826.getClass(), "_typeHandler", null);
        setBooleanField(term174826, term174826.getClass(), "_asStatic", false);
        setField(term174825, term174825.getClass(), "_superClass", term174826);
        setField(term174825, term174825.getClass(), "_superInterfaces", null);
        setField(term174825, term174825.getClass(), "_bindings", null);
        setField(term174825, term174825.getClass(), "_canonicalName", null);
        setField(term174825, term174825.getClass(), "_class", term174829);
        setIntField(term174825, term174825.getClass(), "_hash", 0);
        setField(term174825, term174825.getClass(), "_valueHandler", null);
        setField(term174825, term174825.getClass(), "_typeHandler", null);
        setBooleanField(term174825, term174825.getClass(), "_asStatic", false);
        term174803 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term174803, term174803.getClass(), "_inputType", null);
        setIntField(term174803, term174803.getClass(), "_kind", 0);
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
        args[1] = term173740;
        args[2] = term174128;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term173740, term174825));
        assertTrue(recursiveEquals(term174128, 0));
        assertTrue(recursiveEquals(retValue, term174803));
    }

};


