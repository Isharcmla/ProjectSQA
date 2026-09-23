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

public class JavaUtilCollectionsDeserializers_converter_180689703225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168691;
     Object term169105;
     Object term170336;
     Object term170343;
     Object term170231;

    public JavaUtilCollectionsDeserializers_converter_180689703225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term168727 = Class.forName((String) "java.util.stream.LongPipeline$StatelessOp");
        term169105 = Class.forName((String) "java.lang.StringUTF16$CharsSpliterator");
        term168691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term168841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term168947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term169051 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term168691, term168691.getClass(), "_class", term168727);
        setField(term168841, term168841.getClass(), "_class", null);
        setField(term168947, term168947.getClass(), "_class", null);
        setField(term169051, term169051.getClass(), "_class", term169105);
        setField(term168947, term168947.getClass(), "_superClass", term169051);
        setField(term168841, term168841.getClass(), "_superClass", term168947);
        setField(term168691, term168691.getClass(), "_superClass", term168841);
        term170336 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Class<? extends Object> term170347 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Class<? extends Object> term170354 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier");
        term170343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term170344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term170345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term170346 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term170343, term170343.getClass(), "_keyType", null);
        setField(term170343, term170343.getClass(), "_valueType", null);
        setIntField(term170344, term170344.getClass(), "_ordinal", 0);
        setField(term170344, term170344.getClass(), "_actualType", null);
        setField(term170345, term170345.getClass(), "_elementType", null);
        setField(term170346, term170346.getClass(), "_referencedType", null);
        setField(term170346, term170346.getClass(), "_anchorType", null);
        setField(term170346, term170346.getClass(), "_superClass", null);
        setField(term170346, term170346.getClass(), "_superInterfaces", null);
        setField(term170346, term170346.getClass(), "_bindings", null);
        setField(term170346, term170346.getClass(), "_canonicalName", null);
        setField(term170346, term170346.getClass(), "_class", term170347);
        setIntField(term170346, term170346.getClass(), "_hash", 0);
        setField(term170346, term170346.getClass(), "_valueHandler", null);
        setField(term170346, term170346.getClass(), "_typeHandler", null);
        setBooleanField(term170346, term170346.getClass(), "_asStatic", false);
        setField(term170345, term170345.getClass(), "_superClass", term170346);
        setField(term170345, term170345.getClass(), "_superInterfaces", null);
        setField(term170345, term170345.getClass(), "_bindings", null);
        setField(term170345, term170345.getClass(), "_canonicalName", null);
        setField(term170345, term170345.getClass(), "_class", null);
        setIntField(term170345, term170345.getClass(), "_hash", 0);
        setField(term170345, term170345.getClass(), "_valueHandler", null);
        setField(term170345, term170345.getClass(), "_typeHandler", null);
        setBooleanField(term170345, term170345.getClass(), "_asStatic", false);
        setField(term170344, term170344.getClass(), "_superClass", term170345);
        setField(term170344, term170344.getClass(), "_superInterfaces", null);
        setField(term170344, term170344.getClass(), "_bindings", null);
        setField(term170344, term170344.getClass(), "_canonicalName", null);
        setField(term170344, term170344.getClass(), "_class", null);
        setIntField(term170344, term170344.getClass(), "_hash", 0);
        setField(term170344, term170344.getClass(), "_valueHandler", null);
        setField(term170344, term170344.getClass(), "_typeHandler", null);
        setBooleanField(term170344, term170344.getClass(), "_asStatic", false);
        setField(term170343, term170343.getClass(), "_superClass", term170344);
        setField(term170343, term170343.getClass(), "_superInterfaces", null);
        setField(term170343, term170343.getClass(), "_bindings", null);
        setField(term170343, term170343.getClass(), "_canonicalName", null);
        setField(term170343, term170343.getClass(), "_class", term170354);
        setIntField(term170343, term170343.getClass(), "_hash", 0);
        setField(term170343, term170343.getClass(), "_valueHandler", null);
        setField(term170343, term170343.getClass(), "_typeHandler", null);
        setBooleanField(term170343, term170343.getClass(), "_asStatic", false);
        Class<? extends Object> term169595 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapSerializer");
        term170231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term170119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term170119, term170119.getClass(), "_referencedType", null);
        setField(term170119, term170119.getClass(), "_anchorType", null);
        setField(term170119, term170119.getClass(), "_superClass", null);
        setField(term170119, term170119.getClass(), "_superInterfaces", null);
        setField(term170119, term170119.getClass(), "_bindings", null);
        setField(term170119, term170119.getClass(), "_canonicalName", null);
        setField(term170119, term170119.getClass(), "_class", term169595);
        setIntField(term170119, term170119.getClass(), "_hash", 0);
        setField(term170119, term170119.getClass(), "_valueHandler", null);
        setField(term170119, term170119.getClass(), "_typeHandler", null);
        setBooleanField(term170119, term170119.getClass(), "_asStatic", false);
        setField(term170231, term170231.getClass(), "_inputType", term170119);
        setIntField(term170231, term170231.getClass(), "_kind", 0);
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
        args[1] = term168691;
        args[2] = term169105;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term168691, term170343));
        assertTrue(recursiveEquals(term169105, 0));
        assertTrue(recursiveEquals(retValue, term170231));
    }

};


