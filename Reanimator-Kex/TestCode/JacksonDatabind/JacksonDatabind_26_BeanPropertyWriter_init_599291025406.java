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

public class BeanPropertyWriter_init_599291025406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253642;
     Object term254172;
     Object term254300;
     Object term255484;
     Object term255491;
     Object term255497;
     Object term255498;

    public BeanPropertyWriter_init_599291025406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term253322 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term253414 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term253514 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term253130 = (Object[]) newArray("java.lang.Class", 0);
        setField(term253322, term253322.getClass(), "_member", null);
        setField(term253322, term253322.getClass(), "_contextAnnotations", null);
        setField(term253322, term253322.getClass(), "_name", null);
        setField(term253322, term253322.getClass(), "_wrapperName", term253414);
        setField(term253322, term253322.getClass(), "_metadata", term253514);
        setField(term253322, term253322.getClass(), "_includeInViews", term253130);
        setField(term253322, term253322.getClass(), "_declaredType", null);
        setField(term253322, term253322.getClass(), "_serializer", null);
        term253642 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term253734 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term253914 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term254056 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term253734, term253734.getClass(), "_simpleName", "");
        setField(term253642, term253642.getClass(), "_name", term253734);
        setBooleanField(term253642, term253642.getClass(), "_forSerialization", false);
        setField(term253642, term253642.getClass(), "_ctorParameters", null);
        setField(term253914, term253914.getClass(), "next", null);
        setField(term253914, term253914.getClass(), "value", null);
        setField(term253642, term253642.getClass(), "_setters", term253914);
        setField(term254056, term254056.getClass(), "value", null);
        setField(term254056, term254056.getClass(), "next", null);
        setField(term253642, term253642.getClass(), "_fields", term254056);
        setField(term253642, term253642.getClass(), "_annotationIntrospector", null);
        term254172 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term254300 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        term255484 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term255485 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term255488 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term255489 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term255490 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(term255485, term255485.getClass(), "_value", "");
        setField(term255485, term255485.getClass(), "_quotedUTF8Ref", null);
        setField(term255485, term255485.getClass(), "_unquotedUTF8Ref", null);
        setField(term255485, term255485.getClass(), "_quotedChars", null);
        setField(term255485, term255485.getClass(), "_jdkSerializeValue", null);
        setField(term255484, term255484.getClass(), "_name", term255485);
        setField(term255484, term255484.getClass(), "_wrapperName", null);
        setField(term255484, term255484.getClass(), "_declaredType", null);
        setField(term255484, term255484.getClass(), "_cfgSerializationType", null);
        setField(term255484, term255484.getClass(), "_nonTrivialBaseType", null);
        setField(term255488, term255488.getClass(), "_annotations", null);
        setField(term255484, term255484.getClass(), "_contextAnnotations", term255488);
        setField(term255489, term255489.getClass(), "_required", null);
        setField(term255489, term255489.getClass(), "_description", null);
        setField(term255489, term255489.getClass(), "_index", null);
        setField(term255489, term255489.getClass(), "_defaultValue", null);
        setField(term255484, term255484.getClass(), "_metadata", term255489);
        setField(term255484, term255484.getClass(), "_format", null);
        setField(term255484, term255484.getClass(), "_member", null);
        setField(term255484, term255484.getClass(), "_accessorMethod", null);
        setField(term255484, term255484.getClass(), "_field", null);
        setField(term255490, term255490.getClass(), "_defaultSerializer", null);
        setField(term255490, term255490.getClass(), "_props", null);
        setField(term255490, term255490.getClass(), "_filteredProps", null);
        setField(term255490, term255490.getClass(), "_anyGetterWriter", null);
        setField(term255490, term255490.getClass(), "_propertyFilterId", null);
        setField(term255490, term255490.getClass(), "_typeId", null);
        setField(term255490, term255490.getClass(), "_objectIdWriter", null);
        setField(term255490, term255490.getClass(), "_serializationShape", null);
        setField(term255490, term255490.getClass(), "_handledType", null);
        setField(term255484, term255484.getClass(), "_serializer", term255490);
        setField(term255484, term255484.getClass(), "_nullSerializer", null);
        setField(term255484, term255484.getClass(), "_typeSerializer", null);
        setField(term255484, term255484.getClass(), "_dynamicSerializers", null);
        setBooleanField(term255484, term255484.getClass(), "_suppressNulls", false);
        setField(term255484, term255484.getClass(), "_suppressableValue", null);
        setField(term255484, term255484.getClass(), "_includeInViews", null);
        setField(term255484, term255484.getClass(), "_internalSettings", null);
        term255491 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term255492 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term255495 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term255496 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term255491, term255491.getClass(), "_forSerialization", false);
        setField(term255491, term255491.getClass(), "_annotationIntrospector", null);
        setField(term255492, term255492.getClass(), "_simpleName", "");
        setField(term255492, term255492.getClass(), "_namespace", null);
        setField(term255492, term255492.getClass(), "_encodedSimple", null);
        setField(term255491, term255491.getClass(), "_name", term255492);
        setField(term255491, term255491.getClass(), "_internalName", null);
        setField(term255495, term255495.getClass(), "value", null);
        setField(term255495, term255495.getClass(), "next", null);
        setField(term255495, term255495.getClass(), "name", null);
        setBooleanField(term255495, term255495.getClass(), "isNameExplicit", false);
        setBooleanField(term255495, term255495.getClass(), "isVisible", false);
        setBooleanField(term255495, term255495.getClass(), "isMarkedIgnored", false);
        setField(term255491, term255491.getClass(), "_fields", term255495);
        setField(term255491, term255491.getClass(), "_ctorParameters", null);
        setField(term255491, term255491.getClass(), "_getters", null);
        setField(term255496, term255496.getClass(), "value", null);
        setField(term255496, term255496.getClass(), "next", null);
        setField(term255496, term255496.getClass(), "name", null);
        setBooleanField(term255496, term255496.getClass(), "isNameExplicit", false);
        setBooleanField(term255496, term255496.getClass(), "isVisible", false);
        setBooleanField(term255496, term255496.getClass(), "isMarkedIgnored", false);
        setField(term255491, term255491.getClass(), "_setters", term255496);
        term255497 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term255497, term255497.getClass(), "_annotations", null);
        term255498 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(term255498, term255498.getClass(), "_defaultSerializer", null);
        setField(term255498, term255498.getClass(), "_props", null);
        setField(term255498, term255498.getClass(), "_filteredProps", null);
        setField(term255498, term255498.getClass(), "_anyGetterWriter", null);
        setField(term255498, term255498.getClass(), "_propertyFilterId", null);
        setField(term255498, term255498.getClass(), "_typeId", null);
        setField(term255498, term255498.getClass(), "_objectIdWriter", null);
        setField(term255498, term255498.getClass(), "_serializationShape", null);
        setField(term255498, term255498.getClass(), "_handledType", null);
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
        args[0] = term253642;
        args[1] = null;
        args[2] = term254172;
        args[3] = null;
        args[4] = term254300;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term255484));
        assertTrue(recursiveEquals(term253642, term255491));
        assertTrue(recursiveEquals(term254172, term255497));
        assertTrue(recursiveEquals(term254300, term255498));
    }

};


