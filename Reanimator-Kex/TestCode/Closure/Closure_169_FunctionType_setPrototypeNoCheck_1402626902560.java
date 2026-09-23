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

public class FunctionType_setPrototypeNoCheck_1402626902560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535097;
     Object term535633;

    public FunctionType_setPrototypeNoCheck_1402626902560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term536493 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term536492 = ((Class) term536493).getDeclaredField((String) "INTERFACE");
        ((Field) term536492).setAccessible(true);
        Object enum877 = ((Field) term536492).get((Object) null);
        term535097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term535211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term535311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term535381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term535311, term535311.getClass(), "ownerFunction", null);
        setField(term535211, term535211.getClass(), "type", term535311);
        setField(term535097, term535097.getClass(), "prototypeSlot", term535211);
        setField(term535097, term535097.getClass(), "source", term535381);
        setField(term535097, term535097.getClass(), "kind", enum877);
        term535633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term535633, term535633.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term535633;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term535097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


