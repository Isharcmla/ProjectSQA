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
     Object term22442;
     Object term26867;
     Object term26874;

    public ObjectIdValueProperty_init_189141968753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22324 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term22324, term22324.getClass(), "_propertyIndex", 0);
        term22442 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term22534 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22678 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term22818 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(term22534, term22534.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term22442, term22442.getClass(), "propertyName", term22534);
        setField(term22442, term22442.getClass(), "_idType", term22678);
        setField(term22442, term22442.getClass(), "_deserializer", term22818);
        term26867 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term26868 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term26869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term26870 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term26873 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(term26869, term26869.getClass(), "_elementType", null);
        setField(term26869, term26869.getClass(), "_canonicalName", null);
        setField(term26869, term26869.getClass(), "_class", null);
        setIntField(term26869, term26869.getClass(), "_hash", 0);
        setField(term26869, term26869.getClass(), "_valueHandler", null);
        setField(term26869, term26869.getClass(), "_typeHandler", null);
        setBooleanField(term26869, term26869.getClass(), "_asStatic", false);
        setField(term26868, term26868.getClass(), "_idType", term26869);
        setField(term26870, term26870.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term26870, term26870.getClass(), "_namespace", null);
        setField(term26870, term26870.getClass(), "_encodedSimple", null);
        setField(term26868, term26868.getClass(), "propertyName", term26870);
        setField(term26868, term26868.getClass(), "generator", null);
        setField(term26868, term26868.getClass(), "resolver", null);
        setIntField(term26873, term26873.getClass(), "_kind", 0);
        setField(term26873, term26873.getClass(), "_valueClass", null);
        setField(term26868, term26868.getClass(), "_deserializer", term26873);
        setField(term26868, term26868.getClass(), "idProperty", null);
        setField(term26867, term26867.getClass(), "_objectIdReader", term26868);
        setField(term26867, term26867.getClass(), "_propName", term26870);
        setField(term26867, term26867.getClass(), "_type", term26869);
        setField(term26867, term26867.getClass(), "_wrapperName", null);
        setField(term26867, term26867.getClass(), "_contextAnnotations", null);
        setField(term26867, term26867.getClass(), "_valueDeserializer", term26873);
        setField(term26867, term26867.getClass(), "_valueTypeDeserializer", null);
        setField(term26867, term26867.getClass(), "_nullProvider", null);
        setField(term26867, term26867.getClass(), "_metadata", null);
        setField(term26867, term26867.getClass(), "_managedReferenceName", null);
        setField(term26867, term26867.getClass(), "_objectIdInfo", null);
        setField(term26867, term26867.getClass(), "_viewMatcher", null);
        setIntField(term26867, term26867.getClass(), "_propertyIndex", -1);
        term26874 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term26875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term26876 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term26879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(term26875, term26875.getClass(), "_elementType", null);
        setField(term26875, term26875.getClass(), "_canonicalName", null);
        setField(term26875, term26875.getClass(), "_class", null);
        setIntField(term26875, term26875.getClass(), "_hash", 0);
        setField(term26875, term26875.getClass(), "_valueHandler", null);
        setField(term26875, term26875.getClass(), "_typeHandler", null);
        setBooleanField(term26875, term26875.getClass(), "_asStatic", false);
        setField(term26874, term26874.getClass(), "_idType", term26875);
        setField(term26876, term26876.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term26876, term26876.getClass(), "_namespace", null);
        setField(term26876, term26876.getClass(), "_encodedSimple", null);
        setField(term26874, term26874.getClass(), "propertyName", term26876);
        setField(term26874, term26874.getClass(), "generator", null);
        setField(term26874, term26874.getClass(), "resolver", null);
        setIntField(term26879, term26879.getClass(), "_kind", 0);
        setField(term26879, term26879.getClass(), "_valueClass", null);
        setField(term26874, term26874.getClass(), "_deserializer", term26879);
        setField(term26874, term26874.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term22442;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26867));
        assertTrue(recursiveEquals(term22442, term26874));
    }

};


