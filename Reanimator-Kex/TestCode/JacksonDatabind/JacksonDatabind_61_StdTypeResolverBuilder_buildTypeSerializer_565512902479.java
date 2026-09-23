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
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542892;
     Object term543294;
     Object term544804;
     Object term544811;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term544821 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term544820 = ((Class) term544821).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term544820).setAccessible(true);
        Object enum599 = ((Field) term544820).get((Object) null);
        Class<? extends Object> term545182 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term545181 = ((Class) term545182).getDeclaredField((String) "NONE");
        ((Field) term545181).setAccessible(true);
        Object enum600 = ((Field) term545181).get((Object) null);
        term542892 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term542892, term542892.getClass(), "_appliesFor", enum599);
        setField(term542892, term542892.getClass(), "_idType", enum600);
        Class<? extends Object> term543422 = Class.forName((String) "java.util.concurrent.atomic.DoubleAdder$SerializationProxy");
        term543294 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term543386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term543386, term543386.getClass(), "_class", term543422);
        setField(term543294, term543294.getClass(), "_referencedType", term543386);
        Class<? extends Object> term545617 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term545616 = ((Class) term545617).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term545616).setAccessible(true);
        Object enum601 = ((Field) term545616).get((Object) null);
        Class<? extends Object> term545978 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term545977 = ((Class) term545978).getDeclaredField((String) "NONE");
        ((Field) term545977).setAccessible(true);
        Object enum602 = ((Field) term545977).get((Object) null);
        term544804 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term544804, term544804.getClass(), "_appliesFor", enum601);
        setField(term544804, term544804.getClass(), "_idType", enum602);
        setField(term544804, term544804.getClass(), "_includeAs", null);
        setField(term544804, term544804.getClass(), "_typeProperty", null);
        setBooleanField(term544804, term544804.getClass(), "_typeIdVisible", false);
        setField(term544804, term544804.getClass(), "_defaultImpl", null);
        setField(term544804, term544804.getClass(), "_customIdResolver", null);
        Class<? extends Object> term544813 = Class.forName((String) "com.fasterxml.jackson.databind.ser.Serializers");
        term544811 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term544812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term544812, term544812.getClass(), "_keyType", null);
        setField(term544812, term544812.getClass(), "_valueType", null);
        setField(term544812, term544812.getClass(), "_superClass", null);
        setField(term544812, term544812.getClass(), "_superInterfaces", null);
        setField(term544812, term544812.getClass(), "_bindings", null);
        setField(term544812, term544812.getClass(), "_canonicalName", null);
        setField(term544812, term544812.getClass(), "_class", term544813);
        setIntField(term544812, term544812.getClass(), "_hash", 0);
        setField(term544812, term544812.getClass(), "_valueHandler", null);
        setField(term544812, term544812.getClass(), "_typeHandler", null);
        setBooleanField(term544812, term544812.getClass(), "_asStatic", false);
        setField(term544811, term544811.getClass(), "_referencedType", term544812);
        setField(term544811, term544811.getClass(), "_anchorType", null);
        setField(term544811, term544811.getClass(), "_superClass", null);
        setField(term544811, term544811.getClass(), "_superInterfaces", null);
        setField(term544811, term544811.getClass(), "_bindings", null);
        setField(term544811, term544811.getClass(), "_canonicalName", null);
        setField(term544811, term544811.getClass(), "_class", null);
        setIntField(term544811, term544811.getClass(), "_hash", 0);
        setField(term544811, term544811.getClass(), "_valueHandler", null);
        setField(term544811, term544811.getClass(), "_typeHandler", null);
        setBooleanField(term544811, term544811.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term543294;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term542892, args);
        assertTrue(recursiveEquals(term542892, term544804));
        assertTrue(recursiveEquals(term543294, null));
    }

};


