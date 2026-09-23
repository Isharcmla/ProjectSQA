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

public class BeanPropertyWriter_init_599291025358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212227;
     Object term212763;
     Object term212901;
     Object term213176;
     Object term213184;
     Object term213190;
     Object term213191;

    public BeanPropertyWriter_init_599291025358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term211979 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term212099 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object[] term211726 = (Object[]) newArray("java.lang.Class", 0);
        setField(term211979, term211979.getClass(), "_member", term212099);
        setField(term211979, term211979.getClass(), "_contextAnnotations", null);
        setField(term211979, term211979.getClass(), "_name", null);
        setField(term211979, term211979.getClass(), "_wrapperName", null);
        setField(term211979, term211979.getClass(), "_metadata", null);
        setField(term211979, term211979.getClass(), "_includeInViews", term211726);
        setField(term211979, term211979.getClass(), "_declaredType", null);
        setField(term211979, term211979.getClass(), "_serializer", null);
        setField(term211979, term211979.getClass(), "_dynamicSerializers", null);
        setField(term211979, term211979.getClass(), "_typeSerializer", null);
        setField(term211979, term211979.getClass(), "_cfgSerializationType", null);
        term212227 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term212319 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term212499 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term212643 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term212319, term212319.getClass(), "_simpleName", "");
        setField(term212227, term212227.getClass(), "_name", term212319);
        setBooleanField(term212227, term212227.getClass(), "_forSerialization", false);
        setField(term212227, term212227.getClass(), "_ctorParameters", null);
        setField(term212227, term212227.getClass(), "_setters", null);
        setField(term212499, term212499.getClass(), "value", null);
        setField(term212499, term212499.getClass(), "next", null);
        setField(term212227, term212227.getClass(), "_fields", term212499);
        setField(term212227, term212227.getClass(), "_annotationIntrospector", term212643);
        term212763 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term212901 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        term213176 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term213177 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term213180 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term213181 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term213182 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        Object term213183 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term213177, term213177.getClass(), "_value", "");
        setField(term213177, term213177.getClass(), "_quotedUTF8Ref", null);
        setField(term213177, term213177.getClass(), "_unquotedUTF8Ref", null);
        setField(term213177, term213177.getClass(), "_quotedChars", null);
        setField(term213177, term213177.getClass(), "_jdkSerializeValue", null);
        setField(term213176, term213176.getClass(), "_name", term213177);
        setField(term213176, term213176.getClass(), "_wrapperName", null);
        setField(term213176, term213176.getClass(), "_declaredType", null);
        setField(term213176, term213176.getClass(), "_cfgSerializationType", null);
        setField(term213176, term213176.getClass(), "_nonTrivialBaseType", null);
        setField(term213176, term213176.getClass(), "_contextAnnotations", null);
        setField(term213180, term213180.getClass(), "_required", null);
        setField(term213180, term213180.getClass(), "_description", null);
        setField(term213180, term213180.getClass(), "_index", null);
        setField(term213180, term213180.getClass(), "_defaultValue", null);
        setField(term213176, term213176.getClass(), "_metadata", term213180);
        setField(term213176, term213176.getClass(), "_format", null);
        setField(term213181, term213181.getClass(), "_method", null);
        setField(term213181, term213181.getClass(), "_paramClasses", null);
        setField(term213181, term213181.getClass(), "_serialization", null);
        setField(term213181, term213181.getClass(), "_paramAnnotations", null);
        setField(term213181, term213181.getClass(), "_context", null);
        setField(term213181, term213181.getClass(), "_annotations", null);
        setField(term213176, term213176.getClass(), "_member", term213181);
        setField(term213176, term213176.getClass(), "_accessorMethod", null);
        setField(term213176, term213176.getClass(), "_field", null);
        setField(term213176, term213176.getClass(), "_serializer", null);
        setField(term213176, term213176.getClass(), "_nullSerializer", null);
        setField(term213182, term213182.getClass(), "_idResolver", null);
        setField(term213182, term213182.getClass(), "_property", null);
        setField(term213176, term213176.getClass(), "_typeSerializer", term213182);
        setBooleanField(term213183, term213183.getClass(), "_resetWhenFull", false);
        setField(term213176, term213176.getClass(), "_dynamicSerializers", term213183);
        setBooleanField(term213176, term213176.getClass(), "_suppressNulls", false);
        setField(term213176, term213176.getClass(), "_suppressableValue", null);
        setField(term213176, term213176.getClass(), "_includeInViews", null);
        setField(term213176, term213176.getClass(), "_internalSettings", null);
        term213184 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term213185 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term213186 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term213189 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term213184, term213184.getClass(), "_forSerialization", false);
        setField(term213184, term213184.getClass(), "_annotationIntrospector", term213185);
        setField(term213186, term213186.getClass(), "_simpleName", "");
        setField(term213186, term213186.getClass(), "_namespace", null);
        setField(term213186, term213186.getClass(), "_encodedSimple", null);
        setField(term213184, term213184.getClass(), "_name", term213186);
        setField(term213184, term213184.getClass(), "_internalName", null);
        setField(term213189, term213189.getClass(), "value", null);
        setField(term213189, term213189.getClass(), "next", null);
        setField(term213189, term213189.getClass(), "name", null);
        setBooleanField(term213189, term213189.getClass(), "isNameExplicit", false);
        setBooleanField(term213189, term213189.getClass(), "isVisible", false);
        setBooleanField(term213189, term213189.getClass(), "isMarkedIgnored", false);
        setField(term213184, term213184.getClass(), "_fields", term213189);
        setField(term213184, term213184.getClass(), "_ctorParameters", null);
        setField(term213184, term213184.getClass(), "_getters", null);
        setField(term213184, term213184.getClass(), "_setters", null);
        term213190 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term213190, term213190.getClass(), "_method", null);
        setField(term213190, term213190.getClass(), "_paramClasses", null);
        setField(term213190, term213190.getClass(), "_serialization", null);
        setField(term213190, term213190.getClass(), "_paramAnnotations", null);
        setField(term213190, term213190.getClass(), "_context", null);
        setField(term213190, term213190.getClass(), "_annotations", null);
        term213191 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        setField(term213191, term213191.getClass(), "_idResolver", null);
        setField(term213191, term213191.getClass(), "_property", null);
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
        args[0] = term212227;
        args[1] = term212763;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term212901;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term213176));
        assertTrue(recursiveEquals(term212227, term213184));
        assertTrue(recursiveEquals(term212763, term213190));
        assertTrue(recursiveEquals(term212901, term213191));
    }

};


