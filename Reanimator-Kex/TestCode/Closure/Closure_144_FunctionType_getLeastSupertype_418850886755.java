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

public class FunctionType_getLeastSupertype_418850886755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834307;
     Object term835063;

    public FunctionType_getLeastSupertype_418850886755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term836198 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term836197 = ((Class) term836198).getDeclaredField((String) "INTERFACE");
        ((Field) term836197).setAccessible(true);
        Object enum1507 = ((Field) term836197).get((Object) null);
        term834307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term834861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term834953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term834307, term834307.getClass(), "kind", enum1507);
        setField(term834861, term834861.getClass(), "kind", enum1507);
        setField(term834861, term834861.getClass(), "typeOfThis", term834953);
        setField(term834307, term834307.getClass(), "typeOfThis", term834861);
        Class<? extends Object> term836492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term836491 = ((Class) term836492).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term836491).setAccessible(true);
        Object enum1508 = ((Field) term836491).get((Object) null);
        term835063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term835237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term835063, term835063.getClass(), "kind", enum1508);
        setField(term835237, term835237.getClass(), "kind", enum1508);
        setField(term835237, term835237.getClass(), "typeOfThis", null);
        setField(term835063, term835063.getClass(), "typeOfThis", term835237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term835063;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term834307, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


