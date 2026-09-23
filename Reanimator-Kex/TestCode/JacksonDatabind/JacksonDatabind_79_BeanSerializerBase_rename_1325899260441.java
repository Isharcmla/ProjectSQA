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

public class BeanSerializerBase_rename_1325899260441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233031;
     Object term237220;
     Object term238170;
     Object term238171;
     Object term238154;

    public BeanSerializerBase_rename_1325899260441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233031 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 126);
        Object term236972 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term237070 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term237070, term237070.getClass(), "_value", "");
        setField(term236972, term236972.getClass(), "_name", term237070);
        setField(term236972, term236972.getClass(), "_metadata", null);
        setField(term236972, term236972.getClass(), "_format", null);
        setField(term236972, term236972.getClass(), "_wrapperName", null);
        setField(term236972, term236972.getClass(), "_contextAnnotations", null);
        setField(term236972, term236972.getClass(), "_declaredType", null);
        setField(term236972, term236972.getClass(), "_member", null);
        setField(term236972, term236972.getClass(), "_accessorMethod", null);
        setField(term236972, term236972.getClass(), "_field", null);
        setField(term236972, term236972.getClass(), "_serializer", null);
        setField(term236972, term236972.getClass(), "_nullSerializer", null);
        setField(term236972, term236972.getClass(), "_internalSettings", null);
        setField(term236972, term236972.getClass(), "_cfgSerializationType", null);
        setField(term236972, term236972.getClass(), "_dynamicSerializers", null);
        setBooleanField(term236972, term236972.getClass(), "_suppressNulls", false);
        setField(term236972, term236972.getClass(), "_suppressableValue", null);
        setField(term236972, term236972.getClass(), "_includeInViews", null);
        setField(term236972, term236972.getClass(), "_typeSerializer", null);
        setField(term236972, term236972.getClass(), "_nonTrivialBaseType", null);
        setElement(term233031, 82, term236972);
        term237220 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term237220, term237220.getClass(), "val$prefix", null);
        term238170 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term238170, term238170.getClass(), "val$prefix", null);
        term238171 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 126);
        Object term238172 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term238173 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term238173, term238173.getClass(), "_value", "");
        setField(term238173, term238173.getClass(), "_quotedUTF8Ref", null);
        setField(term238173, term238173.getClass(), "_unquotedUTF8Ref", null);
        setField(term238173, term238173.getClass(), "_quotedChars", null);
        setField(term238173, term238173.getClass(), "_jdkSerializeValue", null);
        setField(term238172, term238172.getClass(), "_name", term238173);
        setField(term238172, term238172.getClass(), "_wrapperName", null);
        setField(term238172, term238172.getClass(), "_declaredType", null);
        setField(term238172, term238172.getClass(), "_cfgSerializationType", null);
        setField(term238172, term238172.getClass(), "_nonTrivialBaseType", null);
        setField(term238172, term238172.getClass(), "_contextAnnotations", null);
        setField(term238172, term238172.getClass(), "_member", null);
        setField(term238172, term238172.getClass(), "_accessorMethod", null);
        setField(term238172, term238172.getClass(), "_field", null);
        setField(term238172, term238172.getClass(), "_serializer", null);
        setField(term238172, term238172.getClass(), "_nullSerializer", null);
        setField(term238172, term238172.getClass(), "_typeSerializer", null);
        setField(term238172, term238172.getClass(), "_dynamicSerializers", null);
        setBooleanField(term238172, term238172.getClass(), "_suppressNulls", false);
        setField(term238172, term238172.getClass(), "_suppressableValue", null);
        setField(term238172, term238172.getClass(), "_includeInViews", null);
        setField(term238172, term238172.getClass(), "_internalSettings", null);
        setField(term238172, term238172.getClass(), "_metadata", null);
        setField(term238172, term238172.getClass(), "_format", null);
        setElement(term238171, 82, term238172);
        term238154 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 126);
        Object term238155 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term238156 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term238156, term238156.getClass(), "_value", "null");
        setField(term238156, term238156.getClass(), "_quotedUTF8Ref", null);
        setField(term238156, term238156.getClass(), "_unquotedUTF8Ref", null);
        setField(term238156, term238156.getClass(), "_quotedChars", null);
        setField(term238156, term238156.getClass(), "_jdkSerializeValue", null);
        setField(term238155, term238155.getClass(), "_name", term238156);
        setField(term238155, term238155.getClass(), "_wrapperName", null);
        setField(term238155, term238155.getClass(), "_declaredType", null);
        setField(term238155, term238155.getClass(), "_cfgSerializationType", null);
        setField(term238155, term238155.getClass(), "_nonTrivialBaseType", null);
        setField(term238155, term238155.getClass(), "_contextAnnotations", null);
        setField(term238155, term238155.getClass(), "_member", null);
        setField(term238155, term238155.getClass(), "_accessorMethod", null);
        setField(term238155, term238155.getClass(), "_field", null);
        setField(term238155, term238155.getClass(), "_serializer", null);
        setField(term238155, term238155.getClass(), "_nullSerializer", null);
        setField(term238155, term238155.getClass(), "_typeSerializer", null);
        setField(term238155, term238155.getClass(), "_dynamicSerializers", null);
        setBooleanField(term238155, term238155.getClass(), "_suppressNulls", false);
        setField(term238155, term238155.getClass(), "_suppressableValue", null);
        setField(term238155, term238155.getClass(), "_includeInViews", null);
        setField(term238155, term238155.getClass(), "_internalSettings", null);
        setField(term238155, term238155.getClass(), "_metadata", null);
        setField(term238155, term238155.getClass(), "_format", null);
        setElement(term238154, 82, term238155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term233031;
        args[1] = term237220;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term233031, term238170));
        assertTrue(recursiveEquals(term237220, term238171));
        assertTrue(recursiveEquals(retValue, term238154));
    }

};


