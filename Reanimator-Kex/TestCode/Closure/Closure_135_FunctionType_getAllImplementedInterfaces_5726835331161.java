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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_5726835331161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1391197;

    public FunctionType_getAllImplementedInterfaces_5726835331161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1393707 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1393706 = ((Class) term1393707).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1393706).setAccessible(true);
        Object enum2602 = ((Field) term1393706).get((Object) null);
        Object term1391741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        ArrayList term1391623 = new ArrayList();
        ((ArrayList) term1391623).add(term1391741);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        ((ArrayList) term1391623).add((Object)null);
        term1391197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1391463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1391571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1391197, term1391197.getClass(), "kind", enum2602);
        setField(term1391463, term1391463.getClass(), "implicitPrototype", term1391571);
        setField(term1391197, term1391197.getClass(), "prototype", term1391463);
        setField(term1391197, term1391197.getClass(), "implementedInterfaces", term1391623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term1391197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


