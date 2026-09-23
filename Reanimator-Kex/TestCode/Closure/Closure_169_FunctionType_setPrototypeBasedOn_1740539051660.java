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

public class FunctionType_setPrototypeBasedOn_1740539051660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645771;
     Object term646127;

    public FunctionType_setPrototypeBasedOn_1740539051660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term647213 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term647212 = ((Class) term647213).getDeclaredField((String) "INTERFACE");
        ((Field) term647212).setAccessible(true);
        Object enum1060 = ((Field) term647212).get((Object) null);
        term645771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term645875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term645771, term645771.getClass(), "nativeType", true);
        setField(term645771, term645771.getClass(), "registry", term645875);
        setField(term645771, term645771.getClass(), "className", null);
        setField(term645771, term645771.getClass(), "ownerFunction", null);
        setField(term645771, term645771.getClass(), "kind", enum1060);
        setField(term645771, term645771.getClass(), "prototypeSlot", null);
        setField(term645771, term645771.getClass(), "source", null);
        term646127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term646127, term646127.getClass(), "className", null);
        setField(term646127, term646127.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term646127;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term645771, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


