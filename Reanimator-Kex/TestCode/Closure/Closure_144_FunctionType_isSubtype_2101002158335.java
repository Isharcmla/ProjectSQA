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

public class FunctionType_isSubtype_2101002158335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231311;
     Object term231569;

    public FunctionType_isSubtype_2101002158335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233089 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term233088 = ((Class) term233089).getDeclaredField((String) "INTERFACE");
        ((Field) term233088).setAccessible(true);
        Object enum434 = ((Field) term233088).get((Object) null);
        term231311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term231311, term231311.getClass(), "kind", enum434);
        term231569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term231569, term231569.getClass(), "kind", enum434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term231569;
        try {
            callMethod(klass, "isSubtype", argTypes, term231311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


