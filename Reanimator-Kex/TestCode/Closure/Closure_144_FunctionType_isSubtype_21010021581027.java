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

public class FunctionType_isSubtype_21010021581027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313879;
     Object term1314325;

    public FunctionType_isSubtype_21010021581027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1316219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1316218 = ((Class) term1316219).getDeclaredField((String) "ORDINARY");
        ((Field) term1316218).setAccessible(true);
        Object enum2357 = ((Field) term1316218).get((Object) null);
        term1313879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1314127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1314215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1313879, term1313879.getClass(), "kind", enum2357);
        setField(term1314127, term1314127.getClass(), "kind", enum2357);
        setField(term1314127, term1314127.getClass(), "typeOfThis", term1314215);
        setField(term1314127, term1314127.getClass(), "call", null);
        setField(term1313879, term1313879.getClass(), "typeOfThis", term1314127);
        Class<? extends Object> term1316510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1316509 = ((Class) term1316510).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1316509).setAccessible(true);
        Object enum2358 = ((Field) term1316509).get((Object) null);
        term1314325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1314509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1314751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1314325, term1314325.getClass(), "kind", enum2357);
        setField(term1314509, term1314509.getClass(), "kind", enum2358);
        setField(term1314509, term1314509.getClass(), "typeOfThis", null);
        setField(term1314509, term1314509.getClass(), "call", term1314751);
        setField(term1314325, term1314325.getClass(), "typeOfThis", term1314509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1314325;
        try {
            callMethod(klass, "isSubtype", argTypes, term1313879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


