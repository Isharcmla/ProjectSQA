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

public class BeanPropertyWriter_init_599291025394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244245;
     Object term244637;
     Object term244789;
     Object term245904;
     Object term245911;
     Object term245916;
     Object term245917;

    public BeanPropertyWriter_init_599291025394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term244117 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term243891 = (Object[]) newArray("java.lang.Class", 0);
        setField(term244117, term244117.getClass(), "_member", null);
        setField(term244117, term244117.getClass(), "_contextAnnotations", null);
        setField(term244117, term244117.getClass(), "_name", null);
        setField(term244117, term244117.getClass(), "_wrapperName", null);
        setField(term244117, term244117.getClass(), "_metadata", null);
        setField(term244117, term244117.getClass(), "_includeInViews", term243891);
        setField(term244117, term244117.getClass(), "_declaredType", null);
        setField(term244117, term244117.getClass(), "_serializer", null);
        setField(term244117, term244117.getClass(), "_dynamicSerializers", null);
        setField(term244117, term244117.getClass(), "_typeSerializer", null);
        setField(term244117, term244117.getClass(), "_cfgSerializationType", null);
        term244245 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term244337 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term244517 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term244337, term244337.getClass(), "_simpleName", "");
        setField(term244245, term244245.getClass(), "_name", term244337);
        setBooleanField(term244245, term244245.getClass(), "_forSerialization", false);
        setField(term244245, term244245.getClass(), "_ctorParameters", null);
        setField(term244245, term244245.getClass(), "_setters", null);
        setField(term244245, term244245.getClass(), "_fields", null);
        setField(term244245, term244245.getClass(), "_annotationIntrospector", term244517);
        term244637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term244789 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        term245904 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term245905 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term245908 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term245909 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term245910 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        setField(term245905, term245905.getClass(), "_value", "");
        setField(term245905, term245905.getClass(), "_quotedUTF8Ref", null);
        setField(term245905, term245905.getClass(), "_unquotedUTF8Ref", null);
        setField(term245905, term245905.getClass(), "_quotedChars", null);
        setField(term245905, term245905.getClass(), "_jdkSerializeValue", null);
        setField(term245904, term245904.getClass(), "_name", term245905);
        setField(term245904, term245904.getClass(), "_wrapperName", null);
        setField(term245904, term245904.getClass(), "_declaredType", null);
        setField(term245904, term245904.getClass(), "_cfgSerializationType", null);
        setField(term245904, term245904.getClass(), "_nonTrivialBaseType", null);
        setField(term245904, term245904.getClass(), "_contextAnnotations", null);
        setField(term245908, term245908.getClass(), "_required", null);
        setField(term245908, term245908.getClass(), "_description", null);
        setField(term245908, term245908.getClass(), "_index", null);
        setField(term245908, term245908.getClass(), "_defaultValue", null);
        setField(term245904, term245904.getClass(), "_metadata", term245908);
        setField(term245904, term245904.getClass(), "_format", null);
        setField(term245909, term245909.getClass(), "_method", null);
        setField(term245909, term245909.getClass(), "_paramClasses", null);
        setField(term245909, term245909.getClass(), "_serialization", null);
        setField(term245909, term245909.getClass(), "_paramAnnotations", null);
        setField(term245909, term245909.getClass(), "_context", null);
        setField(term245909, term245909.getClass(), "_annotations", null);
        setField(term245904, term245904.getClass(), "_member", term245909);
        setField(term245904, term245904.getClass(), "_accessorMethod", null);
        setField(term245904, term245904.getClass(), "_field", null);
        setField(term245910, term245910.getClass(), "_numberType", null);
        setField(term245910, term245910.getClass(), "_schemaType", null);
        setBooleanField(term245910, term245910.getClass(), "_isInt", false);
        setField(term245910, term245910.getClass(), "_handledType", null);
        setField(term245904, term245904.getClass(), "_serializer", term245910);
        setField(term245904, term245904.getClass(), "_nullSerializer", null);
        setField(term245904, term245904.getClass(), "_typeSerializer", null);
        setField(term245904, term245904.getClass(), "_dynamicSerializers", null);
        setBooleanField(term245904, term245904.getClass(), "_suppressNulls", false);
        setField(term245904, term245904.getClass(), "_suppressableValue", null);
        setField(term245904, term245904.getClass(), "_includeInViews", null);
        setField(term245904, term245904.getClass(), "_internalSettings", null);
        term245911 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term245912 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term245913 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term245911, term245911.getClass(), "_forSerialization", false);
        setField(term245912, term245912.getClass(), "_primary", null);
        setField(term245912, term245912.getClass(), "_secondary", null);
        setField(term245911, term245911.getClass(), "_annotationIntrospector", term245912);
        setField(term245913, term245913.getClass(), "_simpleName", "");
        setField(term245913, term245913.getClass(), "_namespace", null);
        setField(term245913, term245913.getClass(), "_encodedSimple", null);
        setField(term245911, term245911.getClass(), "_name", term245913);
        setField(term245911, term245911.getClass(), "_internalName", null);
        setField(term245911, term245911.getClass(), "_fields", null);
        setField(term245911, term245911.getClass(), "_ctorParameters", null);
        setField(term245911, term245911.getClass(), "_getters", null);
        setField(term245911, term245911.getClass(), "_setters", null);
        term245916 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term245916, term245916.getClass(), "_method", null);
        setField(term245916, term245916.getClass(), "_paramClasses", null);
        setField(term245916, term245916.getClass(), "_serialization", null);
        setField(term245916, term245916.getClass(), "_paramAnnotations", null);
        setField(term245916, term245916.getClass(), "_context", null);
        setField(term245916, term245916.getClass(), "_annotations", null);
        term245917 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        setField(term245917, term245917.getClass(), "_numberType", null);
        setField(term245917, term245917.getClass(), "_schemaType", null);
        setBooleanField(term245917, term245917.getClass(), "_isInt", false);
        setField(term245917, term245917.getClass(), "_handledType", null);
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
        args[0] = term244245;
        args[1] = term244637;
        args[2] = null;
        args[3] = null;
        args[4] = term244789;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term245904));
        assertTrue(recursiveEquals(term244245, term245911));
        assertTrue(recursiveEquals(term244637, term245916));
        assertTrue(recursiveEquals(term244789, term245917));
    }

};


