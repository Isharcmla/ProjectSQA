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

public class FunctionType_setPrototypeNoCheck_1402626902564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540241;
     Object term540807;

    public FunctionType_setPrototypeNoCheck_1402626902564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term541681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term541680 = ((Class) term541681).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term541680).setAccessible(true);
        Object enum885 = ((Field) term541680).get((Object) null);
        term540241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term540355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term540455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term540555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term540455, term540455.getClass(), "ownerFunction", term540555);
        setField(term540355, term540355.getClass(), "type", term540455);
        setField(term540241, term540241.getClass(), "prototypeSlot", term540355);
        setField(term540241, term540241.getClass(), "source", null);
        setField(term540241, term540241.getClass(), "kind", enum885);
        term540807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term540807, term540807.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term540807;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term540241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


