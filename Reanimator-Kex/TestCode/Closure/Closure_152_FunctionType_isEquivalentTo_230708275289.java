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

public class FunctionType_isEquivalentTo_230708275289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170812;
     Object term171178;

    public FunctionType_isEquivalentTo_230708275289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term172366 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172365 = ((Class) term172366).getDeclaredField((String) "ORDINARY");
        ((Field) term172365).setAccessible(true);
        Object enum310 = ((Field) term172365).get((Object) null);
        term170812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term171068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term170812, term170812.getClass(), "kind", enum310);
        setField(term170812, term170812.getClass(), "typeOfThis", term171068);
        Class<? extends Object> term172657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172656 = ((Class) term172657).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term172656).setAccessible(true);
        Object enum311 = ((Field) term172656).get((Object) null);
        term171178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term171434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term171178, term171178.getClass(), "kind", enum311);
        setField(term171178, term171178.getClass(), "typeOfThis", term171434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term171178;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term170812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


