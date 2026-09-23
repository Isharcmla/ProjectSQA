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

public class BeanPropertyWriter_init_599291025145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38363;
     Object term38753;
     Object term38976;
     Object term38983;
     Object term38988;

    public BeanPropertyWriter_init_599291025145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38135 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term38235 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term37937 = (Object[]) newArray("java.lang.Class", 0);
        setField(term38135, term38135.getClass(), "_member", null);
        setField(term38135, term38135.getClass(), "_contextAnnotations", null);
        setField(term38135, term38135.getClass(), "_name", null);
        setField(term38135, term38135.getClass(), "_wrapperName", null);
        setField(term38135, term38135.getClass(), "_metadata", term38235);
        setField(term38135, term38135.getClass(), "_includeInViews", term37937);
        setField(term38135, term38135.getClass(), "_declaredType", null);
        setField(term38135, term38135.getClass(), "_serializer", null);
        setField(term38135, term38135.getClass(), "_dynamicSerializers", null);
        setField(term38135, term38135.getClass(), "_typeSerializer", null);
        setField(term38135, term38135.getClass(), "_cfgSerializationType", null);
        term38363 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term38455 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term38635 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term38455, term38455.getClass(), "_simpleName", "");
        setField(term38363, term38363.getClass(), "_name", term38455);
        setBooleanField(term38363, term38363.getClass(), "_forSerialization", false);
        setField(term38363, term38363.getClass(), "_ctorParameters", null);
        setField(term38363, term38363.getClass(), "_setters", null);
        setField(term38635, term38635.getClass(), "value", null);
        setField(term38635, term38635.getClass(), "next", null);
        setField(term38363, term38363.getClass(), "_fields", term38635);
        setField(term38363, term38363.getClass(), "_annotationIntrospector", null);
        term38753 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term38976 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term38977 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term38980 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term38981 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term38982 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term38977, term38977.getClass(), "_value", "");
        setField(term38977, term38977.getClass(), "_quotedUTF8Ref", null);
        setField(term38977, term38977.getClass(), "_unquotedUTF8Ref", null);
        setField(term38977, term38977.getClass(), "_quotedChars", null);
        setField(term38977, term38977.getClass(), "_jdkSerializeValue", null);
        setField(term38976, term38976.getClass(), "_name", term38977);
        setField(term38976, term38976.getClass(), "_wrapperName", null);
        setField(term38976, term38976.getClass(), "_declaredType", null);
        setField(term38976, term38976.getClass(), "_cfgSerializationType", null);
        setField(term38976, term38976.getClass(), "_nonTrivialBaseType", null);
        setField(term38976, term38976.getClass(), "_contextAnnotations", null);
        setField(term38980, term38980.getClass(), "_required", null);
        setField(term38980, term38980.getClass(), "_description", null);
        setField(term38980, term38980.getClass(), "_index", null);
        setField(term38980, term38980.getClass(), "_defaultValue", null);
        setField(term38976, term38976.getClass(), "_metadata", term38980);
        setField(term38976, term38976.getClass(), "_format", null);
        setField(term38981, term38981.getClass(), "_field", null);
        setField(term38981, term38981.getClass(), "_serialization", null);
        setField(term38981, term38981.getClass(), "_context", null);
        setField(term38981, term38981.getClass(), "_annotations", null);
        setField(term38976, term38976.getClass(), "_member", term38981);
        setField(term38976, term38976.getClass(), "_accessorMethod", null);
        setField(term38976, term38976.getClass(), "_field", null);
        setField(term38976, term38976.getClass(), "_serializer", null);
        setField(term38976, term38976.getClass(), "_nullSerializer", null);
        setField(term38976, term38976.getClass(), "_typeSerializer", null);
        setBooleanField(term38982, term38982.getClass(), "_resetWhenFull", false);
        setField(term38976, term38976.getClass(), "_dynamicSerializers", term38982);
        setBooleanField(term38976, term38976.getClass(), "_suppressNulls", false);
        setField(term38976, term38976.getClass(), "_suppressableValue", null);
        setField(term38976, term38976.getClass(), "_includeInViews", null);
        setField(term38976, term38976.getClass(), "_internalSettings", null);
        term38983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term38984 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term38987 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term38983, term38983.getClass(), "_forSerialization", false);
        setField(term38983, term38983.getClass(), "_annotationIntrospector", null);
        setField(term38984, term38984.getClass(), "_simpleName", "");
        setField(term38984, term38984.getClass(), "_namespace", null);
        setField(term38984, term38984.getClass(), "_encodedSimple", null);
        setField(term38983, term38983.getClass(), "_name", term38984);
        setField(term38983, term38983.getClass(), "_internalName", null);
        setField(term38987, term38987.getClass(), "value", null);
        setField(term38987, term38987.getClass(), "next", null);
        setField(term38987, term38987.getClass(), "name", null);
        setBooleanField(term38987, term38987.getClass(), "isNameExplicit", false);
        setBooleanField(term38987, term38987.getClass(), "isVisible", false);
        setBooleanField(term38987, term38987.getClass(), "isMarkedIgnored", false);
        setField(term38983, term38983.getClass(), "_fields", term38987);
        setField(term38983, term38983.getClass(), "_ctorParameters", null);
        setField(term38983, term38983.getClass(), "_getters", null);
        setField(term38983, term38983.getClass(), "_setters", null);
        term38988 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term38988, term38988.getClass(), "_field", null);
        setField(term38988, term38988.getClass(), "_serialization", null);
        setField(term38988, term38988.getClass(), "_context", null);
        setField(term38988, term38988.getClass(), "_annotations", null);
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
        args[0] = term38363;
        args[1] = term38753;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38976));
        assertTrue(recursiveEquals(term38363, term38983));
        assertTrue(recursiveEquals(term38753, term38988));
    }

};


