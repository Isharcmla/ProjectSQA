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

public class BeanPropertyWriter_init_599291025237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108090;
     Object term108482;
     Object term108586;
     Object term108623;
     Object term108630;
     Object term108635;
     Object term108636;

    public BeanPropertyWriter_init_599291025237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107506 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term107598 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term107698 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term107816 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumMapSerializer"));
        Object term107956 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        setField(term107506, term107506.getClass(), "_member", null);
        setField(term107506, term107506.getClass(), "_contextAnnotations", null);
        setField(term107506, term107506.getClass(), "_name", null);
        setField(term107506, term107506.getClass(), "_wrapperName", term107598);
        setField(term107506, term107506.getClass(), "_metadata", term107698);
        setField(term107506, term107506.getClass(), "_includeInViews", null);
        setField(term107506, term107506.getClass(), "_declaredType", null);
        setField(term107506, term107506.getClass(), "_serializer", term107816);
        setField(term107506, term107506.getClass(), "_dynamicSerializers", term107956);
        setField(term107506, term107506.getClass(), "_typeSerializer", null);
        setField(term107506, term107506.getClass(), "_cfgSerializationType", null);
        term108090 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term108182 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term108364 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term108182, term108182.getClass(), "_simpleName", "");
        setField(term108090, term108090.getClass(), "_fullName", term108182);
        setField(term108090, term108090.getClass(), "_introspector", term108364);
        setField(term108090, term108090.getClass(), "_member", null);
        setField(term108090, term108090.getClass(), "_metadata", null);
        term108482 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term108586 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term108623 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term108624 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term108627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term108628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term108629 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term108624, term108624.getClass(), "_value", "");
        setField(term108624, term108624.getClass(), "_quotedUTF8Ref", null);
        setField(term108624, term108624.getClass(), "_unquotedUTF8Ref", null);
        setField(term108624, term108624.getClass(), "_quotedChars", null);
        setField(term108624, term108624.getClass(), "_jdkSerializeValue", null);
        setField(term108623, term108623.getClass(), "_name", term108624);
        setField(term108623, term108623.getClass(), "_wrapperName", null);
        setField(term108627, term108627.getClass(), "_referencedType", null);
        setField(term108627, term108627.getClass(), "_typeParametersFor", null);
        setField(term108627, term108627.getClass(), "_typeParameters", null);
        setField(term108627, term108627.getClass(), "_typeNames", null);
        setField(term108627, term108627.getClass(), "_canonicalName", null);
        setField(term108627, term108627.getClass(), "_class", null);
        setIntField(term108627, term108627.getClass(), "_hash", 0);
        setField(term108627, term108627.getClass(), "_valueHandler", null);
        setField(term108627, term108627.getClass(), "_typeHandler", null);
        setBooleanField(term108627, term108627.getClass(), "_asStatic", false);
        setField(term108623, term108623.getClass(), "_declaredType", term108627);
        setField(term108623, term108623.getClass(), "_cfgSerializationType", null);
        setField(term108623, term108623.getClass(), "_nonTrivialBaseType", null);
        setField(term108623, term108623.getClass(), "_contextAnnotations", null);
        setField(term108623, term108623.getClass(), "_metadata", null);
        setField(term108623, term108623.getClass(), "_format", null);
        setField(term108628, term108628.getClass(), "_field", null);
        setField(term108628, term108628.getClass(), "_serialization", null);
        setField(term108628, term108628.getClass(), "_context", null);
        setField(term108628, term108628.getClass(), "_annotations", null);
        setField(term108623, term108623.getClass(), "_member", term108628);
        setField(term108623, term108623.getClass(), "_accessorMethod", null);
        setField(term108623, term108623.getClass(), "_field", null);
        setField(term108623, term108623.getClass(), "_serializer", null);
        setField(term108623, term108623.getClass(), "_nullSerializer", null);
        setField(term108623, term108623.getClass(), "_typeSerializer", null);
        setBooleanField(term108629, term108629.getClass(), "_resetWhenFull", false);
        setField(term108623, term108623.getClass(), "_dynamicSerializers", term108629);
        setBooleanField(term108623, term108623.getClass(), "_suppressNulls", false);
        setField(term108623, term108623.getClass(), "_suppressableValue", null);
        setField(term108623, term108623.getClass(), "_includeInViews", null);
        setField(term108623, term108623.getClass(), "_internalSettings", null);
        term108630 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term108631 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term108632 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term108630, term108630.getClass(), "_introspector", term108631);
        setField(term108630, term108630.getClass(), "_member", null);
        setField(term108630, term108630.getClass(), "_metadata", null);
        setField(term108632, term108632.getClass(), "_simpleName", "");
        setField(term108632, term108632.getClass(), "_namespace", null);
        setField(term108632, term108632.getClass(), "_encodedSimple", null);
        setField(term108630, term108630.getClass(), "_fullName", term108632);
        setField(term108630, term108630.getClass(), "_inclusion", null);
        setField(term108630, term108630.getClass(), "_name", null);
        term108635 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term108635, term108635.getClass(), "_field", null);
        setField(term108635, term108635.getClass(), "_serialization", null);
        setField(term108635, term108635.getClass(), "_context", null);
        setField(term108635, term108635.getClass(), "_annotations", null);
        term108636 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term108636, term108636.getClass(), "_referencedType", null);
        setField(term108636, term108636.getClass(), "_typeParametersFor", null);
        setField(term108636, term108636.getClass(), "_typeParameters", null);
        setField(term108636, term108636.getClass(), "_typeNames", null);
        setField(term108636, term108636.getClass(), "_canonicalName", null);
        setField(term108636, term108636.getClass(), "_class", null);
        setIntField(term108636, term108636.getClass(), "_hash", 0);
        setField(term108636, term108636.getClass(), "_valueHandler", null);
        setField(term108636, term108636.getClass(), "_typeHandler", null);
        setBooleanField(term108636, term108636.getClass(), "_asStatic", false);
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
        args[0] = term108090;
        args[1] = term108482;
        args[2] = null;
        args[3] = term108586;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term108623));
        assertTrue(recursiveEquals(term108090, term108630));
        assertTrue(recursiveEquals(term108482, term108635));
        assertTrue(recursiveEquals(term108586, term108636));
    }

};


