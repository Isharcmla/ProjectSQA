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

public class BeanPropertyWriter_init_599291025250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114686;
     Object term115076;
     Object term115226;
     Object term116552;
     Object term116559;
     Object term116564;
     Object term116565;

    public BeanPropertyWriter_init_599291025250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114432 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term114558 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object[] term114211 = (Object[]) newArray("java.lang.Class", 0);
        setField(term114432, term114432.getClass(), "_member", term114558);
        setField(term114432, term114432.getClass(), "_contextAnnotations", null);
        setField(term114432, term114432.getClass(), "_name", null);
        setField(term114432, term114432.getClass(), "_wrapperName", null);
        setField(term114432, term114432.getClass(), "_metadata", null);
        setField(term114432, term114432.getClass(), "_includeInViews", term114211);
        setField(term114432, term114432.getClass(), "_declaredType", null);
        setField(term114432, term114432.getClass(), "_serializer", null);
        term114686 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term114778 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term114958 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term114778, term114778.getClass(), "_simpleName", "");
        setField(term114686, term114686.getClass(), "_name", term114778);
        setBooleanField(term114686, term114686.getClass(), "_forSerialization", false);
        setField(term114686, term114686.getClass(), "_ctorParameters", null);
        setField(term114686, term114686.getClass(), "_setters", null);
        setField(term114686, term114686.getClass(), "_fields", null);
        setField(term114686, term114686.getClass(), "_annotationIntrospector", term114958);
        term115076 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term115226 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer"));
        term116552 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term116553 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term116556 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term116557 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term116558 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer"));
        setField(term116553, term116553.getClass(), "_value", "");
        setField(term116553, term116553.getClass(), "_quotedUTF8Ref", null);
        setField(term116553, term116553.getClass(), "_unquotedUTF8Ref", null);
        setField(term116553, term116553.getClass(), "_quotedChars", null);
        setField(term116553, term116553.getClass(), "_jdkSerializeValue", null);
        setField(term116552, term116552.getClass(), "_name", term116553);
        setField(term116552, term116552.getClass(), "_wrapperName", null);
        setField(term116552, term116552.getClass(), "_declaredType", null);
        setField(term116552, term116552.getClass(), "_cfgSerializationType", null);
        setField(term116552, term116552.getClass(), "_nonTrivialBaseType", null);
        setField(term116552, term116552.getClass(), "_contextAnnotations", null);
        setField(term116556, term116556.getClass(), "_required", null);
        setField(term116556, term116556.getClass(), "_description", null);
        setField(term116556, term116556.getClass(), "_index", null);
        setField(term116556, term116556.getClass(), "_defaultValue", null);
        setField(term116552, term116552.getClass(), "_metadata", term116556);
        setField(term116552, term116552.getClass(), "_format", null);
        setField(term116557, term116557.getClass(), "_field", null);
        setField(term116557, term116557.getClass(), "_serialization", null);
        setField(term116557, term116557.getClass(), "_context", null);
        setField(term116557, term116557.getClass(), "_annotations", null);
        setField(term116552, term116552.getClass(), "_member", term116557);
        setField(term116552, term116552.getClass(), "_accessorMethod", null);
        setField(term116552, term116552.getClass(), "_field", null);
        setField(term116558, term116558.getClass(), "_numberType", null);
        setField(term116558, term116558.getClass(), "_schemaType", null);
        setBooleanField(term116558, term116558.getClass(), "_isInt", false);
        setField(term116558, term116558.getClass(), "_handledType", null);
        setField(term116552, term116552.getClass(), "_serializer", term116558);
        setField(term116552, term116552.getClass(), "_nullSerializer", null);
        setField(term116552, term116552.getClass(), "_typeSerializer", null);
        setField(term116552, term116552.getClass(), "_dynamicSerializers", null);
        setBooleanField(term116552, term116552.getClass(), "_suppressNulls", false);
        setField(term116552, term116552.getClass(), "_suppressableValue", null);
        setField(term116552, term116552.getClass(), "_includeInViews", null);
        setField(term116552, term116552.getClass(), "_internalSettings", null);
        term116559 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term116560 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term116561 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term116559, term116559.getClass(), "_forSerialization", false);
        setField(term116560, term116560.getClass(), "_primary", null);
        setField(term116560, term116560.getClass(), "_secondary", null);
        setField(term116559, term116559.getClass(), "_annotationIntrospector", term116560);
        setField(term116561, term116561.getClass(), "_simpleName", "");
        setField(term116561, term116561.getClass(), "_namespace", null);
        setField(term116561, term116561.getClass(), "_encodedSimple", null);
        setField(term116559, term116559.getClass(), "_name", term116561);
        setField(term116559, term116559.getClass(), "_internalName", null);
        setField(term116559, term116559.getClass(), "_fields", null);
        setField(term116559, term116559.getClass(), "_ctorParameters", null);
        setField(term116559, term116559.getClass(), "_getters", null);
        setField(term116559, term116559.getClass(), "_setters", null);
        term116564 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term116564, term116564.getClass(), "_field", null);
        setField(term116564, term116564.getClass(), "_serialization", null);
        setField(term116564, term116564.getClass(), "_context", null);
        setField(term116564, term116564.getClass(), "_annotations", null);
        term116565 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer"));
        setField(term116565, term116565.getClass(), "_numberType", null);
        setField(term116565, term116565.getClass(), "_schemaType", null);
        setBooleanField(term116565, term116565.getClass(), "_isInt", false);
        setField(term116565, term116565.getClass(), "_handledType", null);
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
        args[0] = term114686;
        args[1] = term115076;
        args[2] = null;
        args[3] = null;
        args[4] = term115226;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116552));
        assertTrue(recursiveEquals(term114686, term116559));
        assertTrue(recursiveEquals(term115076, term116564));
        assertTrue(recursiveEquals(term115226, term116565));
    }

};


