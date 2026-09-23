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

public class BeanPropertyWriter_init_599291025210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85799;
     Object term86333;
     Object term86449;
     Object term87489;
     Object term87497;
     Object term87503;
     Object term87504;

    public BeanPropertyWriter_init_599291025210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85327 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term85457 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term85573 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term85671 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term85327, term85327.getClass(), "_member", term85457);
        setField(term85327, term85327.getClass(), "_contextAnnotations", term85573);
        setField(term85327, term85327.getClass(), "_name", term85671);
        term85799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term85891 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term86071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term86213 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term85891, term85891.getClass(), "_simpleName", "");
        setField(term85799, term85799.getClass(), "_name", term85891);
        setBooleanField(term85799, term85799.getClass(), "_forSerialization", false);
        setField(term85799, term85799.getClass(), "_ctorParameters", null);
        setField(term86071, term86071.getClass(), "next", null);
        setField(term86071, term86071.getClass(), "value", null);
        setField(term85799, term85799.getClass(), "_setters", term86071);
        setField(term85799, term85799.getClass(), "_fields", term86213);
        term86333 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term86449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term87489 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term87490 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term87493 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term87494 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term87495 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term87496 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term87490, term87490.getClass(), "_value", "");
        setField(term87490, term87490.getClass(), "_quotedUTF8Ref", null);
        setField(term87490, term87490.getClass(), "_unquotedUTF8Ref", null);
        setField(term87490, term87490.getClass(), "_quotedChars", null);
        setField(term87490, term87490.getClass(), "_jdkSerializeValue", null);
        setField(term87489, term87489.getClass(), "_name", term87490);
        setField(term87489, term87489.getClass(), "_wrapperName", null);
        setField(term87489, term87489.getClass(), "_declaredType", null);
        setField(term87489, term87489.getClass(), "_cfgSerializationType", null);
        setField(term87489, term87489.getClass(), "_nonTrivialBaseType", null);
        setField(term87493, term87493.getClass(), "_annotations", null);
        setField(term87489, term87489.getClass(), "_contextAnnotations", term87493);
        setField(term87494, term87494.getClass(), "_required", null);
        setField(term87494, term87494.getClass(), "_description", null);
        setField(term87494, term87494.getClass(), "_index", null);
        setField(term87494, term87494.getClass(), "_defaultValue", null);
        setField(term87489, term87489.getClass(), "_metadata", term87494);
        setField(term87489, term87489.getClass(), "_format", null);
        setField(term87495, term87495.getClass(), "_method", null);
        setField(term87495, term87495.getClass(), "_paramClasses", null);
        setField(term87495, term87495.getClass(), "_serialization", null);
        setField(term87495, term87495.getClass(), "_paramAnnotations", null);
        setField(term87495, term87495.getClass(), "_context", null);
        setField(term87495, term87495.getClass(), "_annotations", null);
        setField(term87489, term87489.getClass(), "_member", term87495);
        setField(term87489, term87489.getClass(), "_accessorMethod", null);
        setField(term87489, term87489.getClass(), "_field", null);
        setField(term87489, term87489.getClass(), "_serializer", null);
        setField(term87489, term87489.getClass(), "_nullSerializer", null);
        setField(term87489, term87489.getClass(), "_typeSerializer", null);
        setBooleanField(term87496, term87496.getClass(), "_resetWhenFull", false);
        setField(term87489, term87489.getClass(), "_dynamicSerializers", term87496);
        setBooleanField(term87489, term87489.getClass(), "_suppressNulls", false);
        setField(term87489, term87489.getClass(), "_suppressableValue", null);
        setField(term87489, term87489.getClass(), "_includeInViews", null);
        setField(term87489, term87489.getClass(), "_internalSettings", null);
        term87497 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term87498 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term87501 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term87502 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term87497, term87497.getClass(), "_forSerialization", false);
        setField(term87497, term87497.getClass(), "_annotationIntrospector", null);
        setField(term87498, term87498.getClass(), "_simpleName", "");
        setField(term87498, term87498.getClass(), "_namespace", null);
        setField(term87498, term87498.getClass(), "_encodedSimple", null);
        setField(term87497, term87497.getClass(), "_name", term87498);
        setField(term87497, term87497.getClass(), "_internalName", null);
        setField(term87501, term87501.getClass(), "value", null);
        setField(term87501, term87501.getClass(), "next", null);
        setField(term87501, term87501.getClass(), "name", null);
        setBooleanField(term87501, term87501.getClass(), "isNameExplicit", false);
        setBooleanField(term87501, term87501.getClass(), "isVisible", false);
        setBooleanField(term87501, term87501.getClass(), "isMarkedIgnored", false);
        setField(term87497, term87497.getClass(), "_fields", term87501);
        setField(term87497, term87497.getClass(), "_ctorParameters", null);
        setField(term87497, term87497.getClass(), "_getters", null);
        setField(term87502, term87502.getClass(), "value", null);
        setField(term87502, term87502.getClass(), "next", null);
        setField(term87502, term87502.getClass(), "name", null);
        setBooleanField(term87502, term87502.getClass(), "isNameExplicit", false);
        setBooleanField(term87502, term87502.getClass(), "isVisible", false);
        setBooleanField(term87502, term87502.getClass(), "isMarkedIgnored", false);
        setField(term87497, term87497.getClass(), "_setters", term87502);
        term87503 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term87503, term87503.getClass(), "_method", null);
        setField(term87503, term87503.getClass(), "_paramClasses", null);
        setField(term87503, term87503.getClass(), "_serialization", null);
        setField(term87503, term87503.getClass(), "_paramAnnotations", null);
        setField(term87503, term87503.getClass(), "_context", null);
        setField(term87503, term87503.getClass(), "_annotations", null);
        term87504 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term87504, term87504.getClass(), "_annotations", null);
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
        args[0] = term85799;
        args[1] = term86333;
        args[2] = term86449;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87489));
        assertTrue(recursiveEquals(term85799, term87497));
        assertTrue(recursiveEquals(term86333, term87503));
        assertTrue(recursiveEquals(term86449, term87504));
    }

};


