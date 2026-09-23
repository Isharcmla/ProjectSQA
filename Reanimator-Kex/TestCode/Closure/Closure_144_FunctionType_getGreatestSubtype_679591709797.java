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

public class FunctionType_getGreatestSubtype_679591709797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906137;
     Object term907009;

    public FunctionType_getGreatestSubtype_679591709797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term908565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term908564 = ((Class) term908565).getDeclaredField((String) "INTERFACE");
        ((Field) term908564).setAccessible(true);
        Object enum1642 = ((Field) term908564).get((Object) null);
        Class<? extends Object> term908859 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term908858 = ((Class) term908859).getDeclaredField((String) "INTERFACE");
        ((Field) term908858).setAccessible(true);
        Object enum1643 = ((Field) term908858).get((Object) null);
        term906137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term906691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term907137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term907261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term906137, term906137.getClass(), "kind", enum1642);
        setField(term906691, term906691.getClass(), "kind", enum1642);
        setField(term907137, term907137.getClass(), "kind", enum1643);
        setField(term907137, term907137.getClass(), "typeOfThis", term907261);
        setField(term906691, term906691.getClass(), "typeOfThis", term907137);
        setField(term906137, term906137.getClass(), "typeOfThis", term906691);
        Class<? extends Object> term909153 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term909152 = ((Class) term909153).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term909152).setAccessible(true);
        Object enum1644 = ((Field) term909152).get((Object) null);
        term907009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term907009, term907009.getClass(), "kind", enum1644);
        setField(term907009, term907009.getClass(), "typeOfThis", term907137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term907009;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term906137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


