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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1740539051701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702250;
     Object term702502;

    public FunctionType_setPrototypeBasedOn_1740539051701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term702504 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term702503 = ((Class) term702504).getDeclaredField((String) "INTERFACE");
        ((Field) term702503).setAccessible(true);
        Object enum1141 = ((Field) term702503).get((Object) null);
        term702250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term702250, term702250.getClass(), "nativeType", true);
        setField(term702250, term702250.getClass(), "registry", null);
        setField(term702250, term702250.getClass(), "className", null);
        setField(term702250, term702250.getClass(), "ownerFunction", null);
        setField(term702250, term702250.getClass(), "kind", enum1141);
        setField(term702250, term702250.getClass(), "prototypeSlot", null);
        setField(term702250, term702250.getClass(), "source", null);
        term702502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term702502, term702502.getClass(), "className", null);
        setField(term702502, term702502.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term702502;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term702250, args);
    }

};


