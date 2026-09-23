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

public class JavaUtilCollectionsDeserializers_converter_180689703470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479677;
     Object term480135;
     Object term481214;
     Object term481221;
     Object term481112;

    public JavaUtilCollectionsDeserializers_converter_180689703470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480135 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        term479677 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term479769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term479873 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term479977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term480081 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term479677, term479677.getClass(), "_class", null);
        setField(term479769, term479769.getClass(), "_class", null);
        setField(term479873, term479873.getClass(), "_class", null);
        setField(term479977, term479977.getClass(), "_class", null);
        setField(term480081, term480081.getClass(), "_class", term480135);
        setField(term479977, term479977.getClass(), "_superClass", term480081);
        setField(term479873, term479873.getClass(), "_superClass", term479977);
        setField(term479769, term479769.getClass(), "_superClass", term479873);
        setField(term479677, term479677.getClass(), "_superClass", term479769);
        term481214 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanPropertyFilter");
        Class<? extends Object> term481226 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanPropertyFilter");
        term481221 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term481222 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term481223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term481224 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term481225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term481221, term481221.getClass(), "_elementType", null);
        setField(term481222, term481222.getClass(), "_keyType", null);
        setField(term481222, term481222.getClass(), "_valueType", null);
        setField(term481223, term481223.getClass(), "_referencedType", null);
        setField(term481223, term481223.getClass(), "_anchorType", null);
        setField(term481224, term481224.getClass(), "_referencedType", null);
        setField(term481224, term481224.getClass(), "_anchorType", null);
        setField(term481225, term481225.getClass(), "_referencedType", null);
        setField(term481225, term481225.getClass(), "_anchorType", null);
        setField(term481225, term481225.getClass(), "_superClass", null);
        setField(term481225, term481225.getClass(), "_superInterfaces", null);
        setField(term481225, term481225.getClass(), "_bindings", null);
        setField(term481225, term481225.getClass(), "_canonicalName", null);
        setField(term481225, term481225.getClass(), "_class", term481226);
        setIntField(term481225, term481225.getClass(), "_hash", 0);
        setField(term481225, term481225.getClass(), "_valueHandler", null);
        setField(term481225, term481225.getClass(), "_typeHandler", null);
        setBooleanField(term481225, term481225.getClass(), "_asStatic", false);
        setField(term481224, term481224.getClass(), "_superClass", term481225);
        setField(term481224, term481224.getClass(), "_superInterfaces", null);
        setField(term481224, term481224.getClass(), "_bindings", null);
        setField(term481224, term481224.getClass(), "_canonicalName", null);
        setField(term481224, term481224.getClass(), "_class", null);
        setIntField(term481224, term481224.getClass(), "_hash", 0);
        setField(term481224, term481224.getClass(), "_valueHandler", null);
        setField(term481224, term481224.getClass(), "_typeHandler", null);
        setBooleanField(term481224, term481224.getClass(), "_asStatic", false);
        setField(term481223, term481223.getClass(), "_superClass", term481224);
        setField(term481223, term481223.getClass(), "_superInterfaces", null);
        setField(term481223, term481223.getClass(), "_bindings", null);
        setField(term481223, term481223.getClass(), "_canonicalName", null);
        setField(term481223, term481223.getClass(), "_class", null);
        setIntField(term481223, term481223.getClass(), "_hash", 0);
        setField(term481223, term481223.getClass(), "_valueHandler", null);
        setField(term481223, term481223.getClass(), "_typeHandler", null);
        setBooleanField(term481223, term481223.getClass(), "_asStatic", false);
        setField(term481222, term481222.getClass(), "_superClass", term481223);
        setField(term481222, term481222.getClass(), "_superInterfaces", null);
        setField(term481222, term481222.getClass(), "_bindings", null);
        setField(term481222, term481222.getClass(), "_canonicalName", null);
        setField(term481222, term481222.getClass(), "_class", null);
        setIntField(term481222, term481222.getClass(), "_hash", 0);
        setField(term481222, term481222.getClass(), "_valueHandler", null);
        setField(term481222, term481222.getClass(), "_typeHandler", null);
        setBooleanField(term481222, term481222.getClass(), "_asStatic", false);
        setField(term481221, term481221.getClass(), "_superClass", term481222);
        setField(term481221, term481221.getClass(), "_superInterfaces", null);
        setField(term481221, term481221.getClass(), "_bindings", null);
        setField(term481221, term481221.getClass(), "_canonicalName", null);
        setField(term481221, term481221.getClass(), "_class", null);
        setIntField(term481221, term481221.getClass(), "_hash", 0);
        setField(term481221, term481221.getClass(), "_valueHandler", null);
        setField(term481221, term481221.getClass(), "_typeHandler", null);
        setBooleanField(term481221, term481221.getClass(), "_asStatic", false);
        Class<? extends Object> term480447 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanPropertyFilter");
        term481112 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term481101 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term481101, term481101.getClass(), "_referencedType", null);
        setField(term481101, term481101.getClass(), "_anchorType", null);
        setField(term481101, term481101.getClass(), "_superClass", null);
        setField(term481101, term481101.getClass(), "_superInterfaces", null);
        setField(term481101, term481101.getClass(), "_bindings", null);
        setField(term481101, term481101.getClass(), "_canonicalName", null);
        setField(term481101, term481101.getClass(), "_class", term480447);
        setIntField(term481101, term481101.getClass(), "_hash", 0);
        setField(term481101, term481101.getClass(), "_valueHandler", null);
        setField(term481101, term481101.getClass(), "_typeHandler", null);
        setBooleanField(term481101, term481101.getClass(), "_asStatic", false);
        setField(term481112, term481112.getClass(), "_inputType", term481101);
        setIntField(term481112, term481112.getClass(), "_kind", 0);
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
        args[1] = term479677;
        args[2] = term480135;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term479677, term481221));
        assertTrue(recursiveEquals(term480135, 0));
        assertTrue(recursiveEquals(retValue, term481112));
    }

};


