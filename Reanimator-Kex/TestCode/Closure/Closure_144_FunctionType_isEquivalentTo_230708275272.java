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

public class FunctionType_isEquivalentTo_230708275272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159453;
     Object term160007;

    public FunctionType_isEquivalentTo_230708275272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term162500 = ((Class) term162501).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term162500).setAccessible(true);
        Object enum315 = ((Field) term162500).get((Object) null);
        term159453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term159453, term159453.getClass(), "kind", enum315);
        Class<? extends Object> term162801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term162800 = ((Class) term162801).getDeclaredField((String) "INTERFACE");
        ((Field) term162800).setAccessible(true);
        Object enum316 = ((Field) term162800).get((Object) null);
        term160007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term160007, term160007.getClass(), "kind", enum316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term160007;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term159453, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


