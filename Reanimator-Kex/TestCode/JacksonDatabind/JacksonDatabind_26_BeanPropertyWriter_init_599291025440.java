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

public class BeanPropertyWriter_init_599291025440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288330;
     Object term288840;
     Object term288956;
     Object term289072;
     Object term289080;
     Object term289086;
     Object term289087;

    public BeanPropertyWriter_init_599291025440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term287858 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term287988 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term288104 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term288202 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term287858, term287858.getClass(), "_member", term287988);
        setField(term287858, term287858.getClass(), "_contextAnnotations", term288104);
        setField(term287858, term287858.getClass(), "_name", term288202);
        term288330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term288422 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term288602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term288722 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term288422, term288422.getClass(), "_simpleName", "");
        setField(term288330, term288330.getClass(), "_name", term288422);
        setBooleanField(term288330, term288330.getClass(), "_forSerialization", false);
        setField(term288330, term288330.getClass(), "_ctorParameters", null);
        setField(term288602, term288602.getClass(), "next", null);
        setField(term288602, term288602.getClass(), "value", term288722);
        setField(term288330, term288330.getClass(), "_setters", term288602);
        term288840 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term288956 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term289072 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term289073 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term289076 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term289077 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term289078 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term289079 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term289073, term289073.getClass(), "_value", "");
        setField(term289073, term289073.getClass(), "_quotedUTF8Ref", null);
        setField(term289073, term289073.getClass(), "_unquotedUTF8Ref", null);
        setField(term289073, term289073.getClass(), "_quotedChars", null);
        setField(term289073, term289073.getClass(), "_jdkSerializeValue", null);
        setField(term289072, term289072.getClass(), "_name", term289073);
        setField(term289072, term289072.getClass(), "_wrapperName", null);
        setField(term289072, term289072.getClass(), "_declaredType", null);
        setField(term289072, term289072.getClass(), "_cfgSerializationType", null);
        setField(term289072, term289072.getClass(), "_nonTrivialBaseType", null);
        setField(term289076, term289076.getClass(), "_annotations", null);
        setField(term289072, term289072.getClass(), "_contextAnnotations", term289076);
        setField(term289077, term289077.getClass(), "_required", null);
        setField(term289077, term289077.getClass(), "_description", null);
        setField(term289077, term289077.getClass(), "_index", null);
        setField(term289077, term289077.getClass(), "_defaultValue", null);
        setField(term289072, term289072.getClass(), "_metadata", term289077);
        setField(term289072, term289072.getClass(), "_format", null);
        setField(term289078, term289078.getClass(), "_field", null);
        setField(term289078, term289078.getClass(), "_serialization", null);
        setField(term289078, term289078.getClass(), "_context", null);
        setField(term289078, term289078.getClass(), "_annotations", null);
        setField(term289072, term289072.getClass(), "_member", term289078);
        setField(term289072, term289072.getClass(), "_accessorMethod", null);
        setField(term289072, term289072.getClass(), "_field", null);
        setField(term289072, term289072.getClass(), "_serializer", null);
        setField(term289072, term289072.getClass(), "_nullSerializer", null);
        setField(term289072, term289072.getClass(), "_typeSerializer", null);
        setBooleanField(term289079, term289079.getClass(), "_resetWhenFull", false);
        setField(term289072, term289072.getClass(), "_dynamicSerializers", term289079);
        setBooleanField(term289072, term289072.getClass(), "_suppressNulls", false);
        setField(term289072, term289072.getClass(), "_suppressableValue", null);
        setField(term289072, term289072.getClass(), "_includeInViews", null);
        setField(term289072, term289072.getClass(), "_internalSettings", null);
        term289080 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term289081 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term289084 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term289085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setBooleanField(term289080, term289080.getClass(), "_forSerialization", false);
        setField(term289080, term289080.getClass(), "_annotationIntrospector", null);
        setField(term289081, term289081.getClass(), "_simpleName", "");
        setField(term289081, term289081.getClass(), "_namespace", null);
        setField(term289081, term289081.getClass(), "_encodedSimple", null);
        setField(term289080, term289080.getClass(), "_name", term289081);
        setField(term289080, term289080.getClass(), "_internalName", null);
        setField(term289080, term289080.getClass(), "_fields", null);
        setField(term289080, term289080.getClass(), "_ctorParameters", null);
        setField(term289080, term289080.getClass(), "_getters", null);
        setField(term289085, term289085.getClass(), "_method", null);
        setField(term289085, term289085.getClass(), "_paramClasses", null);
        setField(term289085, term289085.getClass(), "_serialization", null);
        setField(term289085, term289085.getClass(), "_paramAnnotations", null);
        setField(term289085, term289085.getClass(), "_context", null);
        setField(term289085, term289085.getClass(), "_annotations", null);
        setField(term289084, term289084.getClass(), "value", term289085);
        setField(term289084, term289084.getClass(), "next", null);
        setField(term289084, term289084.getClass(), "name", null);
        setBooleanField(term289084, term289084.getClass(), "isNameExplicit", false);
        setBooleanField(term289084, term289084.getClass(), "isVisible", false);
        setBooleanField(term289084, term289084.getClass(), "isMarkedIgnored", false);
        setField(term289080, term289080.getClass(), "_setters", term289084);
        term289086 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term289086, term289086.getClass(), "_field", null);
        setField(term289086, term289086.getClass(), "_serialization", null);
        setField(term289086, term289086.getClass(), "_context", null);
        setField(term289086, term289086.getClass(), "_annotations", null);
        term289087 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term289087, term289087.getClass(), "_annotations", null);
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
        args[0] = term288330;
        args[1] = term288840;
        args[2] = term288956;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term289072));
        assertTrue(recursiveEquals(term288330, term289080));
        assertTrue(recursiveEquals(term288840, term289086));
        assertTrue(recursiveEquals(term288956, term289087));
    }

};


