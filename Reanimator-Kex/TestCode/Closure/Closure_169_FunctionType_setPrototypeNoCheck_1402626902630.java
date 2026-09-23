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

public class FunctionType_setPrototypeNoCheck_1402626902630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604130;
     Object term605036;

    public FunctionType_setPrototypeNoCheck_1402626902630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term605908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term605907 = ((Class) term605908).getDeclaredField((String) "ORDINARY");
        ((Field) term605907).setAccessible(true);
        Object enum983 = ((Field) term605907).get((Object) null);
        ArrayList term604932 = new ArrayList();
        term604130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term604244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term604348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term604436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term604348, term604348.getClass(), "ownerFunction", term604436);
        setField(term604244, term604244.getClass(), "type", term604348);
        setField(term604130, term604130.getClass(), "prototypeSlot", term604244);
        setField(term604130, term604130.getClass(), "source", null);
        setField(term604130, term604130.getClass(), "kind", enum983);
        setBooleanField(term604130, term604130.getClass(), "unknown", false);
        setField(term604130, term604130.getClass(), "subTypes", term604932);
        setBooleanField(term604130, term604130.getClass(), "nativeType", false);
        term605036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term605036, term605036.getClass(), "ownerFunction", null);
        setBooleanField(term605036, term605036.getClass(), "unknown", false);
        setField(term605036, term605036.getClass(), "subTypes", null);
        setBooleanField(term605036, term605036.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term605036;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term604130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


