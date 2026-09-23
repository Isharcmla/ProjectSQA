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

public class FunctionType_getLeastSupertype_418850886844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866821;
     Object term867483;

    public FunctionType_getLeastSupertype_418850886844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term870137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term870136 = ((Class) term870137).getDeclaredField((String) "INTERFACE");
        ((Field) term870136).setAccessible(true);
        Object enum1620 = ((Field) term870136).get((Object) null);
        term866821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term867375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term866821, term866821.getClass(), "kind", enum1620);
        setField(term866821, term866821.getClass(), "typeOfThis", term867375);
        Class<? extends Object> term870431 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term870430 = ((Class) term870431).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term870430).setAccessible(true);
        Object enum1621 = ((Field) term870430).get((Object) null);
        term867483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term867657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term867483, term867483.getClass(), "kind", enum1621);
        setField(term867483, term867483.getClass(), "typeOfThis", term867657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term867483;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term866821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


