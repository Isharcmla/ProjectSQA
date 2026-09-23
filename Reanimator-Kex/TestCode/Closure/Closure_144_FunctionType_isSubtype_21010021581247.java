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

public class FunctionType_isSubtype_21010021581247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709178;
     Object term1709830;

    public FunctionType_isSubtype_21010021581247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1713023 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1713022 = ((Class) term1713023).getDeclaredField((String) "INTERFACE");
        ((Field) term1713022).setAccessible(true);
        Object enum3055 = ((Field) term1713022).get((Object) null);
        term1709178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1709722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1709178, term1709178.getClass(), "kind", enum3055);
        setField(term1709722, term1709722.getClass(), "kind", enum3055);
        setField(term1709722, term1709722.getClass(), "typeOfThis", null);
        setField(term1709178, term1709178.getClass(), "typeOfThis", term1709722);
        term1709830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1710160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1710254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1709830, term1709830.getClass(), "kind", enum3055);
        setField(term1710160, term1710160.getClass(), "kind", enum3055);
        setField(term1710160, term1710160.getClass(), "typeOfThis", term1710254);
        setField(term1709830, term1709830.getClass(), "typeOfThis", term1710160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1709830;
        try {
            callMethod(klass, "isSubtype", argTypes, term1709178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


