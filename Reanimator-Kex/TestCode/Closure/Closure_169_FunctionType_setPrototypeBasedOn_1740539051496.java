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

public class FunctionType_setPrototypeBasedOn_1740539051496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458019;
     Object term458255;

    public FunctionType_setPrototypeBasedOn_1740539051496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term460177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term460176 = ((Class) term460177).getDeclaredField((String) "INTERFACE");
        ((Field) term460176).setAccessible(true);
        Object enum754 = ((Field) term460176).get((Object) null);
        term458019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term458019, term458019.getClass(), "nativeType", false);
        setField(term458019, term458019.getClass(), "kind", enum754);
        setField(term458019, term458019.getClass(), "prototypeSlot", null);
        setField(term458019, term458019.getClass(), "source", null);
        term458255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term458255, term458255.getClass(), "className", null);
        setField(term458255, term458255.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term458255;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term458019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


