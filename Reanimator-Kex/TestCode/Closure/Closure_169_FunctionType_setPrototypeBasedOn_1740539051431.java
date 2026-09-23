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

public class FunctionType_setPrototypeBasedOn_1740539051431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394599;
     Object term395201;

    public FunctionType_setPrototypeBasedOn_1740539051431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term396054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term396053 = ((Class) term396054).getDeclaredField((String) "ORDINARY");
        ((Field) term396053).setAccessible(true);
        Object enum657 = ((Field) term396053).get((Object) null);
        term394599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term395113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term394599, term394599.getClass(), "nativeType", false);
        setField(term394599, term394599.getClass(), "kind", enum657);
        setField(term394599, term394599.getClass(), "prototypeSlot", null);
        setField(term394599, term394599.getClass(), "source", term395113);
        term395201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term395201, term395201.getClass(), "className", null);
        setField(term395201, term395201.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term395201;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term394599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


