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

public class FunctionType_setPrototypeNoCheck_1402626902566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542926;
     Object term543792;

    public FunctionType_setPrototypeNoCheck_1402626902566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term544790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term544789 = ((Class) term544790).getDeclaredField((String) "INTERFACE");
        ((Field) term544789).setAccessible(true);
        Object enum889 = ((Field) term544789).get((Object) null);
        term542926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term543040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term543140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term543244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term543140, term543140.getClass(), "ownerFunction", term543244);
        setField(term543040, term543040.getClass(), "type", term543140);
        setField(term542926, term542926.getClass(), "prototypeSlot", term543040);
        setField(term542926, term542926.getClass(), "source", null);
        setField(term542926, term542926.getClass(), "kind", enum889);
        setBooleanField(term542926, term542926.getClass(), "unknown", false);
        setField(term542926, term542926.getClass(), "subTypes", null);
        setBooleanField(term542926, term542926.getClass(), "nativeType", false);
        Object term543882 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term543844 = new ArrayList();
        ((ArrayList) term543844).add((Object)null);
        ((ArrayList) term543844).add(term543882);
        term543792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term543792, term543792.getClass(), "ownerFunction", null);
        setBooleanField(term543792, term543792.getClass(), "unknown", false);
        setField(term543792, term543792.getClass(), "subTypes", term543844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term543792;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term542926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


