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

public class FunctionType_getGreatestSubtype_679591709789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896942;
     Object term897492;

    public FunctionType_getGreatestSubtype_679591709789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term898397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term898396 = ((Class) term898397).getDeclaredField((String) "ORDINARY");
        ((Field) term898396).setAccessible(true);
        Object enum1624 = ((Field) term898396).get((Object) null);
        term896942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term897200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term897288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term897382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term896942, term896942.getClass(), "kind", enum1624);
        setField(term897200, term897200.getClass(), "kind", enum1624);
        setField(term897200, term897200.getClass(), "typeOfThis", term897288);
        setField(term896942, term896942.getClass(), "typeOfThis", term897200);
        setField(term896942, term896942.getClass(), "call", term897382);
        term897492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term897666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term897492, term897492.getClass(), "kind", enum1624);
        setField(term897666, term897666.getClass(), "kind", enum1624);
        setField(term897666, term897666.getClass(), "typeOfThis", null);
        setField(term897492, term897492.getClass(), "typeOfThis", term897666);
        setField(term897492, term897492.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term897492;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term896942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


