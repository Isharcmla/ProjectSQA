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

public class FunctionType_isSubtype_21010021581521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007250;
     Object term2007902;

    public FunctionType_isSubtype_21010021581521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2010634 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2010633 = ((Class) term2010634).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2010633).setAccessible(true);
        Object enum3743 = ((Field) term2010633).get((Object) null);
        term2007250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2007794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2007250, term2007250.getClass(), "kind", enum3743);
        setField(term2007250, term2007250.getClass(), "typeOfThis", term2007794);
        Class<? extends Object> term2010934 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2010933 = ((Class) term2010934).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2010933).setAccessible(true);
        Object enum3744 = ((Field) term2010933).get((Object) null);
        term2007902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2008086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2007902, term2007902.getClass(), "kind", enum3744);
        setField(term2007902, term2007902.getClass(), "typeOfThis", term2008086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2007902;
        try {
            callMethod(klass, "isSubtype", argTypes, term2007250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


