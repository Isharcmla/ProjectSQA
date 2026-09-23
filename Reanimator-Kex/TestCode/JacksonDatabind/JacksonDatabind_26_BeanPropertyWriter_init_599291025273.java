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

public class BeanPropertyWriter_init_599291025273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136579;
     Object term137069;
     Object term137175;
     Object term137339;
     Object term137376;
     Object term137384;
     Object term137390;
     Object term137391;
     Object term137392;

    public BeanPropertyWriter_init_599291025273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term135739 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term135873 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term135989 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term136087 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term136187 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term136291 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term136445 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer"));
        setField(term135739, term135739.getClass(), "_member", term135873);
        setField(term135739, term135739.getClass(), "_contextAnnotations", term135989);
        setField(term135739, term135739.getClass(), "_name", term136087);
        setField(term135739, term135739.getClass(), "_wrapperName", null);
        setField(term135739, term135739.getClass(), "_metadata", term136187);
        setField(term135739, term135739.getClass(), "_includeInViews", null);
        setField(term135739, term135739.getClass(), "_declaredType", term136291);
        setField(term135739, term135739.getClass(), "_serializer", term136445);
        term136579 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term136671 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term136853 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term136953 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term136671, term136671.getClass(), "_simpleName", "");
        setField(term136579, term136579.getClass(), "_fullName", term136671);
        setField(term136579, term136579.getClass(), "_introspector", term136853);
        setField(term136579, term136579.getClass(), "_member", null);
        setField(term136579, term136579.getClass(), "_metadata", term136953);
        term137069 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term137175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term137339 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        term137376 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term137377 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term137380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term137381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term137382 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term137383 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        setField(term137377, term137377.getClass(), "_value", "");
        setField(term137377, term137377.getClass(), "_quotedUTF8Ref", null);
        setField(term137377, term137377.getClass(), "_unquotedUTF8Ref", null);
        setField(term137377, term137377.getClass(), "_quotedChars", null);
        setField(term137377, term137377.getClass(), "_jdkSerializeValue", null);
        setField(term137376, term137376.getClass(), "_name", term137377);
        setField(term137376, term137376.getClass(), "_wrapperName", null);
        setField(term137380, term137380.getClass(), "_elementType", null);
        setField(term137380, term137380.getClass(), "_canonicalName", null);
        setField(term137380, term137380.getClass(), "_class", null);
        setIntField(term137380, term137380.getClass(), "_hash", 0);
        setField(term137380, term137380.getClass(), "_valueHandler", null);
        setField(term137380, term137380.getClass(), "_typeHandler", null);
        setBooleanField(term137380, term137380.getClass(), "_asStatic", false);
        setField(term137376, term137376.getClass(), "_declaredType", term137380);
        setField(term137376, term137376.getClass(), "_cfgSerializationType", null);
        setField(term137376, term137376.getClass(), "_nonTrivialBaseType", null);
        setField(term137381, term137381.getClass(), "_annotations", null);
        setField(term137376, term137376.getClass(), "_contextAnnotations", term137381);
        setField(term137382, term137382.getClass(), "_required", null);
        setField(term137382, term137382.getClass(), "_description", null);
        setField(term137382, term137382.getClass(), "_index", null);
        setField(term137382, term137382.getClass(), "_defaultValue", null);
        setField(term137376, term137376.getClass(), "_metadata", term137382);
        setField(term137376, term137376.getClass(), "_format", null);
        setField(term137376, term137376.getClass(), "_member", null);
        setField(term137376, term137376.getClass(), "_accessorMethod", null);
        setField(term137376, term137376.getClass(), "_field", null);
        setField(term137383, term137383.getClass(), "_valueTypeSerializer", null);
        setField(term137383, term137383.getClass(), "_property", null);
        setField(term137383, term137383.getClass(), "_unwrapSingle", null);
        setField(term137383, term137383.getClass(), "_handledType", null);
        setField(term137376, term137376.getClass(), "_serializer", term137383);
        setField(term137376, term137376.getClass(), "_nullSerializer", null);
        setField(term137376, term137376.getClass(), "_typeSerializer", null);
        setField(term137376, term137376.getClass(), "_dynamicSerializers", null);
        setBooleanField(term137376, term137376.getClass(), "_suppressNulls", false);
        setField(term137376, term137376.getClass(), "_suppressableValue", null);
        setField(term137376, term137376.getClass(), "_includeInViews", null);
        setField(term137376, term137376.getClass(), "_internalSettings", null);
        term137384 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term137385 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term137386 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term137387 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term137384, term137384.getClass(), "_introspector", term137385);
        setField(term137384, term137384.getClass(), "_member", null);
        setField(term137386, term137386.getClass(), "_required", null);
        setField(term137386, term137386.getClass(), "_description", null);
        setField(term137386, term137386.getClass(), "_index", null);
        setField(term137386, term137386.getClass(), "_defaultValue", null);
        setField(term137384, term137384.getClass(), "_metadata", term137386);
        setField(term137387, term137387.getClass(), "_simpleName", "");
        setField(term137387, term137387.getClass(), "_namespace", null);
        setField(term137387, term137387.getClass(), "_encodedSimple", null);
        setField(term137384, term137384.getClass(), "_fullName", term137387);
        setField(term137384, term137384.getClass(), "_inclusion", null);
        setField(term137384, term137384.getClass(), "_name", null);
        term137390 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term137390, term137390.getClass(), "_annotations", null);
        term137391 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term137391, term137391.getClass(), "_elementType", null);
        setField(term137391, term137391.getClass(), "_canonicalName", null);
        setField(term137391, term137391.getClass(), "_class", null);
        setIntField(term137391, term137391.getClass(), "_hash", 0);
        setField(term137391, term137391.getClass(), "_valueHandler", null);
        setField(term137391, term137391.getClass(), "_typeHandler", null);
        setBooleanField(term137391, term137391.getClass(), "_asStatic", false);
        term137392 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        setField(term137392, term137392.getClass(), "_valueTypeSerializer", null);
        setField(term137392, term137392.getClass(), "_property", null);
        setField(term137392, term137392.getClass(), "_unwrapSingle", null);
        setField(term137392, term137392.getClass(), "_handledType", null);
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
        args[0] = term136579;
        args[1] = null;
        args[2] = term137069;
        args[3] = term137175;
        args[4] = term137339;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term137376));
        assertTrue(recursiveEquals(term136579, term137384));
        assertTrue(recursiveEquals(term137069, term137390));
        assertTrue(recursiveEquals(term137175, term137391));
        assertTrue(recursiveEquals(term137339, term137392));
    }

};


