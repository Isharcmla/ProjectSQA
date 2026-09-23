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

public class FunctionType_setPrototypeNoCheck_1402626902606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579827;
     Object term580449;

    public FunctionType_setPrototypeNoCheck_1402626902606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term582577 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term582576 = ((Class) term582577).getDeclaredField((String) "INTERFACE");
        ((Field) term582576).setAccessible(true);
        Object enum949 = ((Field) term582576).get((Object) null);
        ArrayList term580345 = new ArrayList();
        term579827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term579941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term580045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term580145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term580045, term580045.getClass(), "ownerFunction", term580145);
        setField(term579941, term579941.getClass(), "type", term580045);
        setField(term579827, term579827.getClass(), "prototypeSlot", term579941);
        setField(term579827, term579827.getClass(), "source", null);
        setField(term579827, term579827.getClass(), "kind", enum949);
        setField(term579827, term579827.getClass(), "extendedInterfaces", term580345);
        term580449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term580449, term580449.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term580449;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term579827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


