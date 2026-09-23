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

public class BeanPropertyWriter_init_599291025442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289861;
     Object term290257;
     Object term290353;
     Object term290390;
     Object term290397;
     Object term290402;
     Object term290403;

    public BeanPropertyWriter_init_599291025442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term289255 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term289347 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term289447 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term289585 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer"));
        Object term289727 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single"));
        setField(term289255, term289255.getClass(), "_member", null);
        setField(term289255, term289255.getClass(), "_contextAnnotations", null);
        setField(term289255, term289255.getClass(), "_name", null);
        setField(term289255, term289255.getClass(), "_wrapperName", term289347);
        setField(term289255, term289255.getClass(), "_metadata", term289447);
        setField(term289255, term289255.getClass(), "_includeInViews", null);
        setField(term289255, term289255.getClass(), "_declaredType", null);
        setField(term289255, term289255.getClass(), "_serializer", term289585);
        setField(term289255, term289255.getClass(), "_dynamicSerializers", term289727);
        setField(term289255, term289255.getClass(), "_typeSerializer", null);
        setField(term289255, term289255.getClass(), "_cfgSerializationType", null);
        term289861 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term289953 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term290139 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term289953, term289953.getClass(), "_simpleName", "");
        setField(term289861, term289861.getClass(), "_fullName", term289953);
        setField(term289861, term289861.getClass(), "_introspector", term290139);
        setField(term289861, term289861.getClass(), "_member", null);
        setField(term289861, term289861.getClass(), "_metadata", null);
        term290257 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term290353 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term290390 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term290391 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term290394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term290395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term290396 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term290391, term290391.getClass(), "_value", "");
        setField(term290391, term290391.getClass(), "_quotedUTF8Ref", null);
        setField(term290391, term290391.getClass(), "_unquotedUTF8Ref", null);
        setField(term290391, term290391.getClass(), "_quotedChars", null);
        setField(term290391, term290391.getClass(), "_jdkSerializeValue", null);
        setField(term290390, term290390.getClass(), "_name", term290391);
        setField(term290390, term290390.getClass(), "_wrapperName", null);
        setField(term290394, term290394.getClass(), "_componentType", null);
        setField(term290394, term290394.getClass(), "_emptyArray", null);
        setField(term290394, term290394.getClass(), "_canonicalName", null);
        setField(term290394, term290394.getClass(), "_class", null);
        setIntField(term290394, term290394.getClass(), "_hash", 0);
        setField(term290394, term290394.getClass(), "_valueHandler", null);
        setField(term290394, term290394.getClass(), "_typeHandler", null);
        setBooleanField(term290394, term290394.getClass(), "_asStatic", false);
        setField(term290390, term290390.getClass(), "_declaredType", term290394);
        setField(term290390, term290390.getClass(), "_cfgSerializationType", null);
        setField(term290390, term290390.getClass(), "_nonTrivialBaseType", null);
        setField(term290390, term290390.getClass(), "_contextAnnotations", null);
        setField(term290390, term290390.getClass(), "_metadata", null);
        setField(term290390, term290390.getClass(), "_format", null);
        setField(term290395, term290395.getClass(), "_field", null);
        setField(term290395, term290395.getClass(), "_serialization", null);
        setField(term290395, term290395.getClass(), "_context", null);
        setField(term290395, term290395.getClass(), "_annotations", null);
        setField(term290390, term290390.getClass(), "_member", term290395);
        setField(term290390, term290390.getClass(), "_accessorMethod", null);
        setField(term290390, term290390.getClass(), "_field", null);
        setField(term290390, term290390.getClass(), "_serializer", null);
        setField(term290390, term290390.getClass(), "_nullSerializer", null);
        setField(term290390, term290390.getClass(), "_typeSerializer", null);
        setBooleanField(term290396, term290396.getClass(), "_resetWhenFull", false);
        setField(term290390, term290390.getClass(), "_dynamicSerializers", term290396);
        setBooleanField(term290390, term290390.getClass(), "_suppressNulls", false);
        setField(term290390, term290390.getClass(), "_suppressableValue", null);
        setField(term290390, term290390.getClass(), "_includeInViews", null);
        setField(term290390, term290390.getClass(), "_internalSettings", null);
        term290397 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term290398 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term290399 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term290397, term290397.getClass(), "_introspector", term290398);
        setField(term290397, term290397.getClass(), "_member", null);
        setField(term290397, term290397.getClass(), "_metadata", null);
        setField(term290399, term290399.getClass(), "_simpleName", "");
        setField(term290399, term290399.getClass(), "_namespace", null);
        setField(term290399, term290399.getClass(), "_encodedSimple", null);
        setField(term290397, term290397.getClass(), "_fullName", term290399);
        setField(term290397, term290397.getClass(), "_inclusion", null);
        setField(term290397, term290397.getClass(), "_name", null);
        term290402 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term290402, term290402.getClass(), "_field", null);
        setField(term290402, term290402.getClass(), "_serialization", null);
        setField(term290402, term290402.getClass(), "_context", null);
        setField(term290402, term290402.getClass(), "_annotations", null);
        term290403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term290403, term290403.getClass(), "_componentType", null);
        setField(term290403, term290403.getClass(), "_emptyArray", null);
        setField(term290403, term290403.getClass(), "_canonicalName", null);
        setField(term290403, term290403.getClass(), "_class", null);
        setIntField(term290403, term290403.getClass(), "_hash", 0);
        setField(term290403, term290403.getClass(), "_valueHandler", null);
        setField(term290403, term290403.getClass(), "_typeHandler", null);
        setBooleanField(term290403, term290403.getClass(), "_asStatic", false);
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
        args[0] = term289861;
        args[1] = term290257;
        args[2] = null;
        args[3] = term290353;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term290390));
        assertTrue(recursiveEquals(term289861, term290397));
        assertTrue(recursiveEquals(term290257, term290402));
        assertTrue(recursiveEquals(term290353, term290403));
    }

};


