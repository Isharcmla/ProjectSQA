package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;

public class BeanSerializerBase_rename_1325899260397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184641;
     Object term186508;
     Object term187647;
     Object term187648;
     Object term187627;

    public BeanSerializerBase_rename_1325899260397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184641 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 215);
        Object term186134 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term186232 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term186396 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object[] term184832 = (Object[]) newArray("java.lang.Class", 0);
        setField(term186232, term186232.getClass(), "_value", "");
        setField(term186134, term186134.getClass(), "_name", term186232);
        setField(term186134, term186134.getClass(), "_metadata", null);
        setField(term186134, term186134.getClass(), "_format", null);
        setField(term186134, term186134.getClass(), "_wrapperName", null);
        setField(term186134, term186134.getClass(), "_contextAnnotations", null);
        setField(term186134, term186134.getClass(), "_declaredType", null);
        setField(term186134, term186134.getClass(), "_member", null);
        setField(term186134, term186134.getClass(), "_accessorMethod", null);
        setField(term186134, term186134.getClass(), "_field", null);
        setField(term186134, term186134.getClass(), "_serializer", null);
        setField(term186134, term186134.getClass(), "_nullSerializer", null);
        setField(term186134, term186134.getClass(), "_internalSettings", null);
        setField(term186134, term186134.getClass(), "_cfgSerializationType", null);
        setField(term186134, term186134.getClass(), "_dynamicSerializers", null);
        setBooleanField(term186134, term186134.getClass(), "_suppressNulls", false);
        setField(term186134, term186134.getClass(), "_suppressableValue", term186396);
        setField(term186134, term186134.getClass(), "_includeInViews", term184832);
        setField(term186134, term186134.getClass(), "_typeSerializer", null);
        setField(term186134, term186134.getClass(), "_nonTrivialBaseType", null);
        setElement(term184641, 58, term186134);
        term186508 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term186508, term186508.getClass(), "val$prefix", null);
        term187647 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term187647, term187647.getClass(), "val$prefix", null);
        term187648 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 215);
        Object term187649 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term187650 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term187653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object[] term187654 = (Object[]) newArray("java.lang.Class", 0);
        setField(term187650, term187650.getClass(), "_value", "");
        setField(term187650, term187650.getClass(), "_quotedUTF8Ref", null);
        setField(term187650, term187650.getClass(), "_unquotedUTF8Ref", null);
        setField(term187650, term187650.getClass(), "_quotedChars", null);
        setField(term187650, term187650.getClass(), "_jdkSerializeValue", null);
        setField(term187649, term187649.getClass(), "_name", term187650);
        setField(term187649, term187649.getClass(), "_wrapperName", null);
        setField(term187649, term187649.getClass(), "_declaredType", null);
        setField(term187649, term187649.getClass(), "_cfgSerializationType", null);
        setField(term187649, term187649.getClass(), "_nonTrivialBaseType", null);
        setField(term187649, term187649.getClass(), "_contextAnnotations", null);
        setField(term187649, term187649.getClass(), "_member", null);
        setField(term187649, term187649.getClass(), "_accessorMethod", null);
        setField(term187649, term187649.getClass(), "_field", null);
        setField(term187649, term187649.getClass(), "_serializer", null);
        setField(term187649, term187649.getClass(), "_nullSerializer", null);
        setField(term187649, term187649.getClass(), "_typeSerializer", null);
        setField(term187649, term187649.getClass(), "_dynamicSerializers", null);
        setBooleanField(term187649, term187649.getClass(), "_suppressNulls", false);
        setField(term187653, term187653.getClass(), "_owner", null);
        setField(term187653, term187653.getClass(), "_type", null);
        setIntField(term187653, term187653.getClass(), "_index", 0);
        setField(term187653, term187653.getClass(), "_typeContext", null);
        setField(term187653, term187653.getClass(), "_annotations", null);
        setField(term187649, term187649.getClass(), "_suppressableValue", term187653);
        setField(term187649, term187649.getClass(), "_includeInViews", term187654);
        setField(term187649, term187649.getClass(), "_internalSettings", null);
        setField(term187649, term187649.getClass(), "_metadata", null);
        setField(term187649, term187649.getClass(), "_format", null);
        setElement(term187648, 58, term187649);
        term187627 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 215);
        Object term187628 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term187629 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term187637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object[] term187639 = (Object[]) newArray("java.lang.Class", 0);
        setField(term187629, term187629.getClass(), "_value", "null");
        setField(term187629, term187629.getClass(), "_quotedUTF8Ref", null);
        setField(term187629, term187629.getClass(), "_unquotedUTF8Ref", null);
        setField(term187629, term187629.getClass(), "_quotedChars", null);
        setField(term187629, term187629.getClass(), "_jdkSerializeValue", null);
        setField(term187628, term187628.getClass(), "_name", term187629);
        setField(term187628, term187628.getClass(), "_wrapperName", null);
        setField(term187628, term187628.getClass(), "_declaredType", null);
        setField(term187628, term187628.getClass(), "_cfgSerializationType", null);
        setField(term187628, term187628.getClass(), "_nonTrivialBaseType", null);
        setField(term187628, term187628.getClass(), "_contextAnnotations", null);
        setField(term187628, term187628.getClass(), "_member", null);
        setField(term187628, term187628.getClass(), "_accessorMethod", null);
        setField(term187628, term187628.getClass(), "_field", null);
        setField(term187628, term187628.getClass(), "_serializer", null);
        setField(term187628, term187628.getClass(), "_nullSerializer", null);
        setField(term187628, term187628.getClass(), "_typeSerializer", null);
        setField(term187628, term187628.getClass(), "_dynamicSerializers", null);
        setBooleanField(term187628, term187628.getClass(), "_suppressNulls", false);
        setField(term187637, term187637.getClass(), "_owner", null);
        setField(term187637, term187637.getClass(), "_type", null);
        setIntField(term187637, term187637.getClass(), "_index", 0);
        setField(term187637, term187637.getClass(), "_typeContext", null);
        setField(term187637, term187637.getClass(), "_annotations", null);
        setField(term187628, term187628.getClass(), "_suppressableValue", term187637);
        setField(term187628, term187628.getClass(), "_includeInViews", term187639);
        setField(term187628, term187628.getClass(), "_internalSettings", null);
        setField(term187628, term187628.getClass(), "_metadata", null);
        setField(term187628, term187628.getClass(), "_format", null);
        setElement(term187627, 58, term187628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term184641;
        args[1] = term186508;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term184641, term187647));
        assertTrue(recursiveEquals(term186508, term187648));
        assertTrue(recursiveEquals(retValue, term187627));
    }

};


