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

public class BeanPropertyWriter_init_599291025271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134640;
     Object term135108;
     Object term135224;
     Object term135368;
     Object term135559;
     Object term135568;
     Object term135574;
     Object term135575;
     Object term135576;

    public BeanPropertyWriter_init_599291025271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term133716 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term133850 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term133966 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term134064 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term134156 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term134256 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term134400 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term134506 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term133716, term133716.getClass(), "_member", term133850);
        setField(term133716, term133716.getClass(), "_contextAnnotations", term133966);
        setField(term133716, term133716.getClass(), "_name", term134064);
        setField(term133716, term133716.getClass(), "_wrapperName", term134156);
        setField(term133716, term133716.getClass(), "_metadata", term134256);
        setField(term133716, term133716.getClass(), "_includeInViews", null);
        setField(term133716, term133716.getClass(), "_declaredType", null);
        setField(term133716, term133716.getClass(), "_serializer", null);
        setField(term133716, term133716.getClass(), "_dynamicSerializers", null);
        setField(term133716, term133716.getClass(), "_typeSerializer", term134400);
        setField(term133716, term133716.getClass(), "_cfgSerializationType", term134506);
        term134640 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term134732 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term134888 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term134988 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term134732, term134732.getClass(), "_simpleName", "");
        setField(term134640, term134640.getClass(), "_fullName", term134732);
        setField(term134640, term134640.getClass(), "_introspector", null);
        setField(term134640, term134640.getClass(), "_member", term134888);
        setField(term134640, term134640.getClass(), "_metadata", term134988);
        term135108 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term135224 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term135368 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        term135559 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term135560 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term135563 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term135564 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term135565 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term135566 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term135567 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term135560, term135560.getClass(), "_value", "");
        setField(term135560, term135560.getClass(), "_quotedUTF8Ref", null);
        setField(term135560, term135560.getClass(), "_unquotedUTF8Ref", null);
        setField(term135560, term135560.getClass(), "_quotedChars", null);
        setField(term135560, term135560.getClass(), "_jdkSerializeValue", null);
        setField(term135559, term135559.getClass(), "_name", term135560);
        setField(term135559, term135559.getClass(), "_wrapperName", null);
        setField(term135559, term135559.getClass(), "_declaredType", null);
        setField(term135559, term135559.getClass(), "_cfgSerializationType", null);
        setField(term135559, term135559.getClass(), "_nonTrivialBaseType", null);
        setField(term135563, term135563.getClass(), "_annotations", null);
        setField(term135559, term135559.getClass(), "_contextAnnotations", term135563);
        setField(term135564, term135564.getClass(), "_required", null);
        setField(term135564, term135564.getClass(), "_description", null);
        setField(term135564, term135564.getClass(), "_index", null);
        setField(term135564, term135564.getClass(), "_defaultValue", null);
        setField(term135559, term135559.getClass(), "_metadata", term135564);
        setField(term135559, term135559.getClass(), "_format", null);
        setField(term135565, term135565.getClass(), "_method", null);
        setField(term135565, term135565.getClass(), "_paramClasses", null);
        setField(term135565, term135565.getClass(), "_serialization", null);
        setField(term135565, term135565.getClass(), "_paramAnnotations", null);
        setField(term135565, term135565.getClass(), "_context", null);
        setField(term135565, term135565.getClass(), "_annotations", null);
        setField(term135559, term135559.getClass(), "_member", term135565);
        setField(term135559, term135559.getClass(), "_accessorMethod", null);
        setField(term135559, term135559.getClass(), "_field", null);
        setField(term135559, term135559.getClass(), "_serializer", null);
        setField(term135559, term135559.getClass(), "_nullSerializer", null);
        setField(term135566, term135566.getClass(), "_typePropertyName", null);
        setField(term135566, term135566.getClass(), "_idResolver", null);
        setField(term135566, term135566.getClass(), "_property", null);
        setField(term135559, term135559.getClass(), "_typeSerializer", term135566);
        setBooleanField(term135567, term135567.getClass(), "_resetWhenFull", false);
        setField(term135559, term135559.getClass(), "_dynamicSerializers", term135567);
        setBooleanField(term135559, term135559.getClass(), "_suppressNulls", false);
        setField(term135559, term135559.getClass(), "_suppressableValue", null);
        setField(term135559, term135559.getClass(), "_includeInViews", null);
        setField(term135559, term135559.getClass(), "_internalSettings", null);
        term135568 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term135569 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term135570 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term135571 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term135568, term135568.getClass(), "_introspector", null);
        setField(term135569, term135569.getClass(), "_field", null);
        setField(term135569, term135569.getClass(), "_serialization", null);
        setField(term135569, term135569.getClass(), "_context", null);
        setField(term135569, term135569.getClass(), "_annotations", null);
        setField(term135568, term135568.getClass(), "_member", term135569);
        setField(term135570, term135570.getClass(), "_required", null);
        setField(term135570, term135570.getClass(), "_description", null);
        setField(term135570, term135570.getClass(), "_index", null);
        setField(term135570, term135570.getClass(), "_defaultValue", null);
        setField(term135568, term135568.getClass(), "_metadata", term135570);
        setField(term135571, term135571.getClass(), "_simpleName", "");
        setField(term135571, term135571.getClass(), "_namespace", null);
        setField(term135571, term135571.getClass(), "_encodedSimple", null);
        setField(term135568, term135568.getClass(), "_fullName", term135571);
        setField(term135568, term135568.getClass(), "_inclusion", null);
        setField(term135568, term135568.getClass(), "_name", null);
        term135574 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term135574, term135574.getClass(), "_method", null);
        setField(term135574, term135574.getClass(), "_paramClasses", null);
        setField(term135574, term135574.getClass(), "_serialization", null);
        setField(term135574, term135574.getClass(), "_paramAnnotations", null);
        setField(term135574, term135574.getClass(), "_context", null);
        setField(term135574, term135574.getClass(), "_annotations", null);
        term135575 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term135575, term135575.getClass(), "_annotations", null);
        term135576 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(term135576, term135576.getClass(), "_typePropertyName", null);
        setField(term135576, term135576.getClass(), "_idResolver", null);
        setField(term135576, term135576.getClass(), "_property", null);
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
        args[0] = term134640;
        args[1] = term135108;
        args[2] = term135224;
        args[3] = null;
        args[4] = null;
        args[5] = term135368;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term135559));
        assertTrue(recursiveEquals(term134640, term135568));
        assertTrue(recursiveEquals(term135108, term135574));
        assertTrue(recursiveEquals(term135224, term135575));
        assertTrue(recursiveEquals(term135368, term135576));
    }

};


