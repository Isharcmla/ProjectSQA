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

public class BeanPropertyWriter_init_599291025215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89572;
     Object term89962;
     Object term90136;
     Object term90278;
     Object term92089;
     Object term92097;
     Object term92102;
     Object term92103;
     Object term92104;

    public BeanPropertyWriter_init_599291025215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89300 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term89107 = (Object[]) newArray("java.lang.Class", 0);
        Object term89444 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer"));
        setField(term89300, term89300.getClass(), "_member", null);
        setField(term89300, term89300.getClass(), "_contextAnnotations", null);
        setField(term89300, term89300.getClass(), "_name", null);
        setField(term89300, term89300.getClass(), "_wrapperName", null);
        setField(term89300, term89300.getClass(), "_metadata", null);
        setField(term89300, term89300.getClass(), "_includeInViews", term89107);
        setField(term89300, term89300.getClass(), "_declaredType", null);
        setField(term89300, term89300.getClass(), "_serializer", null);
        setField(term89300, term89300.getClass(), "_dynamicSerializers", null);
        setField(term89300, term89300.getClass(), "_typeSerializer", term89444);
        setField(term89300, term89300.getClass(), "_cfgSerializationType", null);
        term89572 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term89664 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term89844 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term89664, term89664.getClass(), "_simpleName", "");
        setField(term89572, term89572.getClass(), "_name", term89664);
        setBooleanField(term89572, term89572.getClass(), "_forSerialization", true);
        setField(term89572, term89572.getClass(), "_getters", null);
        setField(term89844, term89844.getClass(), "value", null);
        setField(term89844, term89844.getClass(), "next", null);
        setField(term89572, term89572.getClass(), "_fields", term89844);
        setField(term89572, term89572.getClass(), "_annotationIntrospector", null);
        term89962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term90136 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        term90278 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        term92089 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term92090 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term92093 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term92094 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term92095 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        Object term92096 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term92090, term92090.getClass(), "_value", "");
        setField(term92090, term92090.getClass(), "_quotedUTF8Ref", null);
        setField(term92090, term92090.getClass(), "_unquotedUTF8Ref", null);
        setField(term92090, term92090.getClass(), "_quotedChars", null);
        setField(term92090, term92090.getClass(), "_jdkSerializeValue", null);
        setField(term92089, term92089.getClass(), "_name", term92090);
        setField(term92089, term92089.getClass(), "_wrapperName", null);
        setField(term92089, term92089.getClass(), "_declaredType", null);
        setField(term92089, term92089.getClass(), "_cfgSerializationType", null);
        setField(term92089, term92089.getClass(), "_nonTrivialBaseType", null);
        setField(term92089, term92089.getClass(), "_contextAnnotations", null);
        setField(term92093, term92093.getClass(), "_required", null);
        setField(term92093, term92093.getClass(), "_description", null);
        setField(term92093, term92093.getClass(), "_index", null);
        setField(term92093, term92093.getClass(), "_defaultValue", null);
        setField(term92089, term92089.getClass(), "_metadata", term92093);
        setField(term92089, term92089.getClass(), "_format", null);
        setField(term92094, term92094.getClass(), "_field", null);
        setField(term92094, term92094.getClass(), "_serialization", null);
        setField(term92094, term92094.getClass(), "_context", null);
        setField(term92094, term92094.getClass(), "_annotations", null);
        setField(term92089, term92089.getClass(), "_member", term92094);
        setField(term92089, term92089.getClass(), "_accessorMethod", null);
        setField(term92089, term92089.getClass(), "_field", null);
        setField(term92095, term92095.getClass(), "_delegate", null);
        setField(term92095, term92095.getClass(), "_handledType", null);
        setField(term92089, term92089.getClass(), "_serializer", term92095);
        setField(term92089, term92089.getClass(), "_nullSerializer", null);
        setField(term92096, term92096.getClass(), "_idResolver", null);
        setField(term92096, term92096.getClass(), "_property", null);
        setField(term92089, term92089.getClass(), "_typeSerializer", term92096);
        setField(term92089, term92089.getClass(), "_dynamicSerializers", null);
        setBooleanField(term92089, term92089.getClass(), "_suppressNulls", false);
        setField(term92089, term92089.getClass(), "_suppressableValue", null);
        setField(term92089, term92089.getClass(), "_includeInViews", null);
        setField(term92089, term92089.getClass(), "_internalSettings", null);
        term92097 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term92098 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term92101 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term92097, term92097.getClass(), "_forSerialization", true);
        setField(term92097, term92097.getClass(), "_annotationIntrospector", null);
        setField(term92098, term92098.getClass(), "_simpleName", "");
        setField(term92098, term92098.getClass(), "_namespace", null);
        setField(term92098, term92098.getClass(), "_encodedSimple", null);
        setField(term92097, term92097.getClass(), "_name", term92098);
        setField(term92097, term92097.getClass(), "_internalName", null);
        setField(term92101, term92101.getClass(), "value", null);
        setField(term92101, term92101.getClass(), "next", null);
        setField(term92101, term92101.getClass(), "name", null);
        setBooleanField(term92101, term92101.getClass(), "isNameExplicit", false);
        setBooleanField(term92101, term92101.getClass(), "isVisible", false);
        setBooleanField(term92101, term92101.getClass(), "isMarkedIgnored", false);
        setField(term92097, term92097.getClass(), "_fields", term92101);
        setField(term92097, term92097.getClass(), "_ctorParameters", null);
        setField(term92097, term92097.getClass(), "_getters", null);
        setField(term92097, term92097.getClass(), "_setters", null);
        term92102 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term92102, term92102.getClass(), "_field", null);
        setField(term92102, term92102.getClass(), "_serialization", null);
        setField(term92102, term92102.getClass(), "_context", null);
        setField(term92102, term92102.getClass(), "_annotations", null);
        term92103 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        setField(term92103, term92103.getClass(), "_delegate", null);
        setField(term92103, term92103.getClass(), "_handledType", null);
        term92104 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term92104, term92104.getClass(), "_idResolver", null);
        setField(term92104, term92104.getClass(), "_property", null);
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
        args[0] = term89572;
        args[1] = term89962;
        args[2] = null;
        args[3] = null;
        args[4] = term90136;
        args[5] = term90278;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term92089));
        assertTrue(recursiveEquals(term89572, term92097));
        assertTrue(recursiveEquals(term89962, term92102));
        assertTrue(recursiveEquals(term90136, term92103));
        assertTrue(recursiveEquals(term90278, term92104));
    }

};


