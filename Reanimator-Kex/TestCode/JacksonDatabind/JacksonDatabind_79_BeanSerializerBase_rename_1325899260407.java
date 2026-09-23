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

public class BeanSerializerBase_rename_1325899260407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194932;
     Object term197265;
     Object term198451;
     Object term198452;
     Object term198435;

    public BeanSerializerBase_rename_1325899260407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194932 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 244);
        Object term197017 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term197115 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term197115, term197115.getClass(), "_value", "");
        setField(term197017, term197017.getClass(), "_name", term197115);
        setField(term197017, term197017.getClass(), "_metadata", null);
        setField(term197017, term197017.getClass(), "_format", null);
        setField(term197017, term197017.getClass(), "_wrapperName", null);
        setField(term197017, term197017.getClass(), "_contextAnnotations", null);
        setField(term197017, term197017.getClass(), "_declaredType", null);
        setField(term197017, term197017.getClass(), "_member", null);
        setField(term197017, term197017.getClass(), "_accessorMethod", null);
        setField(term197017, term197017.getClass(), "_field", null);
        setField(term197017, term197017.getClass(), "_serializer", null);
        setField(term197017, term197017.getClass(), "_nullSerializer", null);
        setField(term197017, term197017.getClass(), "_internalSettings", null);
        setField(term197017, term197017.getClass(), "_cfgSerializationType", null);
        setField(term197017, term197017.getClass(), "_dynamicSerializers", null);
        setBooleanField(term197017, term197017.getClass(), "_suppressNulls", false);
        setField(term197017, term197017.getClass(), "_suppressableValue", null);
        setField(term197017, term197017.getClass(), "_includeInViews", null);
        setField(term197017, term197017.getClass(), "_typeSerializer", null);
        setField(term197017, term197017.getClass(), "_nonTrivialBaseType", null);
        setElement(term194932, 58, term197017);
        term197265 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term197265, term197265.getClass(), "val$prefix", null);
        term198451 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term198451, term198451.getClass(), "val$prefix", null);
        term198452 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 244);
        Object term198453 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term198454 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term198454, term198454.getClass(), "_value", "");
        setField(term198454, term198454.getClass(), "_quotedUTF8Ref", null);
        setField(term198454, term198454.getClass(), "_unquotedUTF8Ref", null);
        setField(term198454, term198454.getClass(), "_quotedChars", null);
        setField(term198454, term198454.getClass(), "_jdkSerializeValue", null);
        setField(term198453, term198453.getClass(), "_name", term198454);
        setField(term198453, term198453.getClass(), "_wrapperName", null);
        setField(term198453, term198453.getClass(), "_declaredType", null);
        setField(term198453, term198453.getClass(), "_cfgSerializationType", null);
        setField(term198453, term198453.getClass(), "_nonTrivialBaseType", null);
        setField(term198453, term198453.getClass(), "_contextAnnotations", null);
        setField(term198453, term198453.getClass(), "_member", null);
        setField(term198453, term198453.getClass(), "_accessorMethod", null);
        setField(term198453, term198453.getClass(), "_field", null);
        setField(term198453, term198453.getClass(), "_serializer", null);
        setField(term198453, term198453.getClass(), "_nullSerializer", null);
        setField(term198453, term198453.getClass(), "_typeSerializer", null);
        setField(term198453, term198453.getClass(), "_dynamicSerializers", null);
        setBooleanField(term198453, term198453.getClass(), "_suppressNulls", false);
        setField(term198453, term198453.getClass(), "_suppressableValue", null);
        setField(term198453, term198453.getClass(), "_includeInViews", null);
        setField(term198453, term198453.getClass(), "_internalSettings", null);
        setField(term198453, term198453.getClass(), "_metadata", null);
        setField(term198453, term198453.getClass(), "_format", null);
        setElement(term198452, 58, term198453);
        term198435 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 244);
        Object term198436 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term198437 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term198437, term198437.getClass(), "_value", "null");
        setField(term198437, term198437.getClass(), "_quotedUTF8Ref", null);
        setField(term198437, term198437.getClass(), "_unquotedUTF8Ref", null);
        setField(term198437, term198437.getClass(), "_quotedChars", null);
        setField(term198437, term198437.getClass(), "_jdkSerializeValue", null);
        setField(term198436, term198436.getClass(), "_name", term198437);
        setField(term198436, term198436.getClass(), "_wrapperName", null);
        setField(term198436, term198436.getClass(), "_declaredType", null);
        setField(term198436, term198436.getClass(), "_cfgSerializationType", null);
        setField(term198436, term198436.getClass(), "_nonTrivialBaseType", null);
        setField(term198436, term198436.getClass(), "_contextAnnotations", null);
        setField(term198436, term198436.getClass(), "_member", null);
        setField(term198436, term198436.getClass(), "_accessorMethod", null);
        setField(term198436, term198436.getClass(), "_field", null);
        setField(term198436, term198436.getClass(), "_serializer", null);
        setField(term198436, term198436.getClass(), "_nullSerializer", null);
        setField(term198436, term198436.getClass(), "_typeSerializer", null);
        setField(term198436, term198436.getClass(), "_dynamicSerializers", null);
        setBooleanField(term198436, term198436.getClass(), "_suppressNulls", false);
        setField(term198436, term198436.getClass(), "_suppressableValue", null);
        setField(term198436, term198436.getClass(), "_includeInViews", null);
        setField(term198436, term198436.getClass(), "_internalSettings", null);
        setField(term198436, term198436.getClass(), "_metadata", null);
        setField(term198436, term198436.getClass(), "_format", null);
        setElement(term198435, 58, term198436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term194932;
        args[1] = term197265;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term194932, term198451));
        assertTrue(recursiveEquals(term197265, term198452));
        assertTrue(recursiveEquals(retValue, term198435));
    }

};


