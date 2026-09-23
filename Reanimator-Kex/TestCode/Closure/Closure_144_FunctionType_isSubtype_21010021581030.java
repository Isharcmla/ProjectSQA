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

public class FunctionType_isSubtype_21010021581030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317908;
     Object term1318568;

    public FunctionType_isSubtype_21010021581030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1321659 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1321658 = ((Class) term1321659).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1321658).setAccessible(true);
        Object enum2366 = ((Field) term1321658).get((Object) null);
        Class<? extends Object> term1321959 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1321958 = ((Class) term1321959).getDeclaredField((String) "INTERFACE");
        ((Field) term1321958).setAccessible(true);
        Object enum2367 = ((Field) term1321958).get((Object) null);
        term1317908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1318460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1317908, term1317908.getClass(), "kind", enum2366);
        setField(term1318460, term1318460.getClass(), "kind", enum2367);
        setField(term1317908, term1317908.getClass(), "typeOfThis", term1318460);
        Class<? extends Object> term1322253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1322252 = ((Class) term1322253).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1322252).setAccessible(true);
        Object enum2368 = ((Field) term1322252).get((Object) null);
        term1318568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1318750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1318568, term1318568.getClass(), "kind", enum2368);
        setField(term1318568, term1318568.getClass(), "typeOfThis", term1318750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1318568;
        try {
            callMethod(klass, "isSubtype", argTypes, term1317908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


