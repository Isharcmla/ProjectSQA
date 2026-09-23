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

public class BeanPropertyWriter_init_599291025290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150239;
     Object term150773;
     Object term152227;
     Object term152234;
     Object term152240;

    public BeanPropertyWriter_init_599291025290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149887 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term150005 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object[] term149637 = (Object[]) newArray("java.lang.Class", 0);
        Object term150111 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term149887, term149887.getClass(), "_member", term150005);
        setField(term149887, term149887.getClass(), "_contextAnnotations", null);
        setField(term149887, term149887.getClass(), "_name", null);
        setField(term149887, term149887.getClass(), "_wrapperName", null);
        setField(term149887, term149887.getClass(), "_metadata", null);
        setField(term149887, term149887.getClass(), "_includeInViews", term149637);
        setField(term149887, term149887.getClass(), "_declaredType", null);
        setField(term149887, term149887.getClass(), "_serializer", null);
        setField(term149887, term149887.getClass(), "_dynamicSerializers", null);
        setField(term149887, term149887.getClass(), "_typeSerializer", null);
        setField(term149887, term149887.getClass(), "_cfgSerializationType", term150111);
        term150239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term150331 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term150511 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term150655 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term150331, term150331.getClass(), "_simpleName", "");
        setField(term150239, term150239.getClass(), "_name", term150331);
        setBooleanField(term150239, term150239.getClass(), "_forSerialization", false);
        setField(term150239, term150239.getClass(), "_ctorParameters", null);
        setField(term150239, term150239.getClass(), "_setters", null);
        setField(term150511, term150511.getClass(), "value", null);
        setField(term150511, term150511.getClass(), "next", null);
        setField(term150239, term150239.getClass(), "_fields", term150511);
        setField(term150239, term150239.getClass(), "_annotationIntrospector", term150655);
        term150773 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term152227 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term152228 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term152231 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term152232 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term152233 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term152228, term152228.getClass(), "_value", "");
        setField(term152228, term152228.getClass(), "_quotedUTF8Ref", null);
        setField(term152228, term152228.getClass(), "_unquotedUTF8Ref", null);
        setField(term152228, term152228.getClass(), "_quotedChars", null);
        setField(term152228, term152228.getClass(), "_jdkSerializeValue", null);
        setField(term152227, term152227.getClass(), "_name", term152228);
        setField(term152227, term152227.getClass(), "_wrapperName", null);
        setField(term152227, term152227.getClass(), "_declaredType", null);
        setField(term152227, term152227.getClass(), "_cfgSerializationType", null);
        setField(term152227, term152227.getClass(), "_nonTrivialBaseType", null);
        setField(term152227, term152227.getClass(), "_contextAnnotations", null);
        setField(term152231, term152231.getClass(), "_required", null);
        setField(term152231, term152231.getClass(), "_description", null);
        setField(term152231, term152231.getClass(), "_index", null);
        setField(term152231, term152231.getClass(), "_defaultValue", null);
        setField(term152227, term152227.getClass(), "_metadata", term152231);
        setField(term152227, term152227.getClass(), "_format", null);
        setField(term152232, term152232.getClass(), "_field", null);
        setField(term152232, term152232.getClass(), "_serialization", null);
        setField(term152232, term152232.getClass(), "_context", null);
        setField(term152232, term152232.getClass(), "_annotations", null);
        setField(term152227, term152227.getClass(), "_member", term152232);
        setField(term152227, term152227.getClass(), "_accessorMethod", null);
        setField(term152227, term152227.getClass(), "_field", null);
        setField(term152227, term152227.getClass(), "_serializer", null);
        setField(term152227, term152227.getClass(), "_nullSerializer", null);
        setField(term152227, term152227.getClass(), "_typeSerializer", null);
        setBooleanField(term152233, term152233.getClass(), "_resetWhenFull", false);
        setField(term152227, term152227.getClass(), "_dynamicSerializers", term152233);
        setBooleanField(term152227, term152227.getClass(), "_suppressNulls", false);
        setField(term152227, term152227.getClass(), "_suppressableValue", null);
        setField(term152227, term152227.getClass(), "_includeInViews", null);
        setField(term152227, term152227.getClass(), "_internalSettings", null);
        term152234 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term152235 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term152236 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term152239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term152234, term152234.getClass(), "_forSerialization", false);
        setField(term152234, term152234.getClass(), "_annotationIntrospector", term152235);
        setField(term152236, term152236.getClass(), "_simpleName", "");
        setField(term152236, term152236.getClass(), "_namespace", null);
        setField(term152236, term152236.getClass(), "_encodedSimple", null);
        setField(term152234, term152234.getClass(), "_name", term152236);
        setField(term152234, term152234.getClass(), "_internalName", null);
        setField(term152239, term152239.getClass(), "value", null);
        setField(term152239, term152239.getClass(), "next", null);
        setField(term152239, term152239.getClass(), "name", null);
        setBooleanField(term152239, term152239.getClass(), "isNameExplicit", false);
        setBooleanField(term152239, term152239.getClass(), "isVisible", false);
        setBooleanField(term152239, term152239.getClass(), "isMarkedIgnored", false);
        setField(term152234, term152234.getClass(), "_fields", term152239);
        setField(term152234, term152234.getClass(), "_ctorParameters", null);
        setField(term152234, term152234.getClass(), "_getters", null);
        setField(term152234, term152234.getClass(), "_setters", null);
        term152240 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term152240, term152240.getClass(), "_field", null);
        setField(term152240, term152240.getClass(), "_serialization", null);
        setField(term152240, term152240.getClass(), "_context", null);
        setField(term152240, term152240.getClass(), "_annotations", null);
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
        args[0] = term150239;
        args[1] = term150773;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term152227));
        assertTrue(recursiveEquals(term150239, term152234));
        assertTrue(recursiveEquals(term150773, term152240));
    }

};


