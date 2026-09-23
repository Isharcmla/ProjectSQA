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

public class FunctionType_getGreatestSubtype_6795917091507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980860;
     Object term1981520;

    public FunctionType_getGreatestSubtype_6795917091507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1982940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1982939 = ((Class) term1982940).getDeclaredField((String) "ORDINARY");
        ((Field) term1982939).setAccessible(true);
        Object enum3694 = ((Field) term1982939).get((Object) null);
        Class<? extends Object> term1983231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1983230 = ((Class) term1983231).getDeclaredField((String) "INTERFACE");
        ((Field) term1983230).setAccessible(true);
        Object enum3695 = ((Field) term1983230).get((Object) null);
        term1980860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1981412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1980860, term1980860.getClass(), "kind", enum3694);
        setField(term1981412, term1981412.getClass(), "kind", enum3695);
        setField(term1980860, term1980860.getClass(), "typeOfThis", term1981412);
        Class<? extends Object> term1983525 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1983524 = ((Class) term1983525).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1983524).setAccessible(true);
        Object enum3696 = ((Field) term1983524).get((Object) null);
        term1981520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1981694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1981520, term1981520.getClass(), "kind", enum3696);
        setField(term1981520, term1981520.getClass(), "typeOfThis", term1981694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1981520;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1980860, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


