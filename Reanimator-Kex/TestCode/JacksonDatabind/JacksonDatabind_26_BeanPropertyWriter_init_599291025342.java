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

public class BeanPropertyWriter_init_599291025342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200267;
     Object term200813;
     Object term200929;
     Object term201051;
     Object term201198;
     Object term201206;
     Object term201212;
     Object term201213;
     Object term201214;

    public BeanPropertyWriter_init_599291025342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term199947 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term200039 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term200139 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term199947, term199947.getClass(), "_member", null);
        setField(term199947, term199947.getClass(), "_contextAnnotations", null);
        setField(term199947, term199947.getClass(), "_name", null);
        setField(term199947, term199947.getClass(), "_wrapperName", term200039);
        setField(term199947, term199947.getClass(), "_metadata", term200139);
        setField(term199947, term199947.getClass(), "_includeInViews", null);
        setField(term199947, term199947.getClass(), "_declaredType", null);
        setField(term199947, term199947.getClass(), "_serializer", null);
        term200267 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term200359 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term200539 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term200683 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term200359, term200359.getClass(), "_simpleName", "");
        setField(term200267, term200267.getClass(), "_name", term200359);
        setBooleanField(term200267, term200267.getClass(), "_forSerialization", false);
        setField(term200267, term200267.getClass(), "_ctorParameters", null);
        setField(term200539, term200539.getClass(), "next", null);
        setField(term200539, term200539.getClass(), "value", null);
        setField(term200267, term200267.getClass(), "_setters", term200539);
        setField(term200267, term200267.getClass(), "_fields", null);
        setField(term200267, term200267.getClass(), "_annotationIntrospector", term200683);
        term200813 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        term200929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term201051 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        term201198 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term201199 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term201202 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term201203 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term201204 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term201205 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(term201199, term201199.getClass(), "_value", "");
        setField(term201199, term201199.getClass(), "_quotedUTF8Ref", null);
        setField(term201199, term201199.getClass(), "_unquotedUTF8Ref", null);
        setField(term201199, term201199.getClass(), "_quotedChars", null);
        setField(term201199, term201199.getClass(), "_jdkSerializeValue", null);
        setField(term201198, term201198.getClass(), "_name", term201199);
        setField(term201198, term201198.getClass(), "_wrapperName", null);
        setField(term201198, term201198.getClass(), "_declaredType", null);
        setField(term201198, term201198.getClass(), "_cfgSerializationType", null);
        setField(term201198, term201198.getClass(), "_nonTrivialBaseType", null);
        setField(term201202, term201202.getClass(), "_annotations", null);
        setField(term201198, term201198.getClass(), "_contextAnnotations", term201202);
        setField(term201203, term201203.getClass(), "_required", null);
        setField(term201203, term201203.getClass(), "_description", null);
        setField(term201203, term201203.getClass(), "_index", null);
        setField(term201203, term201203.getClass(), "_defaultValue", null);
        setField(term201198, term201198.getClass(), "_metadata", term201203);
        setField(term201198, term201198.getClass(), "_format", null);
        setField(term201204, term201204.getClass(), "_constructor", null);
        setField(term201204, term201204.getClass(), "_serialization", null);
        setField(term201204, term201204.getClass(), "_paramAnnotations", null);
        setField(term201204, term201204.getClass(), "_context", null);
        setField(term201204, term201204.getClass(), "_annotations", null);
        setField(term201198, term201198.getClass(), "_member", term201204);
        setField(term201198, term201198.getClass(), "_accessorMethod", null);
        setField(term201198, term201198.getClass(), "_field", null);
        setField(term201205, term201205.getClass(), "_property", null);
        setBooleanField(term201205, term201205.getClass(), "_valueTypeIsStatic", false);
        setField(term201205, term201205.getClass(), "_entryType", null);
        setField(term201205, term201205.getClass(), "_keyType", null);
        setField(term201205, term201205.getClass(), "_valueType", null);
        setField(term201205, term201205.getClass(), "_keySerializer", null);
        setField(term201205, term201205.getClass(), "_valueSerializer", null);
        setField(term201205, term201205.getClass(), "_valueTypeSerializer", null);
        setField(term201205, term201205.getClass(), "_dynamicValueSerializers", null);
        setField(term201205, term201205.getClass(), "_handledType", null);
        setField(term201198, term201198.getClass(), "_serializer", term201205);
        setField(term201198, term201198.getClass(), "_nullSerializer", null);
        setField(term201198, term201198.getClass(), "_typeSerializer", null);
        setField(term201198, term201198.getClass(), "_dynamicSerializers", null);
        setBooleanField(term201198, term201198.getClass(), "_suppressNulls", false);
        setField(term201198, term201198.getClass(), "_suppressableValue", null);
        setField(term201198, term201198.getClass(), "_includeInViews", null);
        setField(term201198, term201198.getClass(), "_internalSettings", null);
        term201206 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term201207 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term201208 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term201211 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term201206, term201206.getClass(), "_forSerialization", false);
        setField(term201206, term201206.getClass(), "_annotationIntrospector", term201207);
        setField(term201208, term201208.getClass(), "_simpleName", "");
        setField(term201208, term201208.getClass(), "_namespace", null);
        setField(term201208, term201208.getClass(), "_encodedSimple", null);
        setField(term201206, term201206.getClass(), "_name", term201208);
        setField(term201206, term201206.getClass(), "_internalName", null);
        setField(term201206, term201206.getClass(), "_fields", null);
        setField(term201206, term201206.getClass(), "_ctorParameters", null);
        setField(term201206, term201206.getClass(), "_getters", null);
        setField(term201211, term201211.getClass(), "value", null);
        setField(term201211, term201211.getClass(), "next", null);
        setField(term201211, term201211.getClass(), "name", null);
        setBooleanField(term201211, term201211.getClass(), "isNameExplicit", false);
        setBooleanField(term201211, term201211.getClass(), "isVisible", false);
        setBooleanField(term201211, term201211.getClass(), "isMarkedIgnored", false);
        setField(term201206, term201206.getClass(), "_setters", term201211);
        term201212 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term201212, term201212.getClass(), "_constructor", null);
        setField(term201212, term201212.getClass(), "_serialization", null);
        setField(term201212, term201212.getClass(), "_paramAnnotations", null);
        setField(term201212, term201212.getClass(), "_context", null);
        setField(term201212, term201212.getClass(), "_annotations", null);
        term201213 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term201213, term201213.getClass(), "_annotations", null);
        term201214 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(term201214, term201214.getClass(), "_property", null);
        setBooleanField(term201214, term201214.getClass(), "_valueTypeIsStatic", false);
        setField(term201214, term201214.getClass(), "_entryType", null);
        setField(term201214, term201214.getClass(), "_keyType", null);
        setField(term201214, term201214.getClass(), "_valueType", null);
        setField(term201214, term201214.getClass(), "_keySerializer", null);
        setField(term201214, term201214.getClass(), "_valueSerializer", null);
        setField(term201214, term201214.getClass(), "_valueTypeSerializer", null);
        setField(term201214, term201214.getClass(), "_dynamicValueSerializers", null);
        setField(term201214, term201214.getClass(), "_handledType", null);
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
        args[0] = term200267;
        args[1] = term200813;
        args[2] = term200929;
        args[3] = null;
        args[4] = term201051;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term201198));
        assertTrue(recursiveEquals(term200267, term201206));
        assertTrue(recursiveEquals(term200813, term201212));
        assertTrue(recursiveEquals(term200929, term201213));
        assertTrue(recursiveEquals(term201051, term201214));
    }

};


