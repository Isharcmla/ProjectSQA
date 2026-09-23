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

public class BeanPropertyWriter_init_599291025397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246562;
     Object term247378;
     Object term249404;
     Object term249410;
     Object term249418;

    public BeanPropertyWriter_init_599291025397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term246216 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term246342 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term246434 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term246216, term246216.getClass(), "_member", term246342);
        setField(term246216, term246216.getClass(), "_contextAnnotations", null);
        setField(term246216, term246216.getClass(), "_name", null);
        setField(term246216, term246216.getClass(), "_wrapperName", term246434);
        setField(term246216, term246216.getClass(), "_metadata", null);
        setField(term246216, term246216.getClass(), "_includeInViews", null);
        setField(term246216, term246216.getClass(), "_declaredType", null);
        setField(term246216, term246216.getClass(), "_serializer", null);
        term246562 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term246654 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term246834 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term246952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term247068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term247216 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term246654, term246654.getClass(), "_simpleName", "");
        setField(term246562, term246562.getClass(), "_name", term246654);
        setBooleanField(term246562, term246562.getClass(), "_forSerialization", false);
        setField(term246562, term246562.getClass(), "_ctorParameters", null);
        setField(term246562, term246562.getClass(), "_setters", null);
        setField(term247068, term247068.getClass(), "_annotations", null);
        setField(term246952, term246952.getClass(), "_annotations", term247068);
        setField(term246834, term246834.getClass(), "value", term246952);
        setField(term246834, term246834.getClass(), "next", null);
        setField(term246562, term246562.getClass(), "_fields", term246834);
        setField(term246562, term246562.getClass(), "_annotationIntrospector", term247216);
        term247378 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        term249404 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term249405 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term249408 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term249409 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        setField(term249405, term249405.getClass(), "_value", "");
        setField(term249405, term249405.getClass(), "_quotedUTF8Ref", null);
        setField(term249405, term249405.getClass(), "_unquotedUTF8Ref", null);
        setField(term249405, term249405.getClass(), "_quotedChars", null);
        setField(term249405, term249405.getClass(), "_jdkSerializeValue", null);
        setField(term249404, term249404.getClass(), "_name", term249405);
        setField(term249404, term249404.getClass(), "_wrapperName", null);
        setField(term249404, term249404.getClass(), "_declaredType", null);
        setField(term249404, term249404.getClass(), "_cfgSerializationType", null);
        setField(term249404, term249404.getClass(), "_nonTrivialBaseType", null);
        setField(term249404, term249404.getClass(), "_contextAnnotations", null);
        setField(term249408, term249408.getClass(), "_required", null);
        setField(term249408, term249408.getClass(), "_description", null);
        setField(term249408, term249408.getClass(), "_index", null);
        setField(term249408, term249408.getClass(), "_defaultValue", null);
        setField(term249404, term249404.getClass(), "_metadata", term249408);
        setField(term249404, term249404.getClass(), "_format", null);
        setField(term249404, term249404.getClass(), "_member", null);
        setField(term249404, term249404.getClass(), "_accessorMethod", null);
        setField(term249404, term249404.getClass(), "_field", null);
        setField(term249409, term249409.getClass(), "_valueTypeSerializer", null);
        setField(term249409, term249409.getClass(), "_property", null);
        setField(term249409, term249409.getClass(), "_unwrapSingle", null);
        setField(term249409, term249409.getClass(), "_handledType", null);
        setField(term249404, term249404.getClass(), "_serializer", term249409);
        setField(term249404, term249404.getClass(), "_nullSerializer", null);
        setField(term249404, term249404.getClass(), "_typeSerializer", null);
        setField(term249404, term249404.getClass(), "_dynamicSerializers", null);
        setBooleanField(term249404, term249404.getClass(), "_suppressNulls", false);
        setField(term249404, term249404.getClass(), "_suppressableValue", null);
        setField(term249404, term249404.getClass(), "_includeInViews", null);
        setField(term249404, term249404.getClass(), "_internalSettings", null);
        term249410 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term249411 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term249412 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term249415 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term249416 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term249417 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setBooleanField(term249410, term249410.getClass(), "_forSerialization", false);
        setField(term249410, term249410.getClass(), "_annotationIntrospector", term249411);
        setField(term249412, term249412.getClass(), "_simpleName", "");
        setField(term249412, term249412.getClass(), "_namespace", null);
        setField(term249412, term249412.getClass(), "_encodedSimple", null);
        setField(term249410, term249410.getClass(), "_name", term249412);
        setField(term249410, term249410.getClass(), "_internalName", null);
        setField(term249416, term249416.getClass(), "_field", null);
        setField(term249416, term249416.getClass(), "_serialization", null);
        setField(term249416, term249416.getClass(), "_context", null);
        setField(term249417, term249417.getClass(), "_annotations", null);
        setField(term249416, term249416.getClass(), "_annotations", term249417);
        setField(term249415, term249415.getClass(), "value", term249416);
        setField(term249415, term249415.getClass(), "next", null);
        setField(term249415, term249415.getClass(), "name", null);
        setBooleanField(term249415, term249415.getClass(), "isNameExplicit", false);
        setBooleanField(term249415, term249415.getClass(), "isVisible", false);
        setBooleanField(term249415, term249415.getClass(), "isMarkedIgnored", false);
        setField(term249410, term249410.getClass(), "_fields", term249415);
        setField(term249410, term249410.getClass(), "_ctorParameters", null);
        setField(term249410, term249410.getClass(), "_getters", null);
        setField(term249410, term249410.getClass(), "_setters", null);
        term249418 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        setField(term249418, term249418.getClass(), "_valueTypeSerializer", null);
        setField(term249418, term249418.getClass(), "_property", null);
        setField(term249418, term249418.getClass(), "_unwrapSingle", null);
        setField(term249418, term249418.getClass(), "_handledType", null);
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
        args[0] = term246562;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term247378;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term249404));
        assertTrue(recursiveEquals(term246562, term249410));
        assertTrue(recursiveEquals(term247378, term249418));
    }

};


