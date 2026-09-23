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

public class SetterlessProperty_init_130687642983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31326;
     Object term31546;
     Object term32004;
     Object term32007;
     Object term32009;

    public SetterlessProperty_init_130687642983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30772 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term30872 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term30976 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term31068 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term31200 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(term30772, term30772.getClass(), "_metadata", term30872);
        setField(term30772, term30772.getClass(), "_propertyFormat", term30976);
        setIntField(term30772, term30772.getClass(), "_propertyIndex", 0);
        setField(term30772, term30772.getClass(), "_propName", term31068);
        setField(term30772, term30772.getClass(), "_type", null);
        setField(term30772, term30772.getClass(), "_wrapperName", null);
        setField(term30772, term30772.getClass(), "_contextAnnotations", null);
        setField(term30772, term30772.getClass(), "_valueTypeDeserializer", null);
        setField(term30772, term30772.getClass(), "_managedReferenceName", null);
        setField(term30772, term30772.getClass(), "_valueDeserializer", term31200);
        setField(term30772, term30772.getClass(), "_viewMatcher", null);
        term31326 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term31418 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term31326, term31326.getClass(), "_metadata", null);
        setField(term31326, term31326.getClass(), "_propertyFormat", null);
        setField(term31326, term31326.getClass(), "_propName", null);
        setField(term31326, term31326.getClass(), "_type", term31418);
        setField(term31326, term31326.getClass(), "_wrapperName", null);
        setField(term31326, term31326.getClass(), "_contextAnnotations", null);
        setField(term31326, term31326.getClass(), "_valueTypeDeserializer", null);
        setField(term31326, term31326.getClass(), "_managedReferenceName", null);
        setIntField(term31326, term31326.getClass(), "_propertyIndex", 0);
        setField(term31326, term31326.getClass(), "_viewMatcher", null);
        term31546 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        term32004 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term32005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term32006 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(term32004, term32004.getClass(), "_annotated", null);
        setField(term32004, term32004.getClass(), "_getter", null);
        setField(term32004, term32004.getClass(), "_propName", null);
        setField(term32005, term32005.getClass(), "_keyType", null);
        setField(term32005, term32005.getClass(), "_valueType", null);
        setField(term32005, term32005.getClass(), "_superClass", null);
        setField(term32005, term32005.getClass(), "_superInterfaces", null);
        setField(term32005, term32005.getClass(), "_bindings", null);
        setField(term32005, term32005.getClass(), "_canonicalName", null);
        setField(term32005, term32005.getClass(), "_class", null);
        setIntField(term32005, term32005.getClass(), "_hash", 0);
        setField(term32005, term32005.getClass(), "_valueHandler", null);
        setField(term32005, term32005.getClass(), "_typeHandler", null);
        setBooleanField(term32005, term32005.getClass(), "_asStatic", false);
        setField(term32004, term32004.getClass(), "_type", term32005);
        setField(term32004, term32004.getClass(), "_wrapperName", null);
        setField(term32004, term32004.getClass(), "_contextAnnotations", null);
        setField(term32006, term32006.getClass(), "_supportsUpdates", null);
        setField(term32006, term32006.getClass(), "_valueClass", null);
        setField(term32004, term32004.getClass(), "_valueDeserializer", term32006);
        setField(term32004, term32004.getClass(), "_valueTypeDeserializer", null);
        setField(term32004, term32004.getClass(), "_nullProvider", null);
        setField(term32004, term32004.getClass(), "_managedReferenceName", null);
        setField(term32004, term32004.getClass(), "_objectIdInfo", null);
        setField(term32004, term32004.getClass(), "_viewMatcher", null);
        setIntField(term32004, term32004.getClass(), "_propertyIndex", 0);
        setField(term32004, term32004.getClass(), "_metadata", null);
        setField(term32004, term32004.getClass(), "_propertyFormat", null);
        setField(term32004, term32004.getClass(), "_aliases", null);
        term32007 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term32008 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32007, term32007.getClass(), "_annotated", null);
        setField(term32007, term32007.getClass(), "_getter", null);
        setField(term32007, term32007.getClass(), "_propName", null);
        setField(term32008, term32008.getClass(), "_keyType", null);
        setField(term32008, term32008.getClass(), "_valueType", null);
        setField(term32008, term32008.getClass(), "_superClass", null);
        setField(term32008, term32008.getClass(), "_superInterfaces", null);
        setField(term32008, term32008.getClass(), "_bindings", null);
        setField(term32008, term32008.getClass(), "_canonicalName", null);
        setField(term32008, term32008.getClass(), "_class", null);
        setIntField(term32008, term32008.getClass(), "_hash", 0);
        setField(term32008, term32008.getClass(), "_valueHandler", null);
        setField(term32008, term32008.getClass(), "_typeHandler", null);
        setBooleanField(term32008, term32008.getClass(), "_asStatic", false);
        setField(term32007, term32007.getClass(), "_type", term32008);
        setField(term32007, term32007.getClass(), "_wrapperName", null);
        setField(term32007, term32007.getClass(), "_contextAnnotations", null);
        setField(term32007, term32007.getClass(), "_valueDeserializer", null);
        setField(term32007, term32007.getClass(), "_valueTypeDeserializer", null);
        setField(term32007, term32007.getClass(), "_nullProvider", null);
        setField(term32007, term32007.getClass(), "_managedReferenceName", null);
        setField(term32007, term32007.getClass(), "_objectIdInfo", null);
        setField(term32007, term32007.getClass(), "_viewMatcher", null);
        setIntField(term32007, term32007.getClass(), "_propertyIndex", 0);
        setField(term32007, term32007.getClass(), "_metadata", null);
        setField(term32007, term32007.getClass(), "_propertyFormat", null);
        setField(term32007, term32007.getClass(), "_aliases", null);
        term32009 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(term32009, term32009.getClass(), "_supportsUpdates", null);
        setField(term32009, term32009.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term31326;
        args[1] = term31546;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32004));
        assertTrue(recursiveEquals(term31326, term32007));
        assertTrue(recursiveEquals(term31546, term32009));
    }

};


