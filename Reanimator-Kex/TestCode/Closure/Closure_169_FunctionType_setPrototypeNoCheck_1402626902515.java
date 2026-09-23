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

public class FunctionType_setPrototypeNoCheck_1402626902515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477628;
     Object term478194;

    public FunctionType_setPrototypeNoCheck_1402626902515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479317 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term479316 = ((Class) term479317).getDeclaredField((String) "INTERFACE");
        ((Field) term479316).setAccessible(true);
        Object enum780 = ((Field) term479316).get((Object) null);
        term477628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term477742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term477842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term477942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term477842, term477842.getClass(), "ownerFunction", term477942);
        setField(term477742, term477742.getClass(), "type", term477842);
        setField(term477628, term477628.getClass(), "prototypeSlot", term477742);
        setField(term477628, term477628.getClass(), "source", null);
        setField(term477628, term477628.getClass(), "kind", enum780);
        term478194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term478194, term478194.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term478194;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term477628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


