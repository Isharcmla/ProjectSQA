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
import java.lang.String;
import java.util.HashMap;

public class BeanPropertyWriter_init_1969363585115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18508;
     Object term22904;
     Object term22945;

    public BeanPropertyWriter_init_1969363585115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23416 = Class.forName((String) "java.util.Spliterators");
        Class<? extends Object> term23586 = Class.forName((String) "java.util.PrimitiveIterator$OfInt");
        Class term23592 = int.class;
        Object[] term23593 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term23593, 0, term23586);
        setElement(term23593, 1, term23592);
        Method term18106 = ((Class) term23416).getDeclaredMethod((String) "spliteratorUnknownSize", (Class[]) term23593);
        ((Method) term18106).setAccessible(false);
        Class<? extends Object> term23703 = Class.forName((String) "java.nio.channels.SelectionKey");
        Field term18158 = ((Class) term23703).getDeclaredField((String) "OP_WRITE");
        ((Field) term18158).setAccessible(false);
        Object term17706 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term17804 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term17938 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term18052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term18276 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer"));
        Object term18396 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ToStringSerializer"));
        setField(term17706, term17706.getClass(), "_name", term17804);
        setField(term17706, term17706.getClass(), "_wrapperName", null);
        setField(term17706, term17706.getClass(), "_member", term17938);
        setField(term17706, term17706.getClass(), "_contextAnnotations", null);
        setField(term17706, term17706.getClass(), "_declaredType", term18052);
        setField(term17706, term17706.getClass(), "_accessorMethod", term18106);
        setField(term17706, term17706.getClass(), "_field", term18158);
        setField(term17706, term17706.getClass(), "_serializer", term18276);
        setField(term17706, term17706.getClass(), "_nullSerializer", term18396);
        Class<? extends Object> term23845 = Class.forName((String) "java.lang.invoke.VarHandleBytes$FieldStaticReadOnly");
        Field term18962 = ((Class) term23845).getDeclaredField((String) "fieldOffset");
        ((Field) term18962).setAccessible(false);
        HashMap term19164 = new HashMap();
        term18508 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term18606 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term18698 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term18814 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term18910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term19116 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer"));
        setField(term18508, term18508.getClass(), "_name", term18606);
        setField(term18508, term18508.getClass(), "_wrapperName", term18698);
        setField(term18508, term18508.getClass(), "_member", null);
        setField(term18508, term18508.getClass(), "_contextAnnotations", term18814);
        setField(term18508, term18508.getClass(), "_declaredType", term18910);
        setField(term18508, term18508.getClass(), "_accessorMethod", null);
        setField(term18508, term18508.getClass(), "_field", term18962);
        setField(term18508, term18508.getClass(), "_serializer", null);
        setField(term18508, term18508.getClass(), "_nullSerializer", term19116);
        setField(term18508, term18508.getClass(), "_internalSettings", term19164);
        Class<? extends Object> term22910 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std");
        Field term22909 = ((Class) term22910).getDeclaredField((String) "_isGetterMinLevel");
        ((Field) term22909).setAccessible(false);
        HashMap term22944 = new HashMap();
        term22904 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term22905 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term22906 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term22908 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term22943 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer"));
        setField(term22905, term22905.getClass(), "_value", null);
        setField(term22905, term22905.getClass(), "_quotedUTF8Ref", null);
        setField(term22905, term22905.getClass(), "_unquotedUTF8Ref", null);
        setField(term22905, term22905.getClass(), "_quotedChars", null);
        setField(term22905, term22905.getClass(), "_jdkSerializeValue", null);
        setField(term22904, term22904.getClass(), "_name", term22905);
        setField(term22906, term22906.getClass(), "_simpleName", null);
        setField(term22906, term22906.getClass(), "_namespace", null);
        setField(term22906, term22906.getClass(), "_encodedSimple", null);
        setField(term22904, term22904.getClass(), "_wrapperName", term22906);
        setField(term22907, term22907.getClass(), "_componentType", null);
        setField(term22907, term22907.getClass(), "_emptyArray", null);
        setField(term22907, term22907.getClass(), "_canonicalName", null);
        setField(term22907, term22907.getClass(), "_class", null);
        setIntField(term22907, term22907.getClass(), "_hash", 0);
        setField(term22907, term22907.getClass(), "_valueHandler", null);
        setField(term22907, term22907.getClass(), "_typeHandler", null);
        setBooleanField(term22907, term22907.getClass(), "_asStatic", false);
        setField(term22904, term22904.getClass(), "_declaredType", term22907);
        setField(term22904, term22904.getClass(), "_cfgSerializationType", null);
        setField(term22904, term22904.getClass(), "_nonTrivialBaseType", null);
        setField(term22908, term22908.getClass(), "_annotations", null);
        setField(term22904, term22904.getClass(), "_contextAnnotations", term22908);
        setField(term22904, term22904.getClass(), "_metadata", null);
        setField(term22904, term22904.getClass(), "_format", null);
        setField(term22904, term22904.getClass(), "_member", null);
        setField(term22904, term22904.getClass(), "_accessorMethod", null);
        setField(term22904, term22904.getClass(), "_field", term22909);
        setField(term22904, term22904.getClass(), "_serializer", null);
        setField(term22943, term22943.getClass(), "_numberType", null);
        setField(term22943, term22943.getClass(), "_schemaType", null);
        setBooleanField(term22943, term22943.getClass(), "_isInt", false);
        setField(term22943, term22943.getClass(), "_handledType", null);
        setField(term22904, term22904.getClass(), "_nullSerializer", term22943);
        setField(term22904, term22904.getClass(), "_typeSerializer", null);
        setField(term22904, term22904.getClass(), "_dynamicSerializers", null);
        setBooleanField(term22904, term22904.getClass(), "_suppressNulls", false);
        setField(term22904, term22904.getClass(), "_suppressableValue", null);
        setField(term22904, term22904.getClass(), "_includeInViews", null);
        setField(term22904, term22904.getClass(), "_internalSettings", term22944);
        Class<? extends Object> term22951 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std");
        Field term22950 = ((Class) term22951).getDeclaredField((String) "_isGetterMinLevel");
        ((Field) term22950).setAccessible(false);
        HashMap term22985 = new HashMap();
        term22945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term22946 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term22947 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22948 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term22949 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term22984 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer"));
        setField(term22946, term22946.getClass(), "_value", null);
        setField(term22946, term22946.getClass(), "_quotedUTF8Ref", null);
        setField(term22946, term22946.getClass(), "_unquotedUTF8Ref", null);
        setField(term22946, term22946.getClass(), "_quotedChars", null);
        setField(term22946, term22946.getClass(), "_jdkSerializeValue", null);
        setField(term22945, term22945.getClass(), "_name", term22946);
        setField(term22947, term22947.getClass(), "_simpleName", null);
        setField(term22947, term22947.getClass(), "_namespace", null);
        setField(term22947, term22947.getClass(), "_encodedSimple", null);
        setField(term22945, term22945.getClass(), "_wrapperName", term22947);
        setField(term22948, term22948.getClass(), "_componentType", null);
        setField(term22948, term22948.getClass(), "_emptyArray", null);
        setField(term22948, term22948.getClass(), "_canonicalName", null);
        setField(term22948, term22948.getClass(), "_class", null);
        setIntField(term22948, term22948.getClass(), "_hash", 0);
        setField(term22948, term22948.getClass(), "_valueHandler", null);
        setField(term22948, term22948.getClass(), "_typeHandler", null);
        setBooleanField(term22948, term22948.getClass(), "_asStatic", false);
        setField(term22945, term22945.getClass(), "_declaredType", term22948);
        setField(term22945, term22945.getClass(), "_cfgSerializationType", null);
        setField(term22945, term22945.getClass(), "_nonTrivialBaseType", null);
        setField(term22949, term22949.getClass(), "_annotations", null);
        setField(term22945, term22945.getClass(), "_contextAnnotations", term22949);
        setField(term22945, term22945.getClass(), "_metadata", null);
        setField(term22945, term22945.getClass(), "_format", null);
        setField(term22945, term22945.getClass(), "_member", null);
        setField(term22945, term22945.getClass(), "_accessorMethod", null);
        setField(term22945, term22945.getClass(), "_field", term22950);
        setField(term22945, term22945.getClass(), "_serializer", null);
        setField(term22984, term22984.getClass(), "_numberType", null);
        setField(term22984, term22984.getClass(), "_schemaType", null);
        setBooleanField(term22984, term22984.getClass(), "_isInt", false);
        setField(term22984, term22984.getClass(), "_handledType", null);
        setField(term22945, term22945.getClass(), "_nullSerializer", term22984);
        setField(term22945, term22945.getClass(), "_typeSerializer", null);
        setField(term22945, term22945.getClass(), "_dynamicSerializers", null);
        setBooleanField(term22945, term22945.getClass(), "_suppressNulls", false);
        setField(term22945, term22945.getClass(), "_suppressableValue", null);
        setField(term22945, term22945.getClass(), "_includeInViews", null);
        setField(term22945, term22945.getClass(), "_internalSettings", term22985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Object[] args = new Object[1];
        args[0] = term18508;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22904));
        assertTrue(recursiveEquals(term18508, term22945));
    }

};


