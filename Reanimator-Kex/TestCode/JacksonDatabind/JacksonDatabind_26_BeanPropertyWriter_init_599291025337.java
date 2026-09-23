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

public class BeanPropertyWriter_init_599291025337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194021;
     Object term194413;
     Object term194511;
     Object term194621;
     Object term194629;
     Object term194634;
     Object term194635;

    public BeanPropertyWriter_init_599291025337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term193767 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term193893 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.InetAddressSerializer"));
        setField(term193767, term193767.getClass(), "_member", null);
        setField(term193767, term193767.getClass(), "_contextAnnotations", null);
        setField(term193767, term193767.getClass(), "_name", null);
        setField(term193767, term193767.getClass(), "_wrapperName", null);
        setField(term193767, term193767.getClass(), "_metadata", null);
        setField(term193767, term193767.getClass(), "_includeInViews", null);
        setField(term193767, term193767.getClass(), "_declaredType", null);
        setField(term193767, term193767.getClass(), "_serializer", term193893);
        setField(term193767, term193767.getClass(), "_dynamicSerializers", null);
        setField(term193767, term193767.getClass(), "_typeSerializer", null);
        setField(term193767, term193767.getClass(), "_cfgSerializationType", null);
        term194021 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term194113 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term194293 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term194113, term194113.getClass(), "_simpleName", "");
        setField(term194021, term194021.getClass(), "_name", term194113);
        setBooleanField(term194021, term194021.getClass(), "_forSerialization", false);
        setField(term194021, term194021.getClass(), "_ctorParameters", null);
        setField(term194293, term194293.getClass(), "next", null);
        setField(term194293, term194293.getClass(), "value", null);
        setField(term194021, term194021.getClass(), "_setters", term194293);
        setField(term194021, term194021.getClass(), "_fields", null);
        setField(term194021, term194021.getClass(), "_annotationIntrospector", null);
        term194413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term194511 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term194621 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term194622 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term194625 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term194626 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term194627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term194628 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term194622, term194622.getClass(), "_value", "");
        setField(term194622, term194622.getClass(), "_quotedUTF8Ref", null);
        setField(term194622, term194622.getClass(), "_unquotedUTF8Ref", null);
        setField(term194622, term194622.getClass(), "_quotedChars", null);
        setField(term194622, term194622.getClass(), "_jdkSerializeValue", null);
        setField(term194621, term194621.getClass(), "_name", term194622);
        setField(term194621, term194621.getClass(), "_wrapperName", null);
        setField(term194621, term194621.getClass(), "_declaredType", null);
        setField(term194625, term194625.getClass(), "_typeParametersFor", null);
        setField(term194625, term194625.getClass(), "_typeParameters", null);
        setField(term194625, term194625.getClass(), "_typeNames", null);
        setField(term194625, term194625.getClass(), "_canonicalName", null);
        setField(term194625, term194625.getClass(), "_class", null);
        setIntField(term194625, term194625.getClass(), "_hash", 0);
        setField(term194625, term194625.getClass(), "_valueHandler", null);
        setField(term194625, term194625.getClass(), "_typeHandler", null);
        setBooleanField(term194625, term194625.getClass(), "_asStatic", false);
        setField(term194621, term194621.getClass(), "_cfgSerializationType", term194625);
        setField(term194621, term194621.getClass(), "_nonTrivialBaseType", null);
        setField(term194621, term194621.getClass(), "_contextAnnotations", null);
        setField(term194626, term194626.getClass(), "_required", null);
        setField(term194626, term194626.getClass(), "_description", null);
        setField(term194626, term194626.getClass(), "_index", null);
        setField(term194626, term194626.getClass(), "_defaultValue", null);
        setField(term194621, term194621.getClass(), "_metadata", term194626);
        setField(term194621, term194621.getClass(), "_format", null);
        setField(term194627, term194627.getClass(), "_method", null);
        setField(term194627, term194627.getClass(), "_paramClasses", null);
        setField(term194627, term194627.getClass(), "_serialization", null);
        setField(term194627, term194627.getClass(), "_paramAnnotations", null);
        setField(term194627, term194627.getClass(), "_context", null);
        setField(term194627, term194627.getClass(), "_annotations", null);
        setField(term194621, term194621.getClass(), "_member", term194627);
        setField(term194621, term194621.getClass(), "_accessorMethod", null);
        setField(term194621, term194621.getClass(), "_field", null);
        setField(term194621, term194621.getClass(), "_serializer", null);
        setField(term194621, term194621.getClass(), "_nullSerializer", null);
        setField(term194621, term194621.getClass(), "_typeSerializer", null);
        setBooleanField(term194628, term194628.getClass(), "_resetWhenFull", false);
        setField(term194621, term194621.getClass(), "_dynamicSerializers", term194628);
        setBooleanField(term194621, term194621.getClass(), "_suppressNulls", false);
        setField(term194621, term194621.getClass(), "_suppressableValue", null);
        setField(term194621, term194621.getClass(), "_includeInViews", null);
        setField(term194621, term194621.getClass(), "_internalSettings", null);
        term194629 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term194630 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term194633 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term194629, term194629.getClass(), "_forSerialization", false);
        setField(term194629, term194629.getClass(), "_annotationIntrospector", null);
        setField(term194630, term194630.getClass(), "_simpleName", "");
        setField(term194630, term194630.getClass(), "_namespace", null);
        setField(term194630, term194630.getClass(), "_encodedSimple", null);
        setField(term194629, term194629.getClass(), "_name", term194630);
        setField(term194629, term194629.getClass(), "_internalName", null);
        setField(term194629, term194629.getClass(), "_fields", null);
        setField(term194629, term194629.getClass(), "_ctorParameters", null);
        setField(term194629, term194629.getClass(), "_getters", null);
        setField(term194633, term194633.getClass(), "value", null);
        setField(term194633, term194633.getClass(), "next", null);
        setField(term194633, term194633.getClass(), "name", null);
        setBooleanField(term194633, term194633.getClass(), "isNameExplicit", false);
        setBooleanField(term194633, term194633.getClass(), "isVisible", false);
        setBooleanField(term194633, term194633.getClass(), "isMarkedIgnored", false);
        setField(term194629, term194629.getClass(), "_setters", term194633);
        term194634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term194634, term194634.getClass(), "_method", null);
        setField(term194634, term194634.getClass(), "_paramClasses", null);
        setField(term194634, term194634.getClass(), "_serialization", null);
        setField(term194634, term194634.getClass(), "_paramAnnotations", null);
        setField(term194634, term194634.getClass(), "_context", null);
        setField(term194634, term194634.getClass(), "_annotations", null);
        term194635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term194635, term194635.getClass(), "_typeParametersFor", null);
        setField(term194635, term194635.getClass(), "_typeParameters", null);
        setField(term194635, term194635.getClass(), "_typeNames", null);
        setField(term194635, term194635.getClass(), "_canonicalName", null);
        setField(term194635, term194635.getClass(), "_class", null);
        setIntField(term194635, term194635.getClass(), "_hash", 0);
        setField(term194635, term194635.getClass(), "_valueHandler", null);
        setField(term194635, term194635.getClass(), "_typeHandler", null);
        setBooleanField(term194635, term194635.getClass(), "_asStatic", false);
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
        args[0] = term194021;
        args[1] = term194413;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term194511;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term194621));
        assertTrue(recursiveEquals(term194021, term194629));
        assertTrue(recursiveEquals(term194413, term194634));
        assertTrue(recursiveEquals(term194511, term194635));
    }

};


