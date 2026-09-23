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

public class BeanSerializerBase_rename_1325899260401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192009;
     Object term192375;
     Object term193584;
     Object term193585;
     Object term193566;

    public BeanSerializerBase_rename_1325899260401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192009 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 236);
        Object term192165 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term192263 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term192165, term192165.getClass(), "_name", term192263);
        setElement(term192009, 2, term192165);
        term192375 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term193584 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term193584, term193584.getClass(), "val$suffix", null);
        term193585 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 236);
        Object term193586 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term193587 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term193587, term193587.getClass(), "_value", null);
        setField(term193587, term193587.getClass(), "_quotedUTF8Ref", null);
        setField(term193587, term193587.getClass(), "_unquotedUTF8Ref", null);
        setField(term193587, term193587.getClass(), "_quotedChars", null);
        setField(term193587, term193587.getClass(), "_jdkSerializeValue", null);
        setField(term193586, term193586.getClass(), "_name", term193587);
        setField(term193586, term193586.getClass(), "_wrapperName", null);
        setField(term193586, term193586.getClass(), "_declaredType", null);
        setField(term193586, term193586.getClass(), "_cfgSerializationType", null);
        setField(term193586, term193586.getClass(), "_nonTrivialBaseType", null);
        setField(term193586, term193586.getClass(), "_contextAnnotations", null);
        setField(term193586, term193586.getClass(), "_member", null);
        setField(term193586, term193586.getClass(), "_accessorMethod", null);
        setField(term193586, term193586.getClass(), "_field", null);
        setField(term193586, term193586.getClass(), "_serializer", null);
        setField(term193586, term193586.getClass(), "_nullSerializer", null);
        setField(term193586, term193586.getClass(), "_typeSerializer", null);
        setField(term193586, term193586.getClass(), "_dynamicSerializers", null);
        setBooleanField(term193586, term193586.getClass(), "_suppressNulls", false);
        setField(term193586, term193586.getClass(), "_suppressableValue", null);
        setField(term193586, term193586.getClass(), "_includeInViews", null);
        setField(term193586, term193586.getClass(), "_internalSettings", null);
        setField(term193586, term193586.getClass(), "_metadata", null);
        setField(term193586, term193586.getClass(), "_format", null);
        setElement(term193585, 2, term193586);
        term193566 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 236);
        Object term193567 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term193568 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term193568, term193568.getClass(), "_value", "nullnull");
        setField(term193568, term193568.getClass(), "_quotedUTF8Ref", null);
        setField(term193568, term193568.getClass(), "_unquotedUTF8Ref", null);
        setField(term193568, term193568.getClass(), "_quotedChars", null);
        setField(term193568, term193568.getClass(), "_jdkSerializeValue", null);
        setField(term193567, term193567.getClass(), "_name", term193568);
        setField(term193567, term193567.getClass(), "_wrapperName", null);
        setField(term193567, term193567.getClass(), "_declaredType", null);
        setField(term193567, term193567.getClass(), "_cfgSerializationType", null);
        setField(term193567, term193567.getClass(), "_nonTrivialBaseType", null);
        setField(term193567, term193567.getClass(), "_contextAnnotations", null);
        setField(term193567, term193567.getClass(), "_member", null);
        setField(term193567, term193567.getClass(), "_accessorMethod", null);
        setField(term193567, term193567.getClass(), "_field", null);
        setField(term193567, term193567.getClass(), "_serializer", null);
        setField(term193567, term193567.getClass(), "_nullSerializer", null);
        setField(term193567, term193567.getClass(), "_typeSerializer", null);
        setField(term193567, term193567.getClass(), "_dynamicSerializers", null);
        setBooleanField(term193567, term193567.getClass(), "_suppressNulls", false);
        setField(term193567, term193567.getClass(), "_suppressableValue", null);
        setField(term193567, term193567.getClass(), "_includeInViews", null);
        setField(term193567, term193567.getClass(), "_internalSettings", null);
        setField(term193567, term193567.getClass(), "_metadata", null);
        setField(term193567, term193567.getClass(), "_format", null);
        setElement(term193566, 2, term193567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term192009;
        args[1] = term192375;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term192009, term193584));
        assertTrue(recursiveEquals(term192375, term193585));
        assertTrue(recursiveEquals(retValue, term193566));
    }

};


