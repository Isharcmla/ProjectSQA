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

public class FunctionType_isSubtype_21010021581087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1422660;
     Object term1423118;

    public FunctionType_isSubtype_21010021581087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1424138 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1424137 = ((Class) term1424138).getDeclaredField((String) "ORDINARY");
        ((Field) term1424137).setAccessible(true);
        Object enum2552 = ((Field) term1424137).get((Object) null);
        term1422660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1422908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1423008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1422660, term1422660.getClass(), "kind", enum2552);
        setField(term1422908, term1422908.getClass(), "kind", enum2552);
        setField(term1422908, term1422908.getClass(), "typeOfThis", term1423008);
        setField(term1422660, term1422660.getClass(), "typeOfThis", term1422908);
        term1423118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1423302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1423118, term1423118.getClass(), "kind", enum2552);
        setField(term1423302, term1423302.getClass(), "kind", enum2552);
        setField(term1423302, term1423302.getClass(), "typeOfThis", null);
        setField(term1423118, term1423118.getClass(), "typeOfThis", term1423302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1423118;
        try {
            callMethod(klass, "isSubtype", argTypes, term1422660, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


