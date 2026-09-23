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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678074;

    public FunctionType_setPrototypeNoCheck_1402626902682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term679256 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term679255 = ((Class) term679256).getDeclaredField((String) "INTERFACE");
        ((Field) term679255).setAccessible(true);
        Object enum1114 = ((Field) term679255).get((Object) null);
        ArrayList term678368 = new ArrayList();
        term678074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term678131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term678183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term678233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term678268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term678183, term678183.getClass(), "ownerFunction", term678233);
        setField(term678131, term678131.getClass(), "type", term678183);
        setField(term678074, term678074.getClass(), "prototypeSlot", term678131);
        setField(term678074, term678074.getClass(), "source", term678268);
        setField(term678074, term678074.getClass(), "ownerFunction", null);
        setField(term678074, term678074.getClass(), "kind", enum1114);
        setBooleanField(term678074, term678074.getClass(), "unknown", false);
        setField(term678074, term678074.getClass(), "subTypes", term678368);
        setBooleanField(term678074, term678074.getClass(), "nativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term678074;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term678074, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


