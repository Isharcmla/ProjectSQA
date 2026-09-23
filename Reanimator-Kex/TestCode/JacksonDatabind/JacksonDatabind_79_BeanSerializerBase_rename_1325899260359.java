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

public class BeanSerializerBase_rename_1325899260359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145744;
     Object term146386;
     Object term147078;
     Object term147079;
     Object term147060;

    public BeanSerializerBase_rename_1325899260359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145744 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 248);
        Object term146176 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term146274 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term146176, term146176.getClass(), "_name", term146274);
        setElement(term145744, 58, term146176);
        term146386 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term147078 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term147078, term147078.getClass(), "val$prefix", null);
        term147079 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 248);
        Object term147080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term147081 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term147081, term147081.getClass(), "_value", null);
        setField(term147081, term147081.getClass(), "_quotedUTF8Ref", null);
        setField(term147081, term147081.getClass(), "_unquotedUTF8Ref", null);
        setField(term147081, term147081.getClass(), "_quotedChars", null);
        setField(term147081, term147081.getClass(), "_jdkSerializeValue", null);
        setField(term147080, term147080.getClass(), "_name", term147081);
        setField(term147080, term147080.getClass(), "_wrapperName", null);
        setField(term147080, term147080.getClass(), "_declaredType", null);
        setField(term147080, term147080.getClass(), "_cfgSerializationType", null);
        setField(term147080, term147080.getClass(), "_nonTrivialBaseType", null);
        setField(term147080, term147080.getClass(), "_contextAnnotations", null);
        setField(term147080, term147080.getClass(), "_member", null);
        setField(term147080, term147080.getClass(), "_accessorMethod", null);
        setField(term147080, term147080.getClass(), "_field", null);
        setField(term147080, term147080.getClass(), "_serializer", null);
        setField(term147080, term147080.getClass(), "_nullSerializer", null);
        setField(term147080, term147080.getClass(), "_typeSerializer", null);
        setField(term147080, term147080.getClass(), "_dynamicSerializers", null);
        setBooleanField(term147080, term147080.getClass(), "_suppressNulls", false);
        setField(term147080, term147080.getClass(), "_suppressableValue", null);
        setField(term147080, term147080.getClass(), "_includeInViews", null);
        setField(term147080, term147080.getClass(), "_internalSettings", null);
        setField(term147080, term147080.getClass(), "_metadata", null);
        setField(term147080, term147080.getClass(), "_format", null);
        setElement(term147079, 58, term147080);
        term147060 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 248);
        Object term147061 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term147062 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term147062, term147062.getClass(), "_value", "nullnull");
        setField(term147062, term147062.getClass(), "_quotedUTF8Ref", null);
        setField(term147062, term147062.getClass(), "_unquotedUTF8Ref", null);
        setField(term147062, term147062.getClass(), "_quotedChars", null);
        setField(term147062, term147062.getClass(), "_jdkSerializeValue", null);
        setField(term147061, term147061.getClass(), "_name", term147062);
        setField(term147061, term147061.getClass(), "_wrapperName", null);
        setField(term147061, term147061.getClass(), "_declaredType", null);
        setField(term147061, term147061.getClass(), "_cfgSerializationType", null);
        setField(term147061, term147061.getClass(), "_nonTrivialBaseType", null);
        setField(term147061, term147061.getClass(), "_contextAnnotations", null);
        setField(term147061, term147061.getClass(), "_member", null);
        setField(term147061, term147061.getClass(), "_accessorMethod", null);
        setField(term147061, term147061.getClass(), "_field", null);
        setField(term147061, term147061.getClass(), "_serializer", null);
        setField(term147061, term147061.getClass(), "_nullSerializer", null);
        setField(term147061, term147061.getClass(), "_typeSerializer", null);
        setField(term147061, term147061.getClass(), "_dynamicSerializers", null);
        setBooleanField(term147061, term147061.getClass(), "_suppressNulls", false);
        setField(term147061, term147061.getClass(), "_suppressableValue", null);
        setField(term147061, term147061.getClass(), "_includeInViews", null);
        setField(term147061, term147061.getClass(), "_internalSettings", null);
        setField(term147061, term147061.getClass(), "_metadata", null);
        setField(term147061, term147061.getClass(), "_format", null);
        setElement(term147060, 58, term147061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term145744;
        args[1] = term146386;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term145744, term147078));
        assertTrue(recursiveEquals(term146386, term147079));
        assertTrue(recursiveEquals(retValue, term147060));
    }

};


