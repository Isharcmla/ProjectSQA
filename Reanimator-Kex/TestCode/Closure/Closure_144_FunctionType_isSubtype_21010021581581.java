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

public class FunctionType_isSubtype_21010021581581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2316642;
     Object term2317304;

    public FunctionType_isSubtype_21010021581581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2320187 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2320186 = ((Class) term2320187).getDeclaredField((String) "INTERFACE");
        ((Field) term2320186).setAccessible(true);
        Object enum4139 = ((Field) term2320186).get((Object) null);
        Class<? extends Object> term2320481 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2320480 = ((Class) term2320481).getDeclaredField((String) "INTERFACE");
        ((Field) term2320480).setAccessible(true);
        Object enum4140 = ((Field) term2320480).get((Object) null);
        term2316642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2317196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2316642, term2316642.getClass(), "kind", enum4139);
        setField(term2317196, term2317196.getClass(), "kind", enum4140);
        setField(term2316642, term2316642.getClass(), "typeOfThis", term2317196);
        term2317304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2317634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2317304, term2317304.getClass(), "kind", enum4139);
        setField(term2317634, term2317634.getClass(), "kind", enum4140);
        setField(term2317304, term2317304.getClass(), "typeOfThis", term2317634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2317304;
        try {
            callMethod(klass, "isSubtype", argTypes, term2316642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


