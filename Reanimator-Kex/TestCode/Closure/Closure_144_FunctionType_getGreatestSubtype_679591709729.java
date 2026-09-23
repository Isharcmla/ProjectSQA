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

public class FunctionType_getGreatestSubtype_679591709729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790003;
     Object term790471;

    public FunctionType_getGreatestSubtype_679591709729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term791858 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term791857 = ((Class) term791858).getDeclaredField((String) "ORDINARY");
        ((Field) term791857).setAccessible(true);
        Object enum1426 = ((Field) term791857).get((Object) null);
        term790003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term790261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term790361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term790003, term790003.getClass(), "kind", enum1426);
        setField(term790261, term790261.getClass(), "kind", enum1426);
        setField(term790261, term790261.getClass(), "typeOfThis", term790361);
        setField(term790003, term790003.getClass(), "typeOfThis", term790261);
        Class<? extends Object> term792149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term792148 = ((Class) term792149).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term792148).setAccessible(true);
        Object enum1427 = ((Field) term792148).get((Object) null);
        term790471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term790727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term790471, term790471.getClass(), "kind", enum1427);
        setField(term790727, term790727.getClass(), "kind", enum1426);
        setField(term790727, term790727.getClass(), "typeOfThis", null);
        setField(term790471, term790471.getClass(), "typeOfThis", term790727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term790471;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term790003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


