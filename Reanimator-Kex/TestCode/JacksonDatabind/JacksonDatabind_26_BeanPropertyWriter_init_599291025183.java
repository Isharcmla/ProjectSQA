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

public class BeanPropertyWriter_init_599291025183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67684;
     Object term68076;
     Object term68188;
     Object term68330;
     Object term68435;
     Object term68443;
     Object term68448;
     Object term68449;
     Object term68450;

    public BeanPropertyWriter_init_599291025183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67464 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term67556 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term67268 = (Object[]) newArray("java.lang.Class", 0);
        setField(term67464, term67464.getClass(), "_member", null);
        setField(term67464, term67464.getClass(), "_contextAnnotations", null);
        setField(term67464, term67464.getClass(), "_name", null);
        setField(term67464, term67464.getClass(), "_wrapperName", term67556);
        setField(term67464, term67464.getClass(), "_metadata", null);
        setField(term67464, term67464.getClass(), "_includeInViews", term67268);
        setField(term67464, term67464.getClass(), "_declaredType", null);
        setField(term67464, term67464.getClass(), "_serializer", null);
        setField(term67464, term67464.getClass(), "_dynamicSerializers", null);
        setField(term67464, term67464.getClass(), "_typeSerializer", null);
        setField(term67464, term67464.getClass(), "_cfgSerializationType", null);
        term67684 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term67776 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term67956 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term67776, term67776.getClass(), "_simpleName", "");
        setField(term67684, term67684.getClass(), "_name", term67776);
        setBooleanField(term67684, term67684.getClass(), "_forSerialization", false);
        setField(term67684, term67684.getClass(), "_ctorParameters", null);
        setField(term67684, term67684.getClass(), "_setters", null);
        setField(term67956, term67956.getClass(), "value", null);
        setField(term67956, term67956.getClass(), "next", null);
        setField(term67684, term67684.getClass(), "_fields", term67956);
        setField(term67684, term67684.getClass(), "_annotationIntrospector", null);
        term68076 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term68188 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        term68330 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        term68435 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term68436 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term68439 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term68440 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term68441 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Object term68442 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term68436, term68436.getClass(), "_value", "");
        setField(term68436, term68436.getClass(), "_quotedUTF8Ref", null);
        setField(term68436, term68436.getClass(), "_unquotedUTF8Ref", null);
        setField(term68436, term68436.getClass(), "_quotedChars", null);
        setField(term68436, term68436.getClass(), "_jdkSerializeValue", null);
        setField(term68435, term68435.getClass(), "_name", term68436);
        setField(term68435, term68435.getClass(), "_wrapperName", null);
        setField(term68435, term68435.getClass(), "_declaredType", null);
        setField(term68435, term68435.getClass(), "_cfgSerializationType", null);
        setField(term68435, term68435.getClass(), "_nonTrivialBaseType", null);
        setField(term68435, term68435.getClass(), "_contextAnnotations", null);
        setField(term68439, term68439.getClass(), "_required", null);
        setField(term68439, term68439.getClass(), "_description", null);
        setField(term68439, term68439.getClass(), "_index", null);
        setField(term68439, term68439.getClass(), "_defaultValue", null);
        setField(term68435, term68435.getClass(), "_metadata", term68439);
        setField(term68435, term68435.getClass(), "_format", null);
        setField(term68440, term68440.getClass(), "_method", null);
        setField(term68440, term68440.getClass(), "_paramClasses", null);
        setField(term68440, term68440.getClass(), "_serialization", null);
        setField(term68440, term68440.getClass(), "_paramAnnotations", null);
        setField(term68440, term68440.getClass(), "_context", null);
        setField(term68440, term68440.getClass(), "_annotations", null);
        setField(term68435, term68435.getClass(), "_member", term68440);
        setField(term68435, term68435.getClass(), "_accessorMethod", null);
        setField(term68435, term68435.getClass(), "_field", null);
        setField(term68441, term68441.getClass(), "_values", null);
        setField(term68441, term68441.getClass(), "_serializeAsIndex", null);
        setField(term68441, term68441.getClass(), "_handledType", null);
        setField(term68435, term68435.getClass(), "_serializer", term68441);
        setField(term68435, term68435.getClass(), "_nullSerializer", null);
        setField(term68442, term68442.getClass(), "_idResolver", null);
        setField(term68442, term68442.getClass(), "_property", null);
        setField(term68435, term68435.getClass(), "_typeSerializer", term68442);
        setField(term68435, term68435.getClass(), "_dynamicSerializers", null);
        setBooleanField(term68435, term68435.getClass(), "_suppressNulls", false);
        setField(term68435, term68435.getClass(), "_suppressableValue", null);
        setField(term68435, term68435.getClass(), "_includeInViews", null);
        setField(term68435, term68435.getClass(), "_internalSettings", null);
        term68443 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term68444 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term68447 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term68443, term68443.getClass(), "_forSerialization", false);
        setField(term68443, term68443.getClass(), "_annotationIntrospector", null);
        setField(term68444, term68444.getClass(), "_simpleName", "");
        setField(term68444, term68444.getClass(), "_namespace", null);
        setField(term68444, term68444.getClass(), "_encodedSimple", null);
        setField(term68443, term68443.getClass(), "_name", term68444);
        setField(term68443, term68443.getClass(), "_internalName", null);
        setField(term68447, term68447.getClass(), "value", null);
        setField(term68447, term68447.getClass(), "next", null);
        setField(term68447, term68447.getClass(), "name", null);
        setBooleanField(term68447, term68447.getClass(), "isNameExplicit", false);
        setBooleanField(term68447, term68447.getClass(), "isVisible", false);
        setBooleanField(term68447, term68447.getClass(), "isMarkedIgnored", false);
        setField(term68443, term68443.getClass(), "_fields", term68447);
        setField(term68443, term68443.getClass(), "_ctorParameters", null);
        setField(term68443, term68443.getClass(), "_getters", null);
        setField(term68443, term68443.getClass(), "_setters", null);
        term68448 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term68448, term68448.getClass(), "_method", null);
        setField(term68448, term68448.getClass(), "_paramClasses", null);
        setField(term68448, term68448.getClass(), "_serialization", null);
        setField(term68448, term68448.getClass(), "_paramAnnotations", null);
        setField(term68448, term68448.getClass(), "_context", null);
        setField(term68448, term68448.getClass(), "_annotations", null);
        term68449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(term68449, term68449.getClass(), "_values", null);
        setField(term68449, term68449.getClass(), "_serializeAsIndex", null);
        setField(term68449, term68449.getClass(), "_handledType", null);
        term68450 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term68450, term68450.getClass(), "_idResolver", null);
        setField(term68450, term68450.getClass(), "_property", null);
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
        args[0] = term67684;
        args[1] = term68076;
        args[2] = null;
        args[3] = null;
        args[4] = term68188;
        args[5] = term68330;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68435));
        assertTrue(recursiveEquals(term67684, term68443));
        assertTrue(recursiveEquals(term68076, term68448));
        assertTrue(recursiveEquals(term68188, term68449));
        assertTrue(recursiveEquals(term68330, term68450));
    }

};


