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

public class BeanPropertyWriter_init_599291025142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54514;
     Object term54670;
     Object term54786;
     Object term54892;
     Object term54990;
     Object term55922;
     Object term55931;
     Object term55934;
     Object term55935;
     Object term55936;
     Object term55937;

    public BeanPropertyWriter_init_599291025142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53660 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term53780 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term53896 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term53994 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term54152 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer"));
        Object term54294 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single"));
        Object term54386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term53660, term53660.getClass(), "_member", term53780);
        setField(term53660, term53660.getClass(), "_contextAnnotations", term53896);
        setField(term53660, term53660.getClass(), "_name", term53994);
        setField(term53660, term53660.getClass(), "_wrapperName", null);
        setField(term53660, term53660.getClass(), "_declaredType", null);
        setField(term53660, term53660.getClass(), "_serializer", term54152);
        setField(term53660, term53660.getClass(), "_dynamicSerializers", term54294);
        setField(term53660, term53660.getClass(), "_typeSerializer", null);
        setField(term53660, term53660.getClass(), "_cfgSerializationType", term54386);
        setBooleanField(term53660, term53660.getClass(), "_isRequired", false);
        term54514 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term54514, term54514.getClass(), "_name", "");
        setBooleanField(term54514, term54514.getClass(), "_forSerialization", true);
        setField(term54514, term54514.getClass(), "_getters", null);
        setField(term54514, term54514.getClass(), "_fields", null);
        setField(term54514, term54514.getClass(), "_annotationIntrospector", null);
        term54670 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term54786 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term54892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term54990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term55922 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term55923 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term55924 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term55925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term55926 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term55929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term55930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term55923, term55923.getClass(), "_field", null);
        setField(term55923, term55923.getClass(), "_serialization", null);
        setField(term55923, term55923.getClass(), "_annotations", null);
        setField(term55922, term55922.getClass(), "_member", term55923);
        setField(term55924, term55924.getClass(), "_annotations", null);
        setField(term55922, term55922.getClass(), "_contextAnnotations", term55924);
        setField(term55925, term55925.getClass(), "_elementType", null);
        setField(term55925, term55925.getClass(), "_canonicalName", null);
        setField(term55925, term55925.getClass(), "_class", null);
        setIntField(term55925, term55925.getClass(), "_hashCode", 0);
        setField(term55925, term55925.getClass(), "_valueHandler", null);
        setField(term55925, term55925.getClass(), "_typeHandler", null);
        setBooleanField(term55925, term55925.getClass(), "_asStatic", false);
        setField(term55922, term55922.getClass(), "_declaredType", term55925);
        setField(term55922, term55922.getClass(), "_accessorMethod", null);
        setField(term55922, term55922.getClass(), "_field", null);
        setField(term55922, term55922.getClass(), "_internalSettings", null);
        setField(term55926, term55926.getClass(), "_value", "");
        setField(term55926, term55926.getClass(), "_quotedUTF8Ref", null);
        setField(term55926, term55926.getClass(), "_unquotedUTF8Ref", null);
        setField(term55926, term55926.getClass(), "_quotedChars", null);
        setField(term55926, term55926.getClass(), "_jdkSerializeValue", null);
        setField(term55922, term55922.getClass(), "_name", term55926);
        setField(term55922, term55922.getClass(), "_wrapperName", null);
        setField(term55929, term55929.getClass(), "_typeParameters", null);
        setField(term55929, term55929.getClass(), "_typeNames", null);
        setField(term55929, term55929.getClass(), "_canonicalName", null);
        setField(term55929, term55929.getClass(), "_class", null);
        setIntField(term55929, term55929.getClass(), "_hashCode", 0);
        setField(term55929, term55929.getClass(), "_valueHandler", null);
        setField(term55929, term55929.getClass(), "_typeHandler", null);
        setBooleanField(term55929, term55929.getClass(), "_asStatic", false);
        setField(term55922, term55922.getClass(), "_cfgSerializationType", term55929);
        setField(term55922, term55922.getClass(), "_serializer", null);
        setField(term55922, term55922.getClass(), "_nullSerializer", null);
        setField(term55922, term55922.getClass(), "_dynamicSerializers", term55930);
        setBooleanField(term55922, term55922.getClass(), "_suppressNulls", false);
        setField(term55922, term55922.getClass(), "_suppressableValue", null);
        setField(term55922, term55922.getClass(), "_includeInViews", null);
        setField(term55922, term55922.getClass(), "_typeSerializer", null);
        setField(term55922, term55922.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term55922, term55922.getClass(), "_isRequired", false);
        term55931 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term55931, term55931.getClass(), "_forSerialization", true);
        setField(term55931, term55931.getClass(), "_annotationIntrospector", null);
        setField(term55931, term55931.getClass(), "_name", "");
        setField(term55931, term55931.getClass(), "_internalName", null);
        setField(term55931, term55931.getClass(), "_fields", null);
        setField(term55931, term55931.getClass(), "_ctorParameters", null);
        setField(term55931, term55931.getClass(), "_getters", null);
        setField(term55931, term55931.getClass(), "_setters", null);
        term55934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term55934, term55934.getClass(), "_field", null);
        setField(term55934, term55934.getClass(), "_serialization", null);
        setField(term55934, term55934.getClass(), "_annotations", null);
        term55935 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term55935, term55935.getClass(), "_annotations", null);
        term55936 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term55936, term55936.getClass(), "_elementType", null);
        setField(term55936, term55936.getClass(), "_canonicalName", null);
        setField(term55936, term55936.getClass(), "_class", null);
        setIntField(term55936, term55936.getClass(), "_hashCode", 0);
        setField(term55936, term55936.getClass(), "_valueHandler", null);
        setField(term55936, term55936.getClass(), "_typeHandler", null);
        setBooleanField(term55936, term55936.getClass(), "_asStatic", false);
        term55937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term55937, term55937.getClass(), "_typeParameters", null);
        setField(term55937, term55937.getClass(), "_typeNames", null);
        setField(term55937, term55937.getClass(), "_canonicalName", null);
        setField(term55937, term55937.getClass(), "_class", null);
        setIntField(term55937, term55937.getClass(), "_hashCode", 0);
        setField(term55937, term55937.getClass(), "_valueHandler", null);
        setField(term55937, term55937.getClass(), "_typeHandler", null);
        setBooleanField(term55937, term55937.getClass(), "_asStatic", false);
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
        args[0] = term54514;
        args[1] = term54670;
        args[2] = term54786;
        args[3] = term54892;
        args[4] = null;
        args[5] = null;
        args[6] = term54990;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55922));
        assertTrue(recursiveEquals(term54514, term55931));
        assertTrue(recursiveEquals(term54670, term55934));
        assertTrue(recursiveEquals(term54786, term55935));
        assertTrue(recursiveEquals(term54892, term55936));
        assertTrue(recursiveEquals(term54990, term55937));
    }

};
