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

public class FunctionType_getLeastSupertype_418850886718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666028;
     Object term666590;

    public FunctionType_getLeastSupertype_418850886718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term669167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term669166 = ((Class) term669167).getDeclaredField((String) "ORDINARY");
        ((Field) term669166).setAccessible(true);
        Object enum1238 = ((Field) term669166).get((Object) null);
        term666028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term666286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term666378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term666482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term666028, term666028.getClass(), "kind", enum1238);
        setField(term666286, term666286.getClass(), "kind", enum1238);
        setField(term666286, term666286.getClass(), "typeOfThis", term666378);
        setField(term666028, term666028.getClass(), "typeOfThis", term666286);
        setField(term666028, term666028.getClass(), "registry", term666482);
        Class<? extends Object> term669458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term669457 = ((Class) term669458).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term669457).setAccessible(true);
        Object enum1239 = ((Field) term669457).get((Object) null);
        term666590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term666838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term666590, term666590.getClass(), "kind", enum1239);
        setField(term666838, term666838.getClass(), "kind", enum1239);
        setField(term666838, term666838.getClass(), "typeOfThis", null);
        setField(term666590, term666590.getClass(), "typeOfThis", term666838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term666590;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term666028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


