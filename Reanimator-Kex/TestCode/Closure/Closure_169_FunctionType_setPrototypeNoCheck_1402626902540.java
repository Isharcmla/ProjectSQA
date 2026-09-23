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

public class FunctionType_setPrototypeNoCheck_1402626902540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512875;
     Object term513445;

    public FunctionType_setPrototypeNoCheck_1402626902540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term514319 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term514318 = ((Class) term514319).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term514318).setAccessible(true);
        Object enum841 = ((Field) term514318).get((Object) null);
        term512875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term512989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term513093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term513193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term513093, term513093.getClass(), "ownerFunction", term513193);
        setField(term512989, term512989.getClass(), "type", term513093);
        setField(term512875, term512875.getClass(), "prototypeSlot", term512989);
        setField(term512875, term512875.getClass(), "source", null);
        setField(term512875, term512875.getClass(), "kind", enum841);
        term513445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term513445, term513445.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term513445;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term512875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


