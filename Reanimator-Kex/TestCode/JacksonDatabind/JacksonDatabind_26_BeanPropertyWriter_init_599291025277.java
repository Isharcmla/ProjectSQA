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

public class BeanPropertyWriter_init_599291025277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140251;
     Object term140641;
     Object term140757;
     Object term140875;
     Object term140883;
     Object term140888;
     Object term140889;

    public BeanPropertyWriter_init_599291025277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term139883 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term139981 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term139654 = (Object[]) newArray("java.lang.Class", 0);
        Object term140123 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double"));
        setField(term139883, term139883.getClass(), "_member", null);
        setField(term139883, term139883.getClass(), "_contextAnnotations", null);
        setField(term139883, term139883.getClass(), "_name", term139981);
        setField(term139883, term139883.getClass(), "_wrapperName", null);
        setField(term139883, term139883.getClass(), "_metadata", null);
        setField(term139883, term139883.getClass(), "_includeInViews", term139654);
        setField(term139883, term139883.getClass(), "_declaredType", null);
        setField(term139883, term139883.getClass(), "_serializer", null);
        setField(term139883, term139883.getClass(), "_dynamicSerializers", term140123);
        setField(term139883, term139883.getClass(), "_typeSerializer", null);
        setField(term139883, term139883.getClass(), "_cfgSerializationType", null);
        term140251 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term140343 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term140523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term140343, term140343.getClass(), "_simpleName", "");
        setField(term140251, term140251.getClass(), "_name", term140343);
        setBooleanField(term140251, term140251.getClass(), "_forSerialization", false);
        setField(term140251, term140251.getClass(), "_ctorParameters", null);
        setField(term140251, term140251.getClass(), "_setters", null);
        setField(term140251, term140251.getClass(), "_fields", null);
        setField(term140251, term140251.getClass(), "_annotationIntrospector", term140523);
        term140641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term140757 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term140875 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term140876 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term140879 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term140880 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term140881 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term140882 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term140876, term140876.getClass(), "_value", "");
        setField(term140876, term140876.getClass(), "_quotedUTF8Ref", null);
        setField(term140876, term140876.getClass(), "_unquotedUTF8Ref", null);
        setField(term140876, term140876.getClass(), "_quotedChars", null);
        setField(term140876, term140876.getClass(), "_jdkSerializeValue", null);
        setField(term140875, term140875.getClass(), "_name", term140876);
        setField(term140875, term140875.getClass(), "_wrapperName", null);
        setField(term140875, term140875.getClass(), "_declaredType", null);
        setField(term140875, term140875.getClass(), "_cfgSerializationType", null);
        setField(term140875, term140875.getClass(), "_nonTrivialBaseType", null);
        setField(term140879, term140879.getClass(), "_annotations", null);
        setField(term140875, term140875.getClass(), "_contextAnnotations", term140879);
        setField(term140880, term140880.getClass(), "_required", null);
        setField(term140880, term140880.getClass(), "_description", null);
        setField(term140880, term140880.getClass(), "_index", null);
        setField(term140880, term140880.getClass(), "_defaultValue", null);
        setField(term140875, term140875.getClass(), "_metadata", term140880);
        setField(term140875, term140875.getClass(), "_format", null);
        setField(term140881, term140881.getClass(), "_field", null);
        setField(term140881, term140881.getClass(), "_serialization", null);
        setField(term140881, term140881.getClass(), "_context", null);
        setField(term140881, term140881.getClass(), "_annotations", null);
        setField(term140875, term140875.getClass(), "_member", term140881);
        setField(term140875, term140875.getClass(), "_accessorMethod", null);
        setField(term140875, term140875.getClass(), "_field", null);
        setField(term140875, term140875.getClass(), "_serializer", null);
        setField(term140875, term140875.getClass(), "_nullSerializer", null);
        setField(term140875, term140875.getClass(), "_typeSerializer", null);
        setBooleanField(term140882, term140882.getClass(), "_resetWhenFull", false);
        setField(term140875, term140875.getClass(), "_dynamicSerializers", term140882);
        setBooleanField(term140875, term140875.getClass(), "_suppressNulls", false);
        setField(term140875, term140875.getClass(), "_suppressableValue", null);
        setField(term140875, term140875.getClass(), "_includeInViews", null);
        setField(term140875, term140875.getClass(), "_internalSettings", null);
        term140883 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term140884 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term140885 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term140883, term140883.getClass(), "_forSerialization", false);
        setField(term140884, term140884.getClass(), "_primary", null);
        setField(term140884, term140884.getClass(), "_secondary", null);
        setField(term140883, term140883.getClass(), "_annotationIntrospector", term140884);
        setField(term140885, term140885.getClass(), "_simpleName", "");
        setField(term140885, term140885.getClass(), "_namespace", null);
        setField(term140885, term140885.getClass(), "_encodedSimple", null);
        setField(term140883, term140883.getClass(), "_name", term140885);
        setField(term140883, term140883.getClass(), "_internalName", null);
        setField(term140883, term140883.getClass(), "_fields", null);
        setField(term140883, term140883.getClass(), "_ctorParameters", null);
        setField(term140883, term140883.getClass(), "_getters", null);
        setField(term140883, term140883.getClass(), "_setters", null);
        term140888 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term140888, term140888.getClass(), "_field", null);
        setField(term140888, term140888.getClass(), "_serialization", null);
        setField(term140888, term140888.getClass(), "_context", null);
        setField(term140888, term140888.getClass(), "_annotations", null);
        term140889 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term140889, term140889.getClass(), "_annotations", null);
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
        args[0] = term140251;
        args[1] = term140641;
        args[2] = term140757;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term140875));
        assertTrue(recursiveEquals(term140251, term140883));
        assertTrue(recursiveEquals(term140641, term140888));
        assertTrue(recursiveEquals(term140757, term140889));
    }

};


