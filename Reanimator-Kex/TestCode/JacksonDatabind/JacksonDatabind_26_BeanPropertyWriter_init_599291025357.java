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

public class BeanPropertyWriter_init_599291025357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211308;
     Object term211706;
     Object term213016;
     Object term213022;
     Object term213027;

    public BeanPropertyWriter_init_599291025357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term210854 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term210984 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term211084 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term211180 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term210854, term210854.getClass(), "_member", term210984);
        setField(term210854, term210854.getClass(), "_contextAnnotations", null);
        setField(term210854, term210854.getClass(), "_name", null);
        setField(term210854, term210854.getClass(), "_wrapperName", null);
        setField(term210854, term210854.getClass(), "_metadata", term211084);
        setField(term210854, term210854.getClass(), "_includeInViews", null);
        setField(term210854, term210854.getClass(), "_declaredType", term211180);
        setField(term210854, term210854.getClass(), "_serializer", null);
        setField(term210854, term210854.getClass(), "_dynamicSerializers", null);
        setField(term210854, term210854.getClass(), "_typeSerializer", null);
        setField(term210854, term210854.getClass(), "_cfgSerializationType", null);
        term211308 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term211400 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term211586 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term211400, term211400.getClass(), "_simpleName", "");
        setField(term211308, term211308.getClass(), "_name", term211400);
        setBooleanField(term211308, term211308.getClass(), "_forSerialization", false);
        setField(term211308, term211308.getClass(), "_ctorParameters", null);
        setField(term211308, term211308.getClass(), "_setters", null);
        setField(term211308, term211308.getClass(), "_fields", null);
        setField(term211308, term211308.getClass(), "_annotationIntrospector", term211586);
        term211706 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        term213016 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term213017 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term213020 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term213021 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        setField(term213017, term213017.getClass(), "_value", "");
        setField(term213017, term213017.getClass(), "_quotedUTF8Ref", null);
        setField(term213017, term213017.getClass(), "_unquotedUTF8Ref", null);
        setField(term213017, term213017.getClass(), "_quotedChars", null);
        setField(term213017, term213017.getClass(), "_jdkSerializeValue", null);
        setField(term213016, term213016.getClass(), "_name", term213017);
        setField(term213016, term213016.getClass(), "_wrapperName", null);
        setField(term213016, term213016.getClass(), "_declaredType", null);
        setField(term213016, term213016.getClass(), "_cfgSerializationType", null);
        setField(term213016, term213016.getClass(), "_nonTrivialBaseType", null);
        setField(term213016, term213016.getClass(), "_contextAnnotations", null);
        setField(term213020, term213020.getClass(), "_required", null);
        setField(term213020, term213020.getClass(), "_description", null);
        setField(term213020, term213020.getClass(), "_index", null);
        setField(term213020, term213020.getClass(), "_defaultValue", null);
        setField(term213016, term213016.getClass(), "_metadata", term213020);
        setField(term213016, term213016.getClass(), "_format", null);
        setField(term213016, term213016.getClass(), "_member", null);
        setField(term213016, term213016.getClass(), "_accessorMethod", null);
        setField(term213016, term213016.getClass(), "_field", null);
        setField(term213021, term213021.getClass(), "_elementType", null);
        setField(term213021, term213021.getClass(), "_property", null);
        setBooleanField(term213021, term213021.getClass(), "_staticTyping", false);
        setField(term213021, term213021.getClass(), "_unwrapSingle", null);
        setField(term213021, term213021.getClass(), "_valueTypeSerializer", null);
        setField(term213021, term213021.getClass(), "_elementSerializer", null);
        setField(term213021, term213021.getClass(), "_dynamicSerializers", null);
        setField(term213021, term213021.getClass(), "_handledType", null);
        setField(term213016, term213016.getClass(), "_serializer", term213021);
        setField(term213016, term213016.getClass(), "_nullSerializer", null);
        setField(term213016, term213016.getClass(), "_typeSerializer", null);
        setField(term213016, term213016.getClass(), "_dynamicSerializers", null);
        setBooleanField(term213016, term213016.getClass(), "_suppressNulls", false);
        setField(term213016, term213016.getClass(), "_suppressableValue", null);
        setField(term213016, term213016.getClass(), "_includeInViews", null);
        setField(term213016, term213016.getClass(), "_internalSettings", null);
        term213022 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term213023 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term213024 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term213022, term213022.getClass(), "_forSerialization", false);
        setField(term213022, term213022.getClass(), "_annotationIntrospector", term213023);
        setField(term213024, term213024.getClass(), "_simpleName", "");
        setField(term213024, term213024.getClass(), "_namespace", null);
        setField(term213024, term213024.getClass(), "_encodedSimple", null);
        setField(term213022, term213022.getClass(), "_name", term213024);
        setField(term213022, term213022.getClass(), "_internalName", null);
        setField(term213022, term213022.getClass(), "_fields", null);
        setField(term213022, term213022.getClass(), "_ctorParameters", null);
        setField(term213022, term213022.getClass(), "_getters", null);
        setField(term213022, term213022.getClass(), "_setters", null);
        term213027 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        setField(term213027, term213027.getClass(), "_elementType", null);
        setField(term213027, term213027.getClass(), "_property", null);
        setBooleanField(term213027, term213027.getClass(), "_staticTyping", false);
        setField(term213027, term213027.getClass(), "_unwrapSingle", null);
        setField(term213027, term213027.getClass(), "_valueTypeSerializer", null);
        setField(term213027, term213027.getClass(), "_elementSerializer", null);
        setField(term213027, term213027.getClass(), "_dynamicSerializers", null);
        setField(term213027, term213027.getClass(), "_handledType", null);
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
        args[0] = term211308;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term211706;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term213016));
        assertTrue(recursiveEquals(term211308, term213022));
        assertTrue(recursiveEquals(term211706, term213027));
    }

};


