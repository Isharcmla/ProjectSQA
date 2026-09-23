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

public class BeanSerializerBase_rename_1325899260377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167207;
     Object term167969;
     Object term169213;
     Object term169214;
     Object term169195;

    public BeanSerializerBase_rename_1325899260377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167207 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 254);
        Object term167759 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term167857 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term167759, term167759.getClass(), "_name", term167857);
        setElement(term167207, 82, term167759);
        term167969 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term169213 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term169213, term169213.getClass(), "val$prefix", null);
        term169214 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 254);
        Object term169215 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term169216 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term169216, term169216.getClass(), "_value", null);
        setField(term169216, term169216.getClass(), "_quotedUTF8Ref", null);
        setField(term169216, term169216.getClass(), "_unquotedUTF8Ref", null);
        setField(term169216, term169216.getClass(), "_quotedChars", null);
        setField(term169216, term169216.getClass(), "_jdkSerializeValue", null);
        setField(term169215, term169215.getClass(), "_name", term169216);
        setField(term169215, term169215.getClass(), "_wrapperName", null);
        setField(term169215, term169215.getClass(), "_declaredType", null);
        setField(term169215, term169215.getClass(), "_cfgSerializationType", null);
        setField(term169215, term169215.getClass(), "_nonTrivialBaseType", null);
        setField(term169215, term169215.getClass(), "_contextAnnotations", null);
        setField(term169215, term169215.getClass(), "_member", null);
        setField(term169215, term169215.getClass(), "_accessorMethod", null);
        setField(term169215, term169215.getClass(), "_field", null);
        setField(term169215, term169215.getClass(), "_serializer", null);
        setField(term169215, term169215.getClass(), "_nullSerializer", null);
        setField(term169215, term169215.getClass(), "_typeSerializer", null);
        setField(term169215, term169215.getClass(), "_dynamicSerializers", null);
        setBooleanField(term169215, term169215.getClass(), "_suppressNulls", false);
        setField(term169215, term169215.getClass(), "_suppressableValue", null);
        setField(term169215, term169215.getClass(), "_includeInViews", null);
        setField(term169215, term169215.getClass(), "_internalSettings", null);
        setField(term169215, term169215.getClass(), "_metadata", null);
        setField(term169215, term169215.getClass(), "_format", null);
        setElement(term169214, 82, term169215);
        term169195 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 254);
        Object term169196 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term169197 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term169197, term169197.getClass(), "_value", "nullnull");
        setField(term169197, term169197.getClass(), "_quotedUTF8Ref", null);
        setField(term169197, term169197.getClass(), "_unquotedUTF8Ref", null);
        setField(term169197, term169197.getClass(), "_quotedChars", null);
        setField(term169197, term169197.getClass(), "_jdkSerializeValue", null);
        setField(term169196, term169196.getClass(), "_name", term169197);
        setField(term169196, term169196.getClass(), "_wrapperName", null);
        setField(term169196, term169196.getClass(), "_declaredType", null);
        setField(term169196, term169196.getClass(), "_cfgSerializationType", null);
        setField(term169196, term169196.getClass(), "_nonTrivialBaseType", null);
        setField(term169196, term169196.getClass(), "_contextAnnotations", null);
        setField(term169196, term169196.getClass(), "_member", null);
        setField(term169196, term169196.getClass(), "_accessorMethod", null);
        setField(term169196, term169196.getClass(), "_field", null);
        setField(term169196, term169196.getClass(), "_serializer", null);
        setField(term169196, term169196.getClass(), "_nullSerializer", null);
        setField(term169196, term169196.getClass(), "_typeSerializer", null);
        setField(term169196, term169196.getClass(), "_dynamicSerializers", null);
        setBooleanField(term169196, term169196.getClass(), "_suppressNulls", false);
        setField(term169196, term169196.getClass(), "_suppressableValue", null);
        setField(term169196, term169196.getClass(), "_includeInViews", null);
        setField(term169196, term169196.getClass(), "_internalSettings", null);
        setField(term169196, term169196.getClass(), "_metadata", null);
        setField(term169196, term169196.getClass(), "_format", null);
        setElement(term169195, 82, term169196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term167207;
        args[1] = term167969;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term167207, term169213));
        assertTrue(recursiveEquals(term167969, term169214));
        assertTrue(recursiveEquals(retValue, term169195));
    }

};


