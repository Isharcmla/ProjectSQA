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

public class BeanPropertyWriter_init_599291025364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216708;
     Object term217242;
     Object term217791;
     Object term217798;
     Object term217804;

    public BeanPropertyWriter_init_599291025364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term216282 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term216380 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term216480 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term216031 = (Object[]) newArray("java.lang.Class", 0);
        Object term216580 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term216282, term216282.getClass(), "_member", null);
        setField(term216282, term216282.getClass(), "_contextAnnotations", null);
        setField(term216282, term216282.getClass(), "_name", term216380);
        setField(term216282, term216282.getClass(), "_wrapperName", null);
        setField(term216282, term216282.getClass(), "_metadata", term216480);
        setField(term216282, term216282.getClass(), "_includeInViews", term216031);
        setField(term216282, term216282.getClass(), "_declaredType", term216580);
        setField(term216282, term216282.getClass(), "_serializer", null);
        setField(term216282, term216282.getClass(), "_dynamicSerializers", null);
        setField(term216282, term216282.getClass(), "_typeSerializer", null);
        setField(term216282, term216282.getClass(), "_cfgSerializationType", null);
        term216708 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term216800 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term216980 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term217124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term216800, term216800.getClass(), "_simpleName", "");
        setField(term216708, term216708.getClass(), "_name", term216800);
        setBooleanField(term216708, term216708.getClass(), "_forSerialization", false);
        setField(term216708, term216708.getClass(), "_ctorParameters", null);
        setField(term216980, term216980.getClass(), "next", null);
        setField(term216980, term216980.getClass(), "value", null);
        setField(term216708, term216708.getClass(), "_setters", term216980);
        setField(term216708, term216708.getClass(), "_fields", null);
        setField(term216708, term216708.getClass(), "_annotationIntrospector", term217124);
        term217242 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term217791 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term217792 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term217795 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term217796 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term217797 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term217792, term217792.getClass(), "_value", "");
        setField(term217792, term217792.getClass(), "_quotedUTF8Ref", null);
        setField(term217792, term217792.getClass(), "_unquotedUTF8Ref", null);
        setField(term217792, term217792.getClass(), "_quotedChars", null);
        setField(term217792, term217792.getClass(), "_jdkSerializeValue", null);
        setField(term217791, term217791.getClass(), "_name", term217792);
        setField(term217791, term217791.getClass(), "_wrapperName", null);
        setField(term217791, term217791.getClass(), "_declaredType", null);
        setField(term217791, term217791.getClass(), "_cfgSerializationType", null);
        setField(term217791, term217791.getClass(), "_nonTrivialBaseType", null);
        setField(term217791, term217791.getClass(), "_contextAnnotations", null);
        setField(term217795, term217795.getClass(), "_required", null);
        setField(term217795, term217795.getClass(), "_description", null);
        setField(term217795, term217795.getClass(), "_index", null);
        setField(term217795, term217795.getClass(), "_defaultValue", null);
        setField(term217791, term217791.getClass(), "_metadata", term217795);
        setField(term217791, term217791.getClass(), "_format", null);
        setField(term217796, term217796.getClass(), "_field", null);
        setField(term217796, term217796.getClass(), "_serialization", null);
        setField(term217796, term217796.getClass(), "_context", null);
        setField(term217796, term217796.getClass(), "_annotations", null);
        setField(term217791, term217791.getClass(), "_member", term217796);
        setField(term217791, term217791.getClass(), "_accessorMethod", null);
        setField(term217791, term217791.getClass(), "_field", null);
        setField(term217791, term217791.getClass(), "_serializer", null);
        setField(term217791, term217791.getClass(), "_nullSerializer", null);
        setField(term217791, term217791.getClass(), "_typeSerializer", null);
        setBooleanField(term217797, term217797.getClass(), "_resetWhenFull", false);
        setField(term217791, term217791.getClass(), "_dynamicSerializers", term217797);
        setBooleanField(term217791, term217791.getClass(), "_suppressNulls", false);
        setField(term217791, term217791.getClass(), "_suppressableValue", null);
        setField(term217791, term217791.getClass(), "_includeInViews", null);
        setField(term217791, term217791.getClass(), "_internalSettings", null);
        term217798 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term217799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term217800 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term217803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term217798, term217798.getClass(), "_forSerialization", false);
        setField(term217798, term217798.getClass(), "_annotationIntrospector", term217799);
        setField(term217800, term217800.getClass(), "_simpleName", "");
        setField(term217800, term217800.getClass(), "_namespace", null);
        setField(term217800, term217800.getClass(), "_encodedSimple", null);
        setField(term217798, term217798.getClass(), "_name", term217800);
        setField(term217798, term217798.getClass(), "_internalName", null);
        setField(term217798, term217798.getClass(), "_fields", null);
        setField(term217798, term217798.getClass(), "_ctorParameters", null);
        setField(term217798, term217798.getClass(), "_getters", null);
        setField(term217803, term217803.getClass(), "value", null);
        setField(term217803, term217803.getClass(), "next", null);
        setField(term217803, term217803.getClass(), "name", null);
        setBooleanField(term217803, term217803.getClass(), "isNameExplicit", false);
        setBooleanField(term217803, term217803.getClass(), "isVisible", false);
        setBooleanField(term217803, term217803.getClass(), "isMarkedIgnored", false);
        setField(term217798, term217798.getClass(), "_setters", term217803);
        term217804 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term217804, term217804.getClass(), "_field", null);
        setField(term217804, term217804.getClass(), "_serialization", null);
        setField(term217804, term217804.getClass(), "_context", null);
        setField(term217804, term217804.getClass(), "_annotations", null);
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
        args[0] = term216708;
        args[1] = term217242;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term217791));
        assertTrue(recursiveEquals(term216708, term217798));
        assertTrue(recursiveEquals(term217242, term217804));
    }

};


