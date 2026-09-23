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

public class BeanPropertyWriter_init_599291025261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123556;
     Object term124066;
     Object term124190;
     Object term124702;
     Object term124709;
     Object term124715;
     Object term124716;

    public BeanPropertyWriter_init_599291025261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123332 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term123135 = (Object[]) newArray("java.lang.Class", 0);
        Object term123428 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term123332, term123332.getClass(), "_member", null);
        setField(term123332, term123332.getClass(), "_contextAnnotations", null);
        setField(term123332, term123332.getClass(), "_name", null);
        setField(term123332, term123332.getClass(), "_wrapperName", null);
        setField(term123332, term123332.getClass(), "_metadata", null);
        setField(term123332, term123332.getClass(), "_includeInViews", term123135);
        setField(term123332, term123332.getClass(), "_declaredType", null);
        setField(term123332, term123332.getClass(), "_serializer", null);
        setField(term123332, term123332.getClass(), "_dynamicSerializers", null);
        setField(term123332, term123332.getClass(), "_typeSerializer", null);
        setField(term123332, term123332.getClass(), "_cfgSerializationType", term123428);
        term123556 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term123648 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term123828 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term123946 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term123648, term123648.getClass(), "_simpleName", "");
        setField(term123556, term123556.getClass(), "_name", term123648);
        setBooleanField(term123556, term123556.getClass(), "_forSerialization", false);
        setField(term123556, term123556.getClass(), "_ctorParameters", null);
        setField(term123556, term123556.getClass(), "_setters", null);
        setField(term123828, term123828.getClass(), "value", term123946);
        setField(term123828, term123828.getClass(), "next", null);
        setField(term123556, term123556.getClass(), "_fields", term123828);
        setField(term123556, term123556.getClass(), "_annotationIntrospector", null);
        term124066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term124190 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer"));
        term124702 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term124703 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term124706 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term124707 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term124708 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer"));
        setField(term124703, term124703.getClass(), "_value", "");
        setField(term124703, term124703.getClass(), "_quotedUTF8Ref", null);
        setField(term124703, term124703.getClass(), "_unquotedUTF8Ref", null);
        setField(term124703, term124703.getClass(), "_quotedChars", null);
        setField(term124703, term124703.getClass(), "_jdkSerializeValue", null);
        setField(term124702, term124702.getClass(), "_name", term124703);
        setField(term124702, term124702.getClass(), "_wrapperName", null);
        setField(term124702, term124702.getClass(), "_declaredType", null);
        setField(term124702, term124702.getClass(), "_cfgSerializationType", null);
        setField(term124702, term124702.getClass(), "_nonTrivialBaseType", null);
        setField(term124702, term124702.getClass(), "_contextAnnotations", null);
        setField(term124706, term124706.getClass(), "_required", null);
        setField(term124706, term124706.getClass(), "_description", null);
        setField(term124706, term124706.getClass(), "_index", null);
        setField(term124706, term124706.getClass(), "_defaultValue", null);
        setField(term124702, term124702.getClass(), "_metadata", term124706);
        setField(term124702, term124702.getClass(), "_format", null);
        setField(term124707, term124707.getClass(), "_method", null);
        setField(term124707, term124707.getClass(), "_paramClasses", null);
        setField(term124707, term124707.getClass(), "_serialization", null);
        setField(term124707, term124707.getClass(), "_paramAnnotations", null);
        setField(term124707, term124707.getClass(), "_context", null);
        setField(term124707, term124707.getClass(), "_annotations", null);
        setField(term124702, term124702.getClass(), "_member", term124707);
        setField(term124702, term124702.getClass(), "_accessorMethod", null);
        setField(term124702, term124702.getClass(), "_field", null);
        setField(term124708, term124708.getClass(), "_handledType", null);
        setField(term124702, term124702.getClass(), "_serializer", term124708);
        setField(term124702, term124702.getClass(), "_nullSerializer", null);
        setField(term124702, term124702.getClass(), "_typeSerializer", null);
        setField(term124702, term124702.getClass(), "_dynamicSerializers", null);
        setBooleanField(term124702, term124702.getClass(), "_suppressNulls", false);
        setField(term124702, term124702.getClass(), "_suppressableValue", null);
        setField(term124702, term124702.getClass(), "_includeInViews", null);
        setField(term124702, term124702.getClass(), "_internalSettings", null);
        term124709 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term124710 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term124713 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term124714 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term124709, term124709.getClass(), "_forSerialization", false);
        setField(term124709, term124709.getClass(), "_annotationIntrospector", null);
        setField(term124710, term124710.getClass(), "_simpleName", "");
        setField(term124710, term124710.getClass(), "_namespace", null);
        setField(term124710, term124710.getClass(), "_encodedSimple", null);
        setField(term124709, term124709.getClass(), "_name", term124710);
        setField(term124709, term124709.getClass(), "_internalName", null);
        setField(term124714, term124714.getClass(), "_field", null);
        setField(term124714, term124714.getClass(), "_serialization", null);
        setField(term124714, term124714.getClass(), "_context", null);
        setField(term124714, term124714.getClass(), "_annotations", null);
        setField(term124713, term124713.getClass(), "value", term124714);
        setField(term124713, term124713.getClass(), "next", null);
        setField(term124713, term124713.getClass(), "name", null);
        setBooleanField(term124713, term124713.getClass(), "isNameExplicit", false);
        setBooleanField(term124713, term124713.getClass(), "isVisible", false);
        setBooleanField(term124713, term124713.getClass(), "isMarkedIgnored", false);
        setField(term124709, term124709.getClass(), "_fields", term124713);
        setField(term124709, term124709.getClass(), "_ctorParameters", null);
        setField(term124709, term124709.getClass(), "_getters", null);
        setField(term124709, term124709.getClass(), "_setters", null);
        term124715 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term124715, term124715.getClass(), "_method", null);
        setField(term124715, term124715.getClass(), "_paramClasses", null);
        setField(term124715, term124715.getClass(), "_serialization", null);
        setField(term124715, term124715.getClass(), "_paramAnnotations", null);
        setField(term124715, term124715.getClass(), "_context", null);
        setField(term124715, term124715.getClass(), "_annotations", null);
        term124716 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer"));
        setField(term124716, term124716.getClass(), "_handledType", null);
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
        args[0] = term123556;
        args[1] = term124066;
        args[2] = null;
        args[3] = null;
        args[4] = term124190;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term124702));
        assertTrue(recursiveEquals(term123556, term124709));
        assertTrue(recursiveEquals(term124066, term124715));
        assertTrue(recursiveEquals(term124190, term124716));
    }

};


