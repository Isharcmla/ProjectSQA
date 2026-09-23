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

public class FunctionType_getLeastSupertype_4188508861015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1149806;
     Object term1150468;

    public FunctionType_getLeastSupertype_4188508861015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1151575 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1151574 = ((Class) term1151575).getDeclaredField((String) "INTERFACE");
        ((Field) term1151574).setAccessible(true);
        Object enum2143 = ((Field) term1151574).get((Object) null);
        term1149806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1150360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1149806, term1149806.getClass(), "kind", enum2143);
        setField(term1149806, term1149806.getClass(), "typeOfThis", term1150360);
        Class<? extends Object> term1151869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1151868 = ((Class) term1151869).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1151868).setAccessible(true);
        Object enum2144 = ((Field) term1151868).get((Object) null);
        term1150468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1150630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1150468, term1150468.getClass(), "kind", enum2144);
        setField(term1150468, term1150468.getClass(), "typeOfThis", term1150630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1150468;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1149806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


