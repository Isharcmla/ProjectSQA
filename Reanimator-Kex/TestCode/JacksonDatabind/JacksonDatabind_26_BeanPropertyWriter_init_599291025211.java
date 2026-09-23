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

public class BeanPropertyWriter_init_599291025211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86790;
     Object term87300;
     Object term87621;
     Object term87628;
     Object term87634;

    public BeanPropertyWriter_init_599291025211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86662 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term86662, term86662.getClass(), "_member", null);
        setField(term86662, term86662.getClass(), "_contextAnnotations", null);
        setField(term86662, term86662.getClass(), "_name", null);
        setField(term86662, term86662.getClass(), "_wrapperName", null);
        setField(term86662, term86662.getClass(), "_metadata", null);
        setField(term86662, term86662.getClass(), "_includeInViews", null);
        setField(term86662, term86662.getClass(), "_declaredType", null);
        setField(term86662, term86662.getClass(), "_serializer", null);
        setField(term86662, term86662.getClass(), "_dynamicSerializers", null);
        setField(term86662, term86662.getClass(), "_typeSerializer", null);
        setField(term86662, term86662.getClass(), "_cfgSerializationType", null);
        term86790 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term86882 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term87062 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term87180 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term86882, term86882.getClass(), "_simpleName", "");
        setField(term86790, term86790.getClass(), "_name", term86882);
        setBooleanField(term86790, term86790.getClass(), "_forSerialization", false);
        setField(term86790, term86790.getClass(), "_ctorParameters", null);
        setField(term86790, term86790.getClass(), "_setters", null);
        setField(term87062, term87062.getClass(), "value", term87180);
        setField(term87062, term87062.getClass(), "next", null);
        setField(term86790, term86790.getClass(), "_fields", term87062);
        setField(term86790, term86790.getClass(), "_annotationIntrospector", null);
        term87300 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term87621 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term87622 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term87625 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term87626 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term87627 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term87622, term87622.getClass(), "_value", "");
        setField(term87622, term87622.getClass(), "_quotedUTF8Ref", null);
        setField(term87622, term87622.getClass(), "_unquotedUTF8Ref", null);
        setField(term87622, term87622.getClass(), "_quotedChars", null);
        setField(term87622, term87622.getClass(), "_jdkSerializeValue", null);
        setField(term87621, term87621.getClass(), "_name", term87622);
        setField(term87621, term87621.getClass(), "_wrapperName", null);
        setField(term87621, term87621.getClass(), "_declaredType", null);
        setField(term87621, term87621.getClass(), "_cfgSerializationType", null);
        setField(term87621, term87621.getClass(), "_nonTrivialBaseType", null);
        setField(term87621, term87621.getClass(), "_contextAnnotations", null);
        setField(term87625, term87625.getClass(), "_required", null);
        setField(term87625, term87625.getClass(), "_description", null);
        setField(term87625, term87625.getClass(), "_index", null);
        setField(term87625, term87625.getClass(), "_defaultValue", null);
        setField(term87621, term87621.getClass(), "_metadata", term87625);
        setField(term87621, term87621.getClass(), "_format", null);
        setField(term87626, term87626.getClass(), "_method", null);
        setField(term87626, term87626.getClass(), "_paramClasses", null);
        setField(term87626, term87626.getClass(), "_serialization", null);
        setField(term87626, term87626.getClass(), "_paramAnnotations", null);
        setField(term87626, term87626.getClass(), "_context", null);
        setField(term87626, term87626.getClass(), "_annotations", null);
        setField(term87621, term87621.getClass(), "_member", term87626);
        setField(term87621, term87621.getClass(), "_accessorMethod", null);
        setField(term87621, term87621.getClass(), "_field", null);
        setField(term87621, term87621.getClass(), "_serializer", null);
        setField(term87621, term87621.getClass(), "_nullSerializer", null);
        setField(term87621, term87621.getClass(), "_typeSerializer", null);
        setBooleanField(term87627, term87627.getClass(), "_resetWhenFull", false);
        setField(term87621, term87621.getClass(), "_dynamicSerializers", term87627);
        setBooleanField(term87621, term87621.getClass(), "_suppressNulls", false);
        setField(term87621, term87621.getClass(), "_suppressableValue", null);
        setField(term87621, term87621.getClass(), "_includeInViews", null);
        setField(term87621, term87621.getClass(), "_internalSettings", null);
        term87628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term87629 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term87632 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term87633 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term87628, term87628.getClass(), "_forSerialization", false);
        setField(term87628, term87628.getClass(), "_annotationIntrospector", null);
        setField(term87629, term87629.getClass(), "_simpleName", "");
        setField(term87629, term87629.getClass(), "_namespace", null);
        setField(term87629, term87629.getClass(), "_encodedSimple", null);
        setField(term87628, term87628.getClass(), "_name", term87629);
        setField(term87628, term87628.getClass(), "_internalName", null);
        setField(term87633, term87633.getClass(), "_field", null);
        setField(term87633, term87633.getClass(), "_serialization", null);
        setField(term87633, term87633.getClass(), "_context", null);
        setField(term87633, term87633.getClass(), "_annotations", null);
        setField(term87632, term87632.getClass(), "value", term87633);
        setField(term87632, term87632.getClass(), "next", null);
        setField(term87632, term87632.getClass(), "name", null);
        setBooleanField(term87632, term87632.getClass(), "isNameExplicit", false);
        setBooleanField(term87632, term87632.getClass(), "isVisible", false);
        setBooleanField(term87632, term87632.getClass(), "isMarkedIgnored", false);
        setField(term87628, term87628.getClass(), "_fields", term87632);
        setField(term87628, term87628.getClass(), "_ctorParameters", null);
        setField(term87628, term87628.getClass(), "_getters", null);
        setField(term87628, term87628.getClass(), "_setters", null);
        term87634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term87634, term87634.getClass(), "_method", null);
        setField(term87634, term87634.getClass(), "_paramClasses", null);
        setField(term87634, term87634.getClass(), "_serialization", null);
        setField(term87634, term87634.getClass(), "_paramAnnotations", null);
        setField(term87634, term87634.getClass(), "_context", null);
        setField(term87634, term87634.getClass(), "_annotations", null);
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
        args[0] = term86790;
        args[1] = term87300;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87621));
        assertTrue(recursiveEquals(term86790, term87628));
        assertTrue(recursiveEquals(term87300, term87634));
    }

};


