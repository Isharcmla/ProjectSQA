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

public class JavaUtilCollectionsDeserializers_converter_180689703133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79807;
     Object term79967;
     Object term80740;
     Object term80747;
     Object term80616;

    public JavaUtilCollectionsDeserializers_converter_180689703133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79967 = Class.forName((String) "java.util.EventListenerProxy");
        term79807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term79913 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79807, term79807.getClass(), "_class", null);
        setField(term79913, term79913.getClass(), "_class", term79967);
        setField(term79807, term79807.getClass(), "_superClass", term79913);
        term80740 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term80749 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        term80747 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term80748 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term80747, term80747.getClass(), "_keyType", null);
        setField(term80747, term80747.getClass(), "_valueType", null);
        setField(term80748, term80748.getClass(), "_elementType", null);
        setField(term80748, term80748.getClass(), "_superClass", null);
        setField(term80748, term80748.getClass(), "_superInterfaces", null);
        setField(term80748, term80748.getClass(), "_bindings", null);
        setField(term80748, term80748.getClass(), "_canonicalName", null);
        setField(term80748, term80748.getClass(), "_class", term80749);
        setIntField(term80748, term80748.getClass(), "_hash", 0);
        setField(term80748, term80748.getClass(), "_valueHandler", null);
        setField(term80748, term80748.getClass(), "_typeHandler", null);
        setBooleanField(term80748, term80748.getClass(), "_asStatic", false);
        setField(term80747, term80747.getClass(), "_superClass", term80748);
        setField(term80747, term80747.getClass(), "_superInterfaces", null);
        setField(term80747, term80747.getClass(), "_bindings", null);
        setField(term80747, term80747.getClass(), "_canonicalName", null);
        setField(term80747, term80747.getClass(), "_class", null);
        setIntField(term80747, term80747.getClass(), "_hash", 0);
        setField(term80747, term80747.getClass(), "_valueHandler", null);
        setField(term80747, term80747.getClass(), "_typeHandler", null);
        setBooleanField(term80747, term80747.getClass(), "_asStatic", false);
        Class<? extends Object> term80336 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        term80616 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term80611 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term80611, term80611.getClass(), "_elementType", null);
        setField(term80611, term80611.getClass(), "_superClass", null);
        setField(term80611, term80611.getClass(), "_superInterfaces", null);
        setField(term80611, term80611.getClass(), "_bindings", null);
        setField(term80611, term80611.getClass(), "_canonicalName", null);
        setField(term80611, term80611.getClass(), "_class", term80336);
        setIntField(term80611, term80611.getClass(), "_hash", 0);
        setField(term80611, term80611.getClass(), "_valueHandler", null);
        setField(term80611, term80611.getClass(), "_typeHandler", null);
        setBooleanField(term80611, term80611.getClass(), "_asStatic", false);
        setField(term80616, term80616.getClass(), "_inputType", term80611);
        setIntField(term80616, term80616.getClass(), "_kind", 0);
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
        args[1] = term79807;
        args[2] = term79967;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term79807, term80747));
        assertTrue(recursiveEquals(term79967, 0));
        assertTrue(recursiveEquals(retValue, term80616));
    }

};


