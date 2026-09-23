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

public class BeanPropertyWriter_init_599291025372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222387;
     Object term222923;
     Object term223071;
     Object term223078;
     Object term223084;

    public BeanPropertyWriter_init_599291025372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221981 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term221729 = (Object[]) newArray("java.lang.Class", 0);
        Object term222121 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        Object term222259 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        setField(term221981, term221981.getClass(), "_member", null);
        setField(term221981, term221981.getClass(), "_contextAnnotations", null);
        setField(term221981, term221981.getClass(), "_name", null);
        setField(term221981, term221981.getClass(), "_wrapperName", null);
        setField(term221981, term221981.getClass(), "_metadata", null);
        setField(term221981, term221981.getClass(), "_includeInViews", term221729);
        setField(term221981, term221981.getClass(), "_declaredType", null);
        setField(term221981, term221981.getClass(), "_serializer", null);
        setField(term221981, term221981.getClass(), "_dynamicSerializers", term222121);
        setField(term221981, term221981.getClass(), "_typeSerializer", term222259);
        setField(term221981, term221981.getClass(), "_cfgSerializationType", null);
        term222387 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term222479 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term222659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term222803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term222479, term222479.getClass(), "_simpleName", "");
        setField(term222387, term222387.getClass(), "_name", term222479);
        setBooleanField(term222387, term222387.getClass(), "_forSerialization", false);
        setField(term222387, term222387.getClass(), "_ctorParameters", null);
        setField(term222659, term222659.getClass(), "next", null);
        setField(term222659, term222659.getClass(), "value", null);
        setField(term222387, term222387.getClass(), "_setters", term222659);
        setField(term222387, term222387.getClass(), "_fields", null);
        setField(term222387, term222387.getClass(), "_annotationIntrospector", term222803);
        term222923 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term223071 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term223072 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term223075 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term223076 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term223077 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term223072, term223072.getClass(), "_value", "");
        setField(term223072, term223072.getClass(), "_quotedUTF8Ref", null);
        setField(term223072, term223072.getClass(), "_unquotedUTF8Ref", null);
        setField(term223072, term223072.getClass(), "_quotedChars", null);
        setField(term223072, term223072.getClass(), "_jdkSerializeValue", null);
        setField(term223071, term223071.getClass(), "_name", term223072);
        setField(term223071, term223071.getClass(), "_wrapperName", null);
        setField(term223071, term223071.getClass(), "_declaredType", null);
        setField(term223071, term223071.getClass(), "_cfgSerializationType", null);
        setField(term223071, term223071.getClass(), "_nonTrivialBaseType", null);
        setField(term223071, term223071.getClass(), "_contextAnnotations", null);
        setField(term223075, term223075.getClass(), "_required", null);
        setField(term223075, term223075.getClass(), "_description", null);
        setField(term223075, term223075.getClass(), "_index", null);
        setField(term223075, term223075.getClass(), "_defaultValue", null);
        setField(term223071, term223071.getClass(), "_metadata", term223075);
        setField(term223071, term223071.getClass(), "_format", null);
        setField(term223076, term223076.getClass(), "_method", null);
        setField(term223076, term223076.getClass(), "_paramClasses", null);
        setField(term223076, term223076.getClass(), "_serialization", null);
        setField(term223076, term223076.getClass(), "_paramAnnotations", null);
        setField(term223076, term223076.getClass(), "_context", null);
        setField(term223076, term223076.getClass(), "_annotations", null);
        setField(term223071, term223071.getClass(), "_member", term223076);
        setField(term223071, term223071.getClass(), "_accessorMethod", null);
        setField(term223071, term223071.getClass(), "_field", null);
        setField(term223071, term223071.getClass(), "_serializer", null);
        setField(term223071, term223071.getClass(), "_nullSerializer", null);
        setField(term223071, term223071.getClass(), "_typeSerializer", null);
        setBooleanField(term223077, term223077.getClass(), "_resetWhenFull", false);
        setField(term223071, term223071.getClass(), "_dynamicSerializers", term223077);
        setBooleanField(term223071, term223071.getClass(), "_suppressNulls", false);
        setField(term223071, term223071.getClass(), "_suppressableValue", null);
        setField(term223071, term223071.getClass(), "_includeInViews", null);
        setField(term223071, term223071.getClass(), "_internalSettings", null);
        term223078 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term223079 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term223080 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term223083 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term223078, term223078.getClass(), "_forSerialization", false);
        setField(term223078, term223078.getClass(), "_annotationIntrospector", term223079);
        setField(term223080, term223080.getClass(), "_simpleName", "");
        setField(term223080, term223080.getClass(), "_namespace", null);
        setField(term223080, term223080.getClass(), "_encodedSimple", null);
        setField(term223078, term223078.getClass(), "_name", term223080);
        setField(term223078, term223078.getClass(), "_internalName", null);
        setField(term223078, term223078.getClass(), "_fields", null);
        setField(term223078, term223078.getClass(), "_ctorParameters", null);
        setField(term223078, term223078.getClass(), "_getters", null);
        setField(term223083, term223083.getClass(), "value", null);
        setField(term223083, term223083.getClass(), "next", null);
        setField(term223083, term223083.getClass(), "name", null);
        setBooleanField(term223083, term223083.getClass(), "isNameExplicit", false);
        setBooleanField(term223083, term223083.getClass(), "isVisible", false);
        setBooleanField(term223083, term223083.getClass(), "isMarkedIgnored", false);
        setField(term223078, term223078.getClass(), "_setters", term223083);
        term223084 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term223084, term223084.getClass(), "_method", null);
        setField(term223084, term223084.getClass(), "_paramClasses", null);
        setField(term223084, term223084.getClass(), "_serialization", null);
        setField(term223084, term223084.getClass(), "_paramAnnotations", null);
        setField(term223084, term223084.getClass(), "_context", null);
        setField(term223084, term223084.getClass(), "_annotations", null);
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
        args[0] = term222387;
        args[1] = term222923;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term223071));
        assertTrue(recursiveEquals(term222387, term223078));
        assertTrue(recursiveEquals(term222923, term223084));
    }

};


