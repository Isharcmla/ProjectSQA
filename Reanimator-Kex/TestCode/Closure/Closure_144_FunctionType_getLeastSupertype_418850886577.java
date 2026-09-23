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

public class FunctionType_getLeastSupertype_418850886577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540875;
     Object term541353;

    public FunctionType_getLeastSupertype_418850886577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term542732 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term542731 = ((Class) term542732).getDeclaredField((String) "ORDINARY");
        ((Field) term542731).setAccessible(true);
        Object enum986 = ((Field) term542731).get((Object) null);
        term540875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term541133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term541243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term540875, term540875.getClass(), "kind", enum986);
        setField(term541133, term541133.getClass(), "kind", enum986);
        setField(term541133, term541133.getClass(), "typeOfThis", term541243);
        setField(term540875, term540875.getClass(), "typeOfThis", term541133);
        Class<? extends Object> term543023 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term543022 = ((Class) term543023).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term543022).setAccessible(true);
        Object enum987 = ((Field) term543022).get((Object) null);
        term541353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term541601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term541353, term541353.getClass(), "kind", enum987);
        setField(term541601, term541601.getClass(), "kind", enum986);
        setField(term541601, term541601.getClass(), "typeOfThis", null);
        setField(term541353, term541353.getClass(), "typeOfThis", term541601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term541353;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term540875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


