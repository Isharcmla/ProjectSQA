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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707815;
     Object term708381;

    public FunctionType_setPrototypeNoCheck_1402626902707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term708457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term708456 = ((Class) term708457).getDeclaredField((String) "ORDINARY");
        ((Field) term708456).setAccessible(true);
        Object enum1147 = ((Field) term708456).get((Object) null);
        term707815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term707929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term708029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term708129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term708029, term708029.getClass(), "ownerFunction", term708129);
        setField(term707929, term707929.getClass(), "type", term708029);
        setField(term707815, term707815.getClass(), "prototypeSlot", term707929);
        setField(term707815, term707815.getClass(), "source", null);
        setField(term707815, term707815.getClass(), "kind", enum1147);
        setBooleanField(term707815, term707815.getClass(), "unknown", false);
        setField(term707815, term707815.getClass(), "subTypes", null);
        setBooleanField(term707815, term707815.getClass(), "nativeType", false);
        term708381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term708381, term708381.getClass(), "ownerFunction", null);
        setBooleanField(term708381, term708381.getClass(), "unknown", false);
        setField(term708381, term708381.getClass(), "subTypes", null);
        setBooleanField(term708381, term708381.getClass(), "nativeType", false);
        setField(term708381, term708381.getClass(), "kind", enum1147);
        setField(term708381, term708381.getClass(), "prototypeSlot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term708381;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term707815, args);
    }

};


