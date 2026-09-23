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

public class FunctionType_setPrototypeNoCheck_1402626902493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453924;
     Object term454396;

    public FunctionType_setPrototypeNoCheck_1402626902493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term456857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term456856 = ((Class) term456857).getDeclaredField((String) "ORDINARY");
        ((Field) term456856).setAccessible(true);
        Object enum749 = ((Field) term456856).get((Object) null);
        term453924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term454038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term454138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term454138, term454138.getClass(), "ownerFunction", term453924);
        setField(term454038, term454038.getClass(), "type", term454138);
        setField(term453924, term453924.getClass(), "prototypeSlot", term454038);
        setField(term453924, term453924.getClass(), "source", null);
        setField(term453924, term453924.getClass(), "kind", enum749);
        setBooleanField(term453924, term453924.getClass(), "unknown", false);
        setField(term453924, term453924.getClass(), "subTypes", null);
        setBooleanField(term453924, term453924.getClass(), "nativeType", false);
        term454396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term454584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term454396, term454396.getClass(), "ownerFunction", null);
        setBooleanField(term454396, term454396.getClass(), "unknown", false);
        setField(term454396, term454396.getClass(), "subTypes", null);
        setBooleanField(term454396, term454396.getClass(), "nativeType", false);
        setField(term454396, term454396.getClass(), "kind", enum749);
        setField(term454396, term454396.getClass(), "prototypeSlot", term454584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term454396;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term453924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


