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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522587;
     Object term523157;

    public FunctionType_setPrototypeNoCheck_1402626902548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term524175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term524174 = ((Class) term524175).getDeclaredField((String) "ORDINARY");
        ((Field) term524174).setAccessible(true);
        Object enum859 = ((Field) term524174).get((Object) null);
        term522587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term522701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term522805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term522905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term522805, term522805.getClass(), "ownerFunction", term522905);
        setField(term522701, term522701.getClass(), "type", term522805);
        setField(term522587, term522587.getClass(), "prototypeSlot", term522701);
        setField(term522587, term522587.getClass(), "source", null);
        setField(term522587, term522587.getClass(), "kind", enum859);
        setBooleanField(term522587, term522587.getClass(), "unknown", false);
        setField(term522587, term522587.getClass(), "subTypes", null);
        setBooleanField(term522587, term522587.getClass(), "nativeType", false);
        term523157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term523345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term523157, term523157.getClass(), "ownerFunction", null);
        setBooleanField(term523157, term523157.getClass(), "unknown", false);
        setField(term523157, term523157.getClass(), "subTypes", null);
        setBooleanField(term523157, term523157.getClass(), "nativeType", false);
        setField(term523157, term523157.getClass(), "kind", enum859);
        setField(term523157, term523157.getClass(), "prototypeSlot", term523345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term523157;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term522587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


