package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109422;
     Object term109562;
     Object term109668;
     Object term109764;
     Object term109870;
     Object term110324;
     Object term110355;
     Object term110356;
     Object term110357;
     Object term110383;
     Object term110384;

    public MapLikeType_init_1153958894233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109386 = Class.forName((String) "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base");
        Object term109350 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term109350, term109350.getClass(), "_class", term109386);
        setIntField(term109350, term109350.getClass(), "_hash", 0);
        setField(term109350, term109350.getClass(), "_valueHandler", null);
        setField(term109350, term109350.getClass(), "_typeHandler", null);
        setBooleanField(term109350, term109350.getClass(), "_asStatic", false);
        term109422 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        term109562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term109668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term109668, term109668.getClass(), "_hash", 0);
        term109764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term109764, term109764.getClass(), "_hash", 0);
        term109870 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Class<? extends Object> term110328 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        term110324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term110325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term110326 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term110327 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object term110354 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term110325, term110325.getClass(), "_elementType", null);
        setField(term110325, term110325.getClass(), "_superClass", null);
        setField(term110325, term110325.getClass(), "_superInterfaces", null);
        setField(term110325, term110325.getClass(), "_bindings", null);
        setField(term110325, term110325.getClass(), "_canonicalName", null);
        setField(term110325, term110325.getClass(), "_class", null);
        setIntField(term110325, term110325.getClass(), "_hash", 0);
        setField(term110325, term110325.getClass(), "_valueHandler", null);
        setField(term110325, term110325.getClass(), "_typeHandler", null);
        setBooleanField(term110325, term110325.getClass(), "_asStatic", false);
        setField(term110324, term110324.getClass(), "_keyType", term110325);
        setField(term110326, term110326.getClass(), "_componentType", null);
        setField(term110326, term110326.getClass(), "_emptyArray", null);
        setField(term110326, term110326.getClass(), "_superClass", null);
        setField(term110326, term110326.getClass(), "_superInterfaces", null);
        setField(term110326, term110326.getClass(), "_bindings", null);
        setField(term110326, term110326.getClass(), "_canonicalName", null);
        setField(term110326, term110326.getClass(), "_class", null);
        setIntField(term110326, term110326.getClass(), "_hash", 0);
        setField(term110326, term110326.getClass(), "_valueHandler", null);
        setField(term110326, term110326.getClass(), "_typeHandler", null);
        setBooleanField(term110326, term110326.getClass(), "_asStatic", false);
        setField(term110324, term110324.getClass(), "_valueType", term110326);
        setField(term110324, term110324.getClass(), "_superClass", null);
        setField(term110324, term110324.getClass(), "_superInterfaces", null);
        setField(term110327, term110327.getClass(), "_names", null);
        setField(term110327, term110327.getClass(), "_types", null);
        setField(term110327, term110327.getClass(), "_unboundVariables", null);
        setIntField(term110327, term110327.getClass(), "_hashCode", 0);
        setField(term110324, term110324.getClass(), "_bindings", term110327);
        setField(term110324, term110324.getClass(), "_canonicalName", null);
        setField(term110324, term110324.getClass(), "_class", term110328);
        setIntField(term110324, term110324.getClass(), "_hash", -437922312);
        setField(term110354, term110354.getClass(), "_elementType", null);
        setField(term110354, term110354.getClass(), "_superClass", null);
        setField(term110354, term110354.getClass(), "_superInterfaces", null);
        setField(term110354, term110354.getClass(), "_bindings", null);
        setField(term110354, term110354.getClass(), "_canonicalName", null);
        setField(term110354, term110354.getClass(), "_class", null);
        setIntField(term110354, term110354.getClass(), "_hash", 0);
        setField(term110354, term110354.getClass(), "_valueHandler", null);
        setField(term110354, term110354.getClass(), "_typeHandler", null);
        setBooleanField(term110354, term110354.getClass(), "_asStatic", false);
        setField(term110324, term110324.getClass(), "_valueHandler", term110354);
        setField(term110324, term110324.getClass(), "_typeHandler", null);
        setBooleanField(term110324, term110324.getClass(), "_asStatic", true);
        term110355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term110355, term110355.getClass(), "_elementType", null);
        setField(term110355, term110355.getClass(), "_superClass", null);
        setField(term110355, term110355.getClass(), "_superInterfaces", null);
        setField(term110355, term110355.getClass(), "_bindings", null);
        setField(term110355, term110355.getClass(), "_canonicalName", null);
        setField(term110355, term110355.getClass(), "_class", null);
        setIntField(term110355, term110355.getClass(), "_hash", 0);
        setField(term110355, term110355.getClass(), "_valueHandler", null);
        setField(term110355, term110355.getClass(), "_typeHandler", null);
        setBooleanField(term110355, term110355.getClass(), "_asStatic", false);
        term110356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term110356, term110356.getClass(), "_componentType", null);
        setField(term110356, term110356.getClass(), "_emptyArray", null);
        setField(term110356, term110356.getClass(), "_superClass", null);
        setField(term110356, term110356.getClass(), "_superInterfaces", null);
        setField(term110356, term110356.getClass(), "_bindings", null);
        setField(term110356, term110356.getClass(), "_canonicalName", null);
        setField(term110356, term110356.getClass(), "_class", null);
        setIntField(term110356, term110356.getClass(), "_hash", 0);
        setField(term110356, term110356.getClass(), "_valueHandler", null);
        setField(term110356, term110356.getClass(), "_typeHandler", null);
        setBooleanField(term110356, term110356.getClass(), "_asStatic", false);
        term110357 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        term110383 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term110383, term110383.getClass(), "_elementType", null);
        setField(term110383, term110383.getClass(), "_superClass", null);
        setField(term110383, term110383.getClass(), "_superInterfaces", null);
        setField(term110383, term110383.getClass(), "_bindings", null);
        setField(term110383, term110383.getClass(), "_canonicalName", null);
        setField(term110383, term110383.getClass(), "_class", null);
        setIntField(term110383, term110383.getClass(), "_hash", 0);
        setField(term110383, term110383.getClass(), "_valueHandler", null);
        setField(term110383, term110383.getClass(), "_typeHandler", null);
        setBooleanField(term110383, term110383.getClass(), "_asStatic", false);
        term110384 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term110384, term110384.getClass(), "_names", null);
        setField(term110384, term110384.getClass(), "_types", null);
        setField(term110384, term110384.getClass(), "_unboundVariables", null);
        setIntField(term110384, term110384.getClass(), "_hashCode", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term109422;
        args[1] = term109562;
        args[2] = null;
        args[3] = null;
        args[4] = term109668;
        args[5] = term109764;
        args[6] = term109870;
        args[7] = null;
        args[8] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110324));
        assertTrue(recursiveEquals(term109422, term110355));
        assertTrue(recursiveEquals(term109562, term110356));
        assertTrue(recursiveEquals(term109668, null));
        assertTrue(recursiveEquals(term109764, true));
        assertTrue(recursiveEquals(term109870, term110384));
    }

};


