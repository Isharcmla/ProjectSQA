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

public class BeanPropertyWriter_init_599291025376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224799;
     Object term225335;
     Object term225497;
     Object term225791;
     Object term225798;
     Object term225804;
     Object term225805;

    public BeanPropertyWriter_init_599291025376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term224529 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term224278 = (Object[]) newArray("java.lang.Class", 0);
        Object term224671 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single"));
        setField(term224529, term224529.getClass(), "_member", null);
        setField(term224529, term224529.getClass(), "_contextAnnotations", null);
        setField(term224529, term224529.getClass(), "_name", null);
        setField(term224529, term224529.getClass(), "_wrapperName", null);
        setField(term224529, term224529.getClass(), "_metadata", null);
        setField(term224529, term224529.getClass(), "_includeInViews", term224278);
        setField(term224529, term224529.getClass(), "_declaredType", null);
        setField(term224529, term224529.getClass(), "_serializer", null);
        setField(term224529, term224529.getClass(), "_dynamicSerializers", term224671);
        setField(term224529, term224529.getClass(), "_typeSerializer", null);
        setField(term224529, term224529.getClass(), "_cfgSerializationType", null);
        term224799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term224891 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term225071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term225215 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term224891, term224891.getClass(), "_simpleName", "");
        setField(term224799, term224799.getClass(), "_name", term224891);
        setBooleanField(term224799, term224799.getClass(), "_forSerialization", false);
        setField(term224799, term224799.getClass(), "_ctorParameters", null);
        setField(term224799, term224799.getClass(), "_setters", null);
        setField(term225071, term225071.getClass(), "value", null);
        setField(term225071, term225071.getClass(), "next", null);
        setField(term224799, term224799.getClass(), "_fields", term225071);
        setField(term224799, term224799.getClass(), "_annotationIntrospector", term225215);
        term225335 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term225497 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        term225791 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term225792 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term225795 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term225796 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term225797 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        setField(term225792, term225792.getClass(), "_value", "");
        setField(term225792, term225792.getClass(), "_quotedUTF8Ref", null);
        setField(term225792, term225792.getClass(), "_unquotedUTF8Ref", null);
        setField(term225792, term225792.getClass(), "_quotedChars", null);
        setField(term225792, term225792.getClass(), "_jdkSerializeValue", null);
        setField(term225791, term225791.getClass(), "_name", term225792);
        setField(term225791, term225791.getClass(), "_wrapperName", null);
        setField(term225791, term225791.getClass(), "_declaredType", null);
        setField(term225791, term225791.getClass(), "_cfgSerializationType", null);
        setField(term225791, term225791.getClass(), "_nonTrivialBaseType", null);
        setField(term225791, term225791.getClass(), "_contextAnnotations", null);
        setField(term225795, term225795.getClass(), "_required", null);
        setField(term225795, term225795.getClass(), "_description", null);
        setField(term225795, term225795.getClass(), "_index", null);
        setField(term225795, term225795.getClass(), "_defaultValue", null);
        setField(term225791, term225791.getClass(), "_metadata", term225795);
        setField(term225791, term225791.getClass(), "_format", null);
        setField(term225796, term225796.getClass(), "_method", null);
        setField(term225796, term225796.getClass(), "_paramClasses", null);
        setField(term225796, term225796.getClass(), "_serialization", null);
        setField(term225796, term225796.getClass(), "_paramAnnotations", null);
        setField(term225796, term225796.getClass(), "_context", null);
        setField(term225796, term225796.getClass(), "_annotations", null);
        setField(term225791, term225791.getClass(), "_member", term225796);
        setField(term225791, term225791.getClass(), "_accessorMethod", null);
        setField(term225791, term225791.getClass(), "_field", null);
        setField(term225797, term225797.getClass(), "_handledType", null);
        setField(term225791, term225791.getClass(), "_serializer", term225797);
        setField(term225791, term225791.getClass(), "_nullSerializer", null);
        setField(term225791, term225791.getClass(), "_typeSerializer", null);
        setField(term225791, term225791.getClass(), "_dynamicSerializers", null);
        setBooleanField(term225791, term225791.getClass(), "_suppressNulls", false);
        setField(term225791, term225791.getClass(), "_suppressableValue", null);
        setField(term225791, term225791.getClass(), "_includeInViews", null);
        setField(term225791, term225791.getClass(), "_internalSettings", null);
        term225798 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term225799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term225800 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term225803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term225798, term225798.getClass(), "_forSerialization", false);
        setField(term225798, term225798.getClass(), "_annotationIntrospector", term225799);
        setField(term225800, term225800.getClass(), "_simpleName", "");
        setField(term225800, term225800.getClass(), "_namespace", null);
        setField(term225800, term225800.getClass(), "_encodedSimple", null);
        setField(term225798, term225798.getClass(), "_name", term225800);
        setField(term225798, term225798.getClass(), "_internalName", null);
        setField(term225803, term225803.getClass(), "value", null);
        setField(term225803, term225803.getClass(), "next", null);
        setField(term225803, term225803.getClass(), "name", null);
        setBooleanField(term225803, term225803.getClass(), "isNameExplicit", false);
        setBooleanField(term225803, term225803.getClass(), "isVisible", false);
        setBooleanField(term225803, term225803.getClass(), "isMarkedIgnored", false);
        setField(term225798, term225798.getClass(), "_fields", term225803);
        setField(term225798, term225798.getClass(), "_ctorParameters", null);
        setField(term225798, term225798.getClass(), "_getters", null);
        setField(term225798, term225798.getClass(), "_setters", null);
        term225804 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term225804, term225804.getClass(), "_method", null);
        setField(term225804, term225804.getClass(), "_paramClasses", null);
        setField(term225804, term225804.getClass(), "_serialization", null);
        setField(term225804, term225804.getClass(), "_paramAnnotations", null);
        setField(term225804, term225804.getClass(), "_context", null);
        setField(term225804, term225804.getClass(), "_annotations", null);
        term225805 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        setField(term225805, term225805.getClass(), "_handledType", null);
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
        args[0] = term224799;
        args[1] = term225335;
        args[2] = null;
        args[3] = null;
        args[4] = term225497;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term225791));
        assertTrue(recursiveEquals(term224799, term225798));
        assertTrue(recursiveEquals(term225335, term225804));
        assertTrue(recursiveEquals(term225497, term225805));
    }

};


