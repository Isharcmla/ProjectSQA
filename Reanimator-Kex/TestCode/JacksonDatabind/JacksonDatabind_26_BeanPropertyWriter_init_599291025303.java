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

public class BeanPropertyWriter_init_599291025303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164175;
     Object term164827;
     Object term164943;
     Object term165108;
     Object term165116;
     Object term165123;
     Object term165124;

    public BeanPropertyWriter_init_599291025303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163831 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term163949 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term164047 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term163831, term163831.getClass(), "_member", term163949);
        setField(term163831, term163831.getClass(), "_contextAnnotations", null);
        setField(term163831, term163831.getClass(), "_name", term164047);
        setField(term163831, term163831.getClass(), "_wrapperName", null);
        term164175 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term164267 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term164447 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term164565 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term164709 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term164267, term164267.getClass(), "_simpleName", "");
        setField(term164175, term164175.getClass(), "_name", term164267);
        setBooleanField(term164175, term164175.getClass(), "_forSerialization", false);
        setField(term164175, term164175.getClass(), "_ctorParameters", null);
        setField(term164175, term164175.getClass(), "_setters", null);
        setField(term164447, term164447.getClass(), "value", term164565);
        setField(term164447, term164447.getClass(), "next", null);
        setField(term164175, term164175.getClass(), "_fields", term164447);
        setField(term164175, term164175.getClass(), "_annotationIntrospector", term164709);
        term164827 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term164943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term165108 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term165109 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term165112 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term165113 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term165114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term165115 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term165109, term165109.getClass(), "_value", "");
        setField(term165109, term165109.getClass(), "_quotedUTF8Ref", null);
        setField(term165109, term165109.getClass(), "_unquotedUTF8Ref", null);
        setField(term165109, term165109.getClass(), "_quotedChars", null);
        setField(term165109, term165109.getClass(), "_jdkSerializeValue", null);
        setField(term165108, term165108.getClass(), "_name", term165109);
        setField(term165108, term165108.getClass(), "_wrapperName", null);
        setField(term165108, term165108.getClass(), "_declaredType", null);
        setField(term165108, term165108.getClass(), "_cfgSerializationType", null);
        setField(term165108, term165108.getClass(), "_nonTrivialBaseType", null);
        setField(term165112, term165112.getClass(), "_annotations", null);
        setField(term165108, term165108.getClass(), "_contextAnnotations", term165112);
        setField(term165113, term165113.getClass(), "_required", null);
        setField(term165113, term165113.getClass(), "_description", null);
        setField(term165113, term165113.getClass(), "_index", null);
        setField(term165113, term165113.getClass(), "_defaultValue", null);
        setField(term165108, term165108.getClass(), "_metadata", term165113);
        setField(term165108, term165108.getClass(), "_format", null);
        setField(term165114, term165114.getClass(), "_field", null);
        setField(term165114, term165114.getClass(), "_serialization", null);
        setField(term165114, term165114.getClass(), "_context", null);
        setField(term165114, term165114.getClass(), "_annotations", null);
        setField(term165108, term165108.getClass(), "_member", term165114);
        setField(term165108, term165108.getClass(), "_accessorMethod", null);
        setField(term165108, term165108.getClass(), "_field", null);
        setField(term165108, term165108.getClass(), "_serializer", null);
        setField(term165108, term165108.getClass(), "_nullSerializer", null);
        setField(term165108, term165108.getClass(), "_typeSerializer", null);
        setBooleanField(term165115, term165115.getClass(), "_resetWhenFull", false);
        setField(term165108, term165108.getClass(), "_dynamicSerializers", term165115);
        setBooleanField(term165108, term165108.getClass(), "_suppressNulls", false);
        setField(term165108, term165108.getClass(), "_suppressableValue", null);
        setField(term165108, term165108.getClass(), "_includeInViews", null);
        setField(term165108, term165108.getClass(), "_internalSettings", null);
        term165116 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term165117 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term165118 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term165121 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term165122 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term165116, term165116.getClass(), "_forSerialization", false);
        setField(term165116, term165116.getClass(), "_annotationIntrospector", term165117);
        setField(term165118, term165118.getClass(), "_simpleName", "");
        setField(term165118, term165118.getClass(), "_namespace", null);
        setField(term165118, term165118.getClass(), "_encodedSimple", null);
        setField(term165116, term165116.getClass(), "_name", term165118);
        setField(term165116, term165116.getClass(), "_internalName", null);
        setField(term165122, term165122.getClass(), "_field", null);
        setField(term165122, term165122.getClass(), "_serialization", null);
        setField(term165122, term165122.getClass(), "_context", null);
        setField(term165122, term165122.getClass(), "_annotations", null);
        setField(term165121, term165121.getClass(), "value", term165122);
        setField(term165121, term165121.getClass(), "next", null);
        setField(term165121, term165121.getClass(), "name", null);
        setBooleanField(term165121, term165121.getClass(), "isNameExplicit", false);
        setBooleanField(term165121, term165121.getClass(), "isVisible", false);
        setBooleanField(term165121, term165121.getClass(), "isMarkedIgnored", false);
        setField(term165116, term165116.getClass(), "_fields", term165121);
        setField(term165116, term165116.getClass(), "_ctorParameters", null);
        setField(term165116, term165116.getClass(), "_getters", null);
        setField(term165116, term165116.getClass(), "_setters", null);
        term165123 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term165123, term165123.getClass(), "_field", null);
        setField(term165123, term165123.getClass(), "_serialization", null);
        setField(term165123, term165123.getClass(), "_context", null);
        setField(term165123, term165123.getClass(), "_annotations", null);
        term165124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term165124, term165124.getClass(), "_annotations", null);
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
        args[0] = term164175;
        args[1] = term164827;
        args[2] = term164943;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term165108));
        assertTrue(recursiveEquals(term164175, term165116));
        assertTrue(recursiveEquals(term164827, term165123));
        assertTrue(recursiveEquals(term164943, term165124));
    }

};


