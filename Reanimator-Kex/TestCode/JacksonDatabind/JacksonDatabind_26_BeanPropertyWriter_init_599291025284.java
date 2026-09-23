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

public class BeanPropertyWriter_init_599291025284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144261;
     Object term144793;
     Object term146422;
     Object term146429;
     Object term146435;

    public BeanPropertyWriter_init_599291025284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143807 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term143925 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term144041 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term144133 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term143807, term143807.getClass(), "_member", term143925);
        setField(term143807, term143807.getClass(), "_contextAnnotations", term144041);
        setField(term143807, term143807.getClass(), "_name", null);
        setField(term143807, term143807.getClass(), "_wrapperName", term144133);
        term144261 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term144353 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term144533 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term144677 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term144353, term144353.getClass(), "_simpleName", "");
        setField(term144261, term144261.getClass(), "_name", term144353);
        setBooleanField(term144261, term144261.getClass(), "_forSerialization", false);
        setField(term144261, term144261.getClass(), "_ctorParameters", null);
        setField(term144533, term144533.getClass(), "next", null);
        setField(term144533, term144533.getClass(), "value", null);
        setField(term144261, term144261.getClass(), "_setters", term144533);
        setField(term144261, term144261.getClass(), "_fields", null);
        setField(term144261, term144261.getClass(), "_annotationIntrospector", term144677);
        term144793 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term146422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term146423 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term146426 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term146427 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term146428 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term146423, term146423.getClass(), "_value", "");
        setField(term146423, term146423.getClass(), "_quotedUTF8Ref", null);
        setField(term146423, term146423.getClass(), "_unquotedUTF8Ref", null);
        setField(term146423, term146423.getClass(), "_quotedChars", null);
        setField(term146423, term146423.getClass(), "_jdkSerializeValue", null);
        setField(term146422, term146422.getClass(), "_name", term146423);
        setField(term146422, term146422.getClass(), "_wrapperName", null);
        setField(term146422, term146422.getClass(), "_declaredType", null);
        setField(term146422, term146422.getClass(), "_cfgSerializationType", null);
        setField(term146422, term146422.getClass(), "_nonTrivialBaseType", null);
        setField(term146426, term146426.getClass(), "_annotations", null);
        setField(term146422, term146422.getClass(), "_contextAnnotations", term146426);
        setField(term146427, term146427.getClass(), "_required", null);
        setField(term146427, term146427.getClass(), "_description", null);
        setField(term146427, term146427.getClass(), "_index", null);
        setField(term146427, term146427.getClass(), "_defaultValue", null);
        setField(term146422, term146422.getClass(), "_metadata", term146427);
        setField(term146422, term146422.getClass(), "_format", null);
        setField(term146422, term146422.getClass(), "_member", null);
        setField(term146422, term146422.getClass(), "_accessorMethod", null);
        setField(term146422, term146422.getClass(), "_field", null);
        setField(term146422, term146422.getClass(), "_serializer", null);
        setField(term146422, term146422.getClass(), "_nullSerializer", null);
        setField(term146422, term146422.getClass(), "_typeSerializer", null);
        setBooleanField(term146428, term146428.getClass(), "_resetWhenFull", false);
        setField(term146422, term146422.getClass(), "_dynamicSerializers", term146428);
        setBooleanField(term146422, term146422.getClass(), "_suppressNulls", false);
        setField(term146422, term146422.getClass(), "_suppressableValue", null);
        setField(term146422, term146422.getClass(), "_includeInViews", null);
        setField(term146422, term146422.getClass(), "_internalSettings", null);
        term146429 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term146430 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term146431 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term146434 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term146429, term146429.getClass(), "_forSerialization", false);
        setField(term146429, term146429.getClass(), "_annotationIntrospector", term146430);
        setField(term146431, term146431.getClass(), "_simpleName", "");
        setField(term146431, term146431.getClass(), "_namespace", null);
        setField(term146431, term146431.getClass(), "_encodedSimple", null);
        setField(term146429, term146429.getClass(), "_name", term146431);
        setField(term146429, term146429.getClass(), "_internalName", null);
        setField(term146429, term146429.getClass(), "_fields", null);
        setField(term146429, term146429.getClass(), "_ctorParameters", null);
        setField(term146429, term146429.getClass(), "_getters", null);
        setField(term146434, term146434.getClass(), "value", null);
        setField(term146434, term146434.getClass(), "next", null);
        setField(term146434, term146434.getClass(), "name", null);
        setBooleanField(term146434, term146434.getClass(), "isNameExplicit", false);
        setBooleanField(term146434, term146434.getClass(), "isVisible", false);
        setBooleanField(term146434, term146434.getClass(), "isMarkedIgnored", false);
        setField(term146429, term146429.getClass(), "_setters", term146434);
        term146435 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term146435, term146435.getClass(), "_annotations", null);
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
        args[0] = term144261;
        args[1] = null;
        args[2] = term144793;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term146422));
        assertTrue(recursiveEquals(term144261, term146429));
        assertTrue(recursiveEquals(term144793, term146435));
    }

};


