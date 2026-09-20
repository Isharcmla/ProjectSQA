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

public class BeanPropertyWriter_init_599291025121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40826;
     Object term41128;
     Object term41226;
     Object term41583;
     Object term41590;
     Object term41594;
     Object term41595;

    public BeanPropertyWriter_init_599291025121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40502 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term40600 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term40692 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term40502, term40502.getClass(), "_member", null);
        setField(term40502, term40502.getClass(), "_contextAnnotations", null);
        setField(term40502, term40502.getClass(), "_name", term40600);
        setField(term40502, term40502.getClass(), "_wrapperName", term40692);
        setField(term40502, term40502.getClass(), "_declaredType", null);
        setField(term40502, term40502.getClass(), "_serializer", null);
        setField(term40502, term40502.getClass(), "_dynamicSerializers", null);
        setField(term40502, term40502.getClass(), "_typeSerializer", null);
        setField(term40502, term40502.getClass(), "_cfgSerializationType", null);
        setBooleanField(term40502, term40502.getClass(), "_isRequired", false);
        term40826 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term41008 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term40826, term40826.getClass(), "_name", "");
        setField(term40826, term40826.getClass(), "_introspector", term41008);
        setField(term40826, term40826.getClass(), "_member", null);
        term41128 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term41226 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term41583 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term41584 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term41585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term41586 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term41589 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term41584, term41584.getClass(), "_method", null);
        setField(term41584, term41584.getClass(), "_paramClasses", null);
        setField(term41584, term41584.getClass(), "_serialization", null);
        setField(term41584, term41584.getClass(), "_paramAnnotations", null);
        setField(term41584, term41584.getClass(), "_annotations", null);
        setField(term41583, term41583.getClass(), "_member", term41584);
        setField(term41583, term41583.getClass(), "_contextAnnotations", null);
        setField(term41585, term41585.getClass(), "_typeParameters", null);
        setField(term41585, term41585.getClass(), "_typeNames", null);
        setField(term41585, term41585.getClass(), "_canonicalName", null);
        setField(term41585, term41585.getClass(), "_class", null);
        setIntField(term41585, term41585.getClass(), "_hashCode", 0);
        setField(term41585, term41585.getClass(), "_valueHandler", null);
        setField(term41585, term41585.getClass(), "_typeHandler", null);
        setBooleanField(term41585, term41585.getClass(), "_asStatic", false);
        setField(term41583, term41583.getClass(), "_declaredType", term41585);
        setField(term41583, term41583.getClass(), "_accessorMethod", null);
        setField(term41583, term41583.getClass(), "_field", null);
        setField(term41583, term41583.getClass(), "_internalSettings", null);
        setField(term41586, term41586.getClass(), "_value", "");
        setField(term41586, term41586.getClass(), "_quotedUTF8Ref", null);
        setField(term41586, term41586.getClass(), "_unquotedUTF8Ref", null);
        setField(term41586, term41586.getClass(), "_quotedChars", null);
        setField(term41586, term41586.getClass(), "_jdkSerializeValue", null);
        setField(term41583, term41583.getClass(), "_name", term41586);
        setField(term41583, term41583.getClass(), "_wrapperName", null);
        setField(term41583, term41583.getClass(), "_cfgSerializationType", null);
        setField(term41583, term41583.getClass(), "_serializer", null);
        setField(term41583, term41583.getClass(), "_nullSerializer", null);
        setField(term41583, term41583.getClass(), "_dynamicSerializers", term41589);
        setBooleanField(term41583, term41583.getClass(), "_suppressNulls", false);
        setField(term41583, term41583.getClass(), "_suppressableValue", null);
        setField(term41583, term41583.getClass(), "_includeInViews", null);
        setField(term41583, term41583.getClass(), "_typeSerializer", null);
        setField(term41583, term41583.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term41583, term41583.getClass(), "_isRequired", false);
        term41590 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term41591 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term41590, term41590.getClass(), "_introspector", term41591);
        setField(term41590, term41590.getClass(), "_member", null);
        setField(term41590, term41590.getClass(), "_name", "");
        term41594 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term41594, term41594.getClass(), "_method", null);
        setField(term41594, term41594.getClass(), "_paramClasses", null);
        setField(term41594, term41594.getClass(), "_serialization", null);
        setField(term41594, term41594.getClass(), "_paramAnnotations", null);
        setField(term41594, term41594.getClass(), "_annotations", null);
        term41595 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term41595, term41595.getClass(), "_typeParameters", null);
        setField(term41595, term41595.getClass(), "_typeNames", null);
        setField(term41595, term41595.getClass(), "_canonicalName", null);
        setField(term41595, term41595.getClass(), "_class", null);
        setIntField(term41595, term41595.getClass(), "_hashCode", 0);
        setField(term41595, term41595.getClass(), "_valueHandler", null);
        setField(term41595, term41595.getClass(), "_typeHandler", null);
        setBooleanField(term41595, term41595.getClass(), "_asStatic", false);
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
        args[0] = term40826;
        args[1] = term41128;
        args[2] = null;
        args[3] = term41226;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41583));
        assertTrue(recursiveEquals(term40826, term41590));
        assertTrue(recursiveEquals(term41128, term41594));
        assertTrue(recursiveEquals(term41226, term41595));
    }

};
