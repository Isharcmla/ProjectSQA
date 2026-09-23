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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728078;
     Object term729016;

    public FunctionType_setPrototypeNoCheck_1402626902721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term729070 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term729069 = ((Class) term729070).getDeclaredField((String) "ORDINARY");
        ((Field) term729069).setAccessible(true);
        Object enum1167 = ((Field) term729069).get((Object) null);
        term728078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term728192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term728292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term728392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term728462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728292, term728292.getClass(), "ownerFunction", term728392);
        setField(term728192, term728192.getClass(), "type", term728292);
        setField(term728078, term728078.getClass(), "prototypeSlot", term728192);
        setField(term728078, term728078.getClass(), "source", term728462);
        setField(term728078, term728078.getClass(), "kind", enum1167);
        setBooleanField(term728078, term728078.getClass(), "unknown", false);
        setField(term728078, term728078.getClass(), "subTypes", null);
        setBooleanField(term728078, term728078.getClass(), "nativeType", false);
        ArrayList term729068 = new ArrayList();
        ((ArrayList) term729068).add((Object)null);
        term729016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term729016, term729016.getClass(), "ownerFunction", null);
        setBooleanField(term729016, term729016.getClass(), "unknown", false);
        setField(term729016, term729016.getClass(), "subTypes", term729068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term729016;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term728078, args);
    }

};


