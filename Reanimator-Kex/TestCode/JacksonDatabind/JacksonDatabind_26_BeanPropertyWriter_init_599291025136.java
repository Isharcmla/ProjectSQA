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

public class BeanPropertyWriter_init_599291025136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34037;
     Object term34287;
     Object term34429;
     Object term35314;
     Object term35322;
     Object term35326;
     Object term35327;

    public BeanPropertyWriter_init_599291025136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33693 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term33809 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term33909 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term33501 = (Object[]) newArray("java.lang.Class", 0);
        setField(term33693, term33693.getClass(), "_member", null);
        setField(term33693, term33693.getClass(), "_contextAnnotations", term33809);
        setField(term33693, term33693.getClass(), "_name", null);
        setField(term33693, term33693.getClass(), "_wrapperName", null);
        setField(term33693, term33693.getClass(), "_metadata", term33909);
        setField(term33693, term33693.getClass(), "_includeInViews", term33501);
        setField(term33693, term33693.getClass(), "_declaredType", null);
        setField(term33693, term33693.getClass(), "_serializer", null);
        setField(term33693, term33693.getClass(), "_dynamicSerializers", null);
        setField(term33693, term33693.getClass(), "_typeSerializer", null);
        setField(term33693, term33693.getClass(), "_cfgSerializationType", null);
        term34037 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term34129 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term34129, term34129.getClass(), "_simpleName", "");
        setField(term34037, term34037.getClass(), "_name", term34129);
        setBooleanField(term34037, term34037.getClass(), "_forSerialization", false);
        setField(term34037, term34037.getClass(), "_ctorParameters", null);
        setField(term34037, term34037.getClass(), "_setters", null);
        setField(term34037, term34037.getClass(), "_fields", null);
        setField(term34037, term34037.getClass(), "_annotationIntrospector", null);
        term34287 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term34429 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        term35314 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term35315 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term35318 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term35319 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term35320 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        Object term35321 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term35315, term35315.getClass(), "_value", "");
        setField(term35315, term35315.getClass(), "_quotedUTF8Ref", null);
        setField(term35315, term35315.getClass(), "_unquotedUTF8Ref", null);
        setField(term35315, term35315.getClass(), "_quotedChars", null);
        setField(term35315, term35315.getClass(), "_jdkSerializeValue", null);
        setField(term35314, term35314.getClass(), "_name", term35315);
        setField(term35314, term35314.getClass(), "_wrapperName", null);
        setField(term35314, term35314.getClass(), "_declaredType", null);
        setField(term35314, term35314.getClass(), "_cfgSerializationType", null);
        setField(term35314, term35314.getClass(), "_nonTrivialBaseType", null);
        setField(term35314, term35314.getClass(), "_contextAnnotations", null);
        setField(term35318, term35318.getClass(), "_required", null);
        setField(term35318, term35318.getClass(), "_description", null);
        setField(term35318, term35318.getClass(), "_index", null);
        setField(term35318, term35318.getClass(), "_defaultValue", null);
        setField(term35314, term35314.getClass(), "_metadata", term35318);
        setField(term35314, term35314.getClass(), "_format", null);
        setField(term35319, term35319.getClass(), "_method", null);
        setField(term35319, term35319.getClass(), "_paramClasses", null);
        setField(term35319, term35319.getClass(), "_serialization", null);
        setField(term35319, term35319.getClass(), "_paramAnnotations", null);
        setField(term35319, term35319.getClass(), "_context", null);
        setField(term35319, term35319.getClass(), "_annotations", null);
        setField(term35314, term35314.getClass(), "_member", term35319);
        setField(term35314, term35314.getClass(), "_accessorMethod", null);
        setField(term35314, term35314.getClass(), "_field", null);
        setField(term35314, term35314.getClass(), "_serializer", null);
        setField(term35314, term35314.getClass(), "_nullSerializer", null);
        setField(term35320, term35320.getClass(), "_idResolver", null);
        setField(term35320, term35320.getClass(), "_property", null);
        setField(term35314, term35314.getClass(), "_typeSerializer", term35320);
        setBooleanField(term35321, term35321.getClass(), "_resetWhenFull", false);
        setField(term35314, term35314.getClass(), "_dynamicSerializers", term35321);
        setBooleanField(term35314, term35314.getClass(), "_suppressNulls", false);
        setField(term35314, term35314.getClass(), "_suppressableValue", null);
        setField(term35314, term35314.getClass(), "_includeInViews", null);
        setField(term35314, term35314.getClass(), "_internalSettings", null);
        term35322 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term35323 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term35322, term35322.getClass(), "_forSerialization", false);
        setField(term35322, term35322.getClass(), "_annotationIntrospector", null);
        setField(term35323, term35323.getClass(), "_simpleName", "");
        setField(term35323, term35323.getClass(), "_namespace", null);
        setField(term35323, term35323.getClass(), "_encodedSimple", null);
        setField(term35322, term35322.getClass(), "_name", term35323);
        setField(term35322, term35322.getClass(), "_internalName", null);
        setField(term35322, term35322.getClass(), "_fields", null);
        setField(term35322, term35322.getClass(), "_ctorParameters", null);
        setField(term35322, term35322.getClass(), "_getters", null);
        setField(term35322, term35322.getClass(), "_setters", null);
        term35326 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term35326, term35326.getClass(), "_method", null);
        setField(term35326, term35326.getClass(), "_paramClasses", null);
        setField(term35326, term35326.getClass(), "_serialization", null);
        setField(term35326, term35326.getClass(), "_paramAnnotations", null);
        setField(term35326, term35326.getClass(), "_context", null);
        setField(term35326, term35326.getClass(), "_annotations", null);
        term35327 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term35327, term35327.getClass(), "_idResolver", null);
        setField(term35327, term35327.getClass(), "_property", null);
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
        args[0] = term34037;
        args[1] = term34287;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term34429;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35314));
        assertTrue(recursiveEquals(term34037, term35322));
        assertTrue(recursiveEquals(term34287, term35326));
        assertTrue(recursiveEquals(term34429, term35327));
    }

};


