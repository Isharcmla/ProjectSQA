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

public class FunctionType_getAllImplementedInterfaces_572683533807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811213;

    public FunctionType_getAllImplementedInterfaces_572683533807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term812449 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term812448 = ((Class) term812449).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term812448).setAccessible(true);
        Object enum1515 = ((Field) term812448).get((Object) null);
        Object term811739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term811777 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term811639 = new ArrayList();
        ((ArrayList) term811639).add(term811739);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add(term811777);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        ((ArrayList) term811639).add((Object)null);
        term811213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term811479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term811587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term811213, term811213.getClass(), "kind", enum1515);
        setField(term811479, term811479.getClass(), "implicitPrototype", term811587);
        setField(term811213, term811213.getClass(), "prototype", term811479);
        setField(term811213, term811213.getClass(), "implementedInterfaces", term811639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term811213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


