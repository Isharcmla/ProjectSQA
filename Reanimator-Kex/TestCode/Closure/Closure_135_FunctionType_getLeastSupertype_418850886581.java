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

public class FunctionType_getLeastSupertype_418850886581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473477;
     Object term474239;

    public FunctionType_getLeastSupertype_418850886581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term475354 = ((Class) term475355).getDeclaredField((String) "ORDINARY");
        ((Field) term475354).setAccessible(true);
        Object enum877 = ((Field) term475354).get((Object) null);
        term473477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term474031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term474131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term473477, term473477.getClass(), "kind", enum877);
        setField(term474031, term474031.getClass(), "kind", enum877);
        setField(term474031, term474031.getClass(), "typeOfThis", term474131);
        setField(term473477, term473477.getClass(), "typeOfThis", term474031);
        Class<? extends Object> term475646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term475645 = ((Class) term475646).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term475645).setAccessible(true);
        Object enum878 = ((Field) term475645).get((Object) null);
        term474239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term474413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term474239, term474239.getClass(), "kind", enum878);
        setField(term474413, term474413.getClass(), "kind", enum878);
        setField(term474413, term474413.getClass(), "typeOfThis", null);
        setField(term474239, term474239.getClass(), "typeOfThis", term474413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term474239;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term473477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


