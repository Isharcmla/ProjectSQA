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

public class BeanPropertyWriter_init_599291025144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37528;
     Object term37920;
     Object term38858;
     Object term38865;
     Object term38870;

    public BeanPropertyWriter_init_599291025144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37302 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term37400 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term37302, term37302.getClass(), "_member", null);
        setField(term37302, term37302.getClass(), "_contextAnnotations", null);
        setField(term37302, term37302.getClass(), "_name", term37400);
        term37528 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term37620 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37800 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term37620, term37620.getClass(), "_simpleName", "");
        setField(term37528, term37528.getClass(), "_name", term37620);
        setBooleanField(term37528, term37528.getClass(), "_forSerialization", true);
        setField(term37528, term37528.getClass(), "_getters", null);
        setField(term37528, term37528.getClass(), "_fields", term37800);
        term37920 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term38858 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term38859 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term38862 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term38863 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term38864 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term38859, term38859.getClass(), "_value", "");
        setField(term38859, term38859.getClass(), "_quotedUTF8Ref", null);
        setField(term38859, term38859.getClass(), "_unquotedUTF8Ref", null);
        setField(term38859, term38859.getClass(), "_quotedChars", null);
        setField(term38859, term38859.getClass(), "_jdkSerializeValue", null);
        setField(term38858, term38858.getClass(), "_name", term38859);
        setField(term38858, term38858.getClass(), "_wrapperName", null);
        setField(term38858, term38858.getClass(), "_declaredType", null);
        setField(term38858, term38858.getClass(), "_cfgSerializationType", null);
        setField(term38858, term38858.getClass(), "_nonTrivialBaseType", null);
        setField(term38858, term38858.getClass(), "_contextAnnotations", null);
        setField(term38862, term38862.getClass(), "_required", null);
        setField(term38862, term38862.getClass(), "_description", null);
        setField(term38862, term38862.getClass(), "_index", null);
        setField(term38862, term38862.getClass(), "_defaultValue", null);
        setField(term38858, term38858.getClass(), "_metadata", term38862);
        setField(term38858, term38858.getClass(), "_format", null);
        setField(term38863, term38863.getClass(), "_method", null);
        setField(term38863, term38863.getClass(), "_paramClasses", null);
        setField(term38863, term38863.getClass(), "_serialization", null);
        setField(term38863, term38863.getClass(), "_paramAnnotations", null);
        setField(term38863, term38863.getClass(), "_context", null);
        setField(term38863, term38863.getClass(), "_annotations", null);
        setField(term38858, term38858.getClass(), "_member", term38863);
        setField(term38858, term38858.getClass(), "_accessorMethod", null);
        setField(term38858, term38858.getClass(), "_field", null);
        setField(term38858, term38858.getClass(), "_serializer", null);
        setField(term38858, term38858.getClass(), "_nullSerializer", null);
        setField(term38858, term38858.getClass(), "_typeSerializer", null);
        setBooleanField(term38864, term38864.getClass(), "_resetWhenFull", false);
        setField(term38858, term38858.getClass(), "_dynamicSerializers", term38864);
        setBooleanField(term38858, term38858.getClass(), "_suppressNulls", false);
        setField(term38858, term38858.getClass(), "_suppressableValue", null);
        setField(term38858, term38858.getClass(), "_includeInViews", null);
        setField(term38858, term38858.getClass(), "_internalSettings", null);
        term38865 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term38866 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term38869 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term38865, term38865.getClass(), "_forSerialization", true);
        setField(term38865, term38865.getClass(), "_annotationIntrospector", null);
        setField(term38866, term38866.getClass(), "_simpleName", "");
        setField(term38866, term38866.getClass(), "_namespace", null);
        setField(term38866, term38866.getClass(), "_encodedSimple", null);
        setField(term38865, term38865.getClass(), "_name", term38866);
        setField(term38865, term38865.getClass(), "_internalName", null);
        setField(term38869, term38869.getClass(), "value", null);
        setField(term38869, term38869.getClass(), "next", null);
        setField(term38869, term38869.getClass(), "name", null);
        setBooleanField(term38869, term38869.getClass(), "isNameExplicit", false);
        setBooleanField(term38869, term38869.getClass(), "isVisible", false);
        setBooleanField(term38869, term38869.getClass(), "isMarkedIgnored", false);
        setField(term38865, term38865.getClass(), "_fields", term38869);
        setField(term38865, term38865.getClass(), "_ctorParameters", null);
        setField(term38865, term38865.getClass(), "_getters", null);
        setField(term38865, term38865.getClass(), "_setters", null);
        term38870 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term38870, term38870.getClass(), "_method", null);
        setField(term38870, term38870.getClass(), "_paramClasses", null);
        setField(term38870, term38870.getClass(), "_serialization", null);
        setField(term38870, term38870.getClass(), "_paramAnnotations", null);
        setField(term38870, term38870.getClass(), "_context", null);
        setField(term38870, term38870.getClass(), "_annotations", null);
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
        args[0] = term37528;
        args[1] = term37920;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38858));
        assertTrue(recursiveEquals(term37528, term38865));
        assertTrue(recursiveEquals(term37920, term38870));
    }

};


