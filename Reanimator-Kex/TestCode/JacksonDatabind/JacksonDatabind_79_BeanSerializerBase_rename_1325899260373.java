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

public class BeanSerializerBase_rename_1325899260373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163785;
     Object term165957;
     Object term166994;
     Object term166995;
     Object term166971;

    public BeanSerializerBase_rename_1325899260373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163785 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 159);
        Object term165493 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term165591 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term165763 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        Object term165845 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term165591, term165591.getClass(), "_value", "");
        setField(term165493, term165493.getClass(), "_name", term165591);
        setField(term165493, term165493.getClass(), "_metadata", null);
        setField(term165493, term165493.getClass(), "_format", null);
        setField(term165493, term165493.getClass(), "_wrapperName", null);
        setField(term165493, term165493.getClass(), "_contextAnnotations", null);
        setField(term165493, term165493.getClass(), "_declaredType", null);
        setField(term165493, term165493.getClass(), "_member", null);
        setField(term165493, term165493.getClass(), "_accessorMethod", null);
        setField(term165493, term165493.getClass(), "_field", null);
        setField(term165493, term165493.getClass(), "_serializer", term165763);
        setField(term165493, term165493.getClass(), "_nullSerializer", null);
        setField(term165493, term165493.getClass(), "_internalSettings", null);
        setField(term165493, term165493.getClass(), "_cfgSerializationType", null);
        setField(term165493, term165493.getClass(), "_dynamicSerializers", null);
        setBooleanField(term165493, term165493.getClass(), "_suppressNulls", false);
        setField(term165493, term165493.getClass(), "_suppressableValue", term165845);
        setField(term165493, term165493.getClass(), "_includeInViews", null);
        setField(term165493, term165493.getClass(), "_typeSerializer", null);
        setField(term165493, term165493.getClass(), "_nonTrivialBaseType", null);
        setElement(term163785, 58, term165493);
        term165957 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term165957, term165957.getClass(), "val$prefix", null);
        term166994 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term166994, term166994.getClass(), "val$prefix", null);
        term166995 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 159);
        Object term166996 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term166997 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term167000 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        Object term167001 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term166997, term166997.getClass(), "_value", "");
        setField(term166997, term166997.getClass(), "_quotedUTF8Ref", null);
        setField(term166997, term166997.getClass(), "_unquotedUTF8Ref", null);
        setField(term166997, term166997.getClass(), "_quotedChars", null);
        setField(term166997, term166997.getClass(), "_jdkSerializeValue", null);
        setField(term166996, term166996.getClass(), "_name", term166997);
        setField(term166996, term166996.getClass(), "_wrapperName", null);
        setField(term166996, term166996.getClass(), "_declaredType", null);
        setField(term166996, term166996.getClass(), "_cfgSerializationType", null);
        setField(term166996, term166996.getClass(), "_nonTrivialBaseType", null);
        setField(term166996, term166996.getClass(), "_contextAnnotations", null);
        setField(term166996, term166996.getClass(), "_member", null);
        setField(term166996, term166996.getClass(), "_accessorMethod", null);
        setField(term166996, term166996.getClass(), "_field", null);
        setIntField(term167000, term167000.getClass(), "_typeId", 0);
        setField(term167000, term167000.getClass(), "_handledType", null);
        setField(term166996, term166996.getClass(), "_serializer", term167000);
        setField(term166996, term166996.getClass(), "_nullSerializer", null);
        setField(term166996, term166996.getClass(), "_typeSerializer", null);
        setField(term166996, term166996.getClass(), "_dynamicSerializers", null);
        setBooleanField(term166996, term166996.getClass(), "_suppressNulls", false);
        setField(term167001, term167001.getClass(), "table", null);
        setField(term167001, term167001.getClass(), "nextTable", null);
        setLongField(term167001, term167001.getClass(), "baseCount", 0L);
        setIntField(term167001, term167001.getClass(), "sizeCtl", 0);
        setIntField(term167001, term167001.getClass(), "transferIndex", 0);
        setIntField(term167001, term167001.getClass(), "cellsBusy", 0);
        setField(term167001, term167001.getClass(), "counterCells", null);
        setField(term167001, term167001.getClass(), "keySet", null);
        setField(term167001, term167001.getClass(), "values", null);
        setField(term167001, term167001.getClass(), "entrySet", null);
        setField(term167001, term167001.getClass(), "keySet", null);
        setField(term167001, term167001.getClass(), "values", null);
        setField(term166996, term166996.getClass(), "_suppressableValue", term167001);
        setField(term166996, term166996.getClass(), "_includeInViews", null);
        setField(term166996, term166996.getClass(), "_internalSettings", null);
        setField(term166996, term166996.getClass(), "_metadata", null);
        setField(term166996, term166996.getClass(), "_format", null);
        setElement(term166995, 58, term166996);
        term166971 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 159);
        Object term166972 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term166973 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term166980 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        Object term166983 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term166973, term166973.getClass(), "_value", "null");
        setField(term166973, term166973.getClass(), "_quotedUTF8Ref", null);
        setField(term166973, term166973.getClass(), "_unquotedUTF8Ref", null);
        setField(term166973, term166973.getClass(), "_quotedChars", null);
        setField(term166973, term166973.getClass(), "_jdkSerializeValue", null);
        setField(term166972, term166972.getClass(), "_name", term166973);
        setField(term166972, term166972.getClass(), "_wrapperName", null);
        setField(term166972, term166972.getClass(), "_declaredType", null);
        setField(term166972, term166972.getClass(), "_cfgSerializationType", null);
        setField(term166972, term166972.getClass(), "_nonTrivialBaseType", null);
        setField(term166972, term166972.getClass(), "_contextAnnotations", null);
        setField(term166972, term166972.getClass(), "_member", null);
        setField(term166972, term166972.getClass(), "_accessorMethod", null);
        setField(term166972, term166972.getClass(), "_field", null);
        setIntField(term166980, term166980.getClass(), "_typeId", 0);
        setField(term166980, term166980.getClass(), "_handledType", null);
        setField(term166972, term166972.getClass(), "_serializer", term166980);
        setField(term166972, term166972.getClass(), "_nullSerializer", null);
        setField(term166972, term166972.getClass(), "_typeSerializer", null);
        setField(term166972, term166972.getClass(), "_dynamicSerializers", null);
        setBooleanField(term166972, term166972.getClass(), "_suppressNulls", false);
        setField(term166983, term166983.getClass(), "table", null);
        setField(term166983, term166983.getClass(), "nextTable", null);
        setLongField(term166983, term166983.getClass(), "baseCount", 0L);
        setIntField(term166983, term166983.getClass(), "sizeCtl", 0);
        setIntField(term166983, term166983.getClass(), "transferIndex", 0);
        setIntField(term166983, term166983.getClass(), "cellsBusy", 0);
        setField(term166983, term166983.getClass(), "counterCells", null);
        setField(term166983, term166983.getClass(), "keySet", null);
        setField(term166983, term166983.getClass(), "values", null);
        setField(term166983, term166983.getClass(), "entrySet", null);
        setField(term166983, term166983.getClass(), "keySet", null);
        setField(term166983, term166983.getClass(), "values", null);
        setField(term166972, term166972.getClass(), "_suppressableValue", term166983);
        setField(term166972, term166972.getClass(), "_includeInViews", null);
        setField(term166972, term166972.getClass(), "_internalSettings", null);
        setField(term166972, term166972.getClass(), "_metadata", null);
        setField(term166972, term166972.getClass(), "_format", null);
        setElement(term166971, 58, term166972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term163785;
        args[1] = term165957;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term163785, term166994));
        assertTrue(recursiveEquals(term165957, term166995));
        assertTrue(recursiveEquals(retValue, term166971));
    }

};


