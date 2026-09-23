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

public class BeanPropertyWriter_init_599291025200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78346;
     Object term79935;
     Object term79941;

    public BeanPropertyWriter_init_599291025200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78120 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term78218 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term78120, term78120.getClass(), "_member", null);
        setField(term78120, term78120.getClass(), "_contextAnnotations", null);
        setField(term78120, term78120.getClass(), "_name", term78218);
        term78346 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term78438 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term78618 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term78438, term78438.getClass(), "_simpleName", "");
        setField(term78346, term78346.getClass(), "_name", term78438);
        setBooleanField(term78346, term78346.getClass(), "_forSerialization", false);
        setField(term78346, term78346.getClass(), "_ctorParameters", null);
        setField(term78346, term78346.getClass(), "_setters", term78618);
        term79935 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term79936 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term79939 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term79940 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term79936, term79936.getClass(), "_value", "");
        setField(term79936, term79936.getClass(), "_quotedUTF8Ref", null);
        setField(term79936, term79936.getClass(), "_unquotedUTF8Ref", null);
        setField(term79936, term79936.getClass(), "_quotedChars", null);
        setField(term79936, term79936.getClass(), "_jdkSerializeValue", null);
        setField(term79935, term79935.getClass(), "_name", term79936);
        setField(term79935, term79935.getClass(), "_wrapperName", null);
        setField(term79935, term79935.getClass(), "_declaredType", null);
        setField(term79935, term79935.getClass(), "_cfgSerializationType", null);
        setField(term79935, term79935.getClass(), "_nonTrivialBaseType", null);
        setField(term79935, term79935.getClass(), "_contextAnnotations", null);
        setField(term79939, term79939.getClass(), "_required", null);
        setField(term79939, term79939.getClass(), "_description", null);
        setField(term79939, term79939.getClass(), "_index", null);
        setField(term79939, term79939.getClass(), "_defaultValue", null);
        setField(term79935, term79935.getClass(), "_metadata", term79939);
        setField(term79935, term79935.getClass(), "_format", null);
        setField(term79935, term79935.getClass(), "_member", null);
        setField(term79935, term79935.getClass(), "_accessorMethod", null);
        setField(term79935, term79935.getClass(), "_field", null);
        setField(term79935, term79935.getClass(), "_serializer", null);
        setField(term79935, term79935.getClass(), "_nullSerializer", null);
        setField(term79935, term79935.getClass(), "_typeSerializer", null);
        setBooleanField(term79940, term79940.getClass(), "_resetWhenFull", false);
        setField(term79935, term79935.getClass(), "_dynamicSerializers", term79940);
        setBooleanField(term79935, term79935.getClass(), "_suppressNulls", false);
        setField(term79935, term79935.getClass(), "_suppressableValue", null);
        setField(term79935, term79935.getClass(), "_includeInViews", null);
        setField(term79935, term79935.getClass(), "_internalSettings", null);
        term79941 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term79942 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term79945 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term79941, term79941.getClass(), "_forSerialization", false);
        setField(term79941, term79941.getClass(), "_annotationIntrospector", null);
        setField(term79942, term79942.getClass(), "_simpleName", "");
        setField(term79942, term79942.getClass(), "_namespace", null);
        setField(term79942, term79942.getClass(), "_encodedSimple", null);
        setField(term79941, term79941.getClass(), "_name", term79942);
        setField(term79941, term79941.getClass(), "_internalName", null);
        setField(term79941, term79941.getClass(), "_fields", null);
        setField(term79941, term79941.getClass(), "_ctorParameters", null);
        setField(term79941, term79941.getClass(), "_getters", null);
        setField(term79945, term79945.getClass(), "value", null);
        setField(term79945, term79945.getClass(), "next", null);
        setField(term79945, term79945.getClass(), "name", null);
        setBooleanField(term79945, term79945.getClass(), "isNameExplicit", false);
        setBooleanField(term79945, term79945.getClass(), "isVisible", false);
        setBooleanField(term79945, term79945.getClass(), "isMarkedIgnored", false);
        setField(term79941, term79941.getClass(), "_setters", term79945);
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
        args[0] = term78346;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term79935));
        assertTrue(recursiveEquals(term78346, term79941));
    }

};


