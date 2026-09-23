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

public class BeanPropertyWriter_init_599291025325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183349;
     Object term184021;
     Object term184195;
     Object term185121;
     Object term185128;
     Object term185135;
     Object term185136;

    public BeanPropertyWriter_init_599291025325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term183221 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term183221, term183221.getClass(), "_member", null);
        setField(term183221, term183221.getClass(), "_contextAnnotations", null);
        setField(term183221, term183221.getClass(), "_name", null);
        setField(term183221, term183221.getClass(), "_wrapperName", null);
        setField(term183221, term183221.getClass(), "_metadata", null);
        setField(term183221, term183221.getClass(), "_includeInViews", null);
        setField(term183221, term183221.getClass(), "_declaredType", null);
        setField(term183221, term183221.getClass(), "_serializer", null);
        term183349 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term183441 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term183621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term183739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term183887 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term183441, term183441.getClass(), "_simpleName", "");
        setField(term183349, term183349.getClass(), "_name", term183441);
        setBooleanField(term183349, term183349.getClass(), "_forSerialization", false);
        setField(term183349, term183349.getClass(), "_ctorParameters", null);
        setField(term183349, term183349.getClass(), "_setters", null);
        setField(term183739, term183739.getClass(), "_annotations", null);
        setField(term183621, term183621.getClass(), "value", term183739);
        setField(term183621, term183621.getClass(), "next", null);
        setField(term183349, term183349.getClass(), "_fields", term183621);
        setField(term183349, term183349.getClass(), "_annotationIntrospector", term183887);
        term184021 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        term184195 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        term185121 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term185122 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term185125 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term185126 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term185127 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        setField(term185122, term185122.getClass(), "_value", "");
        setField(term185122, term185122.getClass(), "_quotedUTF8Ref", null);
        setField(term185122, term185122.getClass(), "_unquotedUTF8Ref", null);
        setField(term185122, term185122.getClass(), "_quotedChars", null);
        setField(term185122, term185122.getClass(), "_jdkSerializeValue", null);
        setField(term185121, term185121.getClass(), "_name", term185122);
        setField(term185121, term185121.getClass(), "_wrapperName", null);
        setField(term185121, term185121.getClass(), "_declaredType", null);
        setField(term185121, term185121.getClass(), "_cfgSerializationType", null);
        setField(term185121, term185121.getClass(), "_nonTrivialBaseType", null);
        setField(term185121, term185121.getClass(), "_contextAnnotations", null);
        setField(term185125, term185125.getClass(), "_required", null);
        setField(term185125, term185125.getClass(), "_description", null);
        setField(term185125, term185125.getClass(), "_index", null);
        setField(term185125, term185125.getClass(), "_defaultValue", null);
        setField(term185121, term185121.getClass(), "_metadata", term185125);
        setField(term185121, term185121.getClass(), "_format", null);
        setField(term185126, term185126.getClass(), "_declaringClass", null);
        setField(term185126, term185126.getClass(), "_rawType", null);
        setField(term185126, term185126.getClass(), "_name", null);
        setField(term185126, term185126.getClass(), "_context", null);
        setField(term185126, term185126.getClass(), "_annotations", null);
        setField(term185121, term185121.getClass(), "_member", term185126);
        setField(term185121, term185121.getClass(), "_accessorMethod", null);
        setField(term185121, term185121.getClass(), "_field", null);
        setField(term185127, term185127.getClass(), "_delegate", null);
        setField(term185127, term185127.getClass(), "_handledType", null);
        setField(term185121, term185121.getClass(), "_serializer", term185127);
        setField(term185121, term185121.getClass(), "_nullSerializer", null);
        setField(term185121, term185121.getClass(), "_typeSerializer", null);
        setField(term185121, term185121.getClass(), "_dynamicSerializers", null);
        setBooleanField(term185121, term185121.getClass(), "_suppressNulls", false);
        setField(term185121, term185121.getClass(), "_suppressableValue", null);
        setField(term185121, term185121.getClass(), "_includeInViews", null);
        setField(term185121, term185121.getClass(), "_internalSettings", null);
        term185128 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term185129 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term185130 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term185133 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term185134 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term185128, term185128.getClass(), "_forSerialization", false);
        setField(term185128, term185128.getClass(), "_annotationIntrospector", term185129);
        setField(term185130, term185130.getClass(), "_simpleName", "");
        setField(term185130, term185130.getClass(), "_namespace", null);
        setField(term185130, term185130.getClass(), "_encodedSimple", null);
        setField(term185128, term185128.getClass(), "_name", term185130);
        setField(term185128, term185128.getClass(), "_internalName", null);
        setField(term185134, term185134.getClass(), "_field", null);
        setField(term185134, term185134.getClass(), "_serialization", null);
        setField(term185134, term185134.getClass(), "_context", null);
        setField(term185134, term185134.getClass(), "_annotations", null);
        setField(term185133, term185133.getClass(), "value", term185134);
        setField(term185133, term185133.getClass(), "next", null);
        setField(term185133, term185133.getClass(), "name", null);
        setBooleanField(term185133, term185133.getClass(), "isNameExplicit", false);
        setBooleanField(term185133, term185133.getClass(), "isVisible", false);
        setBooleanField(term185133, term185133.getClass(), "isMarkedIgnored", false);
        setField(term185128, term185128.getClass(), "_fields", term185133);
        setField(term185128, term185128.getClass(), "_ctorParameters", null);
        setField(term185128, term185128.getClass(), "_getters", null);
        setField(term185128, term185128.getClass(), "_setters", null);
        term185135 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term185135, term185135.getClass(), "_declaringClass", null);
        setField(term185135, term185135.getClass(), "_rawType", null);
        setField(term185135, term185135.getClass(), "_name", null);
        setField(term185135, term185135.getClass(), "_context", null);
        setField(term185135, term185135.getClass(), "_annotations", null);
        term185136 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer"));
        setField(term185136, term185136.getClass(), "_delegate", null);
        setField(term185136, term185136.getClass(), "_handledType", null);
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
        args[0] = term183349;
        args[1] = term184021;
        args[2] = null;
        args[3] = null;
        args[4] = term184195;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term185121));
        assertTrue(recursiveEquals(term183349, term185128));
        assertTrue(recursiveEquals(term184021, term185135));
        assertTrue(recursiveEquals(term184195, term185136));
    }

};


