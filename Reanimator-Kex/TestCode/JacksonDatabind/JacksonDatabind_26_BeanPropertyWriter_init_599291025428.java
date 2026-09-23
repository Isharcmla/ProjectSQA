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

public class BeanPropertyWriter_init_599291025428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273859;
     Object term274515;
     Object term274649;
     Object term276369;
     Object term276376;
     Object term276383;
     Object term276384;

    public BeanPropertyWriter_init_599291025428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273639 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term273731 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term273368 = (Object[]) newArray("java.lang.Class", 0);
        setField(term273639, term273639.getClass(), "_member", null);
        setField(term273639, term273639.getClass(), "_contextAnnotations", null);
        setField(term273639, term273639.getClass(), "_name", null);
        setField(term273639, term273639.getClass(), "_wrapperName", term273731);
        setField(term273639, term273639.getClass(), "_metadata", null);
        setField(term273639, term273639.getClass(), "_includeInViews", term273368);
        setField(term273639, term273639.getClass(), "_declaredType", null);
        setField(term273639, term273639.getClass(), "_serializer", null);
        setField(term273639, term273639.getClass(), "_dynamicSerializers", null);
        setField(term273639, term273639.getClass(), "_typeSerializer", null);
        setField(term273639, term273639.getClass(), "_cfgSerializationType", null);
        term273859 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term273951 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term274131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term274249 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term274397 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term273951, term273951.getClass(), "_simpleName", "");
        setField(term273859, term273859.getClass(), "_name", term273951);
        setBooleanField(term273859, term273859.getClass(), "_forSerialization", false);
        setField(term273859, term273859.getClass(), "_ctorParameters", null);
        setField(term273859, term273859.getClass(), "_setters", null);
        setField(term274249, term274249.getClass(), "_annotations", null);
        setField(term274131, term274131.getClass(), "value", term274249);
        setField(term274131, term274131.getClass(), "next", null);
        setField(term273859, term273859.getClass(), "_fields", term274131);
        setField(term273859, term273859.getClass(), "_annotationIntrospector", term274397);
        term274515 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term274649 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer"));
        term276369 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term276370 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term276373 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term276374 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term276375 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer"));
        setField(term276370, term276370.getClass(), "_value", "");
        setField(term276370, term276370.getClass(), "_quotedUTF8Ref", null);
        setField(term276370, term276370.getClass(), "_unquotedUTF8Ref", null);
        setField(term276370, term276370.getClass(), "_quotedChars", null);
        setField(term276370, term276370.getClass(), "_jdkSerializeValue", null);
        setField(term276369, term276369.getClass(), "_name", term276370);
        setField(term276369, term276369.getClass(), "_wrapperName", null);
        setField(term276369, term276369.getClass(), "_declaredType", null);
        setField(term276369, term276369.getClass(), "_cfgSerializationType", null);
        setField(term276369, term276369.getClass(), "_nonTrivialBaseType", null);
        setField(term276369, term276369.getClass(), "_contextAnnotations", null);
        setField(term276373, term276373.getClass(), "_required", null);
        setField(term276373, term276373.getClass(), "_description", null);
        setField(term276373, term276373.getClass(), "_index", null);
        setField(term276373, term276373.getClass(), "_defaultValue", null);
        setField(term276369, term276369.getClass(), "_metadata", term276373);
        setField(term276369, term276369.getClass(), "_format", null);
        setField(term276374, term276374.getClass(), "_field", null);
        setField(term276374, term276374.getClass(), "_serialization", null);
        setField(term276374, term276374.getClass(), "_context", null);
        setField(term276374, term276374.getClass(), "_annotations", null);
        setField(term276369, term276369.getClass(), "_member", term276374);
        setField(term276369, term276369.getClass(), "_accessorMethod", null);
        setField(term276369, term276369.getClass(), "_field", null);
        setField(term276375, term276375.getClass(), "_handledType", null);
        setField(term276369, term276369.getClass(), "_serializer", term276375);
        setField(term276369, term276369.getClass(), "_nullSerializer", null);
        setField(term276369, term276369.getClass(), "_typeSerializer", null);
        setField(term276369, term276369.getClass(), "_dynamicSerializers", null);
        setBooleanField(term276369, term276369.getClass(), "_suppressNulls", false);
        setField(term276369, term276369.getClass(), "_suppressableValue", null);
        setField(term276369, term276369.getClass(), "_includeInViews", null);
        setField(term276369, term276369.getClass(), "_internalSettings", null);
        term276376 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term276377 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term276378 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term276381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term276382 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term276376, term276376.getClass(), "_forSerialization", false);
        setField(term276376, term276376.getClass(), "_annotationIntrospector", term276377);
        setField(term276378, term276378.getClass(), "_simpleName", "");
        setField(term276378, term276378.getClass(), "_namespace", null);
        setField(term276378, term276378.getClass(), "_encodedSimple", null);
        setField(term276376, term276376.getClass(), "_name", term276378);
        setField(term276376, term276376.getClass(), "_internalName", null);
        setField(term276382, term276382.getClass(), "_field", null);
        setField(term276382, term276382.getClass(), "_serialization", null);
        setField(term276382, term276382.getClass(), "_context", null);
        setField(term276382, term276382.getClass(), "_annotations", null);
        setField(term276381, term276381.getClass(), "value", term276382);
        setField(term276381, term276381.getClass(), "next", null);
        setField(term276381, term276381.getClass(), "name", null);
        setBooleanField(term276381, term276381.getClass(), "isNameExplicit", false);
        setBooleanField(term276381, term276381.getClass(), "isVisible", false);
        setBooleanField(term276381, term276381.getClass(), "isMarkedIgnored", false);
        setField(term276376, term276376.getClass(), "_fields", term276381);
        setField(term276376, term276376.getClass(), "_ctorParameters", null);
        setField(term276376, term276376.getClass(), "_getters", null);
        setField(term276376, term276376.getClass(), "_setters", null);
        term276383 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term276383, term276383.getClass(), "_field", null);
        setField(term276383, term276383.getClass(), "_serialization", null);
        setField(term276383, term276383.getClass(), "_context", null);
        setField(term276383, term276383.getClass(), "_annotations", null);
        term276384 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer"));
        setField(term276384, term276384.getClass(), "_handledType", null);
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
        args[0] = term273859;
        args[1] = term274515;
        args[2] = null;
        args[3] = null;
        args[4] = term274649;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term276369));
        assertTrue(recursiveEquals(term273859, term276376));
        assertTrue(recursiveEquals(term274515, term276383));
        assertTrue(recursiveEquals(term274649, term276384));
    }

};


