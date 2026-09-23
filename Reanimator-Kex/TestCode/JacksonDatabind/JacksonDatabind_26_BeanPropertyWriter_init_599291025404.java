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

public class BeanPropertyWriter_init_599291025404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251911;
     Object term255228;
     Object term255234;

    public BeanPropertyWriter_init_599291025404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term251513 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term251629 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term251240 = (Object[]) newArray("java.lang.Class", 0);
        Object term251783 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$DateKeySerializer"));
        setField(term251513, term251513.getClass(), "_member", null);
        setField(term251513, term251513.getClass(), "_contextAnnotations", term251629);
        setField(term251513, term251513.getClass(), "_name", null);
        setField(term251513, term251513.getClass(), "_wrapperName", null);
        setField(term251513, term251513.getClass(), "_metadata", null);
        setField(term251513, term251513.getClass(), "_includeInViews", term251240);
        setField(term251513, term251513.getClass(), "_declaredType", null);
        setField(term251513, term251513.getClass(), "_serializer", term251783);
        setField(term251513, term251513.getClass(), "_dynamicSerializers", null);
        setField(term251513, term251513.getClass(), "_typeSerializer", null);
        setField(term251513, term251513.getClass(), "_cfgSerializationType", null);
        term251911 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term252003 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term252183 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term252301 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term252449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term252003, term252003.getClass(), "_simpleName", "");
        setField(term251911, term251911.getClass(), "_name", term252003);
        setBooleanField(term251911, term251911.getClass(), "_forSerialization", false);
        setField(term251911, term251911.getClass(), "_ctorParameters", null);
        setField(term251911, term251911.getClass(), "_setters", null);
        setField(term252301, term252301.getClass(), "_annotations", null);
        setField(term252183, term252183.getClass(), "value", term252301);
        setField(term252183, term252183.getClass(), "next", null);
        setField(term251911, term251911.getClass(), "_fields", term252183);
        setField(term251911, term251911.getClass(), "_annotationIntrospector", term252449);
        term255228 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term255229 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term255232 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term255233 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term255229, term255229.getClass(), "_value", "");
        setField(term255229, term255229.getClass(), "_quotedUTF8Ref", null);
        setField(term255229, term255229.getClass(), "_unquotedUTF8Ref", null);
        setField(term255229, term255229.getClass(), "_quotedChars", null);
        setField(term255229, term255229.getClass(), "_jdkSerializeValue", null);
        setField(term255228, term255228.getClass(), "_name", term255229);
        setField(term255228, term255228.getClass(), "_wrapperName", null);
        setField(term255228, term255228.getClass(), "_declaredType", null);
        setField(term255228, term255228.getClass(), "_cfgSerializationType", null);
        setField(term255228, term255228.getClass(), "_nonTrivialBaseType", null);
        setField(term255228, term255228.getClass(), "_contextAnnotations", null);
        setField(term255232, term255232.getClass(), "_required", null);
        setField(term255232, term255232.getClass(), "_description", null);
        setField(term255232, term255232.getClass(), "_index", null);
        setField(term255232, term255232.getClass(), "_defaultValue", null);
        setField(term255228, term255228.getClass(), "_metadata", term255232);
        setField(term255228, term255228.getClass(), "_format", null);
        setField(term255228, term255228.getClass(), "_member", null);
        setField(term255228, term255228.getClass(), "_accessorMethod", null);
        setField(term255228, term255228.getClass(), "_field", null);
        setField(term255228, term255228.getClass(), "_serializer", null);
        setField(term255228, term255228.getClass(), "_nullSerializer", null);
        setField(term255228, term255228.getClass(), "_typeSerializer", null);
        setBooleanField(term255233, term255233.getClass(), "_resetWhenFull", false);
        setField(term255228, term255228.getClass(), "_dynamicSerializers", term255233);
        setBooleanField(term255228, term255228.getClass(), "_suppressNulls", false);
        setField(term255228, term255228.getClass(), "_suppressableValue", null);
        setField(term255228, term255228.getClass(), "_includeInViews", null);
        setField(term255228, term255228.getClass(), "_internalSettings", null);
        term255234 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term255235 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term255236 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term255239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term255240 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term255234, term255234.getClass(), "_forSerialization", false);
        setField(term255234, term255234.getClass(), "_annotationIntrospector", term255235);
        setField(term255236, term255236.getClass(), "_simpleName", "");
        setField(term255236, term255236.getClass(), "_namespace", null);
        setField(term255236, term255236.getClass(), "_encodedSimple", null);
        setField(term255234, term255234.getClass(), "_name", term255236);
        setField(term255234, term255234.getClass(), "_internalName", null);
        setField(term255240, term255240.getClass(), "_field", null);
        setField(term255240, term255240.getClass(), "_serialization", null);
        setField(term255240, term255240.getClass(), "_context", null);
        setField(term255240, term255240.getClass(), "_annotations", null);
        setField(term255239, term255239.getClass(), "value", term255240);
        setField(term255239, term255239.getClass(), "next", null);
        setField(term255239, term255239.getClass(), "name", null);
        setBooleanField(term255239, term255239.getClass(), "isNameExplicit", false);
        setBooleanField(term255239, term255239.getClass(), "isVisible", false);
        setBooleanField(term255239, term255239.getClass(), "isMarkedIgnored", false);
        setField(term255234, term255234.getClass(), "_fields", term255239);
        setField(term255234, term255234.getClass(), "_ctorParameters", null);
        setField(term255234, term255234.getClass(), "_getters", null);
        setField(term255234, term255234.getClass(), "_setters", null);
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
        args[0] = term251911;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term255228));
        assertTrue(recursiveEquals(term251911, term255234));
    }

};


