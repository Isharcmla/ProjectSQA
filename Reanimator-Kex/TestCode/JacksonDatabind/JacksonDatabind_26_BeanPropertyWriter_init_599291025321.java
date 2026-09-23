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

public class BeanPropertyWriter_init_599291025321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180592;
     Object term181246;
     Object term181362;
     Object term181528;
     Object term181536;
     Object term181543;
     Object term181544;

    public BeanPropertyWriter_init_599291025321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179940 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term180058 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object[] term179685 = (Object[]) newArray("java.lang.Class", 0);
        Object term180180 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer"));
        Object term180322 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double"));
        Object term180464 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term179940, term179940.getClass(), "_member", term180058);
        setField(term179940, term179940.getClass(), "_contextAnnotations", null);
        setField(term179940, term179940.getClass(), "_name", null);
        setField(term179940, term179940.getClass(), "_wrapperName", null);
        setField(term179940, term179940.getClass(), "_metadata", null);
        setField(term179940, term179940.getClass(), "_includeInViews", term179685);
        setField(term179940, term179940.getClass(), "_declaredType", null);
        setField(term179940, term179940.getClass(), "_serializer", term180180);
        setField(term179940, term179940.getClass(), "_dynamicSerializers", term180322);
        setField(term179940, term179940.getClass(), "_typeSerializer", term180464);
        setField(term179940, term179940.getClass(), "_cfgSerializationType", null);
        term180592 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term180684 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term180864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term180982 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term181126 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term180684, term180684.getClass(), "_simpleName", "");
        setField(term180592, term180592.getClass(), "_name", term180684);
        setBooleanField(term180592, term180592.getClass(), "_forSerialization", false);
        setField(term180592, term180592.getClass(), "_ctorParameters", null);
        setField(term180592, term180592.getClass(), "_setters", null);
        setField(term180864, term180864.getClass(), "value", term180982);
        setField(term180864, term180864.getClass(), "next", null);
        setField(term180592, term180592.getClass(), "_fields", term180864);
        setField(term180592, term180592.getClass(), "_annotationIntrospector", term181126);
        term181246 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term181362 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term181528 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term181529 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term181532 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term181533 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term181534 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term181535 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term181529, term181529.getClass(), "_value", "");
        setField(term181529, term181529.getClass(), "_quotedUTF8Ref", null);
        setField(term181529, term181529.getClass(), "_unquotedUTF8Ref", null);
        setField(term181529, term181529.getClass(), "_quotedChars", null);
        setField(term181529, term181529.getClass(), "_jdkSerializeValue", null);
        setField(term181528, term181528.getClass(), "_name", term181529);
        setField(term181528, term181528.getClass(), "_wrapperName", null);
        setField(term181528, term181528.getClass(), "_declaredType", null);
        setField(term181528, term181528.getClass(), "_cfgSerializationType", null);
        setField(term181528, term181528.getClass(), "_nonTrivialBaseType", null);
        setField(term181532, term181532.getClass(), "_annotations", null);
        setField(term181528, term181528.getClass(), "_contextAnnotations", term181532);
        setField(term181533, term181533.getClass(), "_required", null);
        setField(term181533, term181533.getClass(), "_description", null);
        setField(term181533, term181533.getClass(), "_index", null);
        setField(term181533, term181533.getClass(), "_defaultValue", null);
        setField(term181528, term181528.getClass(), "_metadata", term181533);
        setField(term181528, term181528.getClass(), "_format", null);
        setField(term181534, term181534.getClass(), "_method", null);
        setField(term181534, term181534.getClass(), "_paramClasses", null);
        setField(term181534, term181534.getClass(), "_serialization", null);
        setField(term181534, term181534.getClass(), "_paramAnnotations", null);
        setField(term181534, term181534.getClass(), "_context", null);
        setField(term181534, term181534.getClass(), "_annotations", null);
        setField(term181528, term181528.getClass(), "_member", term181534);
        setField(term181528, term181528.getClass(), "_accessorMethod", null);
        setField(term181528, term181528.getClass(), "_field", null);
        setField(term181528, term181528.getClass(), "_serializer", null);
        setField(term181528, term181528.getClass(), "_nullSerializer", null);
        setField(term181528, term181528.getClass(), "_typeSerializer", null);
        setBooleanField(term181535, term181535.getClass(), "_resetWhenFull", false);
        setField(term181528, term181528.getClass(), "_dynamicSerializers", term181535);
        setBooleanField(term181528, term181528.getClass(), "_suppressNulls", false);
        setField(term181528, term181528.getClass(), "_suppressableValue", null);
        setField(term181528, term181528.getClass(), "_includeInViews", null);
        setField(term181528, term181528.getClass(), "_internalSettings", null);
        term181536 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term181537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term181538 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term181541 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term181542 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term181536, term181536.getClass(), "_forSerialization", false);
        setField(term181536, term181536.getClass(), "_annotationIntrospector", term181537);
        setField(term181538, term181538.getClass(), "_simpleName", "");
        setField(term181538, term181538.getClass(), "_namespace", null);
        setField(term181538, term181538.getClass(), "_encodedSimple", null);
        setField(term181536, term181536.getClass(), "_name", term181538);
        setField(term181536, term181536.getClass(), "_internalName", null);
        setField(term181542, term181542.getClass(), "_field", null);
        setField(term181542, term181542.getClass(), "_serialization", null);
        setField(term181542, term181542.getClass(), "_context", null);
        setField(term181542, term181542.getClass(), "_annotations", null);
        setField(term181541, term181541.getClass(), "value", term181542);
        setField(term181541, term181541.getClass(), "next", null);
        setField(term181541, term181541.getClass(), "name", null);
        setBooleanField(term181541, term181541.getClass(), "isNameExplicit", false);
        setBooleanField(term181541, term181541.getClass(), "isVisible", false);
        setBooleanField(term181541, term181541.getClass(), "isMarkedIgnored", false);
        setField(term181536, term181536.getClass(), "_fields", term181541);
        setField(term181536, term181536.getClass(), "_ctorParameters", null);
        setField(term181536, term181536.getClass(), "_getters", null);
        setField(term181536, term181536.getClass(), "_setters", null);
        term181543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term181543, term181543.getClass(), "_method", null);
        setField(term181543, term181543.getClass(), "_paramClasses", null);
        setField(term181543, term181543.getClass(), "_serialization", null);
        setField(term181543, term181543.getClass(), "_paramAnnotations", null);
        setField(term181543, term181543.getClass(), "_context", null);
        setField(term181543, term181543.getClass(), "_annotations", null);
        term181544 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term181544, term181544.getClass(), "_annotations", null);
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
        args[0] = term180592;
        args[1] = term181246;
        args[2] = term181362;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term181528));
        assertTrue(recursiveEquals(term180592, term181536));
        assertTrue(recursiveEquals(term181246, term181543));
        assertTrue(recursiveEquals(term181362, term181544));
    }

};


