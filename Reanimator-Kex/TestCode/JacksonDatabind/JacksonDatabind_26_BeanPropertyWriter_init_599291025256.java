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

public class BeanPropertyWriter_init_599291025256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118523;
     Object term118921;
     Object term119037;
     Object term121289;
     Object term121297;
     Object term121302;
     Object term121303;

    public BeanPropertyWriter_init_599291025256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118395 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term118395, term118395.getClass(), "_member", null);
        setField(term118395, term118395.getClass(), "_contextAnnotations", null);
        setField(term118395, term118395.getClass(), "_name", null);
        setField(term118395, term118395.getClass(), "_wrapperName", null);
        setField(term118395, term118395.getClass(), "_metadata", null);
        setField(term118395, term118395.getClass(), "_includeInViews", null);
        setField(term118395, term118395.getClass(), "_declaredType", null);
        setField(term118395, term118395.getClass(), "_serializer", null);
        setField(term118395, term118395.getClass(), "_dynamicSerializers", null);
        setField(term118395, term118395.getClass(), "_typeSerializer", null);
        setField(term118395, term118395.getClass(), "_cfgSerializationType", null);
        term118523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term118615 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term118801 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term118615, term118615.getClass(), "_simpleName", "");
        setField(term118523, term118523.getClass(), "_name", term118615);
        setBooleanField(term118523, term118523.getClass(), "_forSerialization", false);
        setField(term118523, term118523.getClass(), "_ctorParameters", null);
        setField(term118523, term118523.getClass(), "_setters", null);
        setField(term118523, term118523.getClass(), "_fields", null);
        setField(term118523, term118523.getClass(), "_annotationIntrospector", term118801);
        term118921 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term119037 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term121289 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term121290 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term121293 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term121294 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term121295 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term121296 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term121290, term121290.getClass(), "_value", "");
        setField(term121290, term121290.getClass(), "_quotedUTF8Ref", null);
        setField(term121290, term121290.getClass(), "_unquotedUTF8Ref", null);
        setField(term121290, term121290.getClass(), "_quotedChars", null);
        setField(term121290, term121290.getClass(), "_jdkSerializeValue", null);
        setField(term121289, term121289.getClass(), "_name", term121290);
        setField(term121289, term121289.getClass(), "_wrapperName", null);
        setField(term121289, term121289.getClass(), "_declaredType", null);
        setField(term121289, term121289.getClass(), "_cfgSerializationType", null);
        setField(term121289, term121289.getClass(), "_nonTrivialBaseType", null);
        setField(term121293, term121293.getClass(), "_annotations", null);
        setField(term121289, term121289.getClass(), "_contextAnnotations", term121293);
        setField(term121294, term121294.getClass(), "_required", null);
        setField(term121294, term121294.getClass(), "_description", null);
        setField(term121294, term121294.getClass(), "_index", null);
        setField(term121294, term121294.getClass(), "_defaultValue", null);
        setField(term121289, term121289.getClass(), "_metadata", term121294);
        setField(term121289, term121289.getClass(), "_format", null);
        setField(term121295, term121295.getClass(), "_method", null);
        setField(term121295, term121295.getClass(), "_paramClasses", null);
        setField(term121295, term121295.getClass(), "_serialization", null);
        setField(term121295, term121295.getClass(), "_paramAnnotations", null);
        setField(term121295, term121295.getClass(), "_context", null);
        setField(term121295, term121295.getClass(), "_annotations", null);
        setField(term121289, term121289.getClass(), "_member", term121295);
        setField(term121289, term121289.getClass(), "_accessorMethod", null);
        setField(term121289, term121289.getClass(), "_field", null);
        setField(term121289, term121289.getClass(), "_serializer", null);
        setField(term121289, term121289.getClass(), "_nullSerializer", null);
        setField(term121289, term121289.getClass(), "_typeSerializer", null);
        setBooleanField(term121296, term121296.getClass(), "_resetWhenFull", false);
        setField(term121289, term121289.getClass(), "_dynamicSerializers", term121296);
        setBooleanField(term121289, term121289.getClass(), "_suppressNulls", false);
        setField(term121289, term121289.getClass(), "_suppressableValue", null);
        setField(term121289, term121289.getClass(), "_includeInViews", null);
        setField(term121289, term121289.getClass(), "_internalSettings", null);
        term121297 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term121298 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term121299 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term121297, term121297.getClass(), "_forSerialization", false);
        setField(term121297, term121297.getClass(), "_annotationIntrospector", term121298);
        setField(term121299, term121299.getClass(), "_simpleName", "");
        setField(term121299, term121299.getClass(), "_namespace", null);
        setField(term121299, term121299.getClass(), "_encodedSimple", null);
        setField(term121297, term121297.getClass(), "_name", term121299);
        setField(term121297, term121297.getClass(), "_internalName", null);
        setField(term121297, term121297.getClass(), "_fields", null);
        setField(term121297, term121297.getClass(), "_ctorParameters", null);
        setField(term121297, term121297.getClass(), "_getters", null);
        setField(term121297, term121297.getClass(), "_setters", null);
        term121302 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term121302, term121302.getClass(), "_method", null);
        setField(term121302, term121302.getClass(), "_paramClasses", null);
        setField(term121302, term121302.getClass(), "_serialization", null);
        setField(term121302, term121302.getClass(), "_paramAnnotations", null);
        setField(term121302, term121302.getClass(), "_context", null);
        setField(term121302, term121302.getClass(), "_annotations", null);
        term121303 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term121303, term121303.getClass(), "_annotations", null);
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
        args[0] = term118523;
        args[1] = term118921;
        args[2] = term119037;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term121289));
        assertTrue(recursiveEquals(term118523, term121297));
        assertTrue(recursiveEquals(term118921, term121302));
        assertTrue(recursiveEquals(term119037, term121303));
    }

};


