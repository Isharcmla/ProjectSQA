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

public class FunctionType_setPrototypeNoCheck_1402626902497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458783;
     Object term459343;

    public FunctionType_setPrototypeNoCheck_1402626902497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term461334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461333 = ((Class) term461334).getDeclaredField((String) "INTERFACE");
        ((Field) term461333).setAccessible(true);
        Object enum756 = ((Field) term461333).get((Object) null);
        term458783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term458897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term458985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term459085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term458985, term458985.getClass(), "ownerFunction", term459085);
        setField(term458897, term458897.getClass(), "type", term458985);
        setField(term458783, term458783.getClass(), "prototypeSlot", term458897);
        setField(term458783, term458783.getClass(), "source", null);
        setField(term458783, term458783.getClass(), "kind", enum756);
        term459343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term459343, term459343.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term459343;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term458783, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


