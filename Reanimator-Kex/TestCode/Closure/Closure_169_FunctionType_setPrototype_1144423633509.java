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

public class FunctionType_setPrototype_1144423633509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474613;
     Object term474917;

    public FunctionType_setPrototype_1144423633509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475765 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term475764 = ((Class) term475765).getDeclaredField((String) "INTERFACE");
        ((Field) term475764).setAccessible(true);
        Object enum776 = ((Field) term475764).get((Object) null);
        ArrayList term474813 = new ArrayList();
        ((ArrayList) term474813).add((Object)null);
        term474613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term474613, term474613.getClass(), "kind", enum776);
        setField(term474613, term474613.getClass(), "prototypeSlot", null);
        setField(term474613, term474613.getClass(), "source", null);
        setField(term474613, term474613.getClass(), "extendedInterfaces", term474813);
        term474917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term474917, term474917.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term474917;
        args[1] = null;
        try {
            callMethod(klass, "setPrototype", argTypes, term474613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


