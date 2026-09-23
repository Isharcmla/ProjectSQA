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

public class FunctionType_getLeastSupertype_418850886736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692251;
     Object term693019;

    public FunctionType_getLeastSupertype_418850886736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term695804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term695803 = ((Class) term695804).getDeclaredField((String) "INTERFACE");
        ((Field) term695803).setAccessible(true);
        Object enum1289 = ((Field) term695803).get((Object) null);
        term692251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term692805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term692911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term692251, term692251.getClass(), "kind", enum1289);
        setField(term692805, term692805.getClass(), "kind", enum1289);
        setField(term692805, term692805.getClass(), "typeOfThis", term692911);
        setField(term692251, term692251.getClass(), "typeOfThis", term692805);
        Class<? extends Object> term696098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term696097 = ((Class) term696098).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term696097).setAccessible(true);
        Object enum1290 = ((Field) term696097).get((Object) null);
        term693019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term693193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term693019, term693019.getClass(), "kind", enum1290);
        setField(term693193, term693193.getClass(), "kind", enum1290);
        setField(term693193, term693193.getClass(), "typeOfThis", null);
        setField(term693019, term693019.getClass(), "typeOfThis", term693193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term693019;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term692251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


