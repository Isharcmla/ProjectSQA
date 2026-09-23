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

public class BeanSerializerBase_rename_1325899260433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222153;
     Object term226835;
     Object term227934;
     Object term227935;
     Object term227917;

    public BeanSerializerBase_rename_1325899260433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222153 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 199);
        Object term226449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term226547 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term226723 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        setField(term226547, term226547.getClass(), "_value", "");
        setField(term226449, term226449.getClass(), "_name", term226547);
        setField(term226449, term226449.getClass(), "_metadata", null);
        setField(term226449, term226449.getClass(), "_format", null);
        setField(term226449, term226449.getClass(), "_wrapperName", null);
        setField(term226449, term226449.getClass(), "_contextAnnotations", null);
        setField(term226449, term226449.getClass(), "_declaredType", null);
        setField(term226449, term226449.getClass(), "_member", null);
        setField(term226449, term226449.getClass(), "_accessorMethod", null);
        setField(term226449, term226449.getClass(), "_field", null);
        setField(term226449, term226449.getClass(), "_serializer", null);
        setField(term226449, term226449.getClass(), "_nullSerializer", null);
        setField(term226449, term226449.getClass(), "_internalSettings", null);
        setField(term226449, term226449.getClass(), "_cfgSerializationType", null);
        setField(term226449, term226449.getClass(), "_dynamicSerializers", null);
        setBooleanField(term226449, term226449.getClass(), "_suppressNulls", false);
        setField(term226449, term226449.getClass(), "_suppressableValue", term226723);
        setField(term226449, term226449.getClass(), "_includeInViews", null);
        setField(term226449, term226449.getClass(), "_typeSerializer", null);
        setField(term226449, term226449.getClass(), "_nonTrivialBaseType", null);
        setElement(term222153, 82, term226449);
        term226835 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term226835, term226835.getClass(), "val$prefix", null);
        term227934 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term227934, term227934.getClass(), "val$prefix", null);
        term227935 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 199);
        Object term227936 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term227937 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term227940 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        setField(term227937, term227937.getClass(), "_value", "");
        setField(term227937, term227937.getClass(), "_quotedUTF8Ref", null);
        setField(term227937, term227937.getClass(), "_unquotedUTF8Ref", null);
        setField(term227937, term227937.getClass(), "_quotedChars", null);
        setField(term227937, term227937.getClass(), "_jdkSerializeValue", null);
        setField(term227936, term227936.getClass(), "_name", term227937);
        setField(term227936, term227936.getClass(), "_wrapperName", null);
        setField(term227936, term227936.getClass(), "_declaredType", null);
        setField(term227936, term227936.getClass(), "_cfgSerializationType", null);
        setField(term227936, term227936.getClass(), "_nonTrivialBaseType", null);
        setField(term227936, term227936.getClass(), "_contextAnnotations", null);
        setField(term227936, term227936.getClass(), "_member", null);
        setField(term227936, term227936.getClass(), "_accessorMethod", null);
        setField(term227936, term227936.getClass(), "_field", null);
        setField(term227936, term227936.getClass(), "_serializer", null);
        setField(term227936, term227936.getClass(), "_nullSerializer", null);
        setField(term227936, term227936.getClass(), "_typeSerializer", null);
        setField(term227936, term227936.getClass(), "_dynamicSerializers", null);
        setBooleanField(term227936, term227936.getClass(), "_suppressNulls", false);
        setField(term227936, term227936.getClass(), "_suppressableValue", term227940);
        setField(term227936, term227936.getClass(), "_includeInViews", null);
        setField(term227936, term227936.getClass(), "_internalSettings", null);
        setField(term227936, term227936.getClass(), "_metadata", null);
        setField(term227936, term227936.getClass(), "_format", null);
        setElement(term227935, 82, term227936);
        term227917 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 199);
        Object term227918 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term227919 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term227927 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        setField(term227919, term227919.getClass(), "_value", "null");
        setField(term227919, term227919.getClass(), "_quotedUTF8Ref", null);
        setField(term227919, term227919.getClass(), "_unquotedUTF8Ref", null);
        setField(term227919, term227919.getClass(), "_quotedChars", null);
        setField(term227919, term227919.getClass(), "_jdkSerializeValue", null);
        setField(term227918, term227918.getClass(), "_name", term227919);
        setField(term227918, term227918.getClass(), "_wrapperName", null);
        setField(term227918, term227918.getClass(), "_declaredType", null);
        setField(term227918, term227918.getClass(), "_cfgSerializationType", null);
        setField(term227918, term227918.getClass(), "_nonTrivialBaseType", null);
        setField(term227918, term227918.getClass(), "_contextAnnotations", null);
        setField(term227918, term227918.getClass(), "_member", null);
        setField(term227918, term227918.getClass(), "_accessorMethod", null);
        setField(term227918, term227918.getClass(), "_field", null);
        setField(term227918, term227918.getClass(), "_serializer", null);
        setField(term227918, term227918.getClass(), "_nullSerializer", null);
        setField(term227918, term227918.getClass(), "_typeSerializer", null);
        setField(term227918, term227918.getClass(), "_dynamicSerializers", null);
        setBooleanField(term227918, term227918.getClass(), "_suppressNulls", false);
        setField(term227918, term227918.getClass(), "_suppressableValue", term227927);
        setField(term227918, term227918.getClass(), "_includeInViews", null);
        setField(term227918, term227918.getClass(), "_internalSettings", null);
        setField(term227918, term227918.getClass(), "_metadata", null);
        setField(term227918, term227918.getClass(), "_format", null);
        setElement(term227917, 82, term227918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term222153;
        args[1] = term226835;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term222153, term227934));
        assertTrue(recursiveEquals(term226835, term227935));
        assertTrue(recursiveEquals(retValue, term227917));
    }

};


