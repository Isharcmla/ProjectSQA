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

public class BeanPropertyWriter_init_599291025131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45348;
     Object term45506;
     Object term48043;
     Object term48049;
     Object term48052;

    public BeanPropertyWriter_init_599291025131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45122 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term45220 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term45122, term45122.getClass(), "_member", null);
        setField(term45122, term45122.getClass(), "_contextAnnotations", null);
        setField(term45220, term45220.getClass(), "_value", null);
        setField(term45122, term45122.getClass(), "_name", term45220);
        term45348 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term45348, term45348.getClass(), "_name", "");
        setBooleanField(term45348, term45348.getClass(), "_forSerialization", true);
        term45506 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term48043 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term48044 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term48045 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term48048 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term48044, term48044.getClass(), "_method", null);
        setField(term48044, term48044.getClass(), "_paramClasses", null);
        setField(term48044, term48044.getClass(), "_serialization", null);
        setField(term48044, term48044.getClass(), "_paramAnnotations", null);
        setField(term48044, term48044.getClass(), "_annotations", null);
        setField(term48043, term48043.getClass(), "_member", term48044);
        setField(term48043, term48043.getClass(), "_contextAnnotations", null);
        setField(term48043, term48043.getClass(), "_declaredType", null);
        setField(term48043, term48043.getClass(), "_accessorMethod", null);
        setField(term48043, term48043.getClass(), "_field", null);
        setField(term48043, term48043.getClass(), "_internalSettings", null);
        setField(term48045, term48045.getClass(), "_value", "");
        setField(term48045, term48045.getClass(), "_quotedUTF8Ref", null);
        setField(term48045, term48045.getClass(), "_unquotedUTF8Ref", null);
        setField(term48045, term48045.getClass(), "_quotedChars", null);
        setField(term48045, term48045.getClass(), "_jdkSerializeValue", null);
        setField(term48043, term48043.getClass(), "_name", term48045);
        setField(term48043, term48043.getClass(), "_wrapperName", null);
        setField(term48043, term48043.getClass(), "_cfgSerializationType", null);
        setField(term48043, term48043.getClass(), "_serializer", null);
        setField(term48043, term48043.getClass(), "_nullSerializer", null);
        setField(term48043, term48043.getClass(), "_dynamicSerializers", term48048);
        setBooleanField(term48043, term48043.getClass(), "_suppressNulls", false);
        setField(term48043, term48043.getClass(), "_suppressableValue", null);
        setField(term48043, term48043.getClass(), "_includeInViews", null);
        setField(term48043, term48043.getClass(), "_typeSerializer", null);
        setField(term48043, term48043.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term48043, term48043.getClass(), "_isRequired", false);
        term48049 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term48049, term48049.getClass(), "_forSerialization", true);
        setField(term48049, term48049.getClass(), "_annotationIntrospector", null);
        setField(term48049, term48049.getClass(), "_name", "");
        setField(term48049, term48049.getClass(), "_internalName", null);
        setField(term48049, term48049.getClass(), "_fields", null);
        setField(term48049, term48049.getClass(), "_ctorParameters", null);
        setField(term48049, term48049.getClass(), "_getters", null);
        setField(term48049, term48049.getClass(), "_setters", null);
        term48052 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term48052, term48052.getClass(), "_method", null);
        setField(term48052, term48052.getClass(), "_paramClasses", null);
        setField(term48052, term48052.getClass(), "_serialization", null);
        setField(term48052, term48052.getClass(), "_paramAnnotations", null);
        setField(term48052, term48052.getClass(), "_annotations", null);
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
        args[0] = term45348;
        args[1] = term45506;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48043));
        assertTrue(recursiveEquals(term45348, term48049));
        assertTrue(recursiveEquals(term45506, term48052));
    }

};
