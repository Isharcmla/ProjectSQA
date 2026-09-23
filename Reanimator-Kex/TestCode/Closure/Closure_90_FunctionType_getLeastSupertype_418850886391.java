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

public class FunctionType_getLeastSupertype_418850886391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291973;
     Object term291849;

    public FunctionType_getLeastSupertype_418850886391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term293139 = ((Class) term293140).getDeclaredField((String) "ORDINARY");
        ((Field) term293139).setAccessible(true);
        Object enum507 = ((Field) term293139).get((Object) null);
        Class<? extends Object> term293431 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term293430 = ((Class) term293431).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term293430).setAccessible(true);
        Object enum508 = ((Field) term293430).get((Object) null);
        term291973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term292165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term291973, term291973.getClass(), "kind", enum507);
        setField(term292165, term292165.getClass(), "kind", enum508);
        setField(term291973, term291973.getClass(), "typeOfThis", term292165);
        term291849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term291849, term291849.getClass(), "kind", enum508);
        setField(term291849, term291849.getClass(), "typeOfThis", term291973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term291849;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term291973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


