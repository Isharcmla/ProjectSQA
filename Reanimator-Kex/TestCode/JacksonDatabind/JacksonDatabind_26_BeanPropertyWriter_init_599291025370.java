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

public class BeanPropertyWriter_init_599291025370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221035;
     Object term221567;
     Object term221698;
     Object term221705;
     Object term221711;

    public BeanPropertyWriter_init_599291025370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term220791 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term220907 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term220791, term220791.getClass(), "_member", null);
        setField(term220791, term220791.getClass(), "_contextAnnotations", term220907);
        setField(term220791, term220791.getClass(), "_name", null);
        setField(term220791, term220791.getClass(), "_wrapperName", null);
        setField(term220791, term220791.getClass(), "_metadata", null);
        setField(term220791, term220791.getClass(), "_includeInViews", null);
        setField(term220791, term220791.getClass(), "_declaredType", null);
        setField(term220791, term220791.getClass(), "_serializer", null);
        setField(term220791, term220791.getClass(), "_dynamicSerializers", null);
        setField(term220791, term220791.getClass(), "_typeSerializer", null);
        setField(term220791, term220791.getClass(), "_cfgSerializationType", null);
        term221035 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term221127 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term221307 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term221449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term221127, term221127.getClass(), "_simpleName", "");
        setField(term221035, term221035.getClass(), "_name", term221127);
        setBooleanField(term221035, term221035.getClass(), "_forSerialization", false);
        setField(term221035, term221035.getClass(), "_ctorParameters", null);
        setField(term221307, term221307.getClass(), "next", null);
        setField(term221307, term221307.getClass(), "value", null);
        setField(term221035, term221035.getClass(), "_setters", term221307);
        setField(term221449, term221449.getClass(), "value", null);
        setField(term221449, term221449.getClass(), "next", null);
        setField(term221035, term221035.getClass(), "_fields", term221449);
        setField(term221035, term221035.getClass(), "_annotationIntrospector", null);
        term221567 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term221698 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term221699 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term221702 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term221703 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term221704 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term221699, term221699.getClass(), "_value", "");
        setField(term221699, term221699.getClass(), "_quotedUTF8Ref", null);
        setField(term221699, term221699.getClass(), "_unquotedUTF8Ref", null);
        setField(term221699, term221699.getClass(), "_quotedChars", null);
        setField(term221699, term221699.getClass(), "_jdkSerializeValue", null);
        setField(term221698, term221698.getClass(), "_name", term221699);
        setField(term221698, term221698.getClass(), "_wrapperName", null);
        setField(term221698, term221698.getClass(), "_declaredType", null);
        setField(term221698, term221698.getClass(), "_cfgSerializationType", null);
        setField(term221698, term221698.getClass(), "_nonTrivialBaseType", null);
        setField(term221698, term221698.getClass(), "_contextAnnotations", null);
        setField(term221702, term221702.getClass(), "_required", null);
        setField(term221702, term221702.getClass(), "_description", null);
        setField(term221702, term221702.getClass(), "_index", null);
        setField(term221702, term221702.getClass(), "_defaultValue", null);
        setField(term221698, term221698.getClass(), "_metadata", term221702);
        setField(term221698, term221698.getClass(), "_format", null);
        setField(term221703, term221703.getClass(), "_field", null);
        setField(term221703, term221703.getClass(), "_serialization", null);
        setField(term221703, term221703.getClass(), "_context", null);
        setField(term221703, term221703.getClass(), "_annotations", null);
        setField(term221698, term221698.getClass(), "_member", term221703);
        setField(term221698, term221698.getClass(), "_accessorMethod", null);
        setField(term221698, term221698.getClass(), "_field", null);
        setField(term221698, term221698.getClass(), "_serializer", null);
        setField(term221698, term221698.getClass(), "_nullSerializer", null);
        setField(term221698, term221698.getClass(), "_typeSerializer", null);
        setBooleanField(term221704, term221704.getClass(), "_resetWhenFull", false);
        setField(term221698, term221698.getClass(), "_dynamicSerializers", term221704);
        setBooleanField(term221698, term221698.getClass(), "_suppressNulls", false);
        setField(term221698, term221698.getClass(), "_suppressableValue", null);
        setField(term221698, term221698.getClass(), "_includeInViews", null);
        setField(term221698, term221698.getClass(), "_internalSettings", null);
        term221705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term221706 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term221709 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term221710 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term221705, term221705.getClass(), "_forSerialization", false);
        setField(term221705, term221705.getClass(), "_annotationIntrospector", null);
        setField(term221706, term221706.getClass(), "_simpleName", "");
        setField(term221706, term221706.getClass(), "_namespace", null);
        setField(term221706, term221706.getClass(), "_encodedSimple", null);
        setField(term221705, term221705.getClass(), "_name", term221706);
        setField(term221705, term221705.getClass(), "_internalName", null);
        setField(term221709, term221709.getClass(), "value", null);
        setField(term221709, term221709.getClass(), "next", null);
        setField(term221709, term221709.getClass(), "name", null);
        setBooleanField(term221709, term221709.getClass(), "isNameExplicit", false);
        setBooleanField(term221709, term221709.getClass(), "isVisible", false);
        setBooleanField(term221709, term221709.getClass(), "isMarkedIgnored", false);
        setField(term221705, term221705.getClass(), "_fields", term221709);
        setField(term221705, term221705.getClass(), "_ctorParameters", null);
        setField(term221705, term221705.getClass(), "_getters", null);
        setField(term221710, term221710.getClass(), "value", null);
        setField(term221710, term221710.getClass(), "next", null);
        setField(term221710, term221710.getClass(), "name", null);
        setBooleanField(term221710, term221710.getClass(), "isNameExplicit", false);
        setBooleanField(term221710, term221710.getClass(), "isVisible", false);
        setBooleanField(term221710, term221710.getClass(), "isMarkedIgnored", false);
        setField(term221705, term221705.getClass(), "_setters", term221710);
        term221711 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term221711, term221711.getClass(), "_field", null);
        setField(term221711, term221711.getClass(), "_serialization", null);
        setField(term221711, term221711.getClass(), "_context", null);
        setField(term221711, term221711.getClass(), "_annotations", null);
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
        args[0] = term221035;
        args[1] = term221567;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term221698));
        assertTrue(recursiveEquals(term221035, term221705));
        assertTrue(recursiveEquals(term221567, term221711));
    }

};


