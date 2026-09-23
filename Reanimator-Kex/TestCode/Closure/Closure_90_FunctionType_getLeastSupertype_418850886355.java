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

public class FunctionType_getLeastSupertype_418850886355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248938;
     Object term249400;

    public FunctionType_getLeastSupertype_418850886355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250486 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term250485 = ((Class) term250486).getDeclaredField((String) "ORDINARY");
        ((Field) term250485).setAccessible(true);
        Object enum434 = ((Field) term250485).get((Object) null);
        term248938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term249186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term249290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term248938, term248938.getClass(), "kind", enum434);
        setField(term248938, term248938.getClass(), "typeOfThis", term249186);
        setField(term248938, term248938.getClass(), "registry", term249290);
        Class<? extends Object> term250777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term250776 = ((Class) term250777).getDeclaredField((String) "INTERFACE");
        ((Field) term250776).setAccessible(true);
        Object enum435 = ((Field) term250776).get((Object) null);
        term249400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term249400, term249400.getClass(), "kind", enum435);
        setField(term249400, term249400.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term249400;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term248938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


