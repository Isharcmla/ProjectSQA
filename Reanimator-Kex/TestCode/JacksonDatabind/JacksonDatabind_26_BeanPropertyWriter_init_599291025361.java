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

public class BeanPropertyWriter_init_599291025361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213706;
     Object term214526;
     Object term215997;
     Object term216003;
     Object term216011;

    public BeanPropertyWriter_init_599291025361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term213458 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term213578 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term213458, term213458.getClass(), "_member", term213578);
        setField(term213458, term213458.getClass(), "_contextAnnotations", null);
        setField(term213458, term213458.getClass(), "_name", null);
        setField(term213458, term213458.getClass(), "_wrapperName", null);
        setField(term213458, term213458.getClass(), "_metadata", null);
        setField(term213458, term213458.getClass(), "_includeInViews", null);
        setField(term213458, term213458.getClass(), "_declaredType", null);
        setField(term213458, term213458.getClass(), "_serializer", null);
        term213706 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term213798 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term213978 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term214120 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term214264 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term214408 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term213798, term213798.getClass(), "_simpleName", "");
        setField(term213706, term213706.getClass(), "_name", term213798);
        setBooleanField(term213706, term213706.getClass(), "_forSerialization", true);
        setField(term213706, term213706.getClass(), "_getters", null);
        setField(term213978, term213978.getClass(), "value", null);
        setField(term213978, term213978.getClass(), "next", null);
        setField(term213706, term213706.getClass(), "_fields", term213978);
        setField(term214120, term214120.getClass(), "_primary", term214264);
        setField(term214120, term214120.getClass(), "_secondary", term214408);
        setField(term213706, term213706.getClass(), "_annotationIntrospector", term214120);
        term214526 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        term215997 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term215998 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term216001 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term216002 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        setField(term215998, term215998.getClass(), "_value", "");
        setField(term215998, term215998.getClass(), "_quotedUTF8Ref", null);
        setField(term215998, term215998.getClass(), "_unquotedUTF8Ref", null);
        setField(term215998, term215998.getClass(), "_quotedChars", null);
        setField(term215998, term215998.getClass(), "_jdkSerializeValue", null);
        setField(term215997, term215997.getClass(), "_name", term215998);
        setField(term215997, term215997.getClass(), "_wrapperName", null);
        setField(term215997, term215997.getClass(), "_declaredType", null);
        setField(term215997, term215997.getClass(), "_cfgSerializationType", null);
        setField(term215997, term215997.getClass(), "_nonTrivialBaseType", null);
        setField(term215997, term215997.getClass(), "_contextAnnotations", null);
        setField(term216001, term216001.getClass(), "_required", null);
        setField(term216001, term216001.getClass(), "_description", null);
        setField(term216001, term216001.getClass(), "_index", null);
        setField(term216001, term216001.getClass(), "_defaultValue", null);
        setField(term215997, term215997.getClass(), "_metadata", term216001);
        setField(term215997, term215997.getClass(), "_format", null);
        setField(term215997, term215997.getClass(), "_member", null);
        setField(term215997, term215997.getClass(), "_accessorMethod", null);
        setField(term215997, term215997.getClass(), "_field", null);
        setField(term216002, term216002.getClass(), "_elementType", null);
        setField(term216002, term216002.getClass(), "_property", null);
        setBooleanField(term216002, term216002.getClass(), "_staticTyping", false);
        setField(term216002, term216002.getClass(), "_unwrapSingle", null);
        setField(term216002, term216002.getClass(), "_valueTypeSerializer", null);
        setField(term216002, term216002.getClass(), "_elementSerializer", null);
        setField(term216002, term216002.getClass(), "_dynamicSerializers", null);
        setField(term216002, term216002.getClass(), "_handledType", null);
        setField(term215997, term215997.getClass(), "_serializer", term216002);
        setField(term215997, term215997.getClass(), "_nullSerializer", null);
        setField(term215997, term215997.getClass(), "_typeSerializer", null);
        setField(term215997, term215997.getClass(), "_dynamicSerializers", null);
        setBooleanField(term215997, term215997.getClass(), "_suppressNulls", false);
        setField(term215997, term215997.getClass(), "_suppressableValue", null);
        setField(term215997, term215997.getClass(), "_includeInViews", null);
        setField(term215997, term215997.getClass(), "_internalSettings", null);
        term216003 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term216004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term216005 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term216006 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term216007 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term216010 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term216003, term216003.getClass(), "_forSerialization", true);
        setField(term216004, term216004.getClass(), "_primary", term216005);
        setField(term216004, term216004.getClass(), "_secondary", term216006);
        setField(term216003, term216003.getClass(), "_annotationIntrospector", term216004);
        setField(term216007, term216007.getClass(), "_simpleName", "");
        setField(term216007, term216007.getClass(), "_namespace", null);
        setField(term216007, term216007.getClass(), "_encodedSimple", null);
        setField(term216003, term216003.getClass(), "_name", term216007);
        setField(term216003, term216003.getClass(), "_internalName", null);
        setField(term216010, term216010.getClass(), "value", null);
        setField(term216010, term216010.getClass(), "next", null);
        setField(term216010, term216010.getClass(), "name", null);
        setBooleanField(term216010, term216010.getClass(), "isNameExplicit", false);
        setBooleanField(term216010, term216010.getClass(), "isVisible", false);
        setBooleanField(term216010, term216010.getClass(), "isMarkedIgnored", false);
        setField(term216003, term216003.getClass(), "_fields", term216010);
        setField(term216003, term216003.getClass(), "_ctorParameters", null);
        setField(term216003, term216003.getClass(), "_getters", null);
        setField(term216003, term216003.getClass(), "_setters", null);
        term216011 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        setField(term216011, term216011.getClass(), "_elementType", null);
        setField(term216011, term216011.getClass(), "_property", null);
        setBooleanField(term216011, term216011.getClass(), "_staticTyping", false);
        setField(term216011, term216011.getClass(), "_unwrapSingle", null);
        setField(term216011, term216011.getClass(), "_valueTypeSerializer", null);
        setField(term216011, term216011.getClass(), "_elementSerializer", null);
        setField(term216011, term216011.getClass(), "_dynamicSerializers", null);
        setField(term216011, term216011.getClass(), "_handledType", null);
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
        args[0] = term213706;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term214526;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term215997));
        assertTrue(recursiveEquals(term213706, term216003));
        assertTrue(recursiveEquals(term214526, term216011));
    }

};


