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

public class BeanPropertyWriter_init_599291025178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62938;
     Object term63184;
     Object term63350;
     Object term64669;
     Object term64676;
     Object term64680;
     Object term64681;

    public BeanPropertyWriter_init_599291025178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62718 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term62810 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term62718, term62718.getClass(), "_member", null);
        setField(term62718, term62718.getClass(), "_contextAnnotations", null);
        setField(term62718, term62718.getClass(), "_name", null);
        setField(term62718, term62718.getClass(), "_wrapperName", term62810);
        setField(term62718, term62718.getClass(), "_metadata", null);
        setField(term62718, term62718.getClass(), "_includeInViews", null);
        setField(term62718, term62718.getClass(), "_declaredType", null);
        setField(term62718, term62718.getClass(), "_serializer", null);
        term62938 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term63030 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term63030, term63030.getClass(), "_simpleName", "");
        setField(term62938, term62938.getClass(), "_name", term63030);
        setBooleanField(term62938, term62938.getClass(), "_forSerialization", true);
        setField(term62938, term62938.getClass(), "_getters", null);
        setField(term62938, term62938.getClass(), "_fields", null);
        setField(term62938, term62938.getClass(), "_annotationIntrospector", null);
        term63184 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term63350 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer"));
        term64669 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term64670 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term64673 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term64674 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term64675 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer"));
        setField(term64670, term64670.getClass(), "_value", "");
        setField(term64670, term64670.getClass(), "_quotedUTF8Ref", null);
        setField(term64670, term64670.getClass(), "_unquotedUTF8Ref", null);
        setField(term64670, term64670.getClass(), "_quotedChars", null);
        setField(term64670, term64670.getClass(), "_jdkSerializeValue", null);
        setField(term64669, term64669.getClass(), "_name", term64670);
        setField(term64669, term64669.getClass(), "_wrapperName", null);
        setField(term64669, term64669.getClass(), "_declaredType", null);
        setField(term64669, term64669.getClass(), "_cfgSerializationType", null);
        setField(term64669, term64669.getClass(), "_nonTrivialBaseType", null);
        setField(term64673, term64673.getClass(), "_annotations", null);
        setField(term64669, term64669.getClass(), "_contextAnnotations", term64673);
        setField(term64674, term64674.getClass(), "_required", null);
        setField(term64674, term64674.getClass(), "_description", null);
        setField(term64674, term64674.getClass(), "_index", null);
        setField(term64674, term64674.getClass(), "_defaultValue", null);
        setField(term64669, term64669.getClass(), "_metadata", term64674);
        setField(term64669, term64669.getClass(), "_format", null);
        setField(term64669, term64669.getClass(), "_member", null);
        setField(term64669, term64669.getClass(), "_accessorMethod", null);
        setField(term64669, term64669.getClass(), "_field", null);
        setField(term64675, term64675.getClass(), "_property", null);
        setField(term64675, term64675.getClass(), "_unwrapSingle", null);
        setField(term64675, term64675.getClass(), "_handledType", null);
        setField(term64669, term64669.getClass(), "_serializer", term64675);
        setField(term64669, term64669.getClass(), "_nullSerializer", null);
        setField(term64669, term64669.getClass(), "_typeSerializer", null);
        setField(term64669, term64669.getClass(), "_dynamicSerializers", null);
        setBooleanField(term64669, term64669.getClass(), "_suppressNulls", false);
        setField(term64669, term64669.getClass(), "_suppressableValue", null);
        setField(term64669, term64669.getClass(), "_includeInViews", null);
        setField(term64669, term64669.getClass(), "_internalSettings", null);
        term64676 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term64677 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term64676, term64676.getClass(), "_forSerialization", true);
        setField(term64676, term64676.getClass(), "_annotationIntrospector", null);
        setField(term64677, term64677.getClass(), "_simpleName", "");
        setField(term64677, term64677.getClass(), "_namespace", null);
        setField(term64677, term64677.getClass(), "_encodedSimple", null);
        setField(term64676, term64676.getClass(), "_name", term64677);
        setField(term64676, term64676.getClass(), "_internalName", null);
        setField(term64676, term64676.getClass(), "_fields", null);
        setField(term64676, term64676.getClass(), "_ctorParameters", null);
        setField(term64676, term64676.getClass(), "_getters", null);
        setField(term64676, term64676.getClass(), "_setters", null);
        term64680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term64680, term64680.getClass(), "_annotations", null);
        term64681 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer"));
        setField(term64681, term64681.getClass(), "_property", null);
        setField(term64681, term64681.getClass(), "_unwrapSingle", null);
        setField(term64681, term64681.getClass(), "_handledType", null);
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
        args[0] = term62938;
        args[1] = null;
        args[2] = term63184;
        args[3] = null;
        args[4] = term63350;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64669));
        assertTrue(recursiveEquals(term62938, term64676));
        assertTrue(recursiveEquals(term63184, term64680));
        assertTrue(recursiveEquals(term63350, term64681));
    }

};


