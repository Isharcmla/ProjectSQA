package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getLeastSupertype_418850886271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160054;
     Object term160608;

    public FunctionType_getLeastSupertype_418850886271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term161601 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term161600 = ((Class) term161601).getDeclaredField((String) "ORDINARY");
        ((Field) term161600).setAccessible(true);
        Object enum301 = ((Field) term161600).get((Object) null);
        term160054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term160054, term160054.getClass(), "kind", enum301);
        Class<? extends Object> term161892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term161891 = ((Class) term161892).getDeclaredField((String) "INTERFACE");
        ((Field) term161891).setAccessible(true);
        Object enum302 = ((Field) term161891).get((Object) null);
        term160608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term160608, term160608.getClass(), "kind", enum302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term160608;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term160054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


