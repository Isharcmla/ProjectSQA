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

public class FunctionType_setPrototypeNoCheck_1402626902691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690428;
     Object term691002;

    public FunctionType_setPrototypeNoCheck_1402626902691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term691004 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term691003 = ((Class) term691004).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term691003).setAccessible(true);
        Object enum1130 = ((Field) term691003).get((Object) null);
        term690428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term690542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term690646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term690750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term690646, term690646.getClass(), "ownerFunction", term690750);
        setField(term690542, term690542.getClass(), "type", term690646);
        setField(term690428, term690428.getClass(), "prototypeSlot", term690542);
        setField(term690428, term690428.getClass(), "source", null);
        setField(term690428, term690428.getClass(), "kind", enum1130);
        term691002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term691002, term691002.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term691002;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term690428, args);
    }

};


