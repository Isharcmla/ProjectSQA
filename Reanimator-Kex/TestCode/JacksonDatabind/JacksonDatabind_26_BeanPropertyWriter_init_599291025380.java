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

public class BeanPropertyWriter_init_599291025380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227842;
     Object term229449;
     Object term229455;

    public BeanPropertyWriter_init_599291025380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term227524 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term227622 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term227714 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term227524, term227524.getClass(), "_member", null);
        setField(term227524, term227524.getClass(), "_contextAnnotations", null);
        setField(term227524, term227524.getClass(), "_name", term227622);
        setField(term227524, term227524.getClass(), "_wrapperName", term227714);
        term227842 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term227934 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term228114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term228232 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term228348 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term228496 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term227934, term227934.getClass(), "_simpleName", "");
        setField(term227842, term227842.getClass(), "_name", term227934);
        setBooleanField(term227842, term227842.getClass(), "_forSerialization", false);
        setField(term227842, term227842.getClass(), "_ctorParameters", null);
        setField(term227842, term227842.getClass(), "_setters", null);
        setField(term228232, term228232.getClass(), "_annotations", term228348);
        setField(term228114, term228114.getClass(), "value", term228232);
        setField(term228114, term228114.getClass(), "next", null);
        setField(term227842, term227842.getClass(), "_fields", term228114);
        setField(term227842, term227842.getClass(), "_annotationIntrospector", term228496);
        term229449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term229450 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term229453 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term229454 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term229450, term229450.getClass(), "_value", "");
        setField(term229450, term229450.getClass(), "_quotedUTF8Ref", null);
        setField(term229450, term229450.getClass(), "_unquotedUTF8Ref", null);
        setField(term229450, term229450.getClass(), "_quotedChars", null);
        setField(term229450, term229450.getClass(), "_jdkSerializeValue", null);
        setField(term229449, term229449.getClass(), "_name", term229450);
        setField(term229449, term229449.getClass(), "_wrapperName", null);
        setField(term229449, term229449.getClass(), "_declaredType", null);
        setField(term229449, term229449.getClass(), "_cfgSerializationType", null);
        setField(term229449, term229449.getClass(), "_nonTrivialBaseType", null);
        setField(term229449, term229449.getClass(), "_contextAnnotations", null);
        setField(term229453, term229453.getClass(), "_required", null);
        setField(term229453, term229453.getClass(), "_description", null);
        setField(term229453, term229453.getClass(), "_index", null);
        setField(term229453, term229453.getClass(), "_defaultValue", null);
        setField(term229449, term229449.getClass(), "_metadata", term229453);
        setField(term229449, term229449.getClass(), "_format", null);
        setField(term229449, term229449.getClass(), "_member", null);
        setField(term229449, term229449.getClass(), "_accessorMethod", null);
        setField(term229449, term229449.getClass(), "_field", null);
        setField(term229449, term229449.getClass(), "_serializer", null);
        setField(term229449, term229449.getClass(), "_nullSerializer", null);
        setField(term229449, term229449.getClass(), "_typeSerializer", null);
        setBooleanField(term229454, term229454.getClass(), "_resetWhenFull", false);
        setField(term229449, term229449.getClass(), "_dynamicSerializers", term229454);
        setBooleanField(term229449, term229449.getClass(), "_suppressNulls", false);
        setField(term229449, term229449.getClass(), "_suppressableValue", null);
        setField(term229449, term229449.getClass(), "_includeInViews", null);
        setField(term229449, term229449.getClass(), "_internalSettings", null);
        term229455 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term229456 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term229457 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term229460 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term229461 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term229462 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setBooleanField(term229455, term229455.getClass(), "_forSerialization", false);
        setField(term229455, term229455.getClass(), "_annotationIntrospector", term229456);
        setField(term229457, term229457.getClass(), "_simpleName", "");
        setField(term229457, term229457.getClass(), "_namespace", null);
        setField(term229457, term229457.getClass(), "_encodedSimple", null);
        setField(term229455, term229455.getClass(), "_name", term229457);
        setField(term229455, term229455.getClass(), "_internalName", null);
        setField(term229461, term229461.getClass(), "_field", null);
        setField(term229461, term229461.getClass(), "_serialization", null);
        setField(term229461, term229461.getClass(), "_context", null);
        setField(term229462, term229462.getClass(), "_annotations", null);
        setField(term229461, term229461.getClass(), "_annotations", term229462);
        setField(term229460, term229460.getClass(), "value", term229461);
        setField(term229460, term229460.getClass(), "next", null);
        setField(term229460, term229460.getClass(), "name", null);
        setBooleanField(term229460, term229460.getClass(), "isNameExplicit", false);
        setBooleanField(term229460, term229460.getClass(), "isVisible", false);
        setBooleanField(term229460, term229460.getClass(), "isMarkedIgnored", false);
        setField(term229455, term229455.getClass(), "_fields", term229460);
        setField(term229455, term229455.getClass(), "_ctorParameters", null);
        setField(term229455, term229455.getClass(), "_getters", null);
        setField(term229455, term229455.getClass(), "_setters", null);
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
        args[0] = term227842;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term229449));
        assertTrue(recursiveEquals(term227842, term229455));
    }

};


