package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class AsWrapperTypeDeserializer_init_198407507391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78810;
     Object term79162;
     Object term80693;
     Object term80710;
     Object term80720;

    public AsWrapperTypeDeserializer_init_198407507391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78704 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term78704, term78704.getClass(), "_baseType", null);
        setField(term78704, term78704.getClass(), "_idResolver", null);
        setField(term78704, term78704.getClass(), "_typePropertyName", null);
        setBooleanField(term78704, term78704.getClass(), "_typeIdVisible", false);
        setField(term78704, term78704.getClass(), "_deserializers", null);
        term78810 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term78902 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term78994 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term79126 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term78810, term78810.getClass(), "_class", null);
        setIntField(term78902, term78902.getClass(), "_hash", 80);
        setField(term78810, term78810.getClass(), "_elementType", term78902);
        setBooleanField(term78810, term78810.getClass(), "_asStatic", true);
        setField(term78810, term78810.getClass(), "_valueHandler", term78994);
        setField(term78810, term78810.getClass(), "_typeHandler", term79126);
        term79162 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<? extends Object> term80699 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        HashMap term80709 = new HashMap();
        term80693 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term80694 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term80695 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term80696 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term80697 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        Object term80698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term80693, term80693.getClass(), "_idResolver", null);
        setField(term80695, term80695.getClass(), "_keyType", null);
        setField(term80695, term80695.getClass(), "_valueType", null);
        setField(term80695, term80695.getClass(), "_canonicalName", null);
        setField(term80695, term80695.getClass(), "_class", null);
        setIntField(term80695, term80695.getClass(), "_hash", 80);
        setField(term80695, term80695.getClass(), "_valueHandler", null);
        setField(term80695, term80695.getClass(), "_typeHandler", null);
        setBooleanField(term80695, term80695.getClass(), "_asStatic", false);
        setField(term80694, term80694.getClass(), "_elementType", term80695);
        setField(term80694, term80694.getClass(), "_canonicalName", null);
        setField(term80694, term80694.getClass(), "_class", null);
        setIntField(term80694, term80694.getClass(), "_hash", 0);
        setField(term80696, term80696.getClass(), "_keyType", null);
        setField(term80696, term80696.getClass(), "_valueType", null);
        setField(term80696, term80696.getClass(), "_canonicalName", null);
        setField(term80696, term80696.getClass(), "_class", null);
        setIntField(term80696, term80696.getClass(), "_hash", 0);
        setField(term80696, term80696.getClass(), "_valueHandler", null);
        setField(term80696, term80696.getClass(), "_typeHandler", null);
        setBooleanField(term80696, term80696.getClass(), "_asStatic", false);
        setField(term80694, term80694.getClass(), "_valueHandler", term80696);
        setField(term80697, term80697.getClass(), "_config", null);
        setField(term80697, term80697.getClass(), "_typeToId", null);
        setField(term80697, term80697.getClass(), "_idToType", null);
        setField(term80697, term80697.getClass(), "_typeFactory", null);
        setField(term80697, term80697.getClass(), "_baseType", null);
        setField(term80694, term80694.getClass(), "_typeHandler", term80697);
        setBooleanField(term80694, term80694.getClass(), "_asStatic", true);
        setField(term80693, term80693.getClass(), "_baseType", term80694);
        setField(term80693, term80693.getClass(), "_property", null);
        setField(term80698, term80698.getClass(), "_elementType", term80695);
        setField(term80698, term80698.getClass(), "_canonicalName", null);
        setField(term80698, term80698.getClass(), "_class", term80699);
        setIntField(term80698, term80698.getClass(), "_hash", 1352964372);
        setField(term80698, term80698.getClass(), "_valueHandler", term80696);
        setField(term80698, term80698.getClass(), "_typeHandler", term80697);
        setBooleanField(term80698, term80698.getClass(), "_asStatic", true);
        setField(term80693, term80693.getClass(), "_defaultImpl", term80698);
        setField(term80693, term80693.getClass(), "_typePropertyName", null);
        setBooleanField(term80693, term80693.getClass(), "_typeIdVisible", true);
        setField(term80693, term80693.getClass(), "_deserializers", term80709);
        setField(term80693, term80693.getClass(), "_defaultImplDeserializer", null);
        term80710 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        term80720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term80721 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term80722 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term80723 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term80721, term80721.getClass(), "_keyType", null);
        setField(term80721, term80721.getClass(), "_valueType", null);
        setField(term80721, term80721.getClass(), "_canonicalName", null);
        setField(term80721, term80721.getClass(), "_class", null);
        setIntField(term80721, term80721.getClass(), "_hash", 80);
        setField(term80721, term80721.getClass(), "_valueHandler", null);
        setField(term80721, term80721.getClass(), "_typeHandler", null);
        setBooleanField(term80721, term80721.getClass(), "_asStatic", false);
        setField(term80720, term80720.getClass(), "_elementType", term80721);
        setField(term80720, term80720.getClass(), "_canonicalName", null);
        setField(term80720, term80720.getClass(), "_class", null);
        setIntField(term80720, term80720.getClass(), "_hash", 0);
        setField(term80722, term80722.getClass(), "_keyType", null);
        setField(term80722, term80722.getClass(), "_valueType", null);
        setField(term80722, term80722.getClass(), "_canonicalName", null);
        setField(term80722, term80722.getClass(), "_class", null);
        setIntField(term80722, term80722.getClass(), "_hash", 0);
        setField(term80722, term80722.getClass(), "_valueHandler", null);
        setField(term80722, term80722.getClass(), "_typeHandler", null);
        setBooleanField(term80722, term80722.getClass(), "_asStatic", false);
        setField(term80720, term80720.getClass(), "_valueHandler", term80722);
        setField(term80723, term80723.getClass(), "_config", null);
        setField(term80723, term80723.getClass(), "_typeToId", null);
        setField(term80723, term80723.getClass(), "_idToType", null);
        setField(term80723, term80723.getClass(), "_typeFactory", null);
        setField(term80723, term80723.getClass(), "_baseType", null);
        setField(term80720, term80720.getClass(), "_typeHandler", term80723);
        setBooleanField(term80720, term80720.getClass(), "_asStatic", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term78810;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term79162;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80693));
        assertTrue(recursiveEquals(term78810, term80710));
        assertTrue(recursiveEquals(term79162, true));
    }

};


