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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47960;
     Object term48052;
     Object term48144;
     Object term48705;
     Object term48706;
     Object term48707;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47960 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term48052 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term48052, term48052.getClass(), "type", 4);
        setField(term48052, term48052.getClass(), "first", null);
        term48144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term48705 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term48705, term48705.getClass(), "compiler", null);
        term48706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term48706, term48706.getClass(), "number", 0.0);
        setIntField(term48706, term48706.getClass(), "type", 4);
        setField(term48706, term48706.getClass(), "next", null);
        setField(term48706, term48706.getClass(), "first", null);
        setField(term48706, term48706.getClass(), "last", null);
        setField(term48706, term48706.getClass(), "propListHead", null);
        setIntField(term48706, term48706.getClass(), "sourcePosition", 0);
        setField(term48706, term48706.getClass(), "jsType", null);
        setField(term48706, term48706.getClass(), "parent", null);
        term48707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term48707, term48707.getClass(), "number", 0.0);
        setIntField(term48707, term48707.getClass(), "type", 0);
        setField(term48707, term48707.getClass(), "next", null);
        setField(term48707, term48707.getClass(), "first", null);
        setField(term48707, term48707.getClass(), "last", null);
        setField(term48707, term48707.getClass(), "propListHead", null);
        setIntField(term48707, term48707.getClass(), "sourcePosition", 0);
        setField(term48707, term48707.getClass(), "jsType", null);
        setField(term48707, term48707.getClass(), "parent", null);
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
        args[0] = term48052;
        args[1] = null;
        args[2] = term48144;
        args[3] = 4;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term47960, args);
        assertTrue(recursiveEquals(term47960, term48705));
        assertTrue(recursiveEquals(term48052, term48706));
        assertTrue(recursiveEquals(term48144, null));
    }

};


