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

public class FunctionType_getGreatestSubtype_679591709609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589437;
     Object term589313;

    public FunctionType_getGreatestSubtype_679591709609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term590602 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term590601 = ((Class) term590602).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term590601).setAccessible(true);
        Object enum1070 = ((Field) term590601).get((Object) null);
        Class<? extends Object> term590902 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term590901 = ((Class) term590902).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term590901).setAccessible(true);
        Object enum1071 = ((Field) term590901).get((Object) null);
        term589437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term589629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term589437, term589437.getClass(), "kind", enum1070);
        setField(term589629, term589629.getClass(), "kind", enum1071);
        setField(term589437, term589437.getClass(), "typeOfThis", term589629);
        term589313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term589313, term589313.getClass(), "kind", enum1071);
        setField(term589313, term589313.getClass(), "typeOfThis", term589437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term589313;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term589437, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


