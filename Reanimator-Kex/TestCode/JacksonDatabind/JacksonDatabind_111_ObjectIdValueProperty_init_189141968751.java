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

public class ObjectIdValueProperty_init_189141968751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24746;
     Object term25214;
     Object term32851;
     Object term32859;
     Object term32865;

    public ObjectIdValueProperty_init_189141968751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24528 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term24628 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term24528, term24528.getClass(), "_metadata", term24628);
        setIntField(term24528, term24528.getClass(), "_propertyIndex", 0);
        term24746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term24838 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term24982 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term25114 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(term24838, term24838.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term24746, term24746.getClass(), "propertyName", term24838);
        setField(term24746, term24746.getClass(), "_idType", term24982);
        setField(term24746, term24746.getClass(), "_deserializer", term25114);
        term25214 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term32851 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term32852 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term32853 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term32854 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term32857 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        Object term32858 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term32853, term32853.getClass(), "_elementType", null);
        setField(term32853, term32853.getClass(), "_superClass", null);
        setField(term32853, term32853.getClass(), "_superInterfaces", null);
        setField(term32853, term32853.getClass(), "_bindings", null);
        setField(term32853, term32853.getClass(), "_canonicalName", null);
        setField(term32853, term32853.getClass(), "_class", null);
        setIntField(term32853, term32853.getClass(), "_hash", 0);
        setField(term32853, term32853.getClass(), "_valueHandler", null);
        setField(term32853, term32853.getClass(), "_typeHandler", null);
        setBooleanField(term32853, term32853.getClass(), "_asStatic", false);
        setField(term32852, term32852.getClass(), "_idType", term32853);
        setField(term32854, term32854.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term32854, term32854.getClass(), "_namespace", null);
        setField(term32854, term32854.getClass(), "_encodedSimple", null);
        setField(term32852, term32852.getClass(), "propertyName", term32854);
        setField(term32852, term32852.getClass(), "generator", null);
        setField(term32852, term32852.getClass(), "resolver", null);
        setField(term32857, term32857.getClass(), "_valueClass", null);
        setField(term32852, term32852.getClass(), "_deserializer", term32857);
        setField(term32852, term32852.getClass(), "idProperty", null);
        setField(term32851, term32851.getClass(), "_objectIdReader", term32852);
        setField(term32851, term32851.getClass(), "_propName", term32854);
        setField(term32851, term32851.getClass(), "_type", term32853);
        setField(term32851, term32851.getClass(), "_wrapperName", null);
        setField(term32851, term32851.getClass(), "_contextAnnotations", null);
        setField(term32851, term32851.getClass(), "_valueDeserializer", term32857);
        setField(term32851, term32851.getClass(), "_valueTypeDeserializer", null);
        setField(term32851, term32851.getClass(), "_nullProvider", term32857);
        setField(term32851, term32851.getClass(), "_managedReferenceName", null);
        setField(term32851, term32851.getClass(), "_objectIdInfo", null);
        setField(term32851, term32851.getClass(), "_viewMatcher", null);
        setIntField(term32851, term32851.getClass(), "_propertyIndex", -1);
        setField(term32858, term32858.getClass(), "_required", null);
        setField(term32858, term32858.getClass(), "_description", null);
        setField(term32858, term32858.getClass(), "_index", null);
        setField(term32858, term32858.getClass(), "_defaultValue", null);
        setField(term32858, term32858.getClass(), "_mergeInfo", null);
        setField(term32858, term32858.getClass(), "_valueNulls", null);
        setField(term32858, term32858.getClass(), "_contentNulls", null);
        setField(term32851, term32851.getClass(), "_metadata", term32858);
        setField(term32851, term32851.getClass(), "_propertyFormat", null);
        setField(term32851, term32851.getClass(), "_aliases", null);
        term32859 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term32860 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term32861 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term32864 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(term32860, term32860.getClass(), "_elementType", null);
        setField(term32860, term32860.getClass(), "_superClass", null);
        setField(term32860, term32860.getClass(), "_superInterfaces", null);
        setField(term32860, term32860.getClass(), "_bindings", null);
        setField(term32860, term32860.getClass(), "_canonicalName", null);
        setField(term32860, term32860.getClass(), "_class", null);
        setIntField(term32860, term32860.getClass(), "_hash", 0);
        setField(term32860, term32860.getClass(), "_valueHandler", null);
        setField(term32860, term32860.getClass(), "_typeHandler", null);
        setBooleanField(term32860, term32860.getClass(), "_asStatic", false);
        setField(term32859, term32859.getClass(), "_idType", term32860);
        setField(term32861, term32861.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term32861, term32861.getClass(), "_namespace", null);
        setField(term32861, term32861.getClass(), "_encodedSimple", null);
        setField(term32859, term32859.getClass(), "propertyName", term32861);
        setField(term32859, term32859.getClass(), "generator", null);
        setField(term32859, term32859.getClass(), "resolver", null);
        setField(term32864, term32864.getClass(), "_valueClass", null);
        setField(term32859, term32859.getClass(), "_deserializer", term32864);
        setField(term32859, term32859.getClass(), "idProperty", null);
        term32865 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term32865, term32865.getClass(), "_required", null);
        setField(term32865, term32865.getClass(), "_description", null);
        setField(term32865, term32865.getClass(), "_index", null);
        setField(term32865, term32865.getClass(), "_defaultValue", null);
        setField(term32865, term32865.getClass(), "_mergeInfo", null);
        setField(term32865, term32865.getClass(), "_valueNulls", null);
        setField(term32865, term32865.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term24746;
        args[1] = term25214;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32851));
        assertTrue(recursiveEquals(term24746, term32859));
        assertTrue(recursiveEquals(term25214, term32865));
    }

};


