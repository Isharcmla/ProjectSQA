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

public class BeanPropertyWriter_init_599291025398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247818;
     Object term248338;
     Object term248454;
     Object term249534;
     Object term249542;
     Object term249548;
     Object term249549;

    public BeanPropertyWriter_init_599291025398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term247590 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term247690 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term247590, term247590.getClass(), "_member", null);
        setField(term247590, term247590.getClass(), "_contextAnnotations", null);
        setField(term247590, term247590.getClass(), "_name", null);
        setField(term247590, term247590.getClass(), "_wrapperName", null);
        setField(term247590, term247590.getClass(), "_metadata", term247690);
        setField(term247590, term247590.getClass(), "_includeInViews", null);
        setField(term247590, term247590.getClass(), "_declaredType", null);
        setField(term247590, term247590.getClass(), "_serializer", null);
        setField(term247590, term247590.getClass(), "_dynamicSerializers", null);
        setField(term247590, term247590.getClass(), "_typeSerializer", null);
        setField(term247590, term247590.getClass(), "_cfgSerializationType", null);
        term247818 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term247910 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term248090 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term248208 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term247910, term247910.getClass(), "_simpleName", "");
        setField(term247818, term247818.getClass(), "_name", term247910);
        setBooleanField(term247818, term247818.getClass(), "_forSerialization", true);
        setField(term247818, term247818.getClass(), "_getters", null);
        setField(term248090, term248090.getClass(), "value", term248208);
        setField(term248090, term248090.getClass(), "next", null);
        setField(term247818, term247818.getClass(), "_fields", term248090);
        setField(term247818, term247818.getClass(), "_annotationIntrospector", null);
        term248338 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        term248454 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term249534 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term249535 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term249538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term249539 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term249540 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term249541 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term249535, term249535.getClass(), "_value", "");
        setField(term249535, term249535.getClass(), "_quotedUTF8Ref", null);
        setField(term249535, term249535.getClass(), "_unquotedUTF8Ref", null);
        setField(term249535, term249535.getClass(), "_quotedChars", null);
        setField(term249535, term249535.getClass(), "_jdkSerializeValue", null);
        setField(term249534, term249534.getClass(), "_name", term249535);
        setField(term249534, term249534.getClass(), "_wrapperName", null);
        setField(term249534, term249534.getClass(), "_declaredType", null);
        setField(term249534, term249534.getClass(), "_cfgSerializationType", null);
        setField(term249534, term249534.getClass(), "_nonTrivialBaseType", null);
        setField(term249538, term249538.getClass(), "_annotations", null);
        setField(term249534, term249534.getClass(), "_contextAnnotations", term249538);
        setField(term249539, term249539.getClass(), "_required", null);
        setField(term249539, term249539.getClass(), "_description", null);
        setField(term249539, term249539.getClass(), "_index", null);
        setField(term249539, term249539.getClass(), "_defaultValue", null);
        setField(term249534, term249534.getClass(), "_metadata", term249539);
        setField(term249534, term249534.getClass(), "_format", null);
        setField(term249540, term249540.getClass(), "_constructor", null);
        setField(term249540, term249540.getClass(), "_serialization", null);
        setField(term249540, term249540.getClass(), "_paramAnnotations", null);
        setField(term249540, term249540.getClass(), "_context", null);
        setField(term249540, term249540.getClass(), "_annotations", null);
        setField(term249534, term249534.getClass(), "_member", term249540);
        setField(term249534, term249534.getClass(), "_accessorMethod", null);
        setField(term249534, term249534.getClass(), "_field", null);
        setField(term249534, term249534.getClass(), "_serializer", null);
        setField(term249534, term249534.getClass(), "_nullSerializer", null);
        setField(term249534, term249534.getClass(), "_typeSerializer", null);
        setBooleanField(term249541, term249541.getClass(), "_resetWhenFull", false);
        setField(term249534, term249534.getClass(), "_dynamicSerializers", term249541);
        setBooleanField(term249534, term249534.getClass(), "_suppressNulls", false);
        setField(term249534, term249534.getClass(), "_suppressableValue", null);
        setField(term249534, term249534.getClass(), "_includeInViews", null);
        setField(term249534, term249534.getClass(), "_internalSettings", null);
        term249542 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term249543 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term249546 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term249547 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term249542, term249542.getClass(), "_forSerialization", true);
        setField(term249542, term249542.getClass(), "_annotationIntrospector", null);
        setField(term249543, term249543.getClass(), "_simpleName", "");
        setField(term249543, term249543.getClass(), "_namespace", null);
        setField(term249543, term249543.getClass(), "_encodedSimple", null);
        setField(term249542, term249542.getClass(), "_name", term249543);
        setField(term249542, term249542.getClass(), "_internalName", null);
        setField(term249547, term249547.getClass(), "_field", null);
        setField(term249547, term249547.getClass(), "_serialization", null);
        setField(term249547, term249547.getClass(), "_context", null);
        setField(term249547, term249547.getClass(), "_annotations", null);
        setField(term249546, term249546.getClass(), "value", term249547);
        setField(term249546, term249546.getClass(), "next", null);
        setField(term249546, term249546.getClass(), "name", null);
        setBooleanField(term249546, term249546.getClass(), "isNameExplicit", false);
        setBooleanField(term249546, term249546.getClass(), "isVisible", false);
        setBooleanField(term249546, term249546.getClass(), "isMarkedIgnored", false);
        setField(term249542, term249542.getClass(), "_fields", term249546);
        setField(term249542, term249542.getClass(), "_ctorParameters", null);
        setField(term249542, term249542.getClass(), "_getters", null);
        setField(term249542, term249542.getClass(), "_setters", null);
        term249548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term249548, term249548.getClass(), "_constructor", null);
        setField(term249548, term249548.getClass(), "_serialization", null);
        setField(term249548, term249548.getClass(), "_paramAnnotations", null);
        setField(term249548, term249548.getClass(), "_context", null);
        setField(term249548, term249548.getClass(), "_annotations", null);
        term249549 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term249549, term249549.getClass(), "_annotations", null);
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
        args[0] = term247818;
        args[1] = term248338;
        args[2] = term248454;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term249534));
        assertTrue(recursiveEquals(term247818, term249542));
        assertTrue(recursiveEquals(term248338, term249548));
        assertTrue(recursiveEquals(term248454, term249549));
    }

};


