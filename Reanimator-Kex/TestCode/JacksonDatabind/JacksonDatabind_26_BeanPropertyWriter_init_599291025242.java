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

public class BeanPropertyWriter_init_599291025242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110706;
     Object term112011;
     Object term112017;

    public BeanPropertyWriter_init_599291025242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110388 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term110486 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term110578 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term110388, term110388.getClass(), "_member", null);
        setField(term110388, term110388.getClass(), "_contextAnnotations", null);
        setField(term110388, term110388.getClass(), "_name", term110486);
        setField(term110388, term110388.getClass(), "_wrapperName", term110578);
        term110706 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term110798 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term110978 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term110798, term110798.getClass(), "_simpleName", "");
        setField(term110706, term110706.getClass(), "_name", term110798);
        setBooleanField(term110706, term110706.getClass(), "_forSerialization", false);
        setField(term110706, term110706.getClass(), "_ctorParameters", null);
        setField(term110706, term110706.getClass(), "_setters", null);
        setField(term110706, term110706.getClass(), "_fields", null);
        setField(term110706, term110706.getClass(), "_annotationIntrospector", term110978);
        term112011 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term112012 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term112015 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term112016 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term112012, term112012.getClass(), "_value", "");
        setField(term112012, term112012.getClass(), "_quotedUTF8Ref", null);
        setField(term112012, term112012.getClass(), "_unquotedUTF8Ref", null);
        setField(term112012, term112012.getClass(), "_quotedChars", null);
        setField(term112012, term112012.getClass(), "_jdkSerializeValue", null);
        setField(term112011, term112011.getClass(), "_name", term112012);
        setField(term112011, term112011.getClass(), "_wrapperName", null);
        setField(term112011, term112011.getClass(), "_declaredType", null);
        setField(term112011, term112011.getClass(), "_cfgSerializationType", null);
        setField(term112011, term112011.getClass(), "_nonTrivialBaseType", null);
        setField(term112011, term112011.getClass(), "_contextAnnotations", null);
        setField(term112015, term112015.getClass(), "_required", null);
        setField(term112015, term112015.getClass(), "_description", null);
        setField(term112015, term112015.getClass(), "_index", null);
        setField(term112015, term112015.getClass(), "_defaultValue", null);
        setField(term112011, term112011.getClass(), "_metadata", term112015);
        setField(term112011, term112011.getClass(), "_format", null);
        setField(term112011, term112011.getClass(), "_member", null);
        setField(term112011, term112011.getClass(), "_accessorMethod", null);
        setField(term112011, term112011.getClass(), "_field", null);
        setField(term112011, term112011.getClass(), "_serializer", null);
        setField(term112011, term112011.getClass(), "_nullSerializer", null);
        setField(term112011, term112011.getClass(), "_typeSerializer", null);
        setBooleanField(term112016, term112016.getClass(), "_resetWhenFull", false);
        setField(term112011, term112011.getClass(), "_dynamicSerializers", term112016);
        setBooleanField(term112011, term112011.getClass(), "_suppressNulls", false);
        setField(term112011, term112011.getClass(), "_suppressableValue", null);
        setField(term112011, term112011.getClass(), "_includeInViews", null);
        setField(term112011, term112011.getClass(), "_internalSettings", null);
        term112017 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term112018 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term112019 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term112017, term112017.getClass(), "_forSerialization", false);
        setField(term112018, term112018.getClass(), "_primary", null);
        setField(term112018, term112018.getClass(), "_secondary", null);
        setField(term112017, term112017.getClass(), "_annotationIntrospector", term112018);
        setField(term112019, term112019.getClass(), "_simpleName", "");
        setField(term112019, term112019.getClass(), "_namespace", null);
        setField(term112019, term112019.getClass(), "_encodedSimple", null);
        setField(term112017, term112017.getClass(), "_name", term112019);
        setField(term112017, term112017.getClass(), "_internalName", null);
        setField(term112017, term112017.getClass(), "_fields", null);
        setField(term112017, term112017.getClass(), "_ctorParameters", null);
        setField(term112017, term112017.getClass(), "_getters", null);
        setField(term112017, term112017.getClass(), "_setters", null);
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
        args[0] = term110706;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term112011));
        assertTrue(recursiveEquals(term110706, term112017));
    }

};


