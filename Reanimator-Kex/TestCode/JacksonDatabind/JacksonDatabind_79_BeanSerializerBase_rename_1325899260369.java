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

public class BeanSerializerBase_rename_1325899260369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150810;
     Object term154734;

    public BeanSerializerBase_rename_1325899260369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155833 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$1");
        Field term154622 = ((Class) term155833).getDeclaredField((String) "$SwitchMap$sun$invoke$util$Wrapper");
        ((Field) term154622).setAccessible(false);
        term150810 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 167);
        Object term154434 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term154532 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term154532, term154532.getClass(), "_value", "");
        setField(term154434, term154434.getClass(), "_name", term154532);
        setField(term154434, term154434.getClass(), "_metadata", null);
        setField(term154434, term154434.getClass(), "_format", null);
        setField(term154434, term154434.getClass(), "_wrapperName", null);
        setField(term154434, term154434.getClass(), "_contextAnnotations", null);
        setField(term154434, term154434.getClass(), "_declaredType", null);
        setField(term154434, term154434.getClass(), "_member", null);
        setField(term154434, term154434.getClass(), "_accessorMethod", null);
        setField(term154434, term154434.getClass(), "_field", term154622);
        setField(term154434, term154434.getClass(), "_serializer", null);
        setField(term154434, term154434.getClass(), "_nullSerializer", null);
        setField(term154434, term154434.getClass(), "_internalSettings", null);
        setField(term154434, term154434.getClass(), "_cfgSerializationType", null);
        setField(term154434, term154434.getClass(), "_dynamicSerializers", null);
        setBooleanField(term154434, term154434.getClass(), "_suppressNulls", false);
        setField(term154434, term154434.getClass(), "_suppressableValue", null);
        setField(term154434, term154434.getClass(), "_includeInViews", null);
        setField(term154434, term154434.getClass(), "_typeSerializer", null);
        setField(term154434, term154434.getClass(), "_nonTrivialBaseType", null);
        setElement(term150810, 58, term154434);
        term154734 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term154734, term154734.getClass(), "val$prefix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term150810;
        args[1] = term154734;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


