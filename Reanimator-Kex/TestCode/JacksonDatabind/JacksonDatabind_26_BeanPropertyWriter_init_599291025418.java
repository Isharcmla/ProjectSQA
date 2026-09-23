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

public class BeanPropertyWriter_init_599291025418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267324;
     Object term267818;
     Object term267932;
     Object term268048;
     Object term268086;
     Object term268094;
     Object term268100;
     Object term268101;
     Object term268102;

    public BeanPropertyWriter_init_599291025418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term266494 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term266612 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term266728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term266826 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term266926 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term267022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term267190 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer"));
        setField(term266494, term266494.getClass(), "_member", term266612);
        setField(term266494, term266494.getClass(), "_contextAnnotations", term266728);
        setField(term266494, term266494.getClass(), "_name", term266826);
        setField(term266494, term266494.getClass(), "_wrapperName", null);
        setField(term266494, term266494.getClass(), "_metadata", term266926);
        setField(term266494, term266494.getClass(), "_includeInViews", null);
        setField(term266494, term266494.getClass(), "_declaredType", term267022);
        setField(term266494, term266494.getClass(), "_serializer", term267190);
        term267324 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term267416 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term267602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term267702 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term267416, term267416.getClass(), "_simpleName", "");
        setField(term267324, term267324.getClass(), "_fullName", term267416);
        setField(term267324, term267324.getClass(), "_introspector", term267602);
        setField(term267324, term267324.getClass(), "_member", null);
        setField(term267324, term267324.getClass(), "_metadata", term267702);
        term267818 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term267932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term268048 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        term268086 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term268087 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term268090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term268091 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term268092 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term268093 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        setField(term268087, term268087.getClass(), "_value", "");
        setField(term268087, term268087.getClass(), "_quotedUTF8Ref", null);
        setField(term268087, term268087.getClass(), "_unquotedUTF8Ref", null);
        setField(term268087, term268087.getClass(), "_quotedChars", null);
        setField(term268087, term268087.getClass(), "_jdkSerializeValue", null);
        setField(term268086, term268086.getClass(), "_name", term268087);
        setField(term268086, term268086.getClass(), "_wrapperName", null);
        setField(term268090, term268090.getClass(), "_elementType", null);
        setField(term268090, term268090.getClass(), "_canonicalName", null);
        setField(term268090, term268090.getClass(), "_class", null);
        setIntField(term268090, term268090.getClass(), "_hash", 0);
        setField(term268090, term268090.getClass(), "_valueHandler", null);
        setField(term268090, term268090.getClass(), "_typeHandler", null);
        setBooleanField(term268090, term268090.getClass(), "_asStatic", false);
        setField(term268086, term268086.getClass(), "_declaredType", term268090);
        setField(term268086, term268086.getClass(), "_cfgSerializationType", null);
        setField(term268086, term268086.getClass(), "_nonTrivialBaseType", null);
        setField(term268091, term268091.getClass(), "_annotations", null);
        setField(term268086, term268086.getClass(), "_contextAnnotations", term268091);
        setField(term268092, term268092.getClass(), "_required", null);
        setField(term268092, term268092.getClass(), "_description", null);
        setField(term268092, term268092.getClass(), "_index", null);
        setField(term268092, term268092.getClass(), "_defaultValue", null);
        setField(term268086, term268086.getClass(), "_metadata", term268092);
        setField(term268086, term268086.getClass(), "_format", null);
        setField(term268086, term268086.getClass(), "_member", null);
        setField(term268086, term268086.getClass(), "_accessorMethod", null);
        setField(term268086, term268086.getClass(), "_field", null);
        setBooleanField(term268093, term268093.getClass(), "_isInt", false);
        setField(term268093, term268093.getClass(), "_handledType", null);
        setField(term268086, term268086.getClass(), "_serializer", term268093);
        setField(term268086, term268086.getClass(), "_nullSerializer", null);
        setField(term268086, term268086.getClass(), "_typeSerializer", null);
        setField(term268086, term268086.getClass(), "_dynamicSerializers", null);
        setBooleanField(term268086, term268086.getClass(), "_suppressNulls", false);
        setField(term268086, term268086.getClass(), "_suppressableValue", null);
        setField(term268086, term268086.getClass(), "_includeInViews", null);
        setField(term268086, term268086.getClass(), "_internalSettings", null);
        term268094 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term268095 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term268096 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term268097 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term268094, term268094.getClass(), "_introspector", term268095);
        setField(term268094, term268094.getClass(), "_member", null);
        setField(term268096, term268096.getClass(), "_required", null);
        setField(term268096, term268096.getClass(), "_description", null);
        setField(term268096, term268096.getClass(), "_index", null);
        setField(term268096, term268096.getClass(), "_defaultValue", null);
        setField(term268094, term268094.getClass(), "_metadata", term268096);
        setField(term268097, term268097.getClass(), "_simpleName", "");
        setField(term268097, term268097.getClass(), "_namespace", null);
        setField(term268097, term268097.getClass(), "_encodedSimple", null);
        setField(term268094, term268094.getClass(), "_fullName", term268097);
        setField(term268094, term268094.getClass(), "_inclusion", null);
        setField(term268094, term268094.getClass(), "_name", null);
        term268100 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term268100, term268100.getClass(), "_annotations", null);
        term268101 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term268101, term268101.getClass(), "_elementType", null);
        setField(term268101, term268101.getClass(), "_canonicalName", null);
        setField(term268101, term268101.getClass(), "_class", null);
        setIntField(term268101, term268101.getClass(), "_hash", 0);
        setField(term268101, term268101.getClass(), "_valueHandler", null);
        setField(term268101, term268101.getClass(), "_typeHandler", null);
        setBooleanField(term268101, term268101.getClass(), "_asStatic", false);
        term268102 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        setBooleanField(term268102, term268102.getClass(), "_isInt", false);
        setField(term268102, term268102.getClass(), "_handledType", null);
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
        args[0] = term267324;
        args[1] = null;
        args[2] = term267818;
        args[3] = term267932;
        args[4] = term268048;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term268086));
        assertTrue(recursiveEquals(term267324, term268094));
        assertTrue(recursiveEquals(term267818, term268100));
        assertTrue(recursiveEquals(term267932, term268101));
        assertTrue(recursiveEquals(term268048, term268102));
    }

};


