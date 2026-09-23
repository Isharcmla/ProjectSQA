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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanSerializerBase_rename_1325899260371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156057;
     Object term158989;

    public BeanSerializerBase_rename_1325899260371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163566 = Class.forName((String) "java.lang.reflect.InaccessibleObjectException");
        Field term158739 = ((Class) term163566).getDeclaredField((String) "serialVersionUID");
        ((Field) term158739).setAccessible(false);
        term156057 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 196);
        Object term158551 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term158649 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term158877 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer"));
        Object[] term157370 = (Object[]) newArray("java.lang.Class", 0);
        setField(term158649, term158649.getClass(), "_value", "                                                                                                                                                                                                                                                                ");
        setField(term158551, term158551.getClass(), "_name", term158649);
        setField(term158551, term158551.getClass(), "_metadata", null);
        setField(term158551, term158551.getClass(), "_format", null);
        setField(term158551, term158551.getClass(), "_wrapperName", null);
        setField(term158551, term158551.getClass(), "_contextAnnotations", null);
        setField(term158551, term158551.getClass(), "_declaredType", null);
        setField(term158551, term158551.getClass(), "_member", null);
        setField(term158551, term158551.getClass(), "_accessorMethod", null);
        setField(term158551, term158551.getClass(), "_field", term158739);
        setField(term158551, term158551.getClass(), "_serializer", term158877);
        setField(term158551, term158551.getClass(), "_nullSerializer", null);
        setField(term158551, term158551.getClass(), "_internalSettings", null);
        setField(term158551, term158551.getClass(), "_cfgSerializationType", null);
        setField(term158551, term158551.getClass(), "_dynamicSerializers", null);
        setBooleanField(term158551, term158551.getClass(), "_suppressNulls", false);
        setField(term158551, term158551.getClass(), "_suppressableValue", null);
        setField(term158551, term158551.getClass(), "_includeInViews", term157370);
        setField(term158551, term158551.getClass(), "_typeSerializer", null);
        setField(term158551, term158551.getClass(), "_nonTrivialBaseType", null);
        setElement(term156057, 58, term158551);
        term158989 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term158989, term158989.getClass(), "val$prefix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term156057;
        args[1] = term158989;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


