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

public class BeanPropertyWriter_init_599291025159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49450;
     Object term49838;
     Object term51781;
     Object term51787;
     Object term51792;

    public BeanPropertyWriter_init_599291025159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49322 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term49322, term49322.getClass(), "_member", null);
        setField(term49322, term49322.getClass(), "_contextAnnotations", null);
        setField(term49322, term49322.getClass(), "_name", null);
        setField(term49322, term49322.getClass(), "_wrapperName", null);
        setField(term49322, term49322.getClass(), "_metadata", null);
        setField(term49322, term49322.getClass(), "_includeInViews", null);
        setField(term49322, term49322.getClass(), "_declaredType", null);
        setField(term49322, term49322.getClass(), "_serializer", null);
        term49450 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term49542 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term49722 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term49542, term49542.getClass(), "_simpleName", "");
        setField(term49450, term49450.getClass(), "_name", term49542);
        setBooleanField(term49450, term49450.getClass(), "_forSerialization", false);
        setField(term49450, term49450.getClass(), "_ctorParameters", null);
        setField(term49450, term49450.getClass(), "_setters", null);
        setField(term49722, term49722.getClass(), "value", null);
        setField(term49722, term49722.getClass(), "next", null);
        setField(term49450, term49450.getClass(), "_fields", term49722);
        setField(term49450, term49450.getClass(), "_annotationIntrospector", null);
        term49838 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        term51781 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term51782 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term51785 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term51786 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        setField(term51782, term51782.getClass(), "_value", "");
        setField(term51782, term51782.getClass(), "_quotedUTF8Ref", null);
        setField(term51782, term51782.getClass(), "_unquotedUTF8Ref", null);
        setField(term51782, term51782.getClass(), "_quotedChars", null);
        setField(term51782, term51782.getClass(), "_jdkSerializeValue", null);
        setField(term51781, term51781.getClass(), "_name", term51782);
        setField(term51781, term51781.getClass(), "_wrapperName", null);
        setField(term51781, term51781.getClass(), "_declaredType", null);
        setField(term51781, term51781.getClass(), "_cfgSerializationType", null);
        setField(term51781, term51781.getClass(), "_nonTrivialBaseType", null);
        setField(term51781, term51781.getClass(), "_contextAnnotations", null);
        setField(term51785, term51785.getClass(), "_required", null);
        setField(term51785, term51785.getClass(), "_description", null);
        setField(term51785, term51785.getClass(), "_index", null);
        setField(term51785, term51785.getClass(), "_defaultValue", null);
        setField(term51781, term51781.getClass(), "_metadata", term51785);
        setField(term51781, term51781.getClass(), "_format", null);
        setField(term51781, term51781.getClass(), "_member", null);
        setField(term51781, term51781.getClass(), "_accessorMethod", null);
        setField(term51781, term51781.getClass(), "_field", null);
        setField(term51786, term51786.getClass(), "_handledType", null);
        setField(term51781, term51781.getClass(), "_serializer", term51786);
        setField(term51781, term51781.getClass(), "_nullSerializer", null);
        setField(term51781, term51781.getClass(), "_typeSerializer", null);
        setField(term51781, term51781.getClass(), "_dynamicSerializers", null);
        setBooleanField(term51781, term51781.getClass(), "_suppressNulls", false);
        setField(term51781, term51781.getClass(), "_suppressableValue", null);
        setField(term51781, term51781.getClass(), "_includeInViews", null);
        setField(term51781, term51781.getClass(), "_internalSettings", null);
        term51787 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term51788 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term51791 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term51787, term51787.getClass(), "_forSerialization", false);
        setField(term51787, term51787.getClass(), "_annotationIntrospector", null);
        setField(term51788, term51788.getClass(), "_simpleName", "");
        setField(term51788, term51788.getClass(), "_namespace", null);
        setField(term51788, term51788.getClass(), "_encodedSimple", null);
        setField(term51787, term51787.getClass(), "_name", term51788);
        setField(term51787, term51787.getClass(), "_internalName", null);
        setField(term51791, term51791.getClass(), "value", null);
        setField(term51791, term51791.getClass(), "next", null);
        setField(term51791, term51791.getClass(), "name", null);
        setBooleanField(term51791, term51791.getClass(), "isNameExplicit", false);
        setBooleanField(term51791, term51791.getClass(), "isVisible", false);
        setBooleanField(term51791, term51791.getClass(), "isMarkedIgnored", false);
        setField(term51787, term51787.getClass(), "_fields", term51791);
        setField(term51787, term51787.getClass(), "_ctorParameters", null);
        setField(term51787, term51787.getClass(), "_getters", null);
        setField(term51787, term51787.getClass(), "_setters", null);
        term51792 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        setField(term51792, term51792.getClass(), "_handledType", null);
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
        args[0] = term49450;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term49838;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51781));
        assertTrue(recursiveEquals(term49450, term51787));
        assertTrue(recursiveEquals(term49838, term51792));
    }

};


