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

public class FunctionType_getGreatestSubtype_679591709493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419996;
     Object term420472;

    public FunctionType_getGreatestSubtype_679591709493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term422119 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term422118 = ((Class) term422119).getDeclaredField((String) "ORDINARY");
        ((Field) term422118).setAccessible(true);
        Object enum764 = ((Field) term422118).get((Object) null);
        term419996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term420254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term420362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term419996, term419996.getClass(), "kind", enum764);
        setField(term420254, term420254.getClass(), "kind", enum764);
        setField(term420254, term420254.getClass(), "typeOfThis", term420362);
        setField(term419996, term419996.getClass(), "typeOfThis", term420254);
        Class<? extends Object> term422410 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term422409 = ((Class) term422410).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term422409).setAccessible(true);
        Object enum765 = ((Field) term422409).get((Object) null);
        term420472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term420720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term420472, term420472.getClass(), "kind", enum765);
        setField(term420720, term420720.getClass(), "kind", enum764);
        setField(term420720, term420720.getClass(), "typeOfThis", null);
        setField(term420472, term420472.getClass(), "typeOfThis", term420720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term420472;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term419996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


