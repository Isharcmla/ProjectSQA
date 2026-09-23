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

public class BeanPropertyWriter_init_599291025201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79205;
     Object term79713;
     Object term79829;
     Object term80062;
     Object term80070;
     Object term80076;
     Object term80077;

    public BeanPropertyWriter_init_599291025201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78837 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term78935 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term78637 = (Object[]) newArray("java.lang.Class", 0);
        Object term79077 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double"));
        setField(term78837, term78837.getClass(), "_member", null);
        setField(term78837, term78837.getClass(), "_contextAnnotations", null);
        setField(term78837, term78837.getClass(), "_name", term78935);
        setField(term78837, term78837.getClass(), "_wrapperName", null);
        setField(term78837, term78837.getClass(), "_metadata", null);
        setField(term78837, term78837.getClass(), "_includeInViews", term78637);
        setField(term78837, term78837.getClass(), "_declaredType", null);
        setField(term78837, term78837.getClass(), "_serializer", null);
        setField(term78837, term78837.getClass(), "_dynamicSerializers", term79077);
        setField(term78837, term78837.getClass(), "_typeSerializer", null);
        setField(term78837, term78837.getClass(), "_cfgSerializationType", null);
        term79205 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term79297 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term79477 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term79595 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term79297, term79297.getClass(), "_simpleName", "");
        setField(term79205, term79205.getClass(), "_name", term79297);
        setBooleanField(term79205, term79205.getClass(), "_forSerialization", false);
        setField(term79205, term79205.getClass(), "_ctorParameters", null);
        setField(term79205, term79205.getClass(), "_setters", null);
        setField(term79477, term79477.getClass(), "value", term79595);
        setField(term79477, term79477.getClass(), "next", null);
        setField(term79205, term79205.getClass(), "_fields", term79477);
        setField(term79205, term79205.getClass(), "_annotationIntrospector", null);
        term79713 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term79829 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term80062 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term80063 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term80066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term80067 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term80068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term80069 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term80063, term80063.getClass(), "_value", "");
        setField(term80063, term80063.getClass(), "_quotedUTF8Ref", null);
        setField(term80063, term80063.getClass(), "_unquotedUTF8Ref", null);
        setField(term80063, term80063.getClass(), "_quotedChars", null);
        setField(term80063, term80063.getClass(), "_jdkSerializeValue", null);
        setField(term80062, term80062.getClass(), "_name", term80063);
        setField(term80062, term80062.getClass(), "_wrapperName", null);
        setField(term80062, term80062.getClass(), "_declaredType", null);
        setField(term80062, term80062.getClass(), "_cfgSerializationType", null);
        setField(term80062, term80062.getClass(), "_nonTrivialBaseType", null);
        setField(term80066, term80066.getClass(), "_annotations", null);
        setField(term80062, term80062.getClass(), "_contextAnnotations", term80066);
        setField(term80067, term80067.getClass(), "_required", null);
        setField(term80067, term80067.getClass(), "_description", null);
        setField(term80067, term80067.getClass(), "_index", null);
        setField(term80067, term80067.getClass(), "_defaultValue", null);
        setField(term80062, term80062.getClass(), "_metadata", term80067);
        setField(term80062, term80062.getClass(), "_format", null);
        setField(term80068, term80068.getClass(), "_field", null);
        setField(term80068, term80068.getClass(), "_serialization", null);
        setField(term80068, term80068.getClass(), "_context", null);
        setField(term80068, term80068.getClass(), "_annotations", null);
        setField(term80062, term80062.getClass(), "_member", term80068);
        setField(term80062, term80062.getClass(), "_accessorMethod", null);
        setField(term80062, term80062.getClass(), "_field", null);
        setField(term80062, term80062.getClass(), "_serializer", null);
        setField(term80062, term80062.getClass(), "_nullSerializer", null);
        setField(term80062, term80062.getClass(), "_typeSerializer", null);
        setBooleanField(term80069, term80069.getClass(), "_resetWhenFull", false);
        setField(term80062, term80062.getClass(), "_dynamicSerializers", term80069);
        setBooleanField(term80062, term80062.getClass(), "_suppressNulls", false);
        setField(term80062, term80062.getClass(), "_suppressableValue", null);
        setField(term80062, term80062.getClass(), "_includeInViews", null);
        setField(term80062, term80062.getClass(), "_internalSettings", null);
        term80070 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term80071 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term80074 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term80075 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term80070, term80070.getClass(), "_forSerialization", false);
        setField(term80070, term80070.getClass(), "_annotationIntrospector", null);
        setField(term80071, term80071.getClass(), "_simpleName", "");
        setField(term80071, term80071.getClass(), "_namespace", null);
        setField(term80071, term80071.getClass(), "_encodedSimple", null);
        setField(term80070, term80070.getClass(), "_name", term80071);
        setField(term80070, term80070.getClass(), "_internalName", null);
        setField(term80075, term80075.getClass(), "_field", null);
        setField(term80075, term80075.getClass(), "_serialization", null);
        setField(term80075, term80075.getClass(), "_context", null);
        setField(term80075, term80075.getClass(), "_annotations", null);
        setField(term80074, term80074.getClass(), "value", term80075);
        setField(term80074, term80074.getClass(), "next", null);
        setField(term80074, term80074.getClass(), "name", null);
        setBooleanField(term80074, term80074.getClass(), "isNameExplicit", false);
        setBooleanField(term80074, term80074.getClass(), "isVisible", false);
        setBooleanField(term80074, term80074.getClass(), "isMarkedIgnored", false);
        setField(term80070, term80070.getClass(), "_fields", term80074);
        setField(term80070, term80070.getClass(), "_ctorParameters", null);
        setField(term80070, term80070.getClass(), "_getters", null);
        setField(term80070, term80070.getClass(), "_setters", null);
        term80076 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term80076, term80076.getClass(), "_field", null);
        setField(term80076, term80076.getClass(), "_serialization", null);
        setField(term80076, term80076.getClass(), "_context", null);
        setField(term80076, term80076.getClass(), "_annotations", null);
        term80077 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term80077, term80077.getClass(), "_annotations", null);
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
        args[0] = term79205;
        args[1] = term79713;
        args[2] = term79829;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80062));
        assertTrue(recursiveEquals(term79205, term80070));
        assertTrue(recursiveEquals(term79713, term80076));
        assertTrue(recursiveEquals(term79829, term80077));
    }

};


