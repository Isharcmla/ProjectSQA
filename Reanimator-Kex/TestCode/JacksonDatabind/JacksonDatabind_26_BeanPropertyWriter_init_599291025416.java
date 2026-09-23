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

public class BeanPropertyWriter_init_599291025416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265433;
     Object term265967;
     Object term266083;
     Object term266175;
     Object term266314;
     Object term266323;
     Object term266329;
     Object term266330;
     Object term266331;

    public BeanPropertyWriter_init_599291025416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term265145 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term264906 = (Object[]) newArray("java.lang.Class", 0);
        Object term265305 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        setField(term265145, term265145.getClass(), "_member", null);
        setField(term265145, term265145.getClass(), "_contextAnnotations", null);
        setField(term265145, term265145.getClass(), "_name", null);
        setField(term265145, term265145.getClass(), "_wrapperName", null);
        setField(term265145, term265145.getClass(), "_metadata", null);
        setField(term265145, term265145.getClass(), "_includeInViews", term264906);
        setField(term265145, term265145.getClass(), "_declaredType", null);
        setField(term265145, term265145.getClass(), "_serializer", null);
        setField(term265145, term265145.getClass(), "_dynamicSerializers", null);
        setField(term265145, term265145.getClass(), "_typeSerializer", term265305);
        setField(term265145, term265145.getClass(), "_cfgSerializationType", null);
        term265433 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term265525 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term265705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term265849 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term265525, term265525.getClass(), "_simpleName", "");
        setField(term265433, term265433.getClass(), "_name", term265525);
        setBooleanField(term265433, term265433.getClass(), "_forSerialization", true);
        setField(term265433, term265433.getClass(), "_getters", null);
        setField(term265705, term265705.getClass(), "value", null);
        setField(term265705, term265705.getClass(), "next", null);
        setField(term265433, term265433.getClass(), "_fields", term265705);
        setField(term265433, term265433.getClass(), "_annotationIntrospector", term265849);
        term265967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term266083 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term266175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term266314 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term266315 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term266318 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term266319 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term266320 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term266321 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term266322 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term266315, term266315.getClass(), "_value", "");
        setField(term266315, term266315.getClass(), "_quotedUTF8Ref", null);
        setField(term266315, term266315.getClass(), "_unquotedUTF8Ref", null);
        setField(term266315, term266315.getClass(), "_quotedChars", null);
        setField(term266315, term266315.getClass(), "_jdkSerializeValue", null);
        setField(term266314, term266314.getClass(), "_name", term266315);
        setField(term266314, term266314.getClass(), "_wrapperName", null);
        setField(term266314, term266314.getClass(), "_declaredType", null);
        setField(term266318, term266318.getClass(), "_keyType", null);
        setField(term266318, term266318.getClass(), "_valueType", null);
        setField(term266318, term266318.getClass(), "_canonicalName", null);
        setField(term266318, term266318.getClass(), "_class", null);
        setIntField(term266318, term266318.getClass(), "_hash", 0);
        setField(term266318, term266318.getClass(), "_valueHandler", null);
        setField(term266318, term266318.getClass(), "_typeHandler", null);
        setBooleanField(term266318, term266318.getClass(), "_asStatic", false);
        setField(term266314, term266314.getClass(), "_cfgSerializationType", term266318);
        setField(term266314, term266314.getClass(), "_nonTrivialBaseType", null);
        setField(term266319, term266319.getClass(), "_annotations", null);
        setField(term266314, term266314.getClass(), "_contextAnnotations", term266319);
        setField(term266320, term266320.getClass(), "_required", null);
        setField(term266320, term266320.getClass(), "_description", null);
        setField(term266320, term266320.getClass(), "_index", null);
        setField(term266320, term266320.getClass(), "_defaultValue", null);
        setField(term266314, term266314.getClass(), "_metadata", term266320);
        setField(term266314, term266314.getClass(), "_format", null);
        setField(term266321, term266321.getClass(), "_field", null);
        setField(term266321, term266321.getClass(), "_serialization", null);
        setField(term266321, term266321.getClass(), "_context", null);
        setField(term266321, term266321.getClass(), "_annotations", null);
        setField(term266314, term266314.getClass(), "_member", term266321);
        setField(term266314, term266314.getClass(), "_accessorMethod", null);
        setField(term266314, term266314.getClass(), "_field", null);
        setField(term266314, term266314.getClass(), "_serializer", null);
        setField(term266314, term266314.getClass(), "_nullSerializer", null);
        setField(term266314, term266314.getClass(), "_typeSerializer", null);
        setBooleanField(term266322, term266322.getClass(), "_resetWhenFull", false);
        setField(term266314, term266314.getClass(), "_dynamicSerializers", term266322);
        setBooleanField(term266314, term266314.getClass(), "_suppressNulls", false);
        setField(term266314, term266314.getClass(), "_suppressableValue", null);
        setField(term266314, term266314.getClass(), "_includeInViews", null);
        setField(term266314, term266314.getClass(), "_internalSettings", null);
        term266323 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term266324 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term266325 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term266328 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term266323, term266323.getClass(), "_forSerialization", true);
        setField(term266323, term266323.getClass(), "_annotationIntrospector", term266324);
        setField(term266325, term266325.getClass(), "_simpleName", "");
        setField(term266325, term266325.getClass(), "_namespace", null);
        setField(term266325, term266325.getClass(), "_encodedSimple", null);
        setField(term266323, term266323.getClass(), "_name", term266325);
        setField(term266323, term266323.getClass(), "_internalName", null);
        setField(term266328, term266328.getClass(), "value", null);
        setField(term266328, term266328.getClass(), "next", null);
        setField(term266328, term266328.getClass(), "name", null);
        setBooleanField(term266328, term266328.getClass(), "isNameExplicit", false);
        setBooleanField(term266328, term266328.getClass(), "isVisible", false);
        setBooleanField(term266328, term266328.getClass(), "isMarkedIgnored", false);
        setField(term266323, term266323.getClass(), "_fields", term266328);
        setField(term266323, term266323.getClass(), "_ctorParameters", null);
        setField(term266323, term266323.getClass(), "_getters", null);
        setField(term266323, term266323.getClass(), "_setters", null);
        term266329 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term266329, term266329.getClass(), "_field", null);
        setField(term266329, term266329.getClass(), "_serialization", null);
        setField(term266329, term266329.getClass(), "_context", null);
        setField(term266329, term266329.getClass(), "_annotations", null);
        term266330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term266330, term266330.getClass(), "_annotations", null);
        term266331 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term266331, term266331.getClass(), "_keyType", null);
        setField(term266331, term266331.getClass(), "_valueType", null);
        setField(term266331, term266331.getClass(), "_canonicalName", null);
        setField(term266331, term266331.getClass(), "_class", null);
        setIntField(term266331, term266331.getClass(), "_hash", 0);
        setField(term266331, term266331.getClass(), "_valueHandler", null);
        setField(term266331, term266331.getClass(), "_typeHandler", null);
        setBooleanField(term266331, term266331.getClass(), "_asStatic", false);
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
        args[0] = term265433;
        args[1] = term265967;
        args[2] = term266083;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term266175;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term266314));
        assertTrue(recursiveEquals(term265433, term266323));
        assertTrue(recursiveEquals(term265967, term266329));
        assertTrue(recursiveEquals(term266083, term266330));
        assertTrue(recursiveEquals(term266175, term266331));
    }

};


