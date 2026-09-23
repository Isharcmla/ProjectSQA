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

public class BeanPropertyWriter_init_599291025282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142989;
     Object term143639;
     Object term144958;
     Object term144965;
     Object term144972;

    public BeanPropertyWriter_init_599291025282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142861 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term142861, term142861.getClass(), "_member", null);
        setField(term142861, term142861.getClass(), "_contextAnnotations", null);
        setField(term142861, term142861.getClass(), "_name", null);
        term142989 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term143081 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term143261 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term143379 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term143523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term143081, term143081.getClass(), "_simpleName", "");
        setField(term142989, term142989.getClass(), "_name", term143081);
        setBooleanField(term142989, term142989.getClass(), "_forSerialization", false);
        setField(term142989, term142989.getClass(), "_ctorParameters", null);
        setField(term142989, term142989.getClass(), "_setters", null);
        setField(term143261, term143261.getClass(), "value", term143379);
        setField(term143261, term143261.getClass(), "next", null);
        setField(term142989, term142989.getClass(), "_fields", term143261);
        setField(term142989, term142989.getClass(), "_annotationIntrospector", term143523);
        term143639 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term144958 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term144959 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term144962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term144963 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term144964 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term144959, term144959.getClass(), "_value", "");
        setField(term144959, term144959.getClass(), "_quotedUTF8Ref", null);
        setField(term144959, term144959.getClass(), "_unquotedUTF8Ref", null);
        setField(term144959, term144959.getClass(), "_quotedChars", null);
        setField(term144959, term144959.getClass(), "_jdkSerializeValue", null);
        setField(term144958, term144958.getClass(), "_name", term144959);
        setField(term144958, term144958.getClass(), "_wrapperName", null);
        setField(term144958, term144958.getClass(), "_declaredType", null);
        setField(term144958, term144958.getClass(), "_cfgSerializationType", null);
        setField(term144958, term144958.getClass(), "_nonTrivialBaseType", null);
        setField(term144962, term144962.getClass(), "_annotations", null);
        setField(term144958, term144958.getClass(), "_contextAnnotations", term144962);
        setField(term144963, term144963.getClass(), "_required", null);
        setField(term144963, term144963.getClass(), "_description", null);
        setField(term144963, term144963.getClass(), "_index", null);
        setField(term144963, term144963.getClass(), "_defaultValue", null);
        setField(term144958, term144958.getClass(), "_metadata", term144963);
        setField(term144958, term144958.getClass(), "_format", null);
        setField(term144958, term144958.getClass(), "_member", null);
        setField(term144958, term144958.getClass(), "_accessorMethod", null);
        setField(term144958, term144958.getClass(), "_field", null);
        setField(term144958, term144958.getClass(), "_serializer", null);
        setField(term144958, term144958.getClass(), "_nullSerializer", null);
        setField(term144958, term144958.getClass(), "_typeSerializer", null);
        setBooleanField(term144964, term144964.getClass(), "_resetWhenFull", false);
        setField(term144958, term144958.getClass(), "_dynamicSerializers", term144964);
        setBooleanField(term144958, term144958.getClass(), "_suppressNulls", false);
        setField(term144958, term144958.getClass(), "_suppressableValue", null);
        setField(term144958, term144958.getClass(), "_includeInViews", null);
        setField(term144958, term144958.getClass(), "_internalSettings", null);
        term144965 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term144966 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term144967 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term144970 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term144971 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term144965, term144965.getClass(), "_forSerialization", false);
        setField(term144965, term144965.getClass(), "_annotationIntrospector", term144966);
        setField(term144967, term144967.getClass(), "_simpleName", "");
        setField(term144967, term144967.getClass(), "_namespace", null);
        setField(term144967, term144967.getClass(), "_encodedSimple", null);
        setField(term144965, term144965.getClass(), "_name", term144967);
        setField(term144965, term144965.getClass(), "_internalName", null);
        setField(term144971, term144971.getClass(), "_field", null);
        setField(term144971, term144971.getClass(), "_serialization", null);
        setField(term144971, term144971.getClass(), "_context", null);
        setField(term144971, term144971.getClass(), "_annotations", null);
        setField(term144970, term144970.getClass(), "value", term144971);
        setField(term144970, term144970.getClass(), "next", null);
        setField(term144970, term144970.getClass(), "name", null);
        setBooleanField(term144970, term144970.getClass(), "isNameExplicit", false);
        setBooleanField(term144970, term144970.getClass(), "isVisible", false);
        setBooleanField(term144970, term144970.getClass(), "isMarkedIgnored", false);
        setField(term144965, term144965.getClass(), "_fields", term144970);
        setField(term144965, term144965.getClass(), "_ctorParameters", null);
        setField(term144965, term144965.getClass(), "_getters", null);
        setField(term144965, term144965.getClass(), "_setters", null);
        term144972 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term144972, term144972.getClass(), "_annotations", null);
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
        args[0] = term142989;
        args[1] = null;
        args[2] = term143639;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term144958));
        assertTrue(recursiveEquals(term142989, term144965));
        assertTrue(recursiveEquals(term143639, term144972));
    }

};


