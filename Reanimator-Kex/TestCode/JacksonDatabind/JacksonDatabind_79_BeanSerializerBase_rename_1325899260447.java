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

public class BeanSerializerBase_rename_1325899260447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246287;
     Object term246813;
     Object term247552;
     Object term247553;
     Object term247536;

    public BeanSerializerBase_rename_1325899260447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246287 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 20);
        Object term246565 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term246663 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term246663, term246663.getClass(), "_value", "");
        setField(term246565, term246565.getClass(), "_name", term246663);
        setElement(term246287, 2, term246565);
        term246813 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term246813, term246813.getClass(), "val$suffix", null);
        term247552 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term247552, term247552.getClass(), "val$suffix", null);
        term247553 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 20);
        Object term247554 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term247555 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term247555, term247555.getClass(), "_value", "");
        setField(term247555, term247555.getClass(), "_quotedUTF8Ref", null);
        setField(term247555, term247555.getClass(), "_unquotedUTF8Ref", null);
        setField(term247555, term247555.getClass(), "_quotedChars", null);
        setField(term247555, term247555.getClass(), "_jdkSerializeValue", null);
        setField(term247554, term247554.getClass(), "_name", term247555);
        setField(term247554, term247554.getClass(), "_wrapperName", null);
        setField(term247554, term247554.getClass(), "_declaredType", null);
        setField(term247554, term247554.getClass(), "_cfgSerializationType", null);
        setField(term247554, term247554.getClass(), "_nonTrivialBaseType", null);
        setField(term247554, term247554.getClass(), "_contextAnnotations", null);
        setField(term247554, term247554.getClass(), "_member", null);
        setField(term247554, term247554.getClass(), "_accessorMethod", null);
        setField(term247554, term247554.getClass(), "_field", null);
        setField(term247554, term247554.getClass(), "_serializer", null);
        setField(term247554, term247554.getClass(), "_nullSerializer", null);
        setField(term247554, term247554.getClass(), "_typeSerializer", null);
        setField(term247554, term247554.getClass(), "_dynamicSerializers", null);
        setBooleanField(term247554, term247554.getClass(), "_suppressNulls", false);
        setField(term247554, term247554.getClass(), "_suppressableValue", null);
        setField(term247554, term247554.getClass(), "_includeInViews", null);
        setField(term247554, term247554.getClass(), "_internalSettings", null);
        setField(term247554, term247554.getClass(), "_metadata", null);
        setField(term247554, term247554.getClass(), "_format", null);
        setElement(term247553, 2, term247554);
        term247536 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 20);
        Object term247537 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term247538 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term247538, term247538.getClass(), "_value", "null");
        setField(term247538, term247538.getClass(), "_quotedUTF8Ref", null);
        setField(term247538, term247538.getClass(), "_unquotedUTF8Ref", null);
        setField(term247538, term247538.getClass(), "_quotedChars", null);
        setField(term247538, term247538.getClass(), "_jdkSerializeValue", null);
        setField(term247537, term247537.getClass(), "_name", term247538);
        setField(term247537, term247537.getClass(), "_wrapperName", null);
        setField(term247537, term247537.getClass(), "_declaredType", null);
        setField(term247537, term247537.getClass(), "_cfgSerializationType", null);
        setField(term247537, term247537.getClass(), "_nonTrivialBaseType", null);
        setField(term247537, term247537.getClass(), "_contextAnnotations", null);
        setField(term247537, term247537.getClass(), "_member", null);
        setField(term247537, term247537.getClass(), "_accessorMethod", null);
        setField(term247537, term247537.getClass(), "_field", null);
        setField(term247537, term247537.getClass(), "_serializer", null);
        setField(term247537, term247537.getClass(), "_nullSerializer", null);
        setField(term247537, term247537.getClass(), "_typeSerializer", null);
        setField(term247537, term247537.getClass(), "_dynamicSerializers", null);
        setBooleanField(term247537, term247537.getClass(), "_suppressNulls", false);
        setField(term247537, term247537.getClass(), "_suppressableValue", null);
        setField(term247537, term247537.getClass(), "_includeInViews", null);
        setField(term247537, term247537.getClass(), "_internalSettings", null);
        setField(term247537, term247537.getClass(), "_metadata", null);
        setField(term247537, term247537.getClass(), "_format", null);
        setElement(term247536, 2, term247537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term246287;
        args[1] = term246813;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term246287, term247552));
        assertTrue(recursiveEquals(term246813, term247553));
        assertTrue(recursiveEquals(retValue, term247536));
    }

};


