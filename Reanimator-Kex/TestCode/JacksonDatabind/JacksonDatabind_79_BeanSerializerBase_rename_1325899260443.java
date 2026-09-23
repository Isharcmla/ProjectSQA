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

public class BeanSerializerBase_rename_1325899260443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238182;
     Object term239231;
     Object term240095;
     Object term240096;
     Object term240079;

    public BeanSerializerBase_rename_1325899260443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238182 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 83);
        Object term238983 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term239081 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term239081, term239081.getClass(), "_value", "");
        setField(term238983, term238983.getClass(), "_name", term239081);
        setField(term238983, term238983.getClass(), "_metadata", null);
        setField(term238983, term238983.getClass(), "_format", null);
        setField(term238983, term238983.getClass(), "_wrapperName", null);
        setField(term238983, term238983.getClass(), "_contextAnnotations", null);
        setField(term238983, term238983.getClass(), "_declaredType", null);
        setField(term238983, term238983.getClass(), "_member", null);
        setField(term238983, term238983.getClass(), "_accessorMethod", null);
        setField(term238983, term238983.getClass(), "_field", null);
        setField(term238983, term238983.getClass(), "_serializer", null);
        setField(term238983, term238983.getClass(), "_nullSerializer", null);
        setField(term238983, term238983.getClass(), "_internalSettings", null);
        setField(term238983, term238983.getClass(), "_cfgSerializationType", null);
        setField(term238983, term238983.getClass(), "_dynamicSerializers", null);
        setBooleanField(term238983, term238983.getClass(), "_suppressNulls", false);
        setField(term238983, term238983.getClass(), "_suppressableValue", null);
        setField(term238983, term238983.getClass(), "_includeInViews", null);
        setField(term238983, term238983.getClass(), "_typeSerializer", null);
        setField(term238983, term238983.getClass(), "_nonTrivialBaseType", null);
        setElement(term238182, 2, term238983);
        term239231 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term239231, term239231.getClass(), "val$suffix", null);
        term240095 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term240095, term240095.getClass(), "val$suffix", null);
        term240096 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 83);
        Object term240097 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term240098 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term240098, term240098.getClass(), "_value", "");
        setField(term240098, term240098.getClass(), "_quotedUTF8Ref", null);
        setField(term240098, term240098.getClass(), "_unquotedUTF8Ref", null);
        setField(term240098, term240098.getClass(), "_quotedChars", null);
        setField(term240098, term240098.getClass(), "_jdkSerializeValue", null);
        setField(term240097, term240097.getClass(), "_name", term240098);
        setField(term240097, term240097.getClass(), "_wrapperName", null);
        setField(term240097, term240097.getClass(), "_declaredType", null);
        setField(term240097, term240097.getClass(), "_cfgSerializationType", null);
        setField(term240097, term240097.getClass(), "_nonTrivialBaseType", null);
        setField(term240097, term240097.getClass(), "_contextAnnotations", null);
        setField(term240097, term240097.getClass(), "_member", null);
        setField(term240097, term240097.getClass(), "_accessorMethod", null);
        setField(term240097, term240097.getClass(), "_field", null);
        setField(term240097, term240097.getClass(), "_serializer", null);
        setField(term240097, term240097.getClass(), "_nullSerializer", null);
        setField(term240097, term240097.getClass(), "_typeSerializer", null);
        setField(term240097, term240097.getClass(), "_dynamicSerializers", null);
        setBooleanField(term240097, term240097.getClass(), "_suppressNulls", false);
        setField(term240097, term240097.getClass(), "_suppressableValue", null);
        setField(term240097, term240097.getClass(), "_includeInViews", null);
        setField(term240097, term240097.getClass(), "_internalSettings", null);
        setField(term240097, term240097.getClass(), "_metadata", null);
        setField(term240097, term240097.getClass(), "_format", null);
        setElement(term240096, 2, term240097);
        term240079 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 83);
        Object term240080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term240081 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term240081, term240081.getClass(), "_value", "null");
        setField(term240081, term240081.getClass(), "_quotedUTF8Ref", null);
        setField(term240081, term240081.getClass(), "_unquotedUTF8Ref", null);
        setField(term240081, term240081.getClass(), "_quotedChars", null);
        setField(term240081, term240081.getClass(), "_jdkSerializeValue", null);
        setField(term240080, term240080.getClass(), "_name", term240081);
        setField(term240080, term240080.getClass(), "_wrapperName", null);
        setField(term240080, term240080.getClass(), "_declaredType", null);
        setField(term240080, term240080.getClass(), "_cfgSerializationType", null);
        setField(term240080, term240080.getClass(), "_nonTrivialBaseType", null);
        setField(term240080, term240080.getClass(), "_contextAnnotations", null);
        setField(term240080, term240080.getClass(), "_member", null);
        setField(term240080, term240080.getClass(), "_accessorMethod", null);
        setField(term240080, term240080.getClass(), "_field", null);
        setField(term240080, term240080.getClass(), "_serializer", null);
        setField(term240080, term240080.getClass(), "_nullSerializer", null);
        setField(term240080, term240080.getClass(), "_typeSerializer", null);
        setField(term240080, term240080.getClass(), "_dynamicSerializers", null);
        setBooleanField(term240080, term240080.getClass(), "_suppressNulls", false);
        setField(term240080, term240080.getClass(), "_suppressableValue", null);
        setField(term240080, term240080.getClass(), "_includeInViews", null);
        setField(term240080, term240080.getClass(), "_internalSettings", null);
        setField(term240080, term240080.getClass(), "_metadata", null);
        setField(term240080, term240080.getClass(), "_format", null);
        setElement(term240079, 2, term240080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term238182;
        args[1] = term239231;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term238182, term240095));
        assertTrue(recursiveEquals(term239231, term240096));
        assertTrue(recursiveEquals(retValue, term240079));
    }

};


