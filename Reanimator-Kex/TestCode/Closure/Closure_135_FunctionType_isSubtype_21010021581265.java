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

public class FunctionType_isSubtype_21010021581265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1573366;
     Object term1574026;

    public FunctionType_isSubtype_21010021581265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1575060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1575059 = ((Class) term1575060).getDeclaredField((String) "ORDINARY");
        ((Field) term1575059).setAccessible(true);
        Object enum2938 = ((Field) term1575059).get((Object) null);
        term1573366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1573918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1573366, term1573366.getClass(), "kind", enum2938);
        setField(term1573366, term1573366.getClass(), "typeOfThis", term1573918);
        term1574026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1574346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term1574026, term1574026.getClass(), "kind", enum2938);
        setField(term1574026, term1574026.getClass(), "typeOfThis", term1574346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1574026;
        try {
            callMethod(klass, "isSubtype", argTypes, term1573366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


