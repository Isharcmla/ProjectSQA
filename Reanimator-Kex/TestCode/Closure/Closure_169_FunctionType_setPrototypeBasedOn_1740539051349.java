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

public class FunctionType_setPrototypeBasedOn_1740539051349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316759;
     Object term317077;

    public FunctionType_setPrototypeBasedOn_1740539051349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318150 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term318149 = ((Class) term318150).getDeclaredField((String) "INTERFACE");
        ((Field) term318149).setAccessible(true);
        Object enum552 = ((Field) term318149).get((Object) null);
        term316759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term316977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term316759, term316759.getClass(), "nativeType", true);
        setField(term316759, term316759.getClass(), "registry", null);
        setField(term316759, term316759.getClass(), "className", null);
        setField(term316759, term316759.getClass(), "ownerFunction", null);
        setField(term316759, term316759.getClass(), "kind", enum552);
        setField(term316759, term316759.getClass(), "prototypeSlot", null);
        setField(term316759, term316759.getClass(), "source", term316977);
        term317077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term317077, term317077.getClass(), "className", null);
        setField(term317077, term317077.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term317077;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term316759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


