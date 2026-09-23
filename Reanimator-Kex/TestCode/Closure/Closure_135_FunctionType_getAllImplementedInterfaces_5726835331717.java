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

public class FunctionType_getAllImplementedInterfaces_5726835331717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2336100;

    public FunctionType_getAllImplementedInterfaces_5726835331717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2338953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2338952 = ((Class) term2338953).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2338952).setAccessible(true);
        Object enum4369 = ((Field) term2338952).get((Object) null);
        Object term2336564 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term2336526 = new ArrayList();
        ((ArrayList) term2336526).add(term2336100);
        ((ArrayList) term2336526).add(term2336564);
        term2336100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2336366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term2336474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2336100, term2336100.getClass(), "kind", enum4369);
        setField(term2336366, term2336366.getClass(), "implicitPrototype", term2336474);
        setField(term2336100, term2336100.getClass(), "prototype", term2336366);
        setField(term2336100, term2336100.getClass(), "implementedInterfaces", term2336526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term2336100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


