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

public class FunctionType_getGreatestSubtype_679591709363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217154;
     Object term217514;

    public FunctionType_getGreatestSubtype_679591709363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term218582 = ((Class) term218583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term218582).setAccessible(true);
        Object enum394 = ((Field) term218582).get((Object) null);
        term217154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term217406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term217154, term217154.getClass(), "kind", enum394);
        setField(term217154, term217154.getClass(), "registry", term217406);
        Class<? extends Object> term218883 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term218882 = ((Class) term218883).getDeclaredField((String) "ORDINARY");
        ((Field) term218882).setAccessible(true);
        Object enum395 = ((Field) term218882).get((Object) null);
        term217514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term217514, term217514.getClass(), "kind", enum395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term217514;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term217154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


