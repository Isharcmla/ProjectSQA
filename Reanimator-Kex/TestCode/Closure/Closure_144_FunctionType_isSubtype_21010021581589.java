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

public class FunctionType_isSubtype_21010021581589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2331396;
     Object term2332058;

    public FunctionType_isSubtype_21010021581589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2334606 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2334605 = ((Class) term2334606).getDeclaredField((String) "ORDINARY");
        ((Field) term2334605).setAccessible(true);
        Object enum4165 = ((Field) term2334605).get((Object) null);
        term2331396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2331950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2331396, term2331396.getClass(), "kind", enum4165);
        setField(term2331396, term2331396.getClass(), "typeOfThis", term2331950);
        term2332058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2332388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2332058, term2332058.getClass(), "kind", enum4165);
        setField(term2332058, term2332058.getClass(), "typeOfThis", term2332388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2332058;
        try {
            callMethod(klass, "isSubtype", argTypes, term2331396, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


