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

public class BeanPropertyWriter_init_599291025344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201597;
     Object term202107;
     Object term202222;
     Object term202229;
     Object term202235;

    public BeanPropertyWriter_init_599291025344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201371 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term201469 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term201371, term201371.getClass(), "_member", null);
        setField(term201371, term201371.getClass(), "_contextAnnotations", null);
        setField(term201371, term201371.getClass(), "_name", term201469);
        term201597 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term201689 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term201869 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term201987 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term201689, term201689.getClass(), "_simpleName", "");
        setField(term201597, term201597.getClass(), "_name", term201689);
        setBooleanField(term201597, term201597.getClass(), "_forSerialization", true);
        setField(term201597, term201597.getClass(), "_getters", null);
        setField(term201869, term201869.getClass(), "value", term201987);
        setField(term201597, term201597.getClass(), "_fields", term201869);
        term202107 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term202222 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term202223 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term202226 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term202227 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term202228 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term202223, term202223.getClass(), "_value", "");
        setField(term202223, term202223.getClass(), "_quotedUTF8Ref", null);
        setField(term202223, term202223.getClass(), "_unquotedUTF8Ref", null);
        setField(term202223, term202223.getClass(), "_quotedChars", null);
        setField(term202223, term202223.getClass(), "_jdkSerializeValue", null);
        setField(term202222, term202222.getClass(), "_name", term202223);
        setField(term202222, term202222.getClass(), "_wrapperName", null);
        setField(term202222, term202222.getClass(), "_declaredType", null);
        setField(term202222, term202222.getClass(), "_cfgSerializationType", null);
        setField(term202222, term202222.getClass(), "_nonTrivialBaseType", null);
        setField(term202222, term202222.getClass(), "_contextAnnotations", null);
        setField(term202226, term202226.getClass(), "_required", null);
        setField(term202226, term202226.getClass(), "_description", null);
        setField(term202226, term202226.getClass(), "_index", null);
        setField(term202226, term202226.getClass(), "_defaultValue", null);
        setField(term202222, term202222.getClass(), "_metadata", term202226);
        setField(term202222, term202222.getClass(), "_format", null);
        setField(term202227, term202227.getClass(), "_method", null);
        setField(term202227, term202227.getClass(), "_paramClasses", null);
        setField(term202227, term202227.getClass(), "_serialization", null);
        setField(term202227, term202227.getClass(), "_paramAnnotations", null);
        setField(term202227, term202227.getClass(), "_context", null);
        setField(term202227, term202227.getClass(), "_annotations", null);
        setField(term202222, term202222.getClass(), "_member", term202227);
        setField(term202222, term202222.getClass(), "_accessorMethod", null);
        setField(term202222, term202222.getClass(), "_field", null);
        setField(term202222, term202222.getClass(), "_serializer", null);
        setField(term202222, term202222.getClass(), "_nullSerializer", null);
        setField(term202222, term202222.getClass(), "_typeSerializer", null);
        setBooleanField(term202228, term202228.getClass(), "_resetWhenFull", false);
        setField(term202222, term202222.getClass(), "_dynamicSerializers", term202228);
        setBooleanField(term202222, term202222.getClass(), "_suppressNulls", false);
        setField(term202222, term202222.getClass(), "_suppressableValue", null);
        setField(term202222, term202222.getClass(), "_includeInViews", null);
        setField(term202222, term202222.getClass(), "_internalSettings", null);
        term202229 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term202230 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term202233 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term202234 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term202229, term202229.getClass(), "_forSerialization", true);
        setField(term202229, term202229.getClass(), "_annotationIntrospector", null);
        setField(term202230, term202230.getClass(), "_simpleName", "");
        setField(term202230, term202230.getClass(), "_namespace", null);
        setField(term202230, term202230.getClass(), "_encodedSimple", null);
        setField(term202229, term202229.getClass(), "_name", term202230);
        setField(term202229, term202229.getClass(), "_internalName", null);
        setField(term202234, term202234.getClass(), "_field", null);
        setField(term202234, term202234.getClass(), "_serialization", null);
        setField(term202234, term202234.getClass(), "_context", null);
        setField(term202234, term202234.getClass(), "_annotations", null);
        setField(term202233, term202233.getClass(), "value", term202234);
        setField(term202233, term202233.getClass(), "next", null);
        setField(term202233, term202233.getClass(), "name", null);
        setBooleanField(term202233, term202233.getClass(), "isNameExplicit", false);
        setBooleanField(term202233, term202233.getClass(), "isVisible", false);
        setBooleanField(term202233, term202233.getClass(), "isMarkedIgnored", false);
        setField(term202229, term202229.getClass(), "_fields", term202233);
        setField(term202229, term202229.getClass(), "_ctorParameters", null);
        setField(term202229, term202229.getClass(), "_getters", null);
        setField(term202229, term202229.getClass(), "_setters", null);
        term202235 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term202235, term202235.getClass(), "_method", null);
        setField(term202235, term202235.getClass(), "_paramClasses", null);
        setField(term202235, term202235.getClass(), "_serialization", null);
        setField(term202235, term202235.getClass(), "_paramAnnotations", null);
        setField(term202235, term202235.getClass(), "_context", null);
        setField(term202235, term202235.getClass(), "_annotations", null);
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
        args[0] = term201597;
        args[1] = term202107;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term202222));
        assertTrue(recursiveEquals(term201597, term202229));
        assertTrue(recursiveEquals(term202107, term202235));
    }

};


