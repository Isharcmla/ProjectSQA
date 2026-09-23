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

public class BeanSerializerBase_rename_1325899260409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198462;
     Object term203212;
     Object term204322;
     Object term204323;
     Object term204302;

    public BeanSerializerBase_rename_1325899260409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198462 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
        Object term202764 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term202862 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term203004 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term203100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term202862, term202862.getClass(), "_value", "");
        setField(term202764, term202764.getClass(), "_name", term202862);
        setField(term202764, term202764.getClass(), "_metadata", null);
        setField(term202764, term202764.getClass(), "_format", term203004);
        setField(term202764, term202764.getClass(), "_wrapperName", null);
        setField(term202764, term202764.getClass(), "_contextAnnotations", null);
        setField(term202764, term202764.getClass(), "_declaredType", null);
        setField(term202764, term202764.getClass(), "_member", null);
        setField(term202764, term202764.getClass(), "_accessorMethod", null);
        setField(term202764, term202764.getClass(), "_field", null);
        setField(term202764, term202764.getClass(), "_serializer", null);
        setField(term202764, term202764.getClass(), "_nullSerializer", null);
        setField(term202764, term202764.getClass(), "_internalSettings", null);
        setField(term202764, term202764.getClass(), "_cfgSerializationType", term203100);
        setField(term202764, term202764.getClass(), "_dynamicSerializers", null);
        setBooleanField(term202764, term202764.getClass(), "_suppressNulls", false);
        setField(term202764, term202764.getClass(), "_suppressableValue", null);
        setField(term202764, term202764.getClass(), "_includeInViews", null);
        setField(term202764, term202764.getClass(), "_typeSerializer", null);
        setField(term202764, term202764.getClass(), "_nonTrivialBaseType", null);
        setElement(term198462, 58, term202764);
        term203212 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term203212, term203212.getClass(), "val$prefix", null);
        term204322 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term204322, term204322.getClass(), "val$prefix", null);
        term204323 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
        Object term204324 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term204325 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term204328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term204329 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term204325, term204325.getClass(), "_value", "");
        setField(term204325, term204325.getClass(), "_quotedUTF8Ref", null);
        setField(term204325, term204325.getClass(), "_unquotedUTF8Ref", null);
        setField(term204325, term204325.getClass(), "_quotedChars", null);
        setField(term204325, term204325.getClass(), "_jdkSerializeValue", null);
        setField(term204324, term204324.getClass(), "_name", term204325);
        setField(term204324, term204324.getClass(), "_wrapperName", null);
        setField(term204324, term204324.getClass(), "_declaredType", null);
        setField(term204328, term204328.getClass(), "_componentType", null);
        setField(term204328, term204328.getClass(), "_emptyArray", null);
        setField(term204328, term204328.getClass(), "_superClass", null);
        setField(term204328, term204328.getClass(), "_superInterfaces", null);
        setField(term204328, term204328.getClass(), "_bindings", null);
        setField(term204328, term204328.getClass(), "_canonicalName", null);
        setField(term204328, term204328.getClass(), "_class", null);
        setIntField(term204328, term204328.getClass(), "_hash", 0);
        setField(term204328, term204328.getClass(), "_valueHandler", null);
        setField(term204328, term204328.getClass(), "_typeHandler", null);
        setBooleanField(term204328, term204328.getClass(), "_asStatic", false);
        setField(term204324, term204324.getClass(), "_cfgSerializationType", term204328);
        setField(term204324, term204324.getClass(), "_nonTrivialBaseType", null);
        setField(term204324, term204324.getClass(), "_contextAnnotations", null);
        setField(term204324, term204324.getClass(), "_member", null);
        setField(term204324, term204324.getClass(), "_accessorMethod", null);
        setField(term204324, term204324.getClass(), "_field", null);
        setField(term204324, term204324.getClass(), "_serializer", null);
        setField(term204324, term204324.getClass(), "_nullSerializer", null);
        setField(term204324, term204324.getClass(), "_typeSerializer", null);
        setField(term204324, term204324.getClass(), "_dynamicSerializers", null);
        setBooleanField(term204324, term204324.getClass(), "_suppressNulls", false);
        setField(term204324, term204324.getClass(), "_suppressableValue", null);
        setField(term204324, term204324.getClass(), "_includeInViews", null);
        setField(term204324, term204324.getClass(), "_internalSettings", null);
        setField(term204324, term204324.getClass(), "_metadata", null);
        setField(term204329, term204329.getClass(), "_pattern", null);
        setField(term204329, term204329.getClass(), "_shape", null);
        setField(term204329, term204329.getClass(), "_locale", null);
        setField(term204329, term204329.getClass(), "_timezoneStr", null);
        setField(term204329, term204329.getClass(), "_features", null);
        setField(term204329, term204329.getClass(), "_timezone", null);
        setField(term204324, term204324.getClass(), "_format", term204329);
        setElement(term204323, 58, term204324);
        term204302 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
        Object term204303 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term204304 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term204311 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term204315 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term204304, term204304.getClass(), "_value", "null");
        setField(term204304, term204304.getClass(), "_quotedUTF8Ref", null);
        setField(term204304, term204304.getClass(), "_unquotedUTF8Ref", null);
        setField(term204304, term204304.getClass(), "_quotedChars", null);
        setField(term204304, term204304.getClass(), "_jdkSerializeValue", null);
        setField(term204303, term204303.getClass(), "_name", term204304);
        setField(term204303, term204303.getClass(), "_wrapperName", null);
        setField(term204303, term204303.getClass(), "_declaredType", null);
        setField(term204311, term204311.getClass(), "_componentType", null);
        setField(term204311, term204311.getClass(), "_emptyArray", null);
        setField(term204311, term204311.getClass(), "_superClass", null);
        setField(term204311, term204311.getClass(), "_superInterfaces", null);
        setField(term204311, term204311.getClass(), "_bindings", null);
        setField(term204311, term204311.getClass(), "_canonicalName", null);
        setField(term204311, term204311.getClass(), "_class", null);
        setIntField(term204311, term204311.getClass(), "_hash", 0);
        setField(term204311, term204311.getClass(), "_valueHandler", null);
        setField(term204311, term204311.getClass(), "_typeHandler", null);
        setBooleanField(term204311, term204311.getClass(), "_asStatic", false);
        setField(term204303, term204303.getClass(), "_cfgSerializationType", term204311);
        setField(term204303, term204303.getClass(), "_nonTrivialBaseType", null);
        setField(term204303, term204303.getClass(), "_contextAnnotations", null);
        setField(term204303, term204303.getClass(), "_member", null);
        setField(term204303, term204303.getClass(), "_accessorMethod", null);
        setField(term204303, term204303.getClass(), "_field", null);
        setField(term204303, term204303.getClass(), "_serializer", null);
        setField(term204303, term204303.getClass(), "_nullSerializer", null);
        setField(term204303, term204303.getClass(), "_typeSerializer", null);
        setField(term204303, term204303.getClass(), "_dynamicSerializers", null);
        setBooleanField(term204303, term204303.getClass(), "_suppressNulls", false);
        setField(term204303, term204303.getClass(), "_suppressableValue", null);
        setField(term204303, term204303.getClass(), "_includeInViews", null);
        setField(term204303, term204303.getClass(), "_internalSettings", null);
        setField(term204303, term204303.getClass(), "_metadata", null);
        setField(term204315, term204315.getClass(), "_pattern", null);
        setField(term204315, term204315.getClass(), "_shape", null);
        setField(term204315, term204315.getClass(), "_locale", null);
        setField(term204315, term204315.getClass(), "_timezoneStr", null);
        setField(term204315, term204315.getClass(), "_features", null);
        setField(term204315, term204315.getClass(), "_timezone", null);
        setField(term204303, term204303.getClass(), "_format", term204315);
        setElement(term204302, 58, term204303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term198462;
        args[1] = term203212;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term198462, term204322));
        assertTrue(recursiveEquals(term203212, term204323));
        assertTrue(recursiveEquals(retValue, term204302));
    }

};


