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

public class BeanPropertyWriter_init_599291025378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226330;
     Object term227148;
     Object term227321;
     Object term227328;
     Object term227336;

    public BeanPropertyWriter_init_599291025378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term226080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term226202 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(term226080, term226080.getClass(), "_member", null);
        setField(term226080, term226080.getClass(), "_contextAnnotations", null);
        setField(term226080, term226080.getClass(), "_name", null);
        setField(term226080, term226080.getClass(), "_wrapperName", null);
        setField(term226080, term226080.getClass(), "_metadata", null);
        setField(term226080, term226080.getClass(), "_includeInViews", null);
        setField(term226080, term226080.getClass(), "_declaredType", null);
        setField(term226080, term226080.getClass(), "_serializer", term226202);
        setField(term226080, term226080.getClass(), "_dynamicSerializers", null);
        setField(term226080, term226080.getClass(), "_typeSerializer", null);
        setField(term226080, term226080.getClass(), "_cfgSerializationType", null);
        term226330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term226422 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term226602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term226744 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term226888 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term227032 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term226422, term226422.getClass(), "_simpleName", "");
        setField(term226330, term226330.getClass(), "_name", term226422);
        setBooleanField(term226330, term226330.getClass(), "_forSerialization", true);
        setField(term226330, term226330.getClass(), "_getters", null);
        setField(term226602, term226602.getClass(), "value", null);
        setField(term226602, term226602.getClass(), "next", null);
        setField(term226330, term226330.getClass(), "_fields", term226602);
        setField(term226744, term226744.getClass(), "_primary", term226888);
        setField(term226744, term226744.getClass(), "_secondary", term227032);
        setField(term226330, term226330.getClass(), "_annotationIntrospector", term226744);
        term227148 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term227321 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term227322 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term227325 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term227326 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term227327 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term227322, term227322.getClass(), "_value", "");
        setField(term227322, term227322.getClass(), "_quotedUTF8Ref", null);
        setField(term227322, term227322.getClass(), "_unquotedUTF8Ref", null);
        setField(term227322, term227322.getClass(), "_quotedChars", null);
        setField(term227322, term227322.getClass(), "_jdkSerializeValue", null);
        setField(term227321, term227321.getClass(), "_name", term227322);
        setField(term227321, term227321.getClass(), "_wrapperName", null);
        setField(term227321, term227321.getClass(), "_declaredType", null);
        setField(term227321, term227321.getClass(), "_cfgSerializationType", null);
        setField(term227321, term227321.getClass(), "_nonTrivialBaseType", null);
        setField(term227325, term227325.getClass(), "_annotations", null);
        setField(term227321, term227321.getClass(), "_contextAnnotations", term227325);
        setField(term227326, term227326.getClass(), "_required", null);
        setField(term227326, term227326.getClass(), "_description", null);
        setField(term227326, term227326.getClass(), "_index", null);
        setField(term227326, term227326.getClass(), "_defaultValue", null);
        setField(term227321, term227321.getClass(), "_metadata", term227326);
        setField(term227321, term227321.getClass(), "_format", null);
        setField(term227321, term227321.getClass(), "_member", null);
        setField(term227321, term227321.getClass(), "_accessorMethod", null);
        setField(term227321, term227321.getClass(), "_field", null);
        setField(term227321, term227321.getClass(), "_serializer", null);
        setField(term227321, term227321.getClass(), "_nullSerializer", null);
        setField(term227321, term227321.getClass(), "_typeSerializer", null);
        setBooleanField(term227327, term227327.getClass(), "_resetWhenFull", false);
        setField(term227321, term227321.getClass(), "_dynamicSerializers", term227327);
        setBooleanField(term227321, term227321.getClass(), "_suppressNulls", false);
        setField(term227321, term227321.getClass(), "_suppressableValue", null);
        setField(term227321, term227321.getClass(), "_includeInViews", null);
        setField(term227321, term227321.getClass(), "_internalSettings", null);
        term227328 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term227329 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term227330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term227331 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term227332 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term227335 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term227328, term227328.getClass(), "_forSerialization", true);
        setField(term227329, term227329.getClass(), "_primary", term227330);
        setField(term227329, term227329.getClass(), "_secondary", term227331);
        setField(term227328, term227328.getClass(), "_annotationIntrospector", term227329);
        setField(term227332, term227332.getClass(), "_simpleName", "");
        setField(term227332, term227332.getClass(), "_namespace", null);
        setField(term227332, term227332.getClass(), "_encodedSimple", null);
        setField(term227328, term227328.getClass(), "_name", term227332);
        setField(term227328, term227328.getClass(), "_internalName", null);
        setField(term227335, term227335.getClass(), "value", null);
        setField(term227335, term227335.getClass(), "next", null);
        setField(term227335, term227335.getClass(), "name", null);
        setBooleanField(term227335, term227335.getClass(), "isNameExplicit", false);
        setBooleanField(term227335, term227335.getClass(), "isVisible", false);
        setBooleanField(term227335, term227335.getClass(), "isMarkedIgnored", false);
        setField(term227328, term227328.getClass(), "_fields", term227335);
        setField(term227328, term227328.getClass(), "_ctorParameters", null);
        setField(term227328, term227328.getClass(), "_getters", null);
        setField(term227328, term227328.getClass(), "_setters", null);
        term227336 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term227336, term227336.getClass(), "_annotations", null);
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
        args[0] = term226330;
        args[1] = null;
        args[2] = term227148;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term227321));
        assertTrue(recursiveEquals(term226330, term227328));
        assertTrue(recursiveEquals(term227148, term227336));
    }

};


