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

public class BeanPropertyWriter_init_599291025329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187277;
     Object term188097;
     Object term188213;
     Object term188386;
     Object term188394;
     Object term188402;
     Object term188403;

    public BeanPropertyWriter_init_599291025329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186821 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term186941 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term187057 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term187149 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term186821, term186821.getClass(), "_member", term186941);
        setField(term186821, term186821.getClass(), "_contextAnnotations", term187057);
        setField(term186821, term186821.getClass(), "_name", null);
        setField(term186821, term186821.getClass(), "_wrapperName", term187149);
        term187277 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term187369 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term187549 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term187691 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term187835 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term187979 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term187369, term187369.getClass(), "_simpleName", "");
        setField(term187277, term187277.getClass(), "_name", term187369);
        setBooleanField(term187277, term187277.getClass(), "_forSerialization", true);
        setField(term187277, term187277.getClass(), "_getters", null);
        setField(term187549, term187549.getClass(), "value", null);
        setField(term187549, term187549.getClass(), "next", null);
        setField(term187277, term187277.getClass(), "_fields", term187549);
        setField(term187691, term187691.getClass(), "_primary", term187835);
        setField(term187691, term187691.getClass(), "_secondary", term187979);
        setField(term187277, term187277.getClass(), "_annotationIntrospector", term187691);
        term188097 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term188213 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term188386 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term188387 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term188390 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term188391 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term188392 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term188393 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term188387, term188387.getClass(), "_value", "");
        setField(term188387, term188387.getClass(), "_quotedUTF8Ref", null);
        setField(term188387, term188387.getClass(), "_unquotedUTF8Ref", null);
        setField(term188387, term188387.getClass(), "_quotedChars", null);
        setField(term188387, term188387.getClass(), "_jdkSerializeValue", null);
        setField(term188386, term188386.getClass(), "_name", term188387);
        setField(term188386, term188386.getClass(), "_wrapperName", null);
        setField(term188386, term188386.getClass(), "_declaredType", null);
        setField(term188386, term188386.getClass(), "_cfgSerializationType", null);
        setField(term188386, term188386.getClass(), "_nonTrivialBaseType", null);
        setField(term188390, term188390.getClass(), "_annotations", null);
        setField(term188386, term188386.getClass(), "_contextAnnotations", term188390);
        setField(term188391, term188391.getClass(), "_required", null);
        setField(term188391, term188391.getClass(), "_description", null);
        setField(term188391, term188391.getClass(), "_index", null);
        setField(term188391, term188391.getClass(), "_defaultValue", null);
        setField(term188386, term188386.getClass(), "_metadata", term188391);
        setField(term188386, term188386.getClass(), "_format", null);
        setField(term188392, term188392.getClass(), "_field", null);
        setField(term188392, term188392.getClass(), "_serialization", null);
        setField(term188392, term188392.getClass(), "_context", null);
        setField(term188392, term188392.getClass(), "_annotations", null);
        setField(term188386, term188386.getClass(), "_member", term188392);
        setField(term188386, term188386.getClass(), "_accessorMethod", null);
        setField(term188386, term188386.getClass(), "_field", null);
        setField(term188386, term188386.getClass(), "_serializer", null);
        setField(term188386, term188386.getClass(), "_nullSerializer", null);
        setField(term188386, term188386.getClass(), "_typeSerializer", null);
        setBooleanField(term188393, term188393.getClass(), "_resetWhenFull", false);
        setField(term188386, term188386.getClass(), "_dynamicSerializers", term188393);
        setBooleanField(term188386, term188386.getClass(), "_suppressNulls", false);
        setField(term188386, term188386.getClass(), "_suppressableValue", null);
        setField(term188386, term188386.getClass(), "_includeInViews", null);
        setField(term188386, term188386.getClass(), "_internalSettings", null);
        term188394 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term188395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term188396 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term188397 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term188398 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term188401 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term188394, term188394.getClass(), "_forSerialization", true);
        setField(term188395, term188395.getClass(), "_primary", term188396);
        setField(term188395, term188395.getClass(), "_secondary", term188397);
        setField(term188394, term188394.getClass(), "_annotationIntrospector", term188395);
        setField(term188398, term188398.getClass(), "_simpleName", "");
        setField(term188398, term188398.getClass(), "_namespace", null);
        setField(term188398, term188398.getClass(), "_encodedSimple", null);
        setField(term188394, term188394.getClass(), "_name", term188398);
        setField(term188394, term188394.getClass(), "_internalName", null);
        setField(term188401, term188401.getClass(), "value", null);
        setField(term188401, term188401.getClass(), "next", null);
        setField(term188401, term188401.getClass(), "name", null);
        setBooleanField(term188401, term188401.getClass(), "isNameExplicit", false);
        setBooleanField(term188401, term188401.getClass(), "isVisible", false);
        setBooleanField(term188401, term188401.getClass(), "isMarkedIgnored", false);
        setField(term188394, term188394.getClass(), "_fields", term188401);
        setField(term188394, term188394.getClass(), "_ctorParameters", null);
        setField(term188394, term188394.getClass(), "_getters", null);
        setField(term188394, term188394.getClass(), "_setters", null);
        term188402 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term188402, term188402.getClass(), "_field", null);
        setField(term188402, term188402.getClass(), "_serialization", null);
        setField(term188402, term188402.getClass(), "_context", null);
        setField(term188402, term188402.getClass(), "_annotations", null);
        term188403 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term188403, term188403.getClass(), "_annotations", null);
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
        args[0] = term187277;
        args[1] = term188097;
        args[2] = term188213;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term188386));
        assertTrue(recursiveEquals(term187277, term188394));
        assertTrue(recursiveEquals(term188097, term188402));
        assertTrue(recursiveEquals(term188213, term188403));
    }

};


