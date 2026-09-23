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

public class BeanPropertyWriter_init_599291025292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151308;
     Object term151964;
     Object term152080;
     Object term154375;
     Object term154383;
     Object term154390;
     Object term154391;

    public BeanPropertyWriter_init_599291025292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term150964 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term151082 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term151180 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term150964, term150964.getClass(), "_member", term151082);
        setField(term150964, term150964.getClass(), "_contextAnnotations", null);
        setField(term150964, term150964.getClass(), "_name", term151180);
        setField(term150964, term150964.getClass(), "_wrapperName", null);
        term151308 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term151400 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term151580 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term151698 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term151846 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term151400, term151400.getClass(), "_simpleName", "");
        setField(term151308, term151308.getClass(), "_name", term151400);
        setBooleanField(term151308, term151308.getClass(), "_forSerialization", false);
        setField(term151308, term151308.getClass(), "_ctorParameters", null);
        setField(term151308, term151308.getClass(), "_setters", null);
        setField(term151580, term151580.getClass(), "value", term151698);
        setField(term151580, term151580.getClass(), "next", null);
        setField(term151308, term151308.getClass(), "_fields", term151580);
        setField(term151308, term151308.getClass(), "_annotationIntrospector", term151846);
        term151964 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term152080 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term154375 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term154376 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term154379 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term154380 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term154381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term154382 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term154376, term154376.getClass(), "_value", "");
        setField(term154376, term154376.getClass(), "_quotedUTF8Ref", null);
        setField(term154376, term154376.getClass(), "_unquotedUTF8Ref", null);
        setField(term154376, term154376.getClass(), "_quotedChars", null);
        setField(term154376, term154376.getClass(), "_jdkSerializeValue", null);
        setField(term154375, term154375.getClass(), "_name", term154376);
        setField(term154375, term154375.getClass(), "_wrapperName", null);
        setField(term154375, term154375.getClass(), "_declaredType", null);
        setField(term154375, term154375.getClass(), "_cfgSerializationType", null);
        setField(term154375, term154375.getClass(), "_nonTrivialBaseType", null);
        setField(term154379, term154379.getClass(), "_annotations", null);
        setField(term154375, term154375.getClass(), "_contextAnnotations", term154379);
        setField(term154380, term154380.getClass(), "_required", null);
        setField(term154380, term154380.getClass(), "_description", null);
        setField(term154380, term154380.getClass(), "_index", null);
        setField(term154380, term154380.getClass(), "_defaultValue", null);
        setField(term154375, term154375.getClass(), "_metadata", term154380);
        setField(term154375, term154375.getClass(), "_format", null);
        setField(term154381, term154381.getClass(), "_field", null);
        setField(term154381, term154381.getClass(), "_serialization", null);
        setField(term154381, term154381.getClass(), "_context", null);
        setField(term154381, term154381.getClass(), "_annotations", null);
        setField(term154375, term154375.getClass(), "_member", term154381);
        setField(term154375, term154375.getClass(), "_accessorMethod", null);
        setField(term154375, term154375.getClass(), "_field", null);
        setField(term154375, term154375.getClass(), "_serializer", null);
        setField(term154375, term154375.getClass(), "_nullSerializer", null);
        setField(term154375, term154375.getClass(), "_typeSerializer", null);
        setBooleanField(term154382, term154382.getClass(), "_resetWhenFull", false);
        setField(term154375, term154375.getClass(), "_dynamicSerializers", term154382);
        setBooleanField(term154375, term154375.getClass(), "_suppressNulls", false);
        setField(term154375, term154375.getClass(), "_suppressableValue", null);
        setField(term154375, term154375.getClass(), "_includeInViews", null);
        setField(term154375, term154375.getClass(), "_internalSettings", null);
        term154383 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term154384 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term154385 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term154388 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term154389 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term154383, term154383.getClass(), "_forSerialization", false);
        setField(term154383, term154383.getClass(), "_annotationIntrospector", term154384);
        setField(term154385, term154385.getClass(), "_simpleName", "");
        setField(term154385, term154385.getClass(), "_namespace", null);
        setField(term154385, term154385.getClass(), "_encodedSimple", null);
        setField(term154383, term154383.getClass(), "_name", term154385);
        setField(term154383, term154383.getClass(), "_internalName", null);
        setField(term154389, term154389.getClass(), "_field", null);
        setField(term154389, term154389.getClass(), "_serialization", null);
        setField(term154389, term154389.getClass(), "_context", null);
        setField(term154389, term154389.getClass(), "_annotations", null);
        setField(term154388, term154388.getClass(), "value", term154389);
        setField(term154388, term154388.getClass(), "next", null);
        setField(term154388, term154388.getClass(), "name", null);
        setBooleanField(term154388, term154388.getClass(), "isNameExplicit", false);
        setBooleanField(term154388, term154388.getClass(), "isVisible", false);
        setBooleanField(term154388, term154388.getClass(), "isMarkedIgnored", false);
        setField(term154383, term154383.getClass(), "_fields", term154388);
        setField(term154383, term154383.getClass(), "_ctorParameters", null);
        setField(term154383, term154383.getClass(), "_getters", null);
        setField(term154383, term154383.getClass(), "_setters", null);
        term154390 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term154390, term154390.getClass(), "_field", null);
        setField(term154390, term154390.getClass(), "_serialization", null);
        setField(term154390, term154390.getClass(), "_context", null);
        setField(term154390, term154390.getClass(), "_annotations", null);
        term154391 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term154391, term154391.getClass(), "_annotations", null);
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
        args[0] = term151308;
        args[1] = term151964;
        args[2] = term152080;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term154375));
        assertTrue(recursiveEquals(term151308, term154383));
        assertTrue(recursiveEquals(term151964, term154390));
        assertTrue(recursiveEquals(term152080, term154391));
    }

};


