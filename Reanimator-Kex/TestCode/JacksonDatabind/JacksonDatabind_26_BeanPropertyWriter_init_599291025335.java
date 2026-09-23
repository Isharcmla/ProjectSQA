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

public class BeanPropertyWriter_init_599291025335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192750;
     Object term193286;
     Object term193402;
     Object term193539;
     Object term193547;
     Object term193553;
     Object term193554;

    public BeanPropertyWriter_init_599291025335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term192506 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term192622 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term192267 = (Object[]) newArray("java.lang.Class", 0);
        setField(term192506, term192506.getClass(), "_member", null);
        setField(term192506, term192506.getClass(), "_contextAnnotations", term192622);
        setField(term192506, term192506.getClass(), "_name", null);
        setField(term192506, term192506.getClass(), "_wrapperName", null);
        setField(term192506, term192506.getClass(), "_metadata", null);
        setField(term192506, term192506.getClass(), "_includeInViews", term192267);
        setField(term192506, term192506.getClass(), "_declaredType", null);
        setField(term192506, term192506.getClass(), "_serializer", null);
        setField(term192506, term192506.getClass(), "_dynamicSerializers", null);
        setField(term192506, term192506.getClass(), "_typeSerializer", null);
        setField(term192506, term192506.getClass(), "_cfgSerializationType", null);
        term192750 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term192842 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term193022 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term193166 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term192842, term192842.getClass(), "_simpleName", "");
        setField(term192750, term192750.getClass(), "_name", term192842);
        setBooleanField(term192750, term192750.getClass(), "_forSerialization", true);
        setField(term192750, term192750.getClass(), "_getters", null);
        setField(term193022, term193022.getClass(), "value", null);
        setField(term193022, term193022.getClass(), "next", null);
        setField(term192750, term192750.getClass(), "_fields", term193022);
        setField(term192750, term192750.getClass(), "_annotationIntrospector", term193166);
        term193286 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term193402 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term193539 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term193540 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term193543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term193544 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term193545 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term193546 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term193540, term193540.getClass(), "_value", "");
        setField(term193540, term193540.getClass(), "_quotedUTF8Ref", null);
        setField(term193540, term193540.getClass(), "_unquotedUTF8Ref", null);
        setField(term193540, term193540.getClass(), "_quotedChars", null);
        setField(term193540, term193540.getClass(), "_jdkSerializeValue", null);
        setField(term193539, term193539.getClass(), "_name", term193540);
        setField(term193539, term193539.getClass(), "_wrapperName", null);
        setField(term193539, term193539.getClass(), "_declaredType", null);
        setField(term193539, term193539.getClass(), "_cfgSerializationType", null);
        setField(term193539, term193539.getClass(), "_nonTrivialBaseType", null);
        setField(term193543, term193543.getClass(), "_annotations", null);
        setField(term193539, term193539.getClass(), "_contextAnnotations", term193543);
        setField(term193544, term193544.getClass(), "_required", null);
        setField(term193544, term193544.getClass(), "_description", null);
        setField(term193544, term193544.getClass(), "_index", null);
        setField(term193544, term193544.getClass(), "_defaultValue", null);
        setField(term193539, term193539.getClass(), "_metadata", term193544);
        setField(term193539, term193539.getClass(), "_format", null);
        setField(term193545, term193545.getClass(), "_method", null);
        setField(term193545, term193545.getClass(), "_paramClasses", null);
        setField(term193545, term193545.getClass(), "_serialization", null);
        setField(term193545, term193545.getClass(), "_paramAnnotations", null);
        setField(term193545, term193545.getClass(), "_context", null);
        setField(term193545, term193545.getClass(), "_annotations", null);
        setField(term193539, term193539.getClass(), "_member", term193545);
        setField(term193539, term193539.getClass(), "_accessorMethod", null);
        setField(term193539, term193539.getClass(), "_field", null);
        setField(term193539, term193539.getClass(), "_serializer", null);
        setField(term193539, term193539.getClass(), "_nullSerializer", null);
        setField(term193539, term193539.getClass(), "_typeSerializer", null);
        setBooleanField(term193546, term193546.getClass(), "_resetWhenFull", false);
        setField(term193539, term193539.getClass(), "_dynamicSerializers", term193546);
        setBooleanField(term193539, term193539.getClass(), "_suppressNulls", false);
        setField(term193539, term193539.getClass(), "_suppressableValue", null);
        setField(term193539, term193539.getClass(), "_includeInViews", null);
        setField(term193539, term193539.getClass(), "_internalSettings", null);
        term193547 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term193548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term193549 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term193552 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term193547, term193547.getClass(), "_forSerialization", true);
        setField(term193547, term193547.getClass(), "_annotationIntrospector", term193548);
        setField(term193549, term193549.getClass(), "_simpleName", "");
        setField(term193549, term193549.getClass(), "_namespace", null);
        setField(term193549, term193549.getClass(), "_encodedSimple", null);
        setField(term193547, term193547.getClass(), "_name", term193549);
        setField(term193547, term193547.getClass(), "_internalName", null);
        setField(term193552, term193552.getClass(), "value", null);
        setField(term193552, term193552.getClass(), "next", null);
        setField(term193552, term193552.getClass(), "name", null);
        setBooleanField(term193552, term193552.getClass(), "isNameExplicit", false);
        setBooleanField(term193552, term193552.getClass(), "isVisible", false);
        setBooleanField(term193552, term193552.getClass(), "isMarkedIgnored", false);
        setField(term193547, term193547.getClass(), "_fields", term193552);
        setField(term193547, term193547.getClass(), "_ctorParameters", null);
        setField(term193547, term193547.getClass(), "_getters", null);
        setField(term193547, term193547.getClass(), "_setters", null);
        term193553 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term193553, term193553.getClass(), "_method", null);
        setField(term193553, term193553.getClass(), "_paramClasses", null);
        setField(term193553, term193553.getClass(), "_serialization", null);
        setField(term193553, term193553.getClass(), "_paramAnnotations", null);
        setField(term193553, term193553.getClass(), "_context", null);
        setField(term193553, term193553.getClass(), "_annotations", null);
        term193554 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term193554, term193554.getClass(), "_annotations", null);
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
        args[0] = term192750;
        args[1] = term193286;
        args[2] = term193402;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term193539));
        assertTrue(recursiveEquals(term192750, term193547));
        assertTrue(recursiveEquals(term193286, term193553));
        assertTrue(recursiveEquals(term193402, term193554));
    }

};


