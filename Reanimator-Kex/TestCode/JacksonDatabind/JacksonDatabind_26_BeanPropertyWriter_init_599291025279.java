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

public class BeanPropertyWriter_init_599291025279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141899;
     Object term142306;
     Object term142422;
     Object term142518;
     Object term142640;
     Object term142676;
     Object term142685;
     Object term142691;
     Object term142692;
     Object term142693;
     Object term142694;

    public BeanPropertyWriter_init_599291025279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141055 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term141153 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term141253 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term141367 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term141507 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        Object term141651 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        Object term141765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term141055, term141055.getClass(), "_member", null);
        setField(term141055, term141055.getClass(), "_contextAnnotations", null);
        setField(term141055, term141055.getClass(), "_name", term141153);
        setField(term141055, term141055.getClass(), "_wrapperName", null);
        setField(term141055, term141055.getClass(), "_metadata", term141253);
        setField(term141055, term141055.getClass(), "_includeInViews", null);
        setField(term141055, term141055.getClass(), "_declaredType", term141367);
        setField(term141055, term141055.getClass(), "_serializer", null);
        setField(term141055, term141055.getClass(), "_dynamicSerializers", term141507);
        setField(term141055, term141055.getClass(), "_typeSerializer", term141651);
        setField(term141055, term141055.getClass(), "_cfgSerializationType", term141765);
        term141899 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term141991 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term142306 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term142247 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term141991, term141991.getClass(), "_simpleName", "");
        setField(term141899, term141899.getClass(), "_fullName", term141991);
        setField(term141899, term141899.getClass(), "_introspector", null);
        setField(term141899, term141899.getClass(), "_member", term142306);
        setField(term141899, term141899.getClass(), "_metadata", term142247);
        term142422 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term142518 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term142640 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteArraySerializer"));
        term142676 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term142677 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term142680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term142681 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term142682 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term142683 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term142684 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteArraySerializer"));
        setField(term142677, term142677.getClass(), "_value", "");
        setField(term142677, term142677.getClass(), "_quotedUTF8Ref", null);
        setField(term142677, term142677.getClass(), "_unquotedUTF8Ref", null);
        setField(term142677, term142677.getClass(), "_quotedChars", null);
        setField(term142677, term142677.getClass(), "_jdkSerializeValue", null);
        setField(term142676, term142676.getClass(), "_name", term142677);
        setField(term142676, term142676.getClass(), "_wrapperName", null);
        setField(term142680, term142680.getClass(), "_componentType", null);
        setField(term142680, term142680.getClass(), "_emptyArray", null);
        setField(term142680, term142680.getClass(), "_canonicalName", null);
        setField(term142680, term142680.getClass(), "_class", null);
        setIntField(term142680, term142680.getClass(), "_hash", 0);
        setField(term142680, term142680.getClass(), "_valueHandler", null);
        setField(term142680, term142680.getClass(), "_typeHandler", null);
        setBooleanField(term142680, term142680.getClass(), "_asStatic", false);
        setField(term142676, term142676.getClass(), "_declaredType", term142680);
        setField(term142676, term142676.getClass(), "_cfgSerializationType", null);
        setField(term142676, term142676.getClass(), "_nonTrivialBaseType", null);
        setField(term142681, term142681.getClass(), "_annotations", null);
        setField(term142676, term142676.getClass(), "_contextAnnotations", term142681);
        setField(term142682, term142682.getClass(), "_required", null);
        setField(term142682, term142682.getClass(), "_description", null);
        setField(term142682, term142682.getClass(), "_index", null);
        setField(term142682, term142682.getClass(), "_defaultValue", null);
        setField(term142676, term142676.getClass(), "_metadata", term142682);
        setField(term142676, term142676.getClass(), "_format", null);
        setField(term142683, term142683.getClass(), "_field", null);
        setField(term142683, term142683.getClass(), "_serialization", null);
        setField(term142683, term142683.getClass(), "_context", null);
        setField(term142683, term142683.getClass(), "_annotations", null);
        setField(term142676, term142676.getClass(), "_member", term142683);
        setField(term142676, term142676.getClass(), "_accessorMethod", null);
        setField(term142676, term142676.getClass(), "_field", null);
        setField(term142684, term142684.getClass(), "_handledType", null);
        setField(term142676, term142676.getClass(), "_serializer", term142684);
        setField(term142676, term142676.getClass(), "_nullSerializer", null);
        setField(term142676, term142676.getClass(), "_typeSerializer", null);
        setField(term142676, term142676.getClass(), "_dynamicSerializers", null);
        setBooleanField(term142676, term142676.getClass(), "_suppressNulls", false);
        setField(term142676, term142676.getClass(), "_suppressableValue", null);
        setField(term142676, term142676.getClass(), "_includeInViews", null);
        setField(term142676, term142676.getClass(), "_internalSettings", null);
        term142685 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term142686 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term142687 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term142688 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term142685, term142685.getClass(), "_introspector", null);
        setField(term142686, term142686.getClass(), "_field", null);
        setField(term142686, term142686.getClass(), "_serialization", null);
        setField(term142686, term142686.getClass(), "_context", null);
        setField(term142686, term142686.getClass(), "_annotations", null);
        setField(term142685, term142685.getClass(), "_member", term142686);
        setField(term142687, term142687.getClass(), "_required", null);
        setField(term142687, term142687.getClass(), "_description", null);
        setField(term142687, term142687.getClass(), "_index", null);
        setField(term142687, term142687.getClass(), "_defaultValue", null);
        setField(term142685, term142685.getClass(), "_metadata", term142687);
        setField(term142688, term142688.getClass(), "_simpleName", "");
        setField(term142688, term142688.getClass(), "_namespace", null);
        setField(term142688, term142688.getClass(), "_encodedSimple", null);
        setField(term142685, term142685.getClass(), "_fullName", term142688);
        setField(term142685, term142685.getClass(), "_inclusion", null);
        setField(term142685, term142685.getClass(), "_name", null);
        term142691 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term142691, term142691.getClass(), "_field", null);
        setField(term142691, term142691.getClass(), "_serialization", null);
        setField(term142691, term142691.getClass(), "_context", null);
        setField(term142691, term142691.getClass(), "_annotations", null);
        term142692 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term142692, term142692.getClass(), "_annotations", null);
        term142693 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term142693, term142693.getClass(), "_componentType", null);
        setField(term142693, term142693.getClass(), "_emptyArray", null);
        setField(term142693, term142693.getClass(), "_canonicalName", null);
        setField(term142693, term142693.getClass(), "_class", null);
        setIntField(term142693, term142693.getClass(), "_hash", 0);
        setField(term142693, term142693.getClass(), "_valueHandler", null);
        setField(term142693, term142693.getClass(), "_typeHandler", null);
        setBooleanField(term142693, term142693.getClass(), "_asStatic", false);
        term142694 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteArraySerializer"));
        setField(term142694, term142694.getClass(), "_handledType", null);
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
        args[0] = term141899;
        args[1] = term142306;
        args[2] = term142422;
        args[3] = term142518;
        args[4] = term142640;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term142676));
        assertTrue(recursiveEquals(term141899, term142685));
        assertTrue(recursiveEquals(term142306, term142691));
        assertTrue(recursiveEquals(term142422, term142692));
        assertTrue(recursiveEquals(term142518, term142693));
        assertTrue(recursiveEquals(term142640, term142694));
    }

};


