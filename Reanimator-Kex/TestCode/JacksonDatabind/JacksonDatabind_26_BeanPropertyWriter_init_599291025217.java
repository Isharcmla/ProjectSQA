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

public class BeanPropertyWriter_init_599291025217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93023;
     Object term93273;
     Object term93389;
     Object term93447;
     Object term93525;
     Object term93533;
     Object term93537;
     Object term93538;
     Object term93539;

    public BeanPropertyWriter_init_599291025217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92687 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term92779 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term92499 = (Object[]) newArray("java.lang.Class", 0);
        term93447 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StringSerializer"));
        setField(term92687, term92687.getClass(), "_member", null);
        setField(term92687, term92687.getClass(), "_contextAnnotations", null);
        setField(term92687, term92687.getClass(), "_name", null);
        setField(term92687, term92687.getClass(), "_wrapperName", term92779);
        setField(term92687, term92687.getClass(), "_metadata", null);
        setField(term92687, term92687.getClass(), "_includeInViews", term92499);
        setField(term92687, term92687.getClass(), "_declaredType", null);
        setField(term92687, term92687.getClass(), "_serializer", term93447);
        setField(term92687, term92687.getClass(), "_dynamicSerializers", null);
        setField(term92687, term92687.getClass(), "_typeSerializer", null);
        setField(term92687, term92687.getClass(), "_cfgSerializationType", null);
        term93023 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term93115 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term93115, term93115.getClass(), "_simpleName", "");
        setField(term93023, term93023.getClass(), "_name", term93115);
        setBooleanField(term93023, term93023.getClass(), "_forSerialization", true);
        setField(term93023, term93023.getClass(), "_getters", null);
        setField(term93023, term93023.getClass(), "_fields", null);
        setField(term93023, term93023.getClass(), "_annotationIntrospector", null);
        term93273 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term93389 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term93525 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term93526 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term93529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term93530 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term93531 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term93532 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StringSerializer"));
        setField(term93526, term93526.getClass(), "_value", "");
        setField(term93526, term93526.getClass(), "_quotedUTF8Ref", null);
        setField(term93526, term93526.getClass(), "_unquotedUTF8Ref", null);
        setField(term93526, term93526.getClass(), "_quotedChars", null);
        setField(term93526, term93526.getClass(), "_jdkSerializeValue", null);
        setField(term93525, term93525.getClass(), "_name", term93526);
        setField(term93525, term93525.getClass(), "_wrapperName", null);
        setField(term93525, term93525.getClass(), "_declaredType", null);
        setField(term93525, term93525.getClass(), "_cfgSerializationType", null);
        setField(term93525, term93525.getClass(), "_nonTrivialBaseType", null);
        setField(term93529, term93529.getClass(), "_annotations", null);
        setField(term93525, term93525.getClass(), "_contextAnnotations", term93529);
        setField(term93530, term93530.getClass(), "_required", null);
        setField(term93530, term93530.getClass(), "_description", null);
        setField(term93530, term93530.getClass(), "_index", null);
        setField(term93530, term93530.getClass(), "_defaultValue", null);
        setField(term93525, term93525.getClass(), "_metadata", term93530);
        setField(term93525, term93525.getClass(), "_format", null);
        setField(term93531, term93531.getClass(), "_method", null);
        setField(term93531, term93531.getClass(), "_paramClasses", null);
        setField(term93531, term93531.getClass(), "_serialization", null);
        setField(term93531, term93531.getClass(), "_paramAnnotations", null);
        setField(term93531, term93531.getClass(), "_context", null);
        setField(term93531, term93531.getClass(), "_annotations", null);
        setField(term93525, term93525.getClass(), "_member", term93531);
        setField(term93525, term93525.getClass(), "_accessorMethod", null);
        setField(term93525, term93525.getClass(), "_field", null);
        setField(term93532, term93532.getClass(), "_handledType", null);
        setField(term93525, term93525.getClass(), "_serializer", term93532);
        setField(term93525, term93525.getClass(), "_nullSerializer", null);
        setField(term93525, term93525.getClass(), "_typeSerializer", null);
        setField(term93525, term93525.getClass(), "_dynamicSerializers", null);
        setBooleanField(term93525, term93525.getClass(), "_suppressNulls", false);
        setField(term93525, term93525.getClass(), "_suppressableValue", null);
        setField(term93525, term93525.getClass(), "_includeInViews", null);
        setField(term93525, term93525.getClass(), "_internalSettings", null);
        term93533 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term93534 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term93533, term93533.getClass(), "_forSerialization", true);
        setField(term93533, term93533.getClass(), "_annotationIntrospector", null);
        setField(term93534, term93534.getClass(), "_simpleName", "");
        setField(term93534, term93534.getClass(), "_namespace", null);
        setField(term93534, term93534.getClass(), "_encodedSimple", null);
        setField(term93533, term93533.getClass(), "_name", term93534);
        setField(term93533, term93533.getClass(), "_internalName", null);
        setField(term93533, term93533.getClass(), "_fields", null);
        setField(term93533, term93533.getClass(), "_ctorParameters", null);
        setField(term93533, term93533.getClass(), "_getters", null);
        setField(term93533, term93533.getClass(), "_setters", null);
        term93537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term93537, term93537.getClass(), "_method", null);
        setField(term93537, term93537.getClass(), "_paramClasses", null);
        setField(term93537, term93537.getClass(), "_serialization", null);
        setField(term93537, term93537.getClass(), "_paramAnnotations", null);
        setField(term93537, term93537.getClass(), "_context", null);
        setField(term93537, term93537.getClass(), "_annotations", null);
        term93538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term93538, term93538.getClass(), "_annotations", null);
        term93539 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StringSerializer"));
        setField(term93539, term93539.getClass(), "_handledType", null);
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
        args[0] = term93023;
        args[1] = term93273;
        args[2] = term93389;
        args[3] = null;
        args[4] = term93447;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term93525));
        assertTrue(recursiveEquals(term93023, term93533));
        assertTrue(recursiveEquals(term93273, term93537));
        assertTrue(recursiveEquals(term93389, term93538));
        assertTrue(recursiveEquals(term93447, term93539));
    }

};


