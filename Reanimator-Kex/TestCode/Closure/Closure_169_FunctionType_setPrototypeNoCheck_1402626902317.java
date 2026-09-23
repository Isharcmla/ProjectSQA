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

public class FunctionType_setPrototypeNoCheck_1402626902317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290996;
     Object term291362;
     Object term291432;

    public FunctionType_setPrototypeNoCheck_1402626902317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292273 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term292272 = ((Class) term292273).getDeclaredField((String) "INTERFACE");
        ((Field) term292272).setAccessible(true);
        Object enum513 = ((Field) term292272).get((Object) null);
        term290996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term291110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term291110, term291110.getClass(), "type", null);
        setField(term290996, term290996.getClass(), "prototypeSlot", term291110);
        setField(term290996, term290996.getClass(), "kind", enum513);
        term291362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term291362, term291362.getClass(), "ownerFunction", null);
        term291432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term291362;
        args[1] = term291432;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term290996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


