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

public class FunctionType_isSubtype_21010021581242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1700764;
     Object term1701222;

    public FunctionType_isSubtype_21010021581242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1704256 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1704255 = ((Class) term1704256).getDeclaredField((String) "ORDINARY");
        ((Field) term1704255).setAccessible(true);
        Object enum3039 = ((Field) term1704255).get((Object) null);
        term1700764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1701424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1701114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1700764, term1700764.getClass(), "kind", enum3039);
        setField(term1701424, term1701424.getClass(), "kind", enum3039);
        setField(term1701424, term1701424.getClass(), "typeOfThis", null);
        setField(term1700764, term1700764.getClass(), "typeOfThis", term1701424);
        setField(term1700764, term1700764.getClass(), "call", term1701114);
        Class<? extends Object> term1704547 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1704546 = ((Class) term1704547).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1704546).setAccessible(true);
        Object enum3040 = ((Field) term1704546).get((Object) null);
        term1701222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1701222, term1701222.getClass(), "kind", enum3040);
        setField(term1701222, term1701222.getClass(), "typeOfThis", term1701424);
        setField(term1701222, term1701222.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1701222;
        try {
            callMethod(klass, "isSubtype", argTypes, term1700764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


