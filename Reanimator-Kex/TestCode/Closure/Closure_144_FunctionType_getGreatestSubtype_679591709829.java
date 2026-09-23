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

public class FunctionType_getGreatestSubtype_679591709829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term965246;
     Object term965900;

    public FunctionType_getGreatestSubtype_679591709829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term967411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term967410 = ((Class) term967411).getDeclaredField((String) "INTERFACE");
        ((Field) term967410).setAccessible(true);
        Object enum1748 = ((Field) term967410).get((Object) null);
        Class<? extends Object> term967705 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term967704 = ((Class) term967705).getDeclaredField((String) "INTERFACE");
        ((Field) term967704).setAccessible(true);
        Object enum1749 = ((Field) term967704).get((Object) null);
        term965246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term965790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term965246, term965246.getClass(), "kind", enum1748);
        setField(term965790, term965790.getClass(), "kind", enum1749);
        setField(term965246, term965246.getClass(), "typeOfThis", term965790);
        Class<? extends Object> term967999 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term967998 = ((Class) term967999).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term967998).setAccessible(true);
        Object enum1750 = ((Field) term967998).get((Object) null);
        term965900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term966074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term965900, term965900.getClass(), "kind", enum1750);
        setField(term966074, term966074.getClass(), "kind", enum1750);
        setField(term965900, term965900.getClass(), "typeOfThis", term966074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term965900;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term965246, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


