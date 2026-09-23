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

public class BeanPropertyWriter_init_599291025270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132875;
     Object term133425;
     Object term133541;
     Object term135505;
     Object term135513;
     Object term135519;
     Object term135520;

    public BeanPropertyWriter_init_599291025270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132531 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term132649 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term132747 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term132531, term132531.getClass(), "_member", term132649);
        setField(term132531, term132531.getClass(), "_contextAnnotations", null);
        setField(term132531, term132531.getClass(), "_name", term132747);
        setField(term132531, term132531.getClass(), "_wrapperName", null);
        term132875 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term132967 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term133147 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term133291 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term132967, term132967.getClass(), "_simpleName", "");
        setField(term132875, term132875.getClass(), "_name", term132967);
        setBooleanField(term132875, term132875.getClass(), "_forSerialization", true);
        setField(term132875, term132875.getClass(), "_getters", null);
        setField(term133147, term133147.getClass(), "value", null);
        setField(term133147, term133147.getClass(), "next", null);
        setField(term132875, term132875.getClass(), "_fields", term133147);
        setField(term132875, term132875.getClass(), "_annotationIntrospector", term133291);
        term133425 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        term133541 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term135505 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term135506 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term135509 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term135510 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term135511 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term135512 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term135506, term135506.getClass(), "_value", "");
        setField(term135506, term135506.getClass(), "_quotedUTF8Ref", null);
        setField(term135506, term135506.getClass(), "_unquotedUTF8Ref", null);
        setField(term135506, term135506.getClass(), "_quotedChars", null);
        setField(term135506, term135506.getClass(), "_jdkSerializeValue", null);
        setField(term135505, term135505.getClass(), "_name", term135506);
        setField(term135505, term135505.getClass(), "_wrapperName", null);
        setField(term135505, term135505.getClass(), "_declaredType", null);
        setField(term135505, term135505.getClass(), "_cfgSerializationType", null);
        setField(term135505, term135505.getClass(), "_nonTrivialBaseType", null);
        setField(term135509, term135509.getClass(), "_annotations", null);
        setField(term135505, term135505.getClass(), "_contextAnnotations", term135509);
        setField(term135510, term135510.getClass(), "_required", null);
        setField(term135510, term135510.getClass(), "_description", null);
        setField(term135510, term135510.getClass(), "_index", null);
        setField(term135510, term135510.getClass(), "_defaultValue", null);
        setField(term135505, term135505.getClass(), "_metadata", term135510);
        setField(term135505, term135505.getClass(), "_format", null);
        setField(term135511, term135511.getClass(), "_declaringClass", null);
        setField(term135511, term135511.getClass(), "_rawType", null);
        setField(term135511, term135511.getClass(), "_name", null);
        setField(term135511, term135511.getClass(), "_context", null);
        setField(term135511, term135511.getClass(), "_annotations", null);
        setField(term135505, term135505.getClass(), "_member", term135511);
        setField(term135505, term135505.getClass(), "_accessorMethod", null);
        setField(term135505, term135505.getClass(), "_field", null);
        setField(term135505, term135505.getClass(), "_serializer", null);
        setField(term135505, term135505.getClass(), "_nullSerializer", null);
        setField(term135505, term135505.getClass(), "_typeSerializer", null);
        setBooleanField(term135512, term135512.getClass(), "_resetWhenFull", false);
        setField(term135505, term135505.getClass(), "_dynamicSerializers", term135512);
        setBooleanField(term135505, term135505.getClass(), "_suppressNulls", false);
        setField(term135505, term135505.getClass(), "_suppressableValue", null);
        setField(term135505, term135505.getClass(), "_includeInViews", null);
        setField(term135505, term135505.getClass(), "_internalSettings", null);
        term135513 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term135514 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term135515 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term135518 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term135513, term135513.getClass(), "_forSerialization", true);
        setField(term135513, term135513.getClass(), "_annotationIntrospector", term135514);
        setField(term135515, term135515.getClass(), "_simpleName", "");
        setField(term135515, term135515.getClass(), "_namespace", null);
        setField(term135515, term135515.getClass(), "_encodedSimple", null);
        setField(term135513, term135513.getClass(), "_name", term135515);
        setField(term135513, term135513.getClass(), "_internalName", null);
        setField(term135518, term135518.getClass(), "value", null);
        setField(term135518, term135518.getClass(), "next", null);
        setField(term135518, term135518.getClass(), "name", null);
        setBooleanField(term135518, term135518.getClass(), "isNameExplicit", false);
        setBooleanField(term135518, term135518.getClass(), "isVisible", false);
        setBooleanField(term135518, term135518.getClass(), "isMarkedIgnored", false);
        setField(term135513, term135513.getClass(), "_fields", term135518);
        setField(term135513, term135513.getClass(), "_ctorParameters", null);
        setField(term135513, term135513.getClass(), "_getters", null);
        setField(term135513, term135513.getClass(), "_setters", null);
        term135519 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term135519, term135519.getClass(), "_declaringClass", null);
        setField(term135519, term135519.getClass(), "_rawType", null);
        setField(term135519, term135519.getClass(), "_name", null);
        setField(term135519, term135519.getClass(), "_context", null);
        setField(term135519, term135519.getClass(), "_annotations", null);
        term135520 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term135520, term135520.getClass(), "_annotations", null);
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
        args[0] = term132875;
        args[1] = term133425;
        args[2] = term133541;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term135505));
        assertTrue(recursiveEquals(term132875, term135513));
        assertTrue(recursiveEquals(term133425, term135519));
        assertTrue(recursiveEquals(term133541, term135520));
    }

};


