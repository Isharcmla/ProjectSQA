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

public class ObjectIdValueProperty_init_189141968753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39085;
     Object term39583;
     Object term47500;
     Object term47508;
     Object term47514;

    public ObjectIdValueProperty_init_189141968753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38867 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term38967 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term38867, term38867.getClass(), "_metadata", term38967);
        setIntField(term38867, term38867.getClass(), "_propertyIndex", 0);
        term39085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term39177 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term39319 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term39483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        setField(term39177, term39177.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term39085, term39085.getClass(), "propertyName", term39177);
        setField(term39085, term39085.getClass(), "_idType", term39319);
        setField(term39085, term39085.getClass(), "_deserializer", term39483);
        term39583 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term47500 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term47501 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term47502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term47503 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term47506 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        Object term47507 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term47502, term47502.getClass(), "_referencedType", null);
        setField(term47502, term47502.getClass(), "_superClass", null);
        setField(term47502, term47502.getClass(), "_superInterfaces", null);
        setField(term47502, term47502.getClass(), "_bindings", null);
        setField(term47502, term47502.getClass(), "_canonicalName", null);
        setField(term47502, term47502.getClass(), "_class", null);
        setIntField(term47502, term47502.getClass(), "_hash", 0);
        setField(term47502, term47502.getClass(), "_valueHandler", null);
        setField(term47502, term47502.getClass(), "_typeHandler", null);
        setBooleanField(term47502, term47502.getClass(), "_asStatic", false);
        setField(term47501, term47501.getClass(), "_idType", term47502);
        setField(term47503, term47503.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term47503, term47503.getClass(), "_namespace", null);
        setField(term47503, term47503.getClass(), "_encodedSimple", null);
        setField(term47501, term47501.getClass(), "propertyName", term47503);
        setField(term47501, term47501.getClass(), "generator", null);
        setField(term47501, term47501.getClass(), "resolver", null);
        setField(term47506, term47506.getClass(), "_valueClass", null);
        setField(term47501, term47501.getClass(), "_deserializer", term47506);
        setField(term47501, term47501.getClass(), "idProperty", null);
        setField(term47500, term47500.getClass(), "_objectIdReader", term47501);
        setField(term47500, term47500.getClass(), "_propName", term47503);
        setField(term47500, term47500.getClass(), "_type", term47502);
        setField(term47500, term47500.getClass(), "_wrapperName", null);
        setField(term47500, term47500.getClass(), "_contextAnnotations", null);
        setField(term47500, term47500.getClass(), "_valueDeserializer", term47506);
        setField(term47500, term47500.getClass(), "_valueTypeDeserializer", null);
        setField(term47500, term47500.getClass(), "_managedReferenceName", null);
        setField(term47500, term47500.getClass(), "_objectIdInfo", null);
        setField(term47500, term47500.getClass(), "_viewMatcher", null);
        setIntField(term47500, term47500.getClass(), "_propertyIndex", -1);
        setField(term47507, term47507.getClass(), "_required", null);
        setField(term47507, term47507.getClass(), "_description", null);
        setField(term47507, term47507.getClass(), "_index", null);
        setField(term47507, term47507.getClass(), "_defaultValue", null);
        setField(term47500, term47500.getClass(), "_metadata", term47507);
        setField(term47500, term47500.getClass(), "_format", null);
        term47508 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term47509 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term47510 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term47513 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        setField(term47509, term47509.getClass(), "_referencedType", null);
        setField(term47509, term47509.getClass(), "_superClass", null);
        setField(term47509, term47509.getClass(), "_superInterfaces", null);
        setField(term47509, term47509.getClass(), "_bindings", null);
        setField(term47509, term47509.getClass(), "_canonicalName", null);
        setField(term47509, term47509.getClass(), "_class", null);
        setIntField(term47509, term47509.getClass(), "_hash", 0);
        setField(term47509, term47509.getClass(), "_valueHandler", null);
        setField(term47509, term47509.getClass(), "_typeHandler", null);
        setBooleanField(term47509, term47509.getClass(), "_asStatic", false);
        setField(term47508, term47508.getClass(), "_idType", term47509);
        setField(term47510, term47510.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term47510, term47510.getClass(), "_namespace", null);
        setField(term47510, term47510.getClass(), "_encodedSimple", null);
        setField(term47508, term47508.getClass(), "propertyName", term47510);
        setField(term47508, term47508.getClass(), "generator", null);
        setField(term47508, term47508.getClass(), "resolver", null);
        setField(term47513, term47513.getClass(), "_valueClass", null);
        setField(term47508, term47508.getClass(), "_deserializer", term47513);
        setField(term47508, term47508.getClass(), "idProperty", null);
        term47514 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term47514, term47514.getClass(), "_required", null);
        setField(term47514, term47514.getClass(), "_description", null);
        setField(term47514, term47514.getClass(), "_index", null);
        setField(term47514, term47514.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term39085;
        args[1] = term39583;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47500));
        assertTrue(recursiveEquals(term39085, term47508));
        assertTrue(recursiveEquals(term39583, term47514));
    }

};


