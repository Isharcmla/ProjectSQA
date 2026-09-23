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

public class BeanPropertyWriter_init_599291025314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172251;
     Object term172877;
     Object term173945;
     Object term173952;
     Object term173959;

    public BeanPropertyWriter_init_599291025314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term171841 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term171957 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term171685 = (Object[]) newArray("java.lang.Class", 0);
        Object term172117 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        setField(term171841, term171841.getClass(), "_member", null);
        setField(term171841, term171841.getClass(), "_contextAnnotations", term171957);
        setField(term171841, term171841.getClass(), "_name", null);
        setField(term171841, term171841.getClass(), "_wrapperName", null);
        setField(term171841, term171841.getClass(), "_metadata", null);
        setField(term171841, term171841.getClass(), "_includeInViews", term171685);
        setField(term171841, term171841.getClass(), "_declaredType", null);
        setField(term171841, term171841.getClass(), "_serializer", null);
        setField(term171841, term171841.getClass(), "_dynamicSerializers", null);
        setField(term171841, term171841.getClass(), "_typeSerializer", term172117);
        setField(term171841, term171841.getClass(), "_cfgSerializationType", null);
        term172251 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term172343 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term172525 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term172659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term172759 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term172343, term172343.getClass(), "_simpleName", "");
        setField(term172251, term172251.getClass(), "_fullName", term172343);
        setField(term172251, term172251.getClass(), "_introspector", term172525);
        setField(term172251, term172251.getClass(), "_member", term172659);
        setField(term172251, term172251.getClass(), "_metadata", term172759);
        term172877 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term173945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term173946 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term173949 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term173950 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term173951 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term173946, term173946.getClass(), "_value", "");
        setField(term173946, term173946.getClass(), "_quotedUTF8Ref", null);
        setField(term173946, term173946.getClass(), "_unquotedUTF8Ref", null);
        setField(term173946, term173946.getClass(), "_quotedChars", null);
        setField(term173946, term173946.getClass(), "_jdkSerializeValue", null);
        setField(term173945, term173945.getClass(), "_name", term173946);
        setField(term173945, term173945.getClass(), "_wrapperName", null);
        setField(term173945, term173945.getClass(), "_declaredType", null);
        setField(term173945, term173945.getClass(), "_cfgSerializationType", null);
        setField(term173945, term173945.getClass(), "_nonTrivialBaseType", null);
        setField(term173945, term173945.getClass(), "_contextAnnotations", null);
        setField(term173949, term173949.getClass(), "_required", null);
        setField(term173949, term173949.getClass(), "_description", null);
        setField(term173949, term173949.getClass(), "_index", null);
        setField(term173949, term173949.getClass(), "_defaultValue", null);
        setField(term173945, term173945.getClass(), "_metadata", term173949);
        setField(term173945, term173945.getClass(), "_format", null);
        setField(term173950, term173950.getClass(), "_field", null);
        setField(term173950, term173950.getClass(), "_serialization", null);
        setField(term173950, term173950.getClass(), "_context", null);
        setField(term173950, term173950.getClass(), "_annotations", null);
        setField(term173945, term173945.getClass(), "_member", term173950);
        setField(term173945, term173945.getClass(), "_accessorMethod", null);
        setField(term173945, term173945.getClass(), "_field", null);
        setField(term173945, term173945.getClass(), "_serializer", null);
        setField(term173945, term173945.getClass(), "_nullSerializer", null);
        setField(term173945, term173945.getClass(), "_typeSerializer", null);
        setBooleanField(term173951, term173951.getClass(), "_resetWhenFull", false);
        setField(term173945, term173945.getClass(), "_dynamicSerializers", term173951);
        setBooleanField(term173945, term173945.getClass(), "_suppressNulls", false);
        setField(term173945, term173945.getClass(), "_suppressableValue", null);
        setField(term173945, term173945.getClass(), "_includeInViews", null);
        setField(term173945, term173945.getClass(), "_internalSettings", null);
        term173952 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term173953 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term173954 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term173955 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term173956 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term173952, term173952.getClass(), "_introspector", term173953);
        setField(term173954, term173954.getClass(), "_declaringClass", null);
        setField(term173954, term173954.getClass(), "_rawType", null);
        setField(term173954, term173954.getClass(), "_name", null);
        setField(term173954, term173954.getClass(), "_context", null);
        setField(term173954, term173954.getClass(), "_annotations", null);
        setField(term173952, term173952.getClass(), "_member", term173954);
        setField(term173955, term173955.getClass(), "_required", null);
        setField(term173955, term173955.getClass(), "_description", null);
        setField(term173955, term173955.getClass(), "_index", null);
        setField(term173955, term173955.getClass(), "_defaultValue", null);
        setField(term173952, term173952.getClass(), "_metadata", term173955);
        setField(term173956, term173956.getClass(), "_simpleName", "");
        setField(term173956, term173956.getClass(), "_namespace", null);
        setField(term173956, term173956.getClass(), "_encodedSimple", null);
        setField(term173952, term173952.getClass(), "_fullName", term173956);
        setField(term173952, term173952.getClass(), "_inclusion", null);
        setField(term173952, term173952.getClass(), "_name", null);
        term173959 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term173959, term173959.getClass(), "_field", null);
        setField(term173959, term173959.getClass(), "_serialization", null);
        setField(term173959, term173959.getClass(), "_context", null);
        setField(term173959, term173959.getClass(), "_annotations", null);
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
        args[0] = term172251;
        args[1] = term172877;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term173945));
        assertTrue(recursiveEquals(term172251, term173952));
        assertTrue(recursiveEquals(term172877, term173959));
    }

};


