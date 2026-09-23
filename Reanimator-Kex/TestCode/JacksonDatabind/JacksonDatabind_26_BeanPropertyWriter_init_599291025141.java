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

public class BeanPropertyWriter_init_599291025141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36671;
     Object term37140;
     Object term37146;

    public BeanPropertyWriter_init_599291025141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36445 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term36543 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term36445, term36445.getClass(), "_member", null);
        setField(term36445, term36445.getClass(), "_contextAnnotations", null);
        setField(term36445, term36445.getClass(), "_name", term36543);
        term36671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term36763 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term36943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term36763, term36763.getClass(), "_simpleName", "");
        setField(term36671, term36671.getClass(), "_name", term36763);
        setBooleanField(term36671, term36671.getClass(), "_forSerialization", false);
        setField(term36671, term36671.getClass(), "_ctorParameters", null);
        setField(term36671, term36671.getClass(), "_setters", null);
        setField(term36671, term36671.getClass(), "_fields", term36943);
        term37140 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term37141 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term37144 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term37145 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term37141, term37141.getClass(), "_value", "");
        setField(term37141, term37141.getClass(), "_quotedUTF8Ref", null);
        setField(term37141, term37141.getClass(), "_unquotedUTF8Ref", null);
        setField(term37141, term37141.getClass(), "_quotedChars", null);
        setField(term37141, term37141.getClass(), "_jdkSerializeValue", null);
        setField(term37140, term37140.getClass(), "_name", term37141);
        setField(term37140, term37140.getClass(), "_wrapperName", null);
        setField(term37140, term37140.getClass(), "_declaredType", null);
        setField(term37140, term37140.getClass(), "_cfgSerializationType", null);
        setField(term37140, term37140.getClass(), "_nonTrivialBaseType", null);
        setField(term37140, term37140.getClass(), "_contextAnnotations", null);
        setField(term37144, term37144.getClass(), "_required", null);
        setField(term37144, term37144.getClass(), "_description", null);
        setField(term37144, term37144.getClass(), "_index", null);
        setField(term37144, term37144.getClass(), "_defaultValue", null);
        setField(term37140, term37140.getClass(), "_metadata", term37144);
        setField(term37140, term37140.getClass(), "_format", null);
        setField(term37140, term37140.getClass(), "_member", null);
        setField(term37140, term37140.getClass(), "_accessorMethod", null);
        setField(term37140, term37140.getClass(), "_field", null);
        setField(term37140, term37140.getClass(), "_serializer", null);
        setField(term37140, term37140.getClass(), "_nullSerializer", null);
        setField(term37140, term37140.getClass(), "_typeSerializer", null);
        setBooleanField(term37145, term37145.getClass(), "_resetWhenFull", false);
        setField(term37140, term37140.getClass(), "_dynamicSerializers", term37145);
        setBooleanField(term37140, term37140.getClass(), "_suppressNulls", false);
        setField(term37140, term37140.getClass(), "_suppressableValue", null);
        setField(term37140, term37140.getClass(), "_includeInViews", null);
        setField(term37140, term37140.getClass(), "_internalSettings", null);
        term37146 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term37147 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37150 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term37146, term37146.getClass(), "_forSerialization", false);
        setField(term37146, term37146.getClass(), "_annotationIntrospector", null);
        setField(term37147, term37147.getClass(), "_simpleName", "");
        setField(term37147, term37147.getClass(), "_namespace", null);
        setField(term37147, term37147.getClass(), "_encodedSimple", null);
        setField(term37146, term37146.getClass(), "_name", term37147);
        setField(term37146, term37146.getClass(), "_internalName", null);
        setField(term37150, term37150.getClass(), "value", null);
        setField(term37150, term37150.getClass(), "next", null);
        setField(term37150, term37150.getClass(), "name", null);
        setBooleanField(term37150, term37150.getClass(), "isNameExplicit", false);
        setBooleanField(term37150, term37150.getClass(), "isVisible", false);
        setBooleanField(term37150, term37150.getClass(), "isMarkedIgnored", false);
        setField(term37146, term37146.getClass(), "_fields", term37150);
        setField(term37146, term37146.getClass(), "_ctorParameters", null);
        setField(term37146, term37146.getClass(), "_getters", null);
        setField(term37146, term37146.getClass(), "_setters", null);
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
        args[0] = term36671;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37140));
        assertTrue(recursiveEquals(term36671, term37146));
    }

};


