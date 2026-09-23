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

public class BeanSerializerBase_rename_1325899260282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107711;
     Object term108322;
     Object term109332;
     Object term109333;
     Object term109314;

    public BeanSerializerBase_rename_1325899260282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107711 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 271);
        Object term108112 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term108210 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term108112, term108112.getClass(), "_name", term108210);
        setElement(term107711, 52, term108112);
        term108322 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term109332 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term109332, term109332.getClass(), "val$suffix", null);
        term109333 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 271);
        Object term109334 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term109335 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term109335, term109335.getClass(), "_value", null);
        setField(term109335, term109335.getClass(), "_quotedUTF8Ref", null);
        setField(term109335, term109335.getClass(), "_unquotedUTF8Ref", null);
        setField(term109335, term109335.getClass(), "_quotedChars", null);
        setField(term109335, term109335.getClass(), "_jdkSerializeValue", null);
        setField(term109334, term109334.getClass(), "_name", term109335);
        setField(term109334, term109334.getClass(), "_wrapperName", null);
        setField(term109334, term109334.getClass(), "_declaredType", null);
        setField(term109334, term109334.getClass(), "_cfgSerializationType", null);
        setField(term109334, term109334.getClass(), "_nonTrivialBaseType", null);
        setField(term109334, term109334.getClass(), "_contextAnnotations", null);
        setField(term109334, term109334.getClass(), "_member", null);
        setField(term109334, term109334.getClass(), "_accessorMethod", null);
        setField(term109334, term109334.getClass(), "_field", null);
        setField(term109334, term109334.getClass(), "_serializer", null);
        setField(term109334, term109334.getClass(), "_nullSerializer", null);
        setField(term109334, term109334.getClass(), "_typeSerializer", null);
        setField(term109334, term109334.getClass(), "_dynamicSerializers", null);
        setBooleanField(term109334, term109334.getClass(), "_suppressNulls", false);
        setField(term109334, term109334.getClass(), "_suppressableValue", null);
        setField(term109334, term109334.getClass(), "_includeInViews", null);
        setField(term109334, term109334.getClass(), "_internalSettings", null);
        setField(term109334, term109334.getClass(), "_metadata", null);
        setField(term109334, term109334.getClass(), "_format", null);
        setElement(term109333, 52, term109334);
        term109314 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 271);
        Object term109315 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term109316 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term109316, term109316.getClass(), "_value", "nullnull");
        setField(term109316, term109316.getClass(), "_quotedUTF8Ref", null);
        setField(term109316, term109316.getClass(), "_unquotedUTF8Ref", null);
        setField(term109316, term109316.getClass(), "_quotedChars", null);
        setField(term109316, term109316.getClass(), "_jdkSerializeValue", null);
        setField(term109315, term109315.getClass(), "_name", term109316);
        setField(term109315, term109315.getClass(), "_wrapperName", null);
        setField(term109315, term109315.getClass(), "_declaredType", null);
        setField(term109315, term109315.getClass(), "_cfgSerializationType", null);
        setField(term109315, term109315.getClass(), "_nonTrivialBaseType", null);
        setField(term109315, term109315.getClass(), "_contextAnnotations", null);
        setField(term109315, term109315.getClass(), "_member", null);
        setField(term109315, term109315.getClass(), "_accessorMethod", null);
        setField(term109315, term109315.getClass(), "_field", null);
        setField(term109315, term109315.getClass(), "_serializer", null);
        setField(term109315, term109315.getClass(), "_nullSerializer", null);
        setField(term109315, term109315.getClass(), "_typeSerializer", null);
        setField(term109315, term109315.getClass(), "_dynamicSerializers", null);
        setBooleanField(term109315, term109315.getClass(), "_suppressNulls", false);
        setField(term109315, term109315.getClass(), "_suppressableValue", null);
        setField(term109315, term109315.getClass(), "_includeInViews", null);
        setField(term109315, term109315.getClass(), "_internalSettings", null);
        setField(term109315, term109315.getClass(), "_metadata", null);
        setField(term109315, term109315.getClass(), "_format", null);
        setElement(term109314, 52, term109315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term107711;
        args[1] = term108322;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term107711, term109332));
        assertTrue(recursiveEquals(term108322, term109333));
        assertTrue(recursiveEquals(retValue, term109314));
    }

};


