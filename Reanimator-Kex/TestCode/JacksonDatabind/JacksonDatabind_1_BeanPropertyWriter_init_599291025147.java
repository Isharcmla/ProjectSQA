package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57498;
     Object term57802;
     Object term57908;
     Object term58070;
     Object term58487;
     Object term58494;
     Object term58498;
     Object term58499;
     Object term58500;

    public BeanPropertyWriter_init_599291025147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56976 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term57092 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term57190 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term57364 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        setField(term56976, term56976.getClass(), "_member", null);
        setField(term56976, term56976.getClass(), "_contextAnnotations", term57092);
        setField(term56976, term56976.getClass(), "_name", term57190);
        setField(term56976, term56976.getClass(), "_wrapperName", null);
        setField(term56976, term56976.getClass(), "_declaredType", null);
        setField(term56976, term56976.getClass(), "_serializer", term57364);
        setField(term56976, term56976.getClass(), "_dynamicSerializers", null);
        setField(term56976, term56976.getClass(), "_typeSerializer", null);
        setField(term56976, term56976.getClass(), "_cfgSerializationType", null);
        setBooleanField(term56976, term56976.getClass(), "_isRequired", false);
        term57498 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term57684 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term57498, term57498.getClass(), "_name", "");
        setField(term57498, term57498.getClass(), "_introspector", term57684);
        setField(term57498, term57498.getClass(), "_member", null);
        term57802 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term57908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term58070 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ByteArraySerializer"));
        term58487 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term58488 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term58489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58490 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term58493 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ByteArraySerializer"));
        setField(term58488, term58488.getClass(), "_field", null);
        setField(term58488, term58488.getClass(), "_serialization", null);
        setField(term58488, term58488.getClass(), "_annotations", null);
        setField(term58487, term58487.getClass(), "_member", term58488);
        setField(term58487, term58487.getClass(), "_contextAnnotations", null);
        setField(term58489, term58489.getClass(), "_elementType", null);
        setField(term58489, term58489.getClass(), "_canonicalName", null);
        setField(term58489, term58489.getClass(), "_class", null);
        setIntField(term58489, term58489.getClass(), "_hashCode", 0);
        setField(term58489, term58489.getClass(), "_valueHandler", null);
        setField(term58489, term58489.getClass(), "_typeHandler", null);
        setBooleanField(term58489, term58489.getClass(), "_asStatic", false);
        setField(term58487, term58487.getClass(), "_declaredType", term58489);
        setField(term58487, term58487.getClass(), "_accessorMethod", null);
        setField(term58487, term58487.getClass(), "_field", null);
        setField(term58487, term58487.getClass(), "_internalSettings", null);
        setField(term58490, term58490.getClass(), "_value", "");
        setField(term58490, term58490.getClass(), "_quotedUTF8Ref", null);
        setField(term58490, term58490.getClass(), "_unquotedUTF8Ref", null);
        setField(term58490, term58490.getClass(), "_quotedChars", null);
        setField(term58490, term58490.getClass(), "_jdkSerializeValue", null);
        setField(term58487, term58487.getClass(), "_name", term58490);
        setField(term58487, term58487.getClass(), "_wrapperName", null);
        setField(term58487, term58487.getClass(), "_cfgSerializationType", null);
        setField(term58493, term58493.getClass(), "_handledType", null);
        setField(term58487, term58487.getClass(), "_serializer", term58493);
        setField(term58487, term58487.getClass(), "_nullSerializer", null);
        setField(term58487, term58487.getClass(), "_dynamicSerializers", null);
        setBooleanField(term58487, term58487.getClass(), "_suppressNulls", false);
        setField(term58487, term58487.getClass(), "_suppressableValue", null);
        setField(term58487, term58487.getClass(), "_includeInViews", null);
        setField(term58487, term58487.getClass(), "_typeSerializer", null);
        setField(term58487, term58487.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term58487, term58487.getClass(), "_isRequired", false);
        term58494 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term58495 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term58494, term58494.getClass(), "_introspector", term58495);
        setField(term58494, term58494.getClass(), "_member", null);
        setField(term58494, term58494.getClass(), "_name", "");
        term58498 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term58498, term58498.getClass(), "_field", null);
        setField(term58498, term58498.getClass(), "_serialization", null);
        setField(term58498, term58498.getClass(), "_annotations", null);
        term58499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term58499, term58499.getClass(), "_elementType", null);
        setField(term58499, term58499.getClass(), "_canonicalName", null);
        setField(term58499, term58499.getClass(), "_class", null);
        setIntField(term58499, term58499.getClass(), "_hashCode", 0);
        setField(term58499, term58499.getClass(), "_valueHandler", null);
        setField(term58499, term58499.getClass(), "_typeHandler", null);
        setBooleanField(term58499, term58499.getClass(), "_asStatic", false);
        term58500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ByteArraySerializer"));
        setField(term58500, term58500.getClass(), "_handledType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.Object");
        Object[] args = new Object[9];
        args[0] = term57498;
        args[1] = term57802;
        args[2] = null;
        args[3] = term57908;
        args[4] = term58070;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58487));
        assertTrue(recursiveEquals(term57498, term58494));
        assertTrue(recursiveEquals(term57802, term58498));
        assertTrue(recursiveEquals(term57908, term58499));
        assertTrue(recursiveEquals(term58070, term58500));
    }

};
