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

public class FunctionType_getGreatestSubtype_6795917091243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538310;
     Object term1539080;

    public FunctionType_getGreatestSubtype_6795917091243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1540435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1540434 = ((Class) term1540435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1540434).setAccessible(true);
        Object enum2873 = ((Field) term1540434).get((Object) null);
        term1538310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1538862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1538972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1538310, term1538310.getClass(), "kind", enum2873);
        setField(term1538862, term1538862.getClass(), "kind", enum2873);
        setField(term1538862, term1538862.getClass(), "typeOfThis", term1538972);
        setField(term1538310, term1538310.getClass(), "typeOfThis", term1538862);
        Class<? extends Object> term1540735 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1540734 = ((Class) term1540735).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1540734).setAccessible(true);
        Object enum2874 = ((Field) term1540734).get((Object) null);
        term1539080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1539264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1539080, term1539080.getClass(), "kind", enum2874);
        setField(term1539264, term1539264.getClass(), "kind", enum2873);
        setField(term1539264, term1539264.getClass(), "typeOfThis", null);
        setField(term1539080, term1539080.getClass(), "typeOfThis", term1539264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1539080;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1538310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


