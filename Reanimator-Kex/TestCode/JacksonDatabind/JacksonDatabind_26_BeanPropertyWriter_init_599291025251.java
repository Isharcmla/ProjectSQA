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

public class BeanPropertyWriter_init_599291025251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115775;
     Object term116283;
     Object term116437;
     Object term116679;
     Object term116686;
     Object term116692;
     Object term116693;

    public BeanPropertyWriter_init_599291025251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115531 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term115647 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term115531, term115531.getClass(), "_member", null);
        setField(term115531, term115531.getClass(), "_contextAnnotations", term115647);
        setField(term115531, term115531.getClass(), "_name", null);
        setField(term115531, term115531.getClass(), "_wrapperName", null);
        setField(term115531, term115531.getClass(), "_metadata", null);
        setField(term115531, term115531.getClass(), "_includeInViews", null);
        setField(term115531, term115531.getClass(), "_declaredType", null);
        setField(term115531, term115531.getClass(), "_serializer", null);
        setField(term115531, term115531.getClass(), "_dynamicSerializers", null);
        setField(term115531, term115531.getClass(), "_typeSerializer", null);
        setField(term115531, term115531.getClass(), "_cfgSerializationType", null);
        term115775 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term115867 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116047 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term116165 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term115867, term115867.getClass(), "_simpleName", "");
        setField(term115775, term115775.getClass(), "_name", term115867);
        setBooleanField(term115775, term115775.getClass(), "_forSerialization", false);
        setField(term115775, term115775.getClass(), "_ctorParameters", null);
        setField(term115775, term115775.getClass(), "_setters", null);
        setField(term116047, term116047.getClass(), "value", term116165);
        setField(term116047, term116047.getClass(), "next", null);
        setField(term115775, term115775.getClass(), "_fields", term116047);
        setField(term115775, term115775.getClass(), "_annotationIntrospector", null);
        term116283 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term116437 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        term116679 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term116680 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term116683 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term116684 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term116685 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(term116680, term116680.getClass(), "_value", "");
        setField(term116680, term116680.getClass(), "_quotedUTF8Ref", null);
        setField(term116680, term116680.getClass(), "_unquotedUTF8Ref", null);
        setField(term116680, term116680.getClass(), "_quotedChars", null);
        setField(term116680, term116680.getClass(), "_jdkSerializeValue", null);
        setField(term116679, term116679.getClass(), "_name", term116680);
        setField(term116679, term116679.getClass(), "_wrapperName", null);
        setField(term116679, term116679.getClass(), "_declaredType", null);
        setField(term116679, term116679.getClass(), "_cfgSerializationType", null);
        setField(term116679, term116679.getClass(), "_nonTrivialBaseType", null);
        setField(term116679, term116679.getClass(), "_contextAnnotations", null);
        setField(term116683, term116683.getClass(), "_required", null);
        setField(term116683, term116683.getClass(), "_description", null);
        setField(term116683, term116683.getClass(), "_index", null);
        setField(term116683, term116683.getClass(), "_defaultValue", null);
        setField(term116679, term116679.getClass(), "_metadata", term116683);
        setField(term116679, term116679.getClass(), "_format", null);
        setField(term116684, term116684.getClass(), "_field", null);
        setField(term116684, term116684.getClass(), "_serialization", null);
        setField(term116684, term116684.getClass(), "_context", null);
        setField(term116684, term116684.getClass(), "_annotations", null);
        setField(term116679, term116679.getClass(), "_member", term116684);
        setField(term116679, term116679.getClass(), "_accessorMethod", null);
        setField(term116679, term116679.getClass(), "_field", null);
        setField(term116685, term116685.getClass(), "_numberType", null);
        setField(term116685, term116685.getClass(), "_schemaType", null);
        setBooleanField(term116685, term116685.getClass(), "_isInt", false);
        setField(term116685, term116685.getClass(), "_handledType", null);
        setField(term116679, term116679.getClass(), "_serializer", term116685);
        setField(term116679, term116679.getClass(), "_nullSerializer", null);
        setField(term116679, term116679.getClass(), "_typeSerializer", null);
        setField(term116679, term116679.getClass(), "_dynamicSerializers", null);
        setBooleanField(term116679, term116679.getClass(), "_suppressNulls", false);
        setField(term116679, term116679.getClass(), "_suppressableValue", null);
        setField(term116679, term116679.getClass(), "_includeInViews", null);
        setField(term116679, term116679.getClass(), "_internalSettings", null);
        term116686 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term116687 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116690 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term116691 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term116686, term116686.getClass(), "_forSerialization", false);
        setField(term116686, term116686.getClass(), "_annotationIntrospector", null);
        setField(term116687, term116687.getClass(), "_simpleName", "");
        setField(term116687, term116687.getClass(), "_namespace", null);
        setField(term116687, term116687.getClass(), "_encodedSimple", null);
        setField(term116686, term116686.getClass(), "_name", term116687);
        setField(term116686, term116686.getClass(), "_internalName", null);
        setField(term116691, term116691.getClass(), "_field", null);
        setField(term116691, term116691.getClass(), "_serialization", null);
        setField(term116691, term116691.getClass(), "_context", null);
        setField(term116691, term116691.getClass(), "_annotations", null);
        setField(term116690, term116690.getClass(), "value", term116691);
        setField(term116690, term116690.getClass(), "next", null);
        setField(term116690, term116690.getClass(), "name", null);
        setBooleanField(term116690, term116690.getClass(), "isNameExplicit", false);
        setBooleanField(term116690, term116690.getClass(), "isVisible", false);
        setBooleanField(term116690, term116690.getClass(), "isMarkedIgnored", false);
        setField(term116686, term116686.getClass(), "_fields", term116690);
        setField(term116686, term116686.getClass(), "_ctorParameters", null);
        setField(term116686, term116686.getClass(), "_getters", null);
        setField(term116686, term116686.getClass(), "_setters", null);
        term116692 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term116692, term116692.getClass(), "_field", null);
        setField(term116692, term116692.getClass(), "_serialization", null);
        setField(term116692, term116692.getClass(), "_context", null);
        setField(term116692, term116692.getClass(), "_annotations", null);
        term116693 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(term116693, term116693.getClass(), "_numberType", null);
        setField(term116693, term116693.getClass(), "_schemaType", null);
        setBooleanField(term116693, term116693.getClass(), "_isInt", false);
        setField(term116693, term116693.getClass(), "_handledType", null);
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
        args[0] = term115775;
        args[1] = term116283;
        args[2] = null;
        args[3] = null;
        args[4] = term116437;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116679));
        assertTrue(recursiveEquals(term115775, term116686));
        assertTrue(recursiveEquals(term116283, term116692));
        assertTrue(recursiveEquals(term116437, term116693));
    }

};


