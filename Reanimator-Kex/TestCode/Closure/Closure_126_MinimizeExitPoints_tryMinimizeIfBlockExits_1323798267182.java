package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55815;
     Object term55907;
     Object term57046;
     Object term57047;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55815 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term55907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55907, term55907.getClass(), "type", -126);
        term57046 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term57046, term57046.getClass(), "compiler", null);
        term57047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57047, term57047.getClass(), "number", 0.0);
        setIntField(term57047, term57047.getClass(), "type", -126);
        setField(term57047, term57047.getClass(), "next", null);
        setField(term57047, term57047.getClass(), "first", null);
        setField(term57047, term57047.getClass(), "last", null);
        setField(term57047, term57047.getClass(), "propListHead", null);
        setIntField(term57047, term57047.getClass(), "sourcePosition", 0);
        setField(term57047, term57047.getClass(), "jsType", null);
        setField(term57047, term57047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term55907;
        args[1] = null;
        args[2] = null;
        args[3] = 125;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term55815, args);
        assertTrue(recursiveEquals(term55815, term57046));
        assertTrue(recursiveEquals(term55907, term57047));
    }

};


