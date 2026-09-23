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

public class FunctionType_setPrototypeNoCheck_1402626902369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336065;
     Object term336631;

    public FunctionType_setPrototypeNoCheck_1402626902369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term337477 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term337476 = ((Class) term337477).getDeclaredField((String) "INTERFACE");
        ((Field) term337476).setAccessible(true);
        Object enum581 = ((Field) term337476).get((Object) null);
        term336065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term336179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term336279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term336379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term336279, term336279.getClass(), "ownerFunction", term336379);
        setField(term336179, term336179.getClass(), "type", term336279);
        setField(term336065, term336065.getClass(), "prototypeSlot", term336179);
        setField(term336065, term336065.getClass(), "source", null);
        setField(term336065, term336065.getClass(), "kind", enum581);
        term336631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term336631, term336631.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term336631;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term336065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


