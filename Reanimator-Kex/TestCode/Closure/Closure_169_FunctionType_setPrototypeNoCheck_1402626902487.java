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

public class FunctionType_setPrototypeNoCheck_1402626902487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448837;
     Object term449409;

    public FunctionType_setPrototypeNoCheck_1402626902487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term450955 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term450954 = ((Class) term450955).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term450954).setAccessible(true);
        Object enum741 = ((Field) term450954).get((Object) null);
        term448837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term448951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term449051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term449151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term449051, term449051.getClass(), "ownerFunction", term449151);
        setField(term448951, term448951.getClass(), "type", term449051);
        setField(term448837, term448837.getClass(), "prototypeSlot", term448951);
        setField(term448837, term448837.getClass(), "source", null);
        setField(term448837, term448837.getClass(), "kind", enum741);
        term449409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term449409, term449409.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term449409;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term448837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


